DESCRIPTION = "Extensible optionally-pure exceptions."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da5bccb37741b38b68ab236dec15b1f2"

inherit hackage

SRC_URI[md5sum] = "91714be88db1eee936106fd0bd9952b7"
SRC_URI[sha256sum] = "070a3e0d1495243770fb3a629d5187ce898f069cb3621c5f7c610ae264982bf4"

DEPENDS += " \
    hkg-mtl \
    hkg-stm \
    hkg-transformers-compat \
"
