package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class xm91 {

    /* JADX INFO: renamed from: a */
    public static final xm91 f263324a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ xm91[] f263325b;

    static {
        xm91 xm91Var = new xm91("Jam", 0);
        f263324a = xm91Var;
        f263325b = new xm91[]{xm91Var};
    }

    public static xm91 valueOf(String str) {
        return (xm91) Enum.valueOf(xm91.class, str);
    }

    public static xm91[] values() {
        return (xm91[]) f263325b.clone();
    }
}
