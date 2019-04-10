LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://${S}COPYING;md5=751419260aa954499f7abaabaa882bbe"
COMPATIBLE_MACHINE = "(mx6ull)"
DESCRIPTION = "Install an udev-ethernet rule in the final .sdcard image"

S = "${WORKDIR}/"
SRC_URI = "file://70-persistent-net.rules; \
           file://COPYING "

do_install () {
    install -d ${D}${sysconfdir}/udev/rules.d
    install -m 0666 ${S}/70-persistent-net.rules ${D}${sysconfdir}/udev/rules.d/
}


FILES_${PN} += "/etc/udev/rules.d/70-persistent-net.rules"

PROVIDES += "imx6ull-dhcom-udev-ethernet"

