package p196j$.nio.file.attribute;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.nio.file.attribute.w */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1459w {
    public static final EnumC1459w GROUP_EXECUTE;
    public static final EnumC1459w GROUP_READ;
    public static final EnumC1459w GROUP_WRITE;
    public static final EnumC1459w OTHERS_EXECUTE;
    public static final EnumC1459w OTHERS_READ;
    public static final EnumC1459w OTHERS_WRITE;
    public static final EnumC1459w OWNER_EXECUTE;
    public static final EnumC1459w OWNER_READ;
    public static final EnumC1459w OWNER_WRITE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1459w[] f10539a;

    static {
        EnumC1459w enumC1459w = new EnumC1459w("OWNER_READ", 0);
        OWNER_READ = enumC1459w;
        EnumC1459w enumC1459w2 = new EnumC1459w("OWNER_WRITE", 1);
        OWNER_WRITE = enumC1459w2;
        EnumC1459w enumC1459w3 = new EnumC1459w("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = enumC1459w3;
        EnumC1459w enumC1459w4 = new EnumC1459w("GROUP_READ", 3);
        GROUP_READ = enumC1459w4;
        EnumC1459w enumC1459w5 = new EnumC1459w("GROUP_WRITE", 4);
        GROUP_WRITE = enumC1459w5;
        EnumC1459w enumC1459w6 = new EnumC1459w("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = enumC1459w6;
        EnumC1459w enumC1459w7 = new EnumC1459w("OTHERS_READ", 6);
        OTHERS_READ = enumC1459w7;
        EnumC1459w enumC1459w8 = new EnumC1459w("OTHERS_WRITE", 7);
        OTHERS_WRITE = enumC1459w8;
        EnumC1459w enumC1459w9 = new EnumC1459w("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = enumC1459w9;
        f10539a = new EnumC1459w[]{enumC1459w, enumC1459w2, enumC1459w3, enumC1459w4, enumC1459w5, enumC1459w6, enumC1459w7, enumC1459w8, enumC1459w9};
    }

    public static EnumC1459w valueOf(String str) {
        return (EnumC1459w) Enum.valueOf(EnumC1459w.class, str);
    }

    public static EnumC1459w[] values() {
        return (EnumC1459w[]) f10539a.clone();
    }
}
