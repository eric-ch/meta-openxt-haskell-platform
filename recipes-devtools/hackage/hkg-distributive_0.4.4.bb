DESCRIPTION = "Distributive functors -- Dual to Traversable"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e9f8d3f87866b04e973a51b26d3ce825"

inherit hackage

SRC_URI[md5sum] = "d8bb67dfd4b24089b73eca2a3d76ca83"
SRC_URI[sha256sum] = "82d1f53495fe9c25e4e974825666b4a6232af7452784e145cc04aeb365b25468"

DEPENDS += " \
    hkg-tagged \
    hkg-transformers-compat \
"
