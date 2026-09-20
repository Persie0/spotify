package p196j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.nio.file.n */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1487n {
    public static final EnumC1487n END_DIRECTORY;
    public static final EnumC1487n ENTRY;
    public static final EnumC1487n START_DIRECTORY;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1487n[] f10576a;

    static {
        EnumC1487n enumC1487n = new EnumC1487n("START_DIRECTORY", 0);
        START_DIRECTORY = enumC1487n;
        EnumC1487n enumC1487n2 = new EnumC1487n("END_DIRECTORY", 1);
        END_DIRECTORY = enumC1487n2;
        EnumC1487n enumC1487n3 = new EnumC1487n("ENTRY", 2);
        ENTRY = enumC1487n3;
        f10576a = new EnumC1487n[]{enumC1487n, enumC1487n2, enumC1487n3};
    }

    public static EnumC1487n valueOf(String str) {
        return (EnumC1487n) Enum.valueOf(EnumC1487n.class, str);
    }

    public static EnumC1487n[] values() {
        return (EnumC1487n[]) f10576a.clone();
    }
}
