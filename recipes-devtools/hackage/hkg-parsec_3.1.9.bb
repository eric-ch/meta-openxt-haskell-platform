DESCRIPTION = "Parsec is designed from scratch as an industrial-strength parser library. It is simple, safe, well documented (on the package homepage), has extensive libraries, good error messages, and is fast. It is defined as a monad transformer that can be stacked on arbitrary monads, and it is also parametric in the input stream type."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4b36c87a94916f61cc02d0d4211317ff"

inherit hackage

SRC_URI[md5sum] = "6ec46302afa68518bac5f1117b6349f5"
SRC_URI[sha256sum] = "71f711d24c89581a43b8bc2d3ed56a1a802bbf1cd0b083bc34636c232b0342c9"

DEPENDS += " \
    hkg-mtl \
    hkg-text \
"
