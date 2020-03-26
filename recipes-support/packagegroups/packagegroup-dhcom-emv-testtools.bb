SUMMARY = "Packagegroup for common tools needed for EMV tests and hardware start-up"
DESCRIPTION = "Packagegroup for common tools needed for EMV tests and hardware start-up"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} += " \
	stress-ng \
	memtester \
	iperf2 \
	iperf3 \
	glmark2 \
	minicom \
	usbutils \
	libgpiod \
	i2c-tools \
"
