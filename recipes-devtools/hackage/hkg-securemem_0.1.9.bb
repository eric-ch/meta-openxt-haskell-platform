DESCRIPTION = "SecureMem is similar to ByteString, except that it provides a memory chunk that will be auto-scrubbed after it run out of scope."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=06925d257b3055a4a2c1d13812d549ab"

inherit hackage

SRC_URI[md5sum] = "5f299006dd758487d3c716b510566a9d"
SRC_URI[sha256sum] = "feb60dc542ea3ce9cdb449093b85dc69e43df310aab4fd161e4cdaa3ba847036"

DEPENDS += " \
    hkg-byteable \
    hkg-memory \
"
