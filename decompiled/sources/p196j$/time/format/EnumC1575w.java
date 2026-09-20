package p196j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.format.w */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1575w {
    public static final EnumC1575w LENIENT;
    public static final EnumC1575w SMART;
    public static final EnumC1575w STRICT;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1575w[] f10768a;

    static {
        EnumC1575w enumC1575w = new EnumC1575w("STRICT", 0);
        STRICT = enumC1575w;
        EnumC1575w enumC1575w2 = new EnumC1575w("SMART", 1);
        SMART = enumC1575w2;
        EnumC1575w enumC1575w3 = new EnumC1575w("LENIENT", 2);
        LENIENT = enumC1575w3;
        f10768a = new EnumC1575w[]{enumC1575w, enumC1575w2, enumC1575w3};
    }

    public static EnumC1575w valueOf(String str) {
        return (EnumC1575w) Enum.valueOf(EnumC1575w.class, str);
    }

    public static EnumC1575w[] values() {
        return (EnumC1575w[]) f10768a.clone();
    }
}
