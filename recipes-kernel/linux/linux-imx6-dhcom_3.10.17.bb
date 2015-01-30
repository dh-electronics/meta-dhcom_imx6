# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Freescale"
DESCRIPTION = "Linux Kernel provided and supported by Freescale with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx6-dhcom.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# select branch 
SRCBRANCH = "imx_3.10.17_1.0.2_ga"
#SRCBRANCH = "master"
# SRCREV = "91f8d16a53d496c9f1087e7e1081c72d50948434"
# use latest source
SRCREV = "${AUTOREV}"
LOCALVERSION = "-dhcom-1v0"

#SRC_URI += "file://0001-.....patch"

COMPATIBLE_MACHINE = "(mx6)"
