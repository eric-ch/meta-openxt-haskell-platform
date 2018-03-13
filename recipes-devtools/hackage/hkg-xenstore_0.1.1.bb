DESCRIPTION = "Xenstore client access."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=af37f6ace7c98678b40104af99e85b6a"

inherit hackage

SRC_URI[md5sum] = "7e16fe39f738aacabd34ceb05b4a2e1d"
SRC_URI[sha256sum] = "c2b538c9ce6716f4a1b4c0cb63ed5c6e5ee3e69e80dbb7826ee7f5392f45e874"
DEPENDS += " \
    hkg-cereal \
    hkg-mtl \
    hkg-network \
"