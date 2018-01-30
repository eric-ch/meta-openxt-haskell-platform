DESCRIPTION = "A Haskell 98 logically uninhabited data type, used to indicate that a given term should not exist."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84c43960ac46d7029410756642d4da01"

inherit hackage

SRC_URI[md5sum] = "4b0045b68244f89442bf537e3451615e"
SRC_URI[sha256sum] = "d3fffe66a03e4b53db1e459edf75ad8402385a817cae415d857ec0b03ce0cf2b"

DEPENDS += " \
    hkg-hashable \
    hkg-semigroups \
"

