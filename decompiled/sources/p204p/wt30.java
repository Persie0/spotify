package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wt30 {
    private static final /* synthetic */ lzv $ENTRIES;
    private static final /* synthetic */ wt30[] $VALUES;

    @gk60(name = "TEXT")
    public static final wt30 TEXT;

    @gk60(name = "UNKNOWN")
    public static final wt30 UNKNOWN;

    static {
        wt30 wt30Var = new wt30("TEXT", 0);
        TEXT = wt30Var;
        wt30 wt30Var2 = new wt30("UNKNOWN", 1);
        UNKNOWN = wt30Var2;
        wt30[] wt30VarArr = {wt30Var, wt30Var2};
        $VALUES = wt30VarArr;
        $ENTRIES = new nzv(wt30VarArr);
    }

    /* JADX INFO: renamed from: a */
    public static lzv m88904a() {
        return $ENTRIES;
    }

    public static wt30 valueOf(String str) {
        return (wt30) Enum.valueOf(wt30.class, str);
    }

    public static wt30[] values() {
        return (wt30[]) $VALUES.clone();
    }
}
