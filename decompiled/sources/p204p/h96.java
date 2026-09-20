package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h96 {

    /* JADX INFO: renamed from: a */
    public static final h96 f88882a;

    /* JADX INFO: renamed from: b */
    public static final h96 f88883b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ h96[] f88884c;

    static {
        h96 h96Var = new h96("Ratio16by9", 0);
        f88882a = h96Var;
        h96 h96Var2 = new h96("Ratio1by1", 1);
        f88883b = h96Var2;
        f88884c = new h96[]{h96Var, h96Var2};
    }

    public static h96 valueOf(String str) {
        return (h96) Enum.valueOf(h96.class, str);
    }

    public static h96[] values() {
        return (h96[]) f88884c.clone();
    }
}
