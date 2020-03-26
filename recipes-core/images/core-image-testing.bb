SUMMARY = "A small image for internal EMV messures"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "\
	packagegroup-dhcom-emv-testtools \
	"

IMAGE_FEATURES += ""
IMAGE_FSTYPES +=" tar.gz "
