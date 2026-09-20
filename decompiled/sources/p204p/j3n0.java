package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j3n0 {
    private static final /* synthetic */ lzv $ENTRIES;
    private static final /* synthetic */ j3n0[] $VALUES;

    @gk60(name = "DISABLED")
    public static final j3n0 DISABLED;

    @gk60(name = "ENABLED")
    public static final j3n0 ENABLED;

    @gk60(name = "UNAVAILABLE")
    public static final j3n0 UNAVAILABLE;

    static {
        j3n0 j3n0Var = new j3n0("UNAVAILABLE", 0);
        UNAVAILABLE = j3n0Var;
        j3n0 j3n0Var2 = new j3n0("ENABLED", 1);
        ENABLED = j3n0Var2;
        j3n0 j3n0Var3 = new j3n0("DISABLED", 2);
        DISABLED = j3n0Var3;
        j3n0[] j3n0VarArr = {j3n0Var, j3n0Var2, j3n0Var3};
        $VALUES = j3n0VarArr;
        $ENTRIES = new nzv(j3n0VarArr);
    }

    public static j3n0 valueOf(String str) {
        return (j3n0) Enum.valueOf(j3n0.class, str);
    }

    public static j3n0[] values() {
        return (j3n0[]) $VALUES.clone();
    }
}
