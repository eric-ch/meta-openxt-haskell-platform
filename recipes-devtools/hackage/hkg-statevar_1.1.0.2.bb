DESCRIPTION = "This package contains state variables, which are references in the IO monad, like IORefs or parts of the OpenGL state."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6d8bd1ec11fed35e94511f357c1176eb"

HPN = "StateVar"
inherit hackage

SRC_URI[md5sum] = "2c3506a57ba53fa335283e8e437ab5d5"
SRC_URI[sha256sum] = "051c4b98bc4456afe4eb26f775ab0aa370e9e12b1588d5865abd5b0aea83c3f9"

DEPENDS += " \
    hkg-stm \
"
