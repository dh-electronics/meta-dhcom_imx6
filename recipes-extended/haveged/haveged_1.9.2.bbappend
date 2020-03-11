
do_install_append() {
    # The exit status is 143 when the service is stopped
    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        sed -i '/ExecStart/a SuccessExitStatus=143' ${D}${systemd_system_unitdir}/haveged.service
        # Hybrid systemd-sysvinit distros must install the initscript manually
        if ${@bb.utils.contains('DISTRO_FEATURES', 'sysvinit', 'true', 'false', d)}; then
            install -d ${D}${INIT_D_DIR}
            sed -e "s,@SBINDIR@,${sbindir},g" <${S}/init.d/sysv.redhat >${D}${INIT_D_DIR}/haveged
            chmod 755 ${D}${INIT_D_DIR}/haveged
        fi
    fi
}

