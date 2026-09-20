package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class t3v0 {

    /* JADX INFO: renamed from: a */
    public static final t3v0 f216842a;

    /* JADX INFO: renamed from: b */
    public static final t3v0 f216843b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ t3v0[] f216844c;

    static {
        t3v0 t3v0Var = new t3v0("CardClicked", 0);
        f216842a = t3v0Var;
        t3v0 t3v0Var2 = new t3v0("CardLongClicked", 1);
        f216843b = t3v0Var2;
        f216844c = new t3v0[]{t3v0Var, t3v0Var2};
    }

    public static t3v0 valueOf(String str) {
        return (t3v0) Enum.valueOf(t3v0.class, str);
    }

    public static t3v0[] values() {
        return (t3v0[]) f216844c.clone();
    }
}
