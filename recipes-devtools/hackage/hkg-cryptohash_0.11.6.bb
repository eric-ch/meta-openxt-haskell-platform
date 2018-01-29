DESCRIPTION = "A collection of crypto hashes, with a practical incremental and one-pass, pure APIs, with performance close to the fastest implementations available in other languages."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38235ba18366f4bf93b5d86e58fc6b0c"

inherit hackage

SRC_URI[md5sum] = "4d9bcd1301feac3c130bd8f94df97dba"
SRC_URI[sha256sum] = "da382334857a88f3e94ce0fb83f425f0a0787b0644100913c61f6e94bb62df37"

DEPENDS += " \
    hkg-byteable \
"
