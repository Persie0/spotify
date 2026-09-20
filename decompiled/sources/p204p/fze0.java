package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class fze0 {

    /* JADX INFO: renamed from: a */
    public static final fze0 f74992a;

    /* JADX INFO: renamed from: b */
    public static final fze0 f74993b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fze0[] f74994c;

    static {
        fze0 fze0Var = new fze0("CancelButtonClicked", 0);
        f74992a = fze0Var;
        fze0 fze0Var2 = new fze0("DisableMixButtonClicked", 1);
        f74993b = fze0Var2;
        f74994c = new fze0[]{fze0Var, fze0Var2};
    }

    public static fze0 valueOf(String str) {
        return (fze0) Enum.valueOf(fze0.class, str);
    }

    public static fze0[] values() {
        return (fze0[]) f74994c.clone();
    }
}
