DESCRIPTION = "An efficient implementation of Int-indexed arrays (both mutable and immutable), with a powerful loop optimisation framework."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7ab0300579b7aa42a9148282d87c89e"

inherit hackage

SRC_URI[md5sum] = "a08605271abb3ed815135572a42b8524"
SRC_URI[sha256sum] = "0a5320ed44c3f2b04b7f61e0f63f4fcd5b337524e601e01d5813ace3f5a432e4"

DEPENDS += " \
    hkg-primitive \
"
