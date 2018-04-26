include u-boot-imx6-dhcom.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"

SRCBRANCH ??= "dev/2015.10_dhcom"

SRC_URI = "git://github.com/dh-electronics/u-boot-imx6qdl.git;protocol=https;branch=${SRCBRANCH}"

PV = "v2015.10"

# use latest source
SRCREV = "${AUTOREV}"
