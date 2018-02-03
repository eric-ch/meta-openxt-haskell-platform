DESCRIPTION = "Bindings for the libXML2 SAX interface."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.txt;md5=ef44aa0bc0c7e388835dcf37047c3bc3"

inherit hackage pkgconfig

SRC_URI[md5sum] = "c2ee96657807cd75f400c58c7a7134d3"
SRC_URI[sha256sum] = "99141784cc0d6c5749f0df618b2d46922391eede09f4f9ccfc36fb58a9c16d51"

DEPENDS += " \
    libxml2 \
    hkg-xml-types \
    hkg-text \
"
