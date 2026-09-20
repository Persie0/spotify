package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p301 {
    private static final /* synthetic */ lzv $ENTRIES;
    private static final /* synthetic */ p301[] $VALUES;

    @gk60(name = "IN_PERSON")
    public static final p301 IN_PERSON;

    @gk60(name = "REMOTE")
    public static final p301 REMOTE;

    @gk60(name = "REMOTE_V2")
    public static final p301 REMOTE_V2;

    @gk60(name = "UNKNOWN_SESSION_TYPE")
    public static final p301 UNKNOWN_SESSION_TYPE;

    static {
        p301 p301Var = new p301("UNKNOWN_SESSION_TYPE", 0);
        UNKNOWN_SESSION_TYPE = p301Var;
        p301 p301Var2 = new p301("IN_PERSON", 1);
        IN_PERSON = p301Var2;
        p301 p301Var3 = new p301("REMOTE", 2);
        REMOTE = p301Var3;
        p301 p301Var4 = new p301("REMOTE_V2", 3);
        REMOTE_V2 = p301Var4;
        p301[] p301VarArr = {p301Var, p301Var2, p301Var3, p301Var4};
        $VALUES = p301VarArr;
        $ENTRIES = new nzv(p301VarArr);
    }

    public static p301 valueOf(String str) {
        return (p301) Enum.valueOf(p301.class, str);
    }

    public static p301[] values() {
        return (p301[]) $VALUES.clone();
    }
}
