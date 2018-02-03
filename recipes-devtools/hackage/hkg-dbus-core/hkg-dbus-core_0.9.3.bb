DESCRIPTION = "DBus core bindings (obsolete)."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://license.txt;md5=d32239bcb673463ab874e80d47fae504"

inherit hackage

FILESEXTRAPATHS_prepend := "${THISDIR}/patches:"
SRC_URI += " \
    file://cheat-dependencies.patch \
    file://expose-typecode.patch \
"
SRC_URI[md5sum] = "57f03f5fe2a7f558d8497cc8ae9e0e1d"
SRC_URI[sha256sum] = "cabddfbc4ff452f114f242dd364c91705448de9993230acf04b8461bfd380384"

DEPENDS += " \
    hkg-data-binary-ieee754 \
    hkg-libxml-sax \
    hkg-mtl \
    hkg-network \
    hkg-parsec \
    hkg-text \
    hkg-vector \
"
