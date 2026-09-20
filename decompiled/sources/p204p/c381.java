package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c381 {

    /* JADX INFO: renamed from: a */
    public static final c381 f33605a;

    /* JADX INFO: renamed from: b */
    public static final c381 f33606b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ c381[] f33607c;

    static {
        c381 c381Var = new c381("ABOVE", 0);
        f33605a = c381Var;
        c381 c381Var2 = new c381("BELOW", 1);
        f33606b = c381Var2;
        f33607c = new c381[]{c381Var, c381Var2};
    }

    public static c381 valueOf(String str) {
        return (c381) Enum.valueOf(c381.class, str);
    }

    public static c381[] values() {
        return (c381[]) f33607c.clone();
    }
}
