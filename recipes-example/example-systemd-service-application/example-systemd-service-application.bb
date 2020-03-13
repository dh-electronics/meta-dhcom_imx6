LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"
COMPATIBLE_MACHINE = "(dhcom1bimx6ulldrc02)"
DESCRIPTION = "Example Systemd service to start a customer application"

S = "${WORKDIR}/"
SRC_URI = "	file://example-application.sh \
		file://example-application.service"


do_install () {
	install -d ${D}${base_bindir}
	install -m 755 ${S}/example-application.sh ${D}${base_bindir}/example-application.sh
	install -d ${D}/${systemd_unitdir}/system
	install -m 644 ${WORKDIR}/example-application.service ${D}/${systemd_unitdir}/system/example-application.service
}

PROVIDES += "example-application"

inherit systemd

SYSTEMD_SERVICE_${PN} = "example-application.service"
FILES_${PN} = "${base_bindir}/example-application.sh ${systemd_unitdir}/system/example-application.service"

PACKAGE_ARCH = "${MACHINE_ARCH}"
