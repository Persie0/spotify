package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class cg9 {

    /* JADX INFO: renamed from: a */
    public static final cg9 f37597a;

    /* JADX INFO: renamed from: b */
    public static final cg9 f37598b;

    /* JADX INFO: renamed from: c */
    public static final cg9 f37599c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cg9[] f37600d;

    static {
        cg9 cg9Var = new cg9("SELF_ONLY", 0);
        f37597a = cg9Var;
        cg9 cg9Var2 = new cg9("CONNECTIONS_ONLY", 1);
        f37598b = cg9Var2;
        cg9 cg9Var3 = new cg9("PUBLIC", 2);
        f37599c = cg9Var3;
        f37600d = new cg9[]{cg9Var, cg9Var2, cg9Var3};
    }

    public static cg9 valueOf(String str) {
        return (cg9) Enum.valueOf(cg9.class, str);
    }

    public static cg9[] values() {
        return (cg9[]) f37600d.clone();
    }
}
