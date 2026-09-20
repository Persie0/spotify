package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum scf1 implements naf1 {
    /* JADX INFO: Fake field, exist only in values array */
    NET_CAPABILITY_BIP(0),
    NET_CAPABILITY_MMS(1),
    NET_CAPABILITY_SUPL(2),
    NET_CAPABILITY_DUN(3),
    NET_CAPABILITY_FOTA(4),
    NET_CAPABILITY_IMS(5),
    NET_CAPABILITY_CBS(6),
    NET_CAPABILITY_WIFI_P2P(7),
    NET_CAPABILITY_IA(8),
    NET_CAPABILITY_RCS(9),
    NET_CAPABILITY_XCAP(10),
    NET_CAPABILITY_EIMS(11),
    NET_CAPABILITY_NOT_METERED(12),
    NET_CAPABILITY_INTERNET(13),
    NET_CAPABILITY_NOT_RESTRICTED(14),
    NET_CAPABILITY_TRUSTED(15),
    NET_CAPABILITY_NOT_VPN(16),
    NET_CAPABILITY_VALIDATED(17),
    NET_CAPABILITY_CAPTIVE_PORTAL(18),
    NET_CAPABILITY_NOT_ROAMING(19),
    NET_CAPABILITY_FOREGROUND(20),
    NET_CAPABILITY_NOT_CONGESTED(21),
    NET_CAPABILITY_NOT_SUSPENDED(22),
    /* JADX INFO: Fake field, exist only in values array */
    SDK_RECAPTCHA_NET_REACHABLE(23),
    NET_CAPABILITY_MCX(24),
    /* JADX INFO: Fake field, exist only in values array */
    SDK_RECAPTCHA_NET_REACHABLE(25),
    NET_CAPABILITY_TEMPORARILY_NOT_METERED(26),
    /* JADX INFO: Fake field, exist only in values array */
    SDK_RECAPTCHA_NET_REACHABLE(27),
    /* JADX INFO: Fake field, exist only in values array */
    NET_CAPABILITY_BIP(28),
    /* JADX INFO: Fake field, exist only in values array */
    SDK_RECAPTCHA_NET_REACHABLE(29),
    NET_CAPABILITY_ENTERPRISE(30),
    /* JADX INFO: Fake field, exist only in values array */
    SDK_RECAPTCHA_NET_REACHABLE(31),
    /* JADX INFO: Fake field, exist only in values array */
    NET_CAPABILITY_BIP(32),
    NET_CAPABILITY_HEAD_UNIT(33),
    NET_CAPABILITY_MMTEL(34),
    NET_CAPABILITY_PRIORITIZE_LATENCY(35),
    NET_CAPABILITY_PRIORITIZE_BANDWIDTH(36),
    /* JADX INFO: Fake field, exist only in values array */
    SDK_RECAPTCHA_NET_REACHABLE(37),
    TRANSPORT_WIFI(38),
    TRANSPORT_CELLULAR(39),
    TRANSPORT_VPN(40),
    TRANSPORT_ETHERNET(41),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f207737a;

    scf1(int i) {
        this.f207737a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f207737a);
    }
}
