package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h0a1 {

    /* JADX INFO: renamed from: a */
    public static final h0a1 f86192a;

    /* JADX INFO: renamed from: b */
    public static final h0a1 f86193b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ h0a1[] f86194c;

    static {
        h0a1 h0a1Var = new h0a1("OnGoToHomeClicked", 0);
        f86192a = h0a1Var;
        h0a1 h0a1Var2 = new h0a1("OnUnfollowClicked", 1);
        f86193b = h0a1Var2;
        f86194c = new h0a1[]{h0a1Var, h0a1Var2};
    }

    public static h0a1 valueOf(String str) {
        return (h0a1) Enum.valueOf(h0a1.class, str);
    }

    public static h0a1[] values() {
        return (h0a1[]) f86194c.clone();
    }
}
