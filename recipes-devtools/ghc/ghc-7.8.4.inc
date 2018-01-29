require ghc-common.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/ghc-7:"
SRC_URI = " \
    https://downloads.haskell.org/~ghc/${PV}/ghc-${PV}-src.tar.bz2 \
    file://build.mk \
"
SRC_URI[md5sum] = "f4b8c79c356be70a1b340e19c24a01c1"
SRC_URI[sha256sum] = "59e3bd514a1820cc1c03e1808282205c0b8518369acae12645ceaf839e6f114b"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7cb08deb79c4385547f57d6bb2864e0f"

do_compile() {
    cp ${WORKDIR}/build.mk ${S}/mk/
    oe_runmake
}

do_install() {
    oe_runmake install DESTDIR="${D}"
}
