package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class cl11 {

    /* JADX INFO: renamed from: a */
    public static final cl11 f39150a;

    /* JADX INFO: renamed from: b */
    public static final cl11 f39151b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cl11[] f39152c;

    static {
        cl11 cl11Var = new cl11("RowClicked", 0);
        f39150a = cl11Var;
        cl11 cl11Var2 = new cl11("FollowButtonClicked", 1);
        f39151b = cl11Var2;
        f39152c = new cl11[]{cl11Var, cl11Var2};
    }

    public static cl11 valueOf(String str) {
        return (cl11) Enum.valueOf(cl11.class, str);
    }

    public static cl11[] values() {
        return (cl11[]) f39152c.clone();
    }
}
