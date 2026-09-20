package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class x4d0 {

    /* JADX INFO: renamed from: a */
    public static final x4d0 f258064a;

    /* JADX INFO: renamed from: b */
    public static final x4d0 f258065b;

    /* JADX INFO: renamed from: c */
    public static final x4d0 f258066c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ x4d0[] f258067d;

    static {
        x4d0 x4d0Var = new x4d0("NORMAL", 0);
        f258064a = x4d0Var;
        x4d0 x4d0Var2 = new x4d0("LINK_TEXT", 1);
        f258065b = x4d0Var2;
        x4d0 x4d0Var3 = new x4d0("LINK_URL", 2);
        f258066c = x4d0Var3;
        f258067d = new x4d0[]{x4d0Var, x4d0Var2, x4d0Var3};
    }

    public static x4d0 valueOf(String str) {
        return (x4d0) Enum.valueOf(x4d0.class, str);
    }

    public static x4d0[] values() {
        return (x4d0[]) f258067d.clone();
    }
}
