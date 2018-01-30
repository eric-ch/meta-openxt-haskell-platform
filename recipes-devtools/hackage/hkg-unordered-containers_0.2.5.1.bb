DESCRIPTION = "Efficient hashing-based container types. The containers have been optimized for performance critical use, both in terms of large data quantities and high speed."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f146cd05e812322fbcf9b679fa56636"

inherit hackage

SRC_URI[md5sum] = "c330100ca1d5e6b3cb8242d0bde706f9"
SRC_URI[sha256sum] = "6e5878ade3ea65f2a7cb0a1df155f88f7e710d5bb975a5cbf1b45fb8cfee811a"

DEPENDS += " \
    hkg-hashable \
"
