package p196j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.zone.d */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1620d {
    public static final EnumC1620d STANDARD;
    public static final EnumC1620d UTC;
    public static final EnumC1620d WALL;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1620d[] f10879a;

    static {
        EnumC1620d enumC1620d = new EnumC1620d("UTC", 0);
        UTC = enumC1620d;
        EnumC1620d enumC1620d2 = new EnumC1620d("WALL", 1);
        WALL = enumC1620d2;
        EnumC1620d enumC1620d3 = new EnumC1620d("STANDARD", 2);
        STANDARD = enumC1620d3;
        f10879a = new EnumC1620d[]{enumC1620d, enumC1620d2, enumC1620d3};
    }

    public static EnumC1620d valueOf(String str) {
        return (EnumC1620d) Enum.valueOf(EnumC1620d.class, str);
    }

    public static EnumC1620d[] values() {
        return (EnumC1620d[]) f10879a.clone();
    }
}
