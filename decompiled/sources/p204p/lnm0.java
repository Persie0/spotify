package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class lnm0 {

    /* JADX INFO: renamed from: a */
    public static final lnm0 f135178a;

    /* JADX INFO: renamed from: b */
    public static final lnm0 f135179b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ lnm0[] f135180c;

    static {
        lnm0 lnm0Var = new lnm0("Visible", 0);
        f135178a = lnm0Var;
        lnm0 lnm0Var2 = new lnm0("Hidden", 1);
        f135179b = lnm0Var2;
        f135180c = new lnm0[]{lnm0Var, lnm0Var2};
    }

    public static lnm0 valueOf(String str) {
        return (lnm0) Enum.valueOf(lnm0.class, str);
    }

    public static lnm0[] values() {
        return (lnm0[]) f135180c.clone();
    }
}
