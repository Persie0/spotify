package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class cvh0 {

    /* JADX INFO: renamed from: a */
    public static final cvh0 f42432a;

    /* JADX INFO: renamed from: b */
    public static final cvh0 f42433b;

    /* JADX INFO: renamed from: c */
    public static final cvh0 f42434c;

    /* JADX INFO: renamed from: d */
    public static final cvh0 f42435d;

    /* JADX INFO: renamed from: e */
    public static final cvh0 f42436e;

    /* JADX INFO: renamed from: f */
    public static final cvh0 f42437f;

    /* JADX INFO: renamed from: g */
    public static final cvh0 f42438g;

    /* JADX INFO: renamed from: h */
    public static final cvh0 f42439h;

    /* JADX INFO: renamed from: i */
    public static final cvh0 f42440i;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ cvh0[] f42441t;

    static {
        cvh0 cvh0Var = new cvh0("IDLE", 0);
        f42432a = cvh0Var;
        cvh0 cvh0Var2 = new cvh0("RELOADING", 1);
        f42433b = cvh0Var2;
        cvh0 cvh0Var3 = new cvh0("RELOADING_INVALID_PAYMENT", 2);
        f42434c = cvh0Var3;
        cvh0 cvh0Var4 = new cvh0("EDITING_ADDRESS", 3);
        f42435d = cvh0Var4;
        cvh0 cvh0Var5 = new cvh0("EDITING_PAYMENT", 4);
        f42436e = cvh0Var5;
        cvh0 cvh0Var6 = new cvh0("EJECTED_TO_WEB", 5);
        f42437f = cvh0Var6;
        cvh0 cvh0Var7 = new cvh0("CHECKING_IF_COMPLETE", 6);
        f42438g = cvh0Var7;
        cvh0 cvh0Var8 = new cvh0("SUBMITTING_CHECKOUT", 7);
        f42439h = cvh0Var8;
        cvh0 cvh0Var9 = new cvh0("SUBMITTING_CHECKOUT_WITH_CPD", 8);
        f42440i = cvh0Var9;
        f42441t = new cvh0[]{cvh0Var, cvh0Var2, cvh0Var3, cvh0Var4, cvh0Var5, cvh0Var6, cvh0Var7, cvh0Var8, cvh0Var9};
    }

    public static cvh0 valueOf(String str) {
        return (cvh0) Enum.valueOf(cvh0.class, str);
    }

    public static cvh0[] values() {
        return (cvh0[]) f42441t.clone();
    }
}
