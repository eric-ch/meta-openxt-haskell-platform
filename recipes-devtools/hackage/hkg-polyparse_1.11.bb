DESCRIPTION = "A variety of alternative parser combinator libraries, including the original HuttonMeijer set. The Poly sets have features like good error reporting, arbitrary token type, running state, lazy parsing, and so on. Finally, Text.Parse is a proposed replacement for the standard Read class, for better deserialisation of Haskell values from Strings."
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=271beef410de4146a7e52374fbba02d3"

inherit hackage

SRC_URI[md5sum] = "56df08f5256bd777c01a428a003696bc"
SRC_URI[sha256sum] = "30ef045a25bd7de0f3507ed1161aab35b5711120d315b15f23558205903b81fc"

DEPENDS += " \
    hkg-text \
"
