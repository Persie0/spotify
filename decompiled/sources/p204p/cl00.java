package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class cl00 {

    /* JADX INFO: renamed from: a */
    public static final cl00 f39139a;

    /* JADX INFO: renamed from: b */
    public static final cl00 f39140b;

    /* JADX INFO: renamed from: c */
    public static final cl00 f39141c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cl00[] f39142d;

    static {
        cl00 cl00Var = new cl00("UNKNOWN", 0);
        f39139a = cl00Var;
        cl00 cl00Var2 = new cl00("DEFAULT", 1);
        f39140b = cl00Var2;
        cl00 cl00Var3 = new cl00("YUV", 2);
        f39141c = cl00Var3;
        f39142d = new cl00[]{cl00Var, cl00Var2, cl00Var3};
    }

    public static cl00 valueOf(String str) {
        return (cl00) Enum.valueOf(cl00.class, str);
    }

    public static cl00[] values() {
        return (cl00[]) f39142d.clone();
    }
}
