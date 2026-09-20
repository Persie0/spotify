package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class mfp0 {

    /* JADX INFO: renamed from: a */
    public static final mfp0 f143133a;

    /* JADX INFO: renamed from: b */
    public static final mfp0 f143134b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ mfp0[] f143135c;

    static {
        mfp0 mfp0Var = new mfp0("CardClicked", 0);
        f143133a = mfp0Var;
        mfp0 mfp0Var2 = new mfp0("CardLongClicked", 1);
        f143134b = mfp0Var2;
        f143135c = new mfp0[]{mfp0Var, mfp0Var2};
    }

    public static mfp0 valueOf(String str) {
        return (mfp0) Enum.valueOf(mfp0.class, str);
    }

    public static mfp0[] values() {
        return (mfp0[]) f143135c.clone();
    }
}
