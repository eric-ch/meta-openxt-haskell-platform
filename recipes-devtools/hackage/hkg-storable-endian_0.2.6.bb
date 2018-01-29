DESCRIPTION = "Storable instances with endianness."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4f801f10bb1613d14b5f06070c0d1f58"

inherit hackage

SRC_URI[md5sum] = "1341cabd4d4b72abdc692438fc49552f"
SRC_URI[sha256sum] = "3743ac8f084ed3187b83f17b4fac280e77c5df01f7910f42b6a1bf09d5a65489"

DEPENDS += "hkg-byteorder"
