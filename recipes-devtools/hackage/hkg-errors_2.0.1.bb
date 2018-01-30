DESCRIPTION = "This library encourages an error-handling style that directly uses the type system, rather than out-of-band exceptions."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f2c465dc64718d1b4a7e98fc58603417"

inherit hackage

SRC_URI[md5sum] = "0502d287e465d97b689044d4bfccd9ce"
SRC_URI[sha256sum] = "7e5585e4a9fafd64b39825ff6d5d6872fe000db0be5f968d8d619cb6a0c997f0"

DEPENDS += " \
    hkg-safe \
    hkg-transformers-compat \
"
