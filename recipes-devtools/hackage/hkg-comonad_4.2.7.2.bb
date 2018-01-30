DESCRIPTION = "Comonads."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=21de4606c146e14c8ca6e65ae2ef3ccf"

inherit hackage

SRC_URI[md5sum] = "a8cc75c2fd5eecd733b5bb013d08d23c"
SRC_URI[sha256sum] = "b762261ef545a16881b66409398752e249a8e654a34088c66d9fabf9ba5a3b2b"

DEPENDS += " \
    hkg-semigroups \
    hkg-contravariant \
    hkg-transformers-compat \
    hkg-distributive \
"
