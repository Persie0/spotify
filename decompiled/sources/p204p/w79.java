package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class w79 {

    /* JADX INFO: renamed from: a */
    public static final w79 f248604a;

    /* JADX INFO: renamed from: b */
    public static final w79 f248605b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ w79[] f248606c;

    static {
        w79 w79Var = new w79("CardClicked", 0);
        f248604a = w79Var;
        w79 w79Var2 = new w79("CtaButtonClicked", 1);
        f248605b = w79Var2;
        f248606c = new w79[]{w79Var, w79Var2};
    }

    public static w79 valueOf(String str) {
        return (w79) Enum.valueOf(w79.class, str);
    }

    public static w79[] values() {
        return (w79[]) f248606c.clone();
    }
}
