package p196j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.nio.file.a */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1432a {
    public static final EnumC1432a EXECUTE;
    public static final EnumC1432a READ;
    public static final EnumC1432a WRITE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1432a[] f10514a;

    static {
        EnumC1432a enumC1432a = new EnumC1432a("READ", 0);
        READ = enumC1432a;
        EnumC1432a enumC1432a2 = new EnumC1432a("WRITE", 1);
        WRITE = enumC1432a2;
        EnumC1432a enumC1432a3 = new EnumC1432a("EXECUTE", 2);
        EXECUTE = enumC1432a3;
        f10514a = new EnumC1432a[]{enumC1432a, enumC1432a2, enumC1432a3};
    }

    public static EnumC1432a valueOf(String str) {
        return (EnumC1432a) Enum.valueOf(EnumC1432a.class, str);
    }

    public static EnumC1432a[] values() {
        return (EnumC1432a[]) f10514a.clone();
    }
}
