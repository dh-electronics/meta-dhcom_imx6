include u-boot-imx6-dhcom.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

SRCBRANCH ??= "dev/2018.05_dhcom"

SRC_URI = "\
    git://git@dhplgl01.dh-electronics.org/dhcom-imx6/u-boot-imx6qdl.git;protocol=ssh;branch=${SRCBRANCH} \
"

PV = "v2018.05"
BB_STRICT_CHECKSUM = "0"

# use latest source
SRCREV = "${AUTOREV}"
