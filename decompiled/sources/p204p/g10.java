package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g10 {

    /* JADX INFO: renamed from: a */
    public static final g10 f75501a;

    /* JADX INFO: renamed from: b */
    public static final g10 f75502b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ g10[] f75503c;

    static {
        g10 g10Var = new g10("Download", 0);
        f75501a = g10Var;
        g10 g10Var2 = new g10("RemoveDownload", 1);
        f75502b = g10Var2;
        f75503c = new g10[]{g10Var, g10Var2};
    }

    public static g10 valueOf(String str) {
        return (g10) Enum.valueOf(g10.class, str);
    }

    public static g10[] values() {
        return (g10[]) f75503c.clone();
    }
}
