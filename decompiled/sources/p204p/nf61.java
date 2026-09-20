package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nf61 {

    /* JADX INFO: renamed from: a */
    public static final nf61 f153257a;

    /* JADX INFO: renamed from: b */
    public static final nf61 f153258b;

    /* JADX INFO: renamed from: c */
    public static final nf61 f153259c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nf61[] f153260d;

    static {
        nf61 nf61Var = new nf61("FORCE_NONE", 0);
        f153257a = nf61Var;
        nf61 nf61Var2 = new nf61("FORCE_SQUARE", 1);
        f153258b = nf61Var2;
        nf61 nf61Var3 = new nf61("FORCE_RECTANGLE", 2);
        f153259c = nf61Var3;
        f153260d = new nf61[]{nf61Var, nf61Var2, nf61Var3};
    }

    public static nf61 valueOf(String str) {
        return (nf61) Enum.valueOf(nf61.class, str);
    }

    public static nf61[] values() {
        return (nf61[]) f153260d.clone();
    }
}
