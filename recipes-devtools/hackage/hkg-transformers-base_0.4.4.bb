DESCRIPTION = "This package provides a straightforward port of monadLib's BaseM typeclass to transformers."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=93e7d84c230d8f835ebffaa82a621e39"

inherit hackage

SRC_URI[md5sum] = "d2904686fa190187ea99e756c8f2c901"
SRC_URI[sha256sum] = "6aa3494fc70659342fbbb163035d5827ecfd8079e3c929e2372adf771fd52387"

DEPENDS += " \
    hkg-stm \
    hkg-transformers-compat \
"
