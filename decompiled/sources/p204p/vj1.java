package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class vj1 {

    /* JADX INFO: renamed from: a */
    public static final vj1 f241850a;

    /* JADX INFO: renamed from: b */
    public static final vj1 f241851b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ vj1[] f241852c;

    static {
        vj1 vj1Var = new vj1("AddHit", 0);
        f241850a = vj1Var;
        vj1 vj1Var2 = new vj1("AddedHit", 1);
        f241851b = vj1Var2;
        f241852c = new vj1[]{vj1Var, vj1Var2};
    }

    public static vj1 valueOf(String str) {
        return (vj1) Enum.valueOf(vj1.class, str);
    }

    public static vj1[] values() {
        return (vj1[]) f241852c.clone();
    }
}
