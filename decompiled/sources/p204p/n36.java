package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class n36 {

    /* JADX INFO: renamed from: a */
    public static final n36 f149939a;

    /* JADX INFO: renamed from: b */
    public static final n36 f149940b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ n36[] f149941c;

    static {
        n36 n36Var = new n36("RowClicked", 0);
        f149939a = n36Var;
        n36 n36Var2 = new n36("FollowButtonClicked", 1);
        f149940b = n36Var2;
        f149941c = new n36[]{n36Var, n36Var2};
    }

    public static n36 valueOf(String str) {
        return (n36) Enum.valueOf(n36.class, str);
    }

    public static n36[] values() {
        return (n36[]) f149941c.clone();
    }
}
