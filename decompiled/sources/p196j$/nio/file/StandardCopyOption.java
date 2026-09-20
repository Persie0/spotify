package p196j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class StandardCopyOption implements CopyOption {
    public static final StandardCopyOption ATOMIC_MOVE;
    public static final StandardCopyOption COPY_ATTRIBUTES;
    public static final StandardCopyOption REPLACE_EXISTING;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ StandardCopyOption[] f10513a;

    static {
        StandardCopyOption standardCopyOption = new StandardCopyOption("REPLACE_EXISTING", 0);
        REPLACE_EXISTING = standardCopyOption;
        StandardCopyOption standardCopyOption2 = new StandardCopyOption("COPY_ATTRIBUTES", 1);
        COPY_ATTRIBUTES = standardCopyOption2;
        StandardCopyOption standardCopyOption3 = new StandardCopyOption("ATOMIC_MOVE", 2);
        ATOMIC_MOVE = standardCopyOption3;
        f10513a = new StandardCopyOption[]{standardCopyOption, standardCopyOption2, standardCopyOption3};
    }

    public static StandardCopyOption valueOf(String str) {
        return (StandardCopyOption) Enum.valueOf(StandardCopyOption.class, str);
    }

    public static StandardCopyOption[] values() {
        return (StandardCopyOption[]) f10513a.clone();
    }
}
