package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class s160 {
    private static final /* synthetic */ lzv $ENTRIES;
    private static final /* synthetic */ s160[] $VALUES;
    public static final s160 NEW_JOIN_REQUEST;
    public static final s160 REQUEST_ACCEPTED_BY_HOST;
    public static final s160 REQUEST_CANCELLED_AUTOMATICALLY;
    public static final s160 REQUEST_CANCELLED_BY_REQUESTER;
    public static final s160 REQUEST_DECLINED_BY_HOST;
    public static final s160 REQUEST_DECLINED_JAM_ENDED;
    public static final s160 UNKNOWN;

    static {
        s160 s160Var = new s160("UNKNOWN", 0);
        UNKNOWN = s160Var;
        s160 s160Var2 = new s160("NEW_JOIN_REQUEST", 1);
        NEW_JOIN_REQUEST = s160Var2;
        s160 s160Var3 = new s160("REQUEST_DECLINED_BY_HOST", 2);
        REQUEST_DECLINED_BY_HOST = s160Var3;
        s160 s160Var4 = new s160("REQUEST_DECLINED_JAM_ENDED", 3);
        REQUEST_DECLINED_JAM_ENDED = s160Var4;
        s160 s160Var5 = new s160("REQUEST_CANCELLED_BY_REQUESTER", 4);
        REQUEST_CANCELLED_BY_REQUESTER = s160Var5;
        s160 s160Var6 = new s160("REQUEST_ACCEPTED_BY_HOST", 5);
        REQUEST_ACCEPTED_BY_HOST = s160Var6;
        s160 s160Var7 = new s160("REQUEST_CANCELLED_AUTOMATICALLY", 6);
        REQUEST_CANCELLED_AUTOMATICALLY = s160Var7;
        s160[] s160VarArr = {s160Var, s160Var2, s160Var3, s160Var4, s160Var5, s160Var6, s160Var7};
        $VALUES = s160VarArr;
        $ENTRIES = new nzv(s160VarArr);
    }

    public static s160 valueOf(String str) {
        return (s160) Enum.valueOf(s160.class, str);
    }

    public static s160[] values() {
        return (s160[]) $VALUES.clone();
    }
}
