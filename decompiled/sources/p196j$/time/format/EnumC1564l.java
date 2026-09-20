package p196j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.format.l */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1564l implements InterfaceC1557e {
    public static final EnumC1564l INSENSITIVE;
    public static final EnumC1564l LENIENT;
    public static final EnumC1564l SENSITIVE;
    public static final EnumC1564l STRICT;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1564l[] f10732a;

    static {
        EnumC1564l enumC1564l = new EnumC1564l("SENSITIVE", 0);
        SENSITIVE = enumC1564l;
        EnumC1564l enumC1564l2 = new EnumC1564l("INSENSITIVE", 1);
        INSENSITIVE = enumC1564l2;
        EnumC1564l enumC1564l3 = new EnumC1564l("STRICT", 2);
        STRICT = enumC1564l3;
        EnumC1564l enumC1564l4 = new EnumC1564l("LENIENT", 3);
        LENIENT = enumC1564l4;
        f10732a = new EnumC1564l[]{enumC1564l, enumC1564l2, enumC1564l3, enumC1564l4};
    }

    public static EnumC1564l valueOf(String str) {
        return (EnumC1564l) Enum.valueOf(EnumC1564l.class, str);
    }

    public static EnumC1564l[] values() {
        return (EnumC1564l[]) f10732a.clone();
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: E */
    public final int mo24064E(C1570r c1570r, CharSequence charSequence, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            c1570r.f10753b = true;
            return i;
        }
        if (iOrdinal == 1) {
            c1570r.f10753b = false;
            return i;
        }
        if (iOrdinal == 2) {
            c1570r.f10754c = true;
            return i;
        }
        if (iOrdinal != 3) {
            return i;
        }
        c1570r.f10754c = false;
        return i;
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: r */
    public final boolean mo24065r(C1571s c1571s, StringBuilder sb) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
