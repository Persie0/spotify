package p196j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.chrono.d0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1521d0 implements InterfaceC1536m {
    public static final EnumC1521d0 BEFORE_ROC;
    public static final EnumC1521d0 ROC;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1521d0[] f10639a;

    static {
        EnumC1521d0 enumC1521d0 = new EnumC1521d0("BEFORE_ROC", 0);
        BEFORE_ROC = enumC1521d0;
        EnumC1521d0 enumC1521d1 = new EnumC1521d0("ROC", 1);
        ROC = enumC1521d1;
        f10639a = new EnumC1521d0[]{enumC1521d0, enumC1521d1};
    }

    public static EnumC1521d0 valueOf(String str) {
        return (EnumC1521d0) Enum.valueOf(EnumC1521d0.class, str);
    }

    public static EnumC1521d0[] values() {
        return (EnumC1521d0[]) f10639a.clone();
    }

    @Override // p196j$.time.chrono.InterfaceC1536m
    public final int getValue() {
        return ordinal();
    }
}
