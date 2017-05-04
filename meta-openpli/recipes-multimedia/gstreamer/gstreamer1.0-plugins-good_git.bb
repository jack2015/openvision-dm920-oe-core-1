DEFAULT_PREFERENCE = "1"

include gstreamer1.0-plugins-good.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
					file://gst/replaygain/rganalysis.c;beginline=1;endline=23;md5=b60ebefd5b2f5a8e0cab6bfee391a5fe \
					"

SRCREV = "27f40eca4dee0417aa477896b98ebcf4e7c349ce"
SRCREV_common = "48a5d85ebf4a0bad1c997c83100f710fe2154fbf"
SRCREV_FORMAT = "base"

SRC_URI = " git://anongit.freedesktop.org/gstreamer/gst-plugins-good;branch=master;name=base \
			git://anongit.freedesktop.org/gstreamer/common;destsuffix=git/common;name=common \
			"

SRC_URI += "file://0001-gstrtpmp4gpay-set-dafault-value-for-MPEG4-without-co.patch \
			file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
			"

S = "${WORKDIR}/git"

inherit gitpkgv

GST_VERSION_FULL ="1.12.0"
PV = "${GST_VERSION_FULL}+git${SRCPV}"
PKGV = "${GST_VERSION_FULL}+git${GITPKGV}"

do_configure_prepend() {
	cd ${S}
	./autogen.sh --noconfigure
	cd ${B}
}
