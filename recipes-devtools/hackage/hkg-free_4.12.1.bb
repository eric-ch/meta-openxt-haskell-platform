DESCRIPTION = "Free monads are useful for many tree-like structures and domain specific languages."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a729fe2fe231d7614436ee9d371e1679"

inherit hackage

SRC_URI[md5sum] = "a6e19cb5f1bd3360096a7af43b91d0dc"
SRC_URI[sha256sum] = "376559042204e56bcd1152f04bf01079118c6ccba5e0cf8344de929537bc286b"

DEPENDS += " \
    hkg-bifunctors \
    hkg-comonad \
    hkg-distributive \
    hkg-exceptions \
    hkg-mtl \
    hkg-profunctors \
    hkg-semigroupoids \
    hkg-semigroups \
    hkg-prelude-extras \
"
