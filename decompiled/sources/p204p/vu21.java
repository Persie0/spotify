package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vu21 {

    /* JADX INFO: renamed from: a */
    public static final vu21 f244848a;

    /* JADX INFO: renamed from: b */
    public static final vu21 f244849b;

    /* JADX INFO: renamed from: c */
    public static final vu21 f244850c;

    /* JADX INFO: renamed from: d */
    public static final vu21 f244851d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ vu21[] f244852e;

    static {
        vu21 vu21Var = new vu21("Media", 0);
        f244848a = vu21Var;
        vu21 vu21Var2 = new vu21("Leading", 1);
        vu21 vu21Var3 = new vu21("Pretitle", 2);
        f244849b = vu21Var3;
        vu21 vu21Var4 = new vu21("Title", 3);
        f244850c = vu21Var4;
        vu21 vu21Var5 = new vu21("Subtitle", 4);
        f244851d = vu21Var5;
        f244852e = new vu21[]{vu21Var, vu21Var2, vu21Var3, vu21Var4, vu21Var5, new vu21("Trailing", 5), new vu21("Body", 6), new vu21("Footer", 7)};
    }

    public static vu21 valueOf(String str) {
        return (vu21) Enum.valueOf(vu21.class, str);
    }

    public static vu21[] values() {
        return (vu21[]) f244852e.clone();
    }
}
