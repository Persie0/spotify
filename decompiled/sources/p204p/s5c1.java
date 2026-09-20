package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class s5c1 {

    /* JADX INFO: renamed from: a */
    public static final s5c1 f205773a;

    /* JADX INFO: renamed from: b */
    public static final s5c1 f205774b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ s5c1[] f205775c;

    static {
        s5c1 s5c1Var = new s5c1("RowClicked", 0);
        f205773a = s5c1Var;
        s5c1 s5c1Var2 = new s5c1("RowLongClicked", 1);
        f205774b = s5c1Var2;
        f205775c = new s5c1[]{s5c1Var, s5c1Var2};
    }

    public static s5c1 valueOf(String str) {
        return (s5c1) Enum.valueOf(s5c1.class, str);
    }

    public static s5c1[] values() {
        return (s5c1[]) f205775c.clone();
    }
}
