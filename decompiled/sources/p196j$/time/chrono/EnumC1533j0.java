package p196j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.chrono.j0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1533j0 implements InterfaceC1536m {

    /* JADX INFO: renamed from: BE */
    public static final EnumC1533j0 f10656BE;
    public static final EnumC1533j0 BEFORE_BE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1533j0[] f10657a;

    static {
        EnumC1533j0 enumC1533j0 = new EnumC1533j0("BEFORE_BE", 0);
        BEFORE_BE = enumC1533j0;
        EnumC1533j0 enumC1533j1 = new EnumC1533j0("BE", 1);
        f10656BE = enumC1533j1;
        f10657a = new EnumC1533j0[]{enumC1533j0, enumC1533j1};
    }

    public static EnumC1533j0 valueOf(String str) {
        return (EnumC1533j0) Enum.valueOf(EnumC1533j0.class, str);
    }

    public static EnumC1533j0[] values() {
        return (EnumC1533j0[]) f10657a.clone();
    }

    @Override // p196j$.time.chrono.InterfaceC1536m
    public final int getValue() {
        return ordinal();
    }
}
