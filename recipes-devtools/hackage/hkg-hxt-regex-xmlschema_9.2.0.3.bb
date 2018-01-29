DESCRIPTION = "This library supports full W3C XML Schema regular expressions inclusive all Unicode character sets and blocks."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cb61534369f1bbb7cbe62e014d3d5717"

inherit hackage

SRC_URI[md5sum] = "7b875bedc63771bad57e42164387c4db"
SRC_URI[sha256sum] = "f4743ba65498d6001cdfcf5cbc3317d4bc43941be5c7030b60beb83408c892b0"

DEPENDS += " \
    hkg-parsec \
    hkg-hxt-charproperties \
"
