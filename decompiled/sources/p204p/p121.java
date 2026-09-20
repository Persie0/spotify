package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p121 {

    /* JADX INFO: renamed from: a */
    public static final p121 f172930a;

    /* JADX INFO: renamed from: b */
    public static final p121 f172931b;

    /* JADX INFO: renamed from: c */
    public static final p121 f172932c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ p121[] f172933d;

    static {
        p121 p121Var = new p121("TEXT", 0);
        f172930a = p121Var;
        p121 p121Var2 = new p121("VOICE", 1);
        f172931b = p121Var2;
        p121 p121Var3 = new p121("SUGGESTED", 2);
        f172932c = p121Var3;
        f172933d = new p121[]{p121Var, p121Var2, p121Var3};
    }

    public static p121 valueOf(String str) {
        return (p121) Enum.valueOf(p121.class, str);
    }

    public static p121[] values() {
        return (p121[]) f172933d.clone();
    }
}
