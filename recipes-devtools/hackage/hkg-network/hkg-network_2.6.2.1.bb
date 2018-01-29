DESCRIPTION = "This package provides a low-level networking interface."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78dd98be72709820ee0098ba6a71a888"

inherit hackage

SRC_URI[md5sum] = "c58ab6f46a20a755970bec73f7bd4612"
SRC_URI[sha256sum] = "a3fda15c9bbe2c7274d97f40398c6cf8d1d3a9fe896fbf6531e1bfc849bb1bfa"

FILESEXTRAPATHS_prepend := "${THISDIR}/patches:"
SRC_URI =+ " \
    file://duplicated-inline-functions.patch \
"
