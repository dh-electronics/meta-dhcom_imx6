include u-boot-imx6-dhcom.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

SRCBRANCH ??= "dev/2018.03_dhcom"

SRC_URI = "\
    git://github.com/dh-electronics/u-boot-imx6qdl.git;protocol=https;branch=${SRCBRANCH} \
    file://0001-Revert-gcc-6.0-requirement.patch \
"

PV = "v2018.03"

# use latest source
SRCREV = "${AUTOREV}"
