package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fdi0 {

    /* JADX INFO: renamed from: a */
    public static final fdi0 f68507a;

    /* JADX INFO: renamed from: b */
    public static final fdi0 f68508b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fdi0[] f68509c;

    static {
        fdi0 fdi0Var = new fdi0("NON_AUTH", 0);
        f68507a = fdi0Var;
        fdi0 fdi0Var2 = new fdi0("AUTH", 1);
        f68508b = fdi0Var2;
        f68509c = new fdi0[]{fdi0Var, fdi0Var2};
    }

    public static fdi0 valueOf(String str) {
        return (fdi0) Enum.valueOf(fdi0.class, str);
    }

    public static fdi0[] values() {
        return (fdi0[]) f68509c.clone();
    }
}
