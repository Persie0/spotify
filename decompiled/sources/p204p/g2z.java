package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g2z {

    /* JADX INFO: renamed from: a */
    public static final g2z f76030a;

    /* JADX INFO: renamed from: b */
    public static final g2z f76031b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ g2z[] f76032c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f76033d;

    static {
        g2z g2zVar = new g2z("TOP", 0);
        f76030a = g2zVar;
        g2z g2zVar2 = new g2z("BOTTOM", 1);
        f76031b = g2zVar2;
        g2z[] g2zVarArr = {g2zVar, g2zVar2};
        f76032c = g2zVarArr;
        f76033d = new nzv(g2zVarArr);
    }

    public static g2z valueOf(String str) {
        return (g2z) Enum.valueOf(g2z.class, str);
    }

    public static g2z[] values() {
        return (g2z[]) f76032c.clone();
    }
}
