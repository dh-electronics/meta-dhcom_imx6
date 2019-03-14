# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-bsp/u-boot/u-boot.inc

inherit fsl-u-boot-localversion

DESCRIPTION = "U-Boot based on mainline U-Boot used by DH electronics GmbH to support i.MX6 DHCOMs"
LICENSE = "GPLv2+"
COMPATIBLE_MACHINE = "(mxs|mx3|mx5|mx6|vf60|dhcom1bimx6ull)"

DEPENDS_mxs += "elftosb-native openssl-native"

PROVIDES += "u-boot"

S = "${WORKDIR}/git"

# FIXME: Allow linking of 'tools' binaries with native libraries
#        used for generating the boot logo and other tools used
#        during the build process.
EXTRA_OEMAKE += 'HOSTCC="${BUILD_CC} ${BUILD_CPPFLAGS}" \
                 HOSTLDFLAGS="${BUILD_LDFLAGS}" \
                 HOSTSTRIP=true'

PACKAGE_ARCH = "${MACHINE_ARCH}"
