DESCRIPTION = "Lifted-base exports IO operations from the base library lifted to any instance of MonadBase or MonadBaseControl."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=167e598e7d6aab2d167b4246f744a8bd"

inherit hackage

SRC_URI[md5sum] = "83c1c1be3194fefb4f0f78ddf9394352"
SRC_URI[sha256sum] = "57c5837d83f569bb72136ca89256e50e1ac168ee935804a8e7763e9d8322e1fb"

DEPENDS += " \
    hkg-base-unicode-symbols \
    hkg-monad-control \
    hkg-transformers-base \
"
