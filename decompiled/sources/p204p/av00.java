package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class av00 {

    /* JADX INFO: renamed from: a */
    public static final av00 f20060a;

    /* JADX INFO: renamed from: b */
    public static final av00 f20061b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ av00[] f20062c;

    static {
        av00 av00Var = new av00("NONE", 0);
        f20060a = av00Var;
        av00 av00Var2 = new av00("SUPPORTER_DIALOG", 1);
        f20061b = av00Var2;
        f20062c = new av00[]{av00Var, av00Var2};
    }

    public static av00 valueOf(String str) {
        return (av00) Enum.valueOf(av00.class, str);
    }

    public static av00[] values() {
        return (av00[]) f20062c.clone();
    }
}
