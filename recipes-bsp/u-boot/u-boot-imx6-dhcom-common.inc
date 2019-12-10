SECTION = "bootloaders"
DEPENDS += "flex-native bison-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
PE = "1"

SRCBRANCH ??= "dev/2018.05_dhcom"
SRC_URI = "git://github.com/dh-electronics/u-boot-imx6qdl.git;protocol=https;branch=${SRCBRANCH} "

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
