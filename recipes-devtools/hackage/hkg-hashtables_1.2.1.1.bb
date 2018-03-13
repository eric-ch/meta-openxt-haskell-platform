DESCRIPTION = "This package provides a couple of different implementations of mutable hash tables in the ST monad, as well as a typeclass abstracting their common operations, and a set of wrappers to use the hash tables in the IO monad."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98a00f9d3aa6556d4aa97ecbd31af0ba"

inherit hackage

SRC_URI[md5sum] = "cef5b39623ae6e78f8fa1f036eb27b21"
SRC_URI[sha256sum] = "227f554a93310645c654254659969b347de3d1bf3d98901dbb5c113ece72e951"

DEPENDS += " \
    hkg-text \
    hkg-hashable \
    hkg-primitive \
    hkg-vector \
"
# NOTE: hashtables 1.2.2.{0,1} is not compatible with GHC 7.8.4
