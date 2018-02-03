DESCRIPTION = "Haskell utilities for parsing, filtering, transforming and generating XML documents."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=fe41c6f999f87439d72ea3f6f16d7167"

HPN = "HaXml"
inherit hackage

SRC_URI[md5sum] = "83e174f818a3a3a0a932ae6fc3125691"
SRC_URI[sha256sum] = "6448a7ee1c26159c6c10db93757ed9248f647b1c0c431e7aead6aadd6d2307c7"

DEPENDS += " \
    hkg-random \
    hkg-polyparse \
"
