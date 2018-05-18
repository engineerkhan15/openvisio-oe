SUMMARY = "decoding library for DTS Coherent Acoustics streams"
SECTION = "libs/multimedia"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

PR = "r1"

inherit autotools-brokensep lib_package pkgconfig gitpkgv

SRC_URI = "git://code.videolan.org/videolan/libdca;protocol=https"

S = "${WORKDIR}/git"

PV = "0.0.6+git${SRCPV}"
PKGV = "0.0.6+git${GITPKGV}"
