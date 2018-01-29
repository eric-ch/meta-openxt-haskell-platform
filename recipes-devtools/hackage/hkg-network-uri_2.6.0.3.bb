DESCRIPTION = "This package provides an URI manipulation inteface."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78dd98be72709820ee0098ba6a71a888"

inherit hackage

SRC_URI[md5sum] = "1370aa94bb60da253616e23c4a849277"
SRC_URI[sha256sum] = "0fc2cdff47ca77d826ebeb5cabe6ddac2333ca1504b2b629dd369399c5c28bdf"

DEPENDS += " \
    hkg-parsec \
"

