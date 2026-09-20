package p196j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.chrono.t */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1543t implements InterfaceC1536m {
    public static final EnumC1543t BCE;

    /* JADX INFO: renamed from: CE */
    public static final EnumC1543t f10680CE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1543t[] f10681a;

    static {
        EnumC1543t enumC1543t = new EnumC1543t("BCE", 0);
        BCE = enumC1543t;
        EnumC1543t enumC1543t2 = new EnumC1543t("CE", 1);
        f10680CE = enumC1543t2;
        f10681a = new EnumC1543t[]{enumC1543t, enumC1543t2};
    }

    public static EnumC1543t valueOf(String str) {
        return (EnumC1543t) Enum.valueOf(EnumC1543t.class, str);
    }

    public static EnumC1543t[] values() {
        return (EnumC1543t[]) f10681a.clone();
    }

    @Override // p196j$.time.chrono.InterfaceC1536m
    public final int getValue() {
        return ordinal();
    }
}
