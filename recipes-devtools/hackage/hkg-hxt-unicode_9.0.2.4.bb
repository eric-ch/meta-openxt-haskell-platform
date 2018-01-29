DESCRIPTION = "Unicode encoding and decoding functions for utf8, iso-latin-* and somes other encodings, used in the Haskell XML Toolbox."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cb61534369f1bbb7cbe62e014d3d5717"

inherit hackage

SRC_URI[md5sum] = "e4f61cef60736dca5778641e791f66c8"
SRC_URI[sha256sum] = "7b5823f3bd94b57022d9d84ab3555303653c5121eaaef2ee1fd4918f3c434466"

DEPENDS += " \
    hkg-hxt-charproperties \
"
