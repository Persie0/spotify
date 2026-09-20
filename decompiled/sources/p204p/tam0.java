package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class tam0 {

    /* JADX INFO: renamed from: a */
    public static final tam0 f218633a;

    /* JADX INFO: renamed from: b */
    public static final tam0 f218634b;

    /* JADX INFO: renamed from: c */
    public static final tam0 f218635c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ tam0[] f218636d;

    static {
        tam0 tam0Var = new tam0("IDLE", 0);
        f218633a = tam0Var;
        tam0 tam0Var2 = new tam0("FOCUSED", 1);
        f218634b = tam0Var2;
        tam0 tam0Var3 = new tam0("NOT_FOCUSED", 2);
        f218635c = tam0Var3;
        f218636d = new tam0[]{tam0Var, tam0Var2, tam0Var3};
    }

    public static tam0 valueOf(String str) {
        return (tam0) Enum.valueOf(tam0.class, str);
    }

    public static tam0[] values() {
        return (tam0[]) f218636d.clone();
    }
}
