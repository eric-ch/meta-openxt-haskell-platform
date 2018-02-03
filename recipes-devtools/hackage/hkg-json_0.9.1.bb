DESCRIPTION = "JSON library."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc842e62515f35f232f237038e679cb2"

inherit hackage

SRC_URI[md5sum] = "39f878c351120c7d8bd1d634eee26cbb"
SRC_URI[sha256sum] = "96b57e4d167e45dc80aeff872a922ae9cdb953a1ded29ebbb51019b68f0085a2"

DEPENDS += " \
    hkg-parsec \
    hkg-mtl \
"
