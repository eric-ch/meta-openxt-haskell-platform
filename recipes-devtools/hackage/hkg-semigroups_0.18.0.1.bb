DESCRIPTION = "In mathematics, a semigroup is an algebraic structure consisting of a set together with an associative binary operation. A semigroup generalizes a monoid in that there might not exist an identity element. It also (originally) generalized a group (a monoid with all inverses) to a type where every element did not have to have an inverse, thus the name semigroup."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a38bfee1357b68d214d9aab35f38aa98"

inherit hackage

SRC_URI[md5sum] = "f4a3636d007be86d63d5b0d623e2b32a"
SRC_URI[sha256sum] = "f6e787519acf261e823d529cc3e5d4fca019075f39f8986649f21891d06d3115"

DEPENDS += " \
    hkg-hashable \
    hkg-nats \
    hkg-tagged \
    hkg-text \
    hkg-unordered-containers \
"
