DESCRIPTION = "Profunctors."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f2eb4c28ba2e5751c153c6148f70e9e4"

inherit hackage

SRC_URI[md5sum] = "4c035c81a40396d790606efd575a2bf1"
SRC_URI[sha256sum] = "e0cc9129a4c1d2027cdada0a4cd26e540666a929ebe4e17ce5e2cec02d589682"

DEPENDS += " \
    hkg-bifunctors \
    hkg-comonad \
    hkg-contravariant \
    hkg-distributive \
    hkg-tagged \
"
