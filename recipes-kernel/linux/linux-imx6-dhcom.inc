# Copyright (C) 2012, 2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

inherit kernel fsl-kernel-localversion fsl-vivante-kernel-driver-handler

# Put a local version until we have a true SRCREV to point to
LOCALVERSION ?= ""
SCMVERSION ?= "y"
SRCBRANCH ?= ""

# DH electronics at GitHub
#SRC_URI = "git://github.com/dh-electronics/linux-imx6qdl.git;protocol=https;branch=${SRCBRANCH} \
#           file://defconfig \
#"

# DH electronics internal
SRC_URI = "git://git@dhplgl01.dh-electronics.org/dhcom-imx6/linux-imx6qdl.git;protocol=ssh;branch=${SRCBRANCH} \
           file://defconfig \
"
S = "${WORKDIR}/git"

# We need to pass it as param since kernel might support more then one
# machine, with different entry points
KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"
