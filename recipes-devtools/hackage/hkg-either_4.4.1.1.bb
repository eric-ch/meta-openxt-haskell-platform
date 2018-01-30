DESCRIPTION = "An either monad transformer."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7c2b0270cbb855f29a4baff6b62fc13"

inherit hackage

SRC_URI[md5sum] = "d4d10f6458e095e1fd29d272eba418c3"
SRC_URI[sha256sum] = "b087cb0fb63fec2fbdcac05fef0d03751daef5deb86cda3c732b9a6a31e634d3"

DEPENDS += " \
    hkg-semigroupoids \
    hkg-semigroups \
    hkg-mtl \
    hkg-bifunctors \
    hkg-exceptions \
    hkg-free \
    hkg-monadrandom \
    hkg-mmorph \
    hkg-monad-control \
    hkg-transformers-base \
"
