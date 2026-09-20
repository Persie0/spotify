package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class zl31 {

    /* JADX INFO: renamed from: a */
    public static final zl31 f283899a;

    /* JADX INFO: renamed from: b */
    public static final zl31 f283900b;

    /* JADX INFO: renamed from: c */
    public static final zl31 f283901c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ zl31[] f283902d;

    static {
        zl31 zl31Var = new zl31("Track", 0);
        f283899a = zl31Var;
        zl31 zl31Var2 = new zl31("Contributor", 1);
        f283900b = zl31Var2;
        zl31 zl31Var3 = new zl31("Sample", 2);
        f283901c = zl31Var3;
        f283902d = new zl31[]{zl31Var, zl31Var2, zl31Var3};
    }

    public static zl31 valueOf(String str) {
        return (zl31) Enum.valueOf(zl31.class, str);
    }

    public static zl31[] values() {
        return (zl31[]) f283902d.clone();
    }
}
