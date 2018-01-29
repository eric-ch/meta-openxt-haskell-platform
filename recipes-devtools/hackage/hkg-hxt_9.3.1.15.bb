DESCRIPTION = "The Haskell XML Toolbox bases on the ideas of HaXml and HXML, but introduces a more general approach for processing XML with Haskell."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cb61534369f1bbb7cbe62e014d3d5717"

inherit hackage

SRC_URI[md5sum] = "f2d996c22736ded04d4a987d12767d3b"
SRC_URI[sha256sum] = "723e7b3c22f58771087e7763d11702b3ae3aa910158a2beee70e973722966560"

DEPENDS += " \
    hkg-hunit \
    hkg-hxt-charproperties \
    hkg-hxt-regex-xmlschema \
    hkg-hxt-unicode \
    hkg-mtl \
    hkg-network \
    hkg-network-uri \
    hkg-parsec \
"
