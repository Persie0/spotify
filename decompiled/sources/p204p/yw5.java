package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class yw5 {

    /* JADX INFO: renamed from: a */
    public static final yw5 f276864a;

    /* JADX INFO: renamed from: b */
    public static final yw5 f276865b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ yw5[] f276866c;

    static {
        yw5 yw5Var = new yw5("CardClicked", 0);
        f276864a = yw5Var;
        yw5 yw5Var2 = new yw5("FollowButtonClicked", 1);
        f276865b = yw5Var2;
        f276866c = new yw5[]{yw5Var, yw5Var2};
    }

    public static yw5 valueOf(String str) {
        return (yw5) Enum.valueOf(yw5.class, str);
    }

    public static yw5[] values() {
        return (yw5[]) f276866c.clone();
    }
}
