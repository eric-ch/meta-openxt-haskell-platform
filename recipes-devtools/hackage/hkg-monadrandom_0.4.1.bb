DESCRIPTION = "Support for computations which consume random values."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3067809e776166e4b194b8bbb1cced79"

HPN = "MonadRandom"
inherit hackage

SRC_URI[md5sum] = "7a00f53270354ed5d6d41b94e5ba85e2"
SRC_URI[sha256sum] = "71fbc82f2cec58795b28a1c4820127b64939d3fa710e465a86764413b891554b"

DEPENDS += " \
    hkg-mtl \
    hkg-random \
    hkg-transformers-compat \
"
