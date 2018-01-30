DESCRIPTION = "Provides a wide array of (semi)groupoids and operations for working with them."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a38bfee1357b68d214d9aab35f38aa98"

inherit hackage

SRC_URI[md5sum] = "841475628dcdb5e900b9e5d9f461510f"
SRC_URI[sha256sum] = "cde047e36c4072dd32fcda5846155a3dd4e844f441e4c651b886ee069d95c7c9"

DEPENDS += " \
    hkg-comonad \
    hkg-contravariant \
    hkg-semigroups \
    hkg-bifunctors \
    hkg-base-orphans \
"
