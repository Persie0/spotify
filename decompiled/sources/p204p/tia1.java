package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class tia1 {

    /* JADX INFO: renamed from: a */
    public static final tia1 f220596a;

    /* JADX INFO: renamed from: b */
    public static final tia1 f220597b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ tia1[] f220598c;

    static {
        tia1 tia1Var = new tia1("INLINE", 0);
        f220596a = tia1Var;
        tia1 tia1Var2 = new tia1("BOTTOM_SHEET", 1);
        f220597b = tia1Var2;
        f220598c = new tia1[]{tia1Var, tia1Var2};
    }

    public static tia1 valueOf(String str) {
        return (tia1) Enum.valueOf(tia1.class, str);
    }

    public static tia1[] values() {
        return (tia1[]) f220598c.clone();
    }
}
