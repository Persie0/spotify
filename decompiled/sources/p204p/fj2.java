package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class fj2 {

    /* JADX INFO: renamed from: a */
    public static final fj2 f70044a;

    /* JADX INFO: renamed from: b */
    public static final fj2 f70045b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fj2[] f70046c;

    static {
        fj2 fj2Var = new fj2("Completed", 0);
        f70044a = fj2Var;
        fj2 fj2Var2 = new fj2("Failed", 1);
        f70045b = fj2Var2;
        f70046c = new fj2[]{fj2Var, fj2Var2};
    }

    public static fj2 valueOf(String str) {
        return (fj2) Enum.valueOf(fj2.class, str);
    }

    public static fj2[] values() {
        return (fj2[]) f70046c.clone();
    }
}
