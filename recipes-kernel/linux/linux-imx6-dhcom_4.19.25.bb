# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Freescale"
DESCRIPTION = "Linux Kernel provided and supported by Freescale with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx6-dhcom.inc
LIC_FILES_CHKSUM="file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

DEPENDS += "lzop-native bc-native"

# select branch 
SRCBRANCH = "release/4.19.25_dhsom/20200211"

# use latest source
SRCREV = "${AUTOREV}"

LOCALVERSION = "-release20200211"

#SRC_URI += "file://0001-.....patch"

COMPATIBLE_MACHINE = "(mx6)"
BB_STRICT_CHECKSUM = "0"


