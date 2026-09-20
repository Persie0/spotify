package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class kze0 {

    /* JADX INFO: renamed from: a */
    public static final kze0 f128094a;

    /* JADX INFO: renamed from: b */
    public static final kze0 f128095b;

    /* JADX INFO: renamed from: c */
    public static final kze0 f128096c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ kze0[] f128097d;

    static {
        kze0 kze0Var = new kze0("SortOrder", 0);
        f128094a = kze0Var;
        kze0 kze0Var2 = new kze0("VideoMode", 1);
        f128095b = kze0Var2;
        kze0 kze0Var3 = new kze0("SortOrderAndVideoMode", 2);
        f128096c = kze0Var3;
        f128097d = new kze0[]{kze0Var, kze0Var2, kze0Var3};
    }

    public static kze0 valueOf(String str) {
        return (kze0) Enum.valueOf(kze0.class, str);
    }

    public static kze0[] values() {
        return (kze0[]) f128097d.clone();
    }
}
