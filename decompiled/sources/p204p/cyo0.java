package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class cyo0 {

    /* JADX INFO: renamed from: a */
    public static final cyo0 f43334a;

    /* JADX INFO: renamed from: b */
    public static final cyo0 f43335b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cyo0[] f43336c;

    static {
        cyo0 cyo0Var = new cyo0("AVAILABLE", 0);
        f43334a = cyo0Var;
        cyo0 cyo0Var2 = new cyo0("NOT_AVAILABLE", 1);
        f43335b = cyo0Var2;
        f43336c = new cyo0[]{cyo0Var, cyo0Var2};
    }

    public static cyo0 valueOf(String str) {
        return (cyo0) Enum.valueOf(cyo0.class, str);
    }

    public static cyo0[] values() {
        return (cyo0[]) f43336c.clone();
    }
}
