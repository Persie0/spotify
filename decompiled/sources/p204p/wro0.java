package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wro0 {

    /* JADX INFO: renamed from: a */
    public static final wro0 f254396a;

    /* JADX INFO: renamed from: b */
    public static final wro0 f254397b;

    /* JADX INFO: renamed from: c */
    public static final wro0 f254398c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ wro0[] f254399d;

    static {
        wro0 wro0Var = new wro0("PLAYING", 0);
        f254396a = wro0Var;
        wro0 wro0Var2 = new wro0("INACTIVE", 1);
        f254397b = wro0Var2;
        wro0 wro0Var3 = new wro0("PAUSED", 2);
        f254398c = wro0Var3;
        f254399d = new wro0[]{wro0Var, wro0Var2, wro0Var3};
    }

    public static wro0 valueOf(String str) {
        return (wro0) Enum.valueOf(wro0.class, str);
    }

    public static wro0[] values() {
        return (wro0[]) f254399d.clone();
    }
}
