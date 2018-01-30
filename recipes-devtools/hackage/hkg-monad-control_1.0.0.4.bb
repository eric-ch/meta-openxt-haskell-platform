DESCRIPTION = "This package defines the type class MonadBaseControl, a subset of MonadBase into which generic control operations such as catch can be lifted from IO or any other base monad. Instances are based on monad transformers in MonadTransControl, which includes all standard monad transformers in the transformers library except ContT."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=67634a94867d2b4cea9192052bca1335"

inherit hackage

SRC_URI[md5sum] = "0b7a04457195df963ae088ac2ff1b057"
SRC_URI[sha256sum] = "e984b7346af6d31b7ce918e1a0263075af8cbcf5440bc3df698d0354c90df61e"

DEPENDS += " \
    hkg-stm \
    hkg-transformers-base \
    hkg-transformers-compat \
"
