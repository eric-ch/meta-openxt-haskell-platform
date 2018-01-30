DESCRIPTION = "In mathematics, a semigroup is an algebraic structure consisting of a set together with an associative binary operation. A semigroup generalizes a monoid in that there might not exist an identity element. It also (originally) generalized a group (a monoid with all inverses) to a type where every element did not have to have an inverse, thus the name semigroup."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a334afc29ca5fa43de3ec039a04dca8b"

inherit hackage

SRC_URI[md5sum] = "f8f0630f5f715b5693682895cd57cc46"
SRC_URI[sha256sum] = "fc923f7d1fdc0062416a61f6ab96b4e1958e1aee1ddf1c71fa2cc6d08154e44e"

DEPENDS += " \
    hkg-text \
"
