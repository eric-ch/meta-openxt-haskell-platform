DESCRIPTION = "This package includes backported versions of types that were added to transformers in transformers 0.3 and 0.4 for users who need strict transformers 0.2 or 0.3 compatibility to run on old versions of the platform, but also need those types."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d15158cd0c27d27e3f10cdee26eeba82"

inherit hackage

SRC_URI[md5sum] = "73caa1b5fa494e9759dfac01bed744a8"
SRC_URI[sha256sum] = "4eca78f0190df3f6f5655901817d51e848ca60ef162e906b98a6d9ac0d33fe24"

DEPENDS += " \
    hkg-mtl \
"
