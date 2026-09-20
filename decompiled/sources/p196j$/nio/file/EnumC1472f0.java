package p196j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.nio.file.f0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1472f0 implements InterfaceC1498u {
    public static final EnumC1472f0 APPEND;
    public static final EnumC1472f0 CREATE;
    public static final EnumC1472f0 CREATE_NEW;
    public static final EnumC1472f0 DELETE_ON_CLOSE;
    public static final EnumC1472f0 DSYNC;
    public static final EnumC1472f0 READ;
    public static final EnumC1472f0 SPARSE;
    public static final EnumC1472f0 SYNC;
    public static final EnumC1472f0 TRUNCATE_EXISTING;
    public static final EnumC1472f0 WRITE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1472f0[] f10551a;

    static {
        EnumC1472f0 enumC1472f0 = new EnumC1472f0("READ", 0);
        READ = enumC1472f0;
        EnumC1472f0 enumC1472f1 = new EnumC1472f0("WRITE", 1);
        WRITE = enumC1472f1;
        EnumC1472f0 enumC1472f2 = new EnumC1472f0("APPEND", 2);
        APPEND = enumC1472f2;
        EnumC1472f0 enumC1472f3 = new EnumC1472f0("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = enumC1472f3;
        EnumC1472f0 enumC1472f4 = new EnumC1472f0("CREATE", 4);
        CREATE = enumC1472f4;
        EnumC1472f0 enumC1472f5 = new EnumC1472f0("CREATE_NEW", 5);
        CREATE_NEW = enumC1472f5;
        EnumC1472f0 enumC1472f6 = new EnumC1472f0("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = enumC1472f6;
        EnumC1472f0 enumC1472f7 = new EnumC1472f0("SPARSE", 7);
        SPARSE = enumC1472f7;
        EnumC1472f0 enumC1472f8 = new EnumC1472f0("SYNC", 8);
        SYNC = enumC1472f8;
        EnumC1472f0 enumC1472f9 = new EnumC1472f0("DSYNC", 9);
        DSYNC = enumC1472f9;
        f10551a = new EnumC1472f0[]{enumC1472f0, enumC1472f1, enumC1472f2, enumC1472f3, enumC1472f4, enumC1472f5, enumC1472f6, enumC1472f7, enumC1472f8, enumC1472f9};
    }

    public static EnumC1472f0 valueOf(String str) {
        return (EnumC1472f0) Enum.valueOf(EnumC1472f0.class, str);
    }

    public static EnumC1472f0[] values() {
        return (EnumC1472f0[]) f10551a.clone();
    }
}
