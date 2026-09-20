package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class ylq0 {

    /* JADX INFO: renamed from: a */
    public static final ylq0 f274074a;

    /* JADX INFO: renamed from: b */
    public static final ylq0 f274075b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ylq0[] f274076c;

    static {
        ylq0 ylq0Var = new ylq0("COLLAPSED", 0);
        f274074a = ylq0Var;
        ylq0 ylq0Var2 = new ylq0("EXPANDED", 1);
        f274075b = ylq0Var2;
        f274076c = new ylq0[]{ylq0Var, ylq0Var2};
    }

    public static ylq0 valueOf(String str) {
        return (ylq0) Enum.valueOf(ylq0.class, str);
    }

    public static ylq0[] values() {
        return (ylq0[]) f274076c.clone();
    }
}
