package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vp71 {

    /* JADX INFO: renamed from: a */
    public static final vp71 f243614a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ vp71[] f243615b;

    static {
        vp71 vp71Var = new vp71("QUICK", 0);
        f243614a = vp71Var;
        f243615b = new vp71[]{vp71Var, new vp71("HIGH", 1)};
    }

    public static vp71 valueOf(String str) {
        return (vp71) Enum.valueOf(vp71.class, str);
    }

    public static vp71[] values() {
        return (vp71[]) f243615b.clone();
    }
}
