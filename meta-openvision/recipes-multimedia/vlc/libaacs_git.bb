SUMMARY = "Open implementation of the AACS specification"
SECTION = "libs/multimedia"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4b54a1fd55a448865a0b32d41598759d"
DEPENDS = "libgcrypt"
PV = "0.9.0+git${SRCPV}"
PR = "r1"

SRC_URI = " git://code.videolan.org/videolan/${BPN}.git;protocol=https \
			file://libgcrypt-gpg-error-use-pkgconfig.patch \
			"

S = "${WORKDIR}/git"

inherit autotools lib_package pkgconfig
