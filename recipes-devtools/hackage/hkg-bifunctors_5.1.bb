DESCRIPTION = "Bifunctors."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73130196532c7fabf2c21240cf73fe49"

inherit hackage

SRC_URI[md5sum] = "4a15af381b6bc855b55120b60d56e5c6"
SRC_URI[sha256sum] = "0bd9de8dfe8c3c33555cc59fa423edf624761b850252fa2051097e97574635dd"

DEPENDS += " \
    hkg-semigroups \
    hkg-tagged \
"
