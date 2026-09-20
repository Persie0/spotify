package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class lcx0 {

    /* JADX INFO: renamed from: a */
    public static final lcx0 f132003a;

    /* JADX INFO: renamed from: b */
    public static final lcx0 f132004b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ lcx0[] f132005c;

    static {
        lcx0 lcx0Var = new lcx0("POSITIVE_BUTTON_CLICKED", 0);
        f132003a = lcx0Var;
        lcx0 lcx0Var2 = new lcx0("NEGATIVE_BUTTON_CLICKED", 1);
        f132004b = lcx0Var2;
        f132005c = new lcx0[]{lcx0Var, lcx0Var2};
    }

    public static lcx0 valueOf(String str) {
        return (lcx0) Enum.valueOf(lcx0.class, str);
    }

    public static lcx0[] values() {
        return (lcx0[]) f132005c.clone();
    }
}
