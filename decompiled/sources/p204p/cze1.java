package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class cze1 {

    /* JADX INFO: renamed from: a */
    public static final cze1 f43545a;

    /* JADX INFO: renamed from: b */
    public static final cze1 f43546b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cze1[] f43547c;

    static {
        cze1 cze1Var = new cze1("CONNECT", 0);
        f43545a = cze1Var;
        cze1 cze1Var2 = new cze1("CAST", 1);
        f43546b = cze1Var2;
        f43547c = new cze1[]{cze1Var, cze1Var2};
    }

    public static cze1 valueOf(String str) {
        return (cze1) Enum.valueOf(cze1.class, str);
    }

    public static cze1[] values() {
        return (cze1[]) f43547c.clone();
    }
}
