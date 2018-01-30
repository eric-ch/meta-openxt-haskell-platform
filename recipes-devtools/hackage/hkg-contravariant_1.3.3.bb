DESCRIPTION = "Contravariant functors."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7d61d6ba3edb07f32ff749898db116c0"

inherit hackage

SRC_URI[md5sum] = "18c806028daebcb89dd5f1eb3f5e1ad0"
SRC_URI[sha256sum] = "65390e2bde01c1cc91cfe414b5ad0aa9dcb26e527f0646719d19dbaf616590a0"

DEPENDS += " \
    hkg-statevar \
    hkg-semigroups \
    hkg-transformers-compat \
    hkg-void \
"
