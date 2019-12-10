# Build additional yocto images for multi partition images
# Add your image recipes to:
# PARTITIONS_IMAGE = "image_recipe1 image_recipe2"
#

PARTITIONS_IMAGE ?= ""

python __anonymous () {

    # Format partitions to an iterable list
    partimages = (d.getVar('PARTITIONS_IMAGE') or "").split()

    if len(partimages) > 0:
        # Get current tasks
        tasks = filter(lambda k: d.getVarFlag(k, "task", True), d.keys())
        for task in tasks:
            if task == 'do_image_complete':
                curimagename = d.getVar('PN') or ""
                initramfs = d.getVar('INITRAMFS_IMAGE') or ""
                if curimagename not in partimages and curimagename not in initramfs:
                    for partition in partimages:
                        d.appendVarFlag('do_image_complete', 'depends', ' %s:do_image_complete' % partition)
}

image_rootfs_image_clean_task () {
    for name in ${PARTITIONS_IMAGE};
    do
        if `echo ${IMAGE_NAME} | grep -q $name` ;
        then
            return;
        fi
    done
    LIST=`ls -l ${IMAGE_ROOTFS}`
    for dir in ${PARTITIONS_MOUNTPOINT_IMAGE};
    do
        rm -rf ${IMAGE_ROOTFS}/$dir/*
    done
}
IMAGE_PREPROCESS_COMMAND_append = " image_rootfs_image_clean_task; "
