package p196j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.format.x */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1576x {
    public static final EnumC1576x ALWAYS;
    public static final EnumC1576x EXCEEDS_PAD;
    public static final EnumC1576x NEVER;
    public static final EnumC1576x NORMAL;
    public static final EnumC1576x NOT_NEGATIVE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1576x[] f10769a;

    static {
        EnumC1576x enumC1576x = new EnumC1576x("NORMAL", 0);
        NORMAL = enumC1576x;
        EnumC1576x enumC1576x2 = new EnumC1576x("ALWAYS", 1);
        ALWAYS = enumC1576x2;
        EnumC1576x enumC1576x3 = new EnumC1576x("NEVER", 2);
        NEVER = enumC1576x3;
        EnumC1576x enumC1576x4 = new EnumC1576x("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = enumC1576x4;
        EnumC1576x enumC1576x5 = new EnumC1576x("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = enumC1576x5;
        f10769a = new EnumC1576x[]{enumC1576x, enumC1576x2, enumC1576x3, enumC1576x4, enumC1576x5};
    }

    public static EnumC1576x valueOf(String str) {
        return (EnumC1576x) Enum.valueOf(EnumC1576x.class, str);
    }

    public static EnumC1576x[] values() {
        return (EnumC1576x[]) f10769a.clone();
    }
}
