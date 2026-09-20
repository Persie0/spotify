package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class wj1 {

    /* JADX INFO: renamed from: a */
    public static final wj1 f251824a;

    /* JADX INFO: renamed from: b */
    public static final wj1 f251825b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ wj1[] f251826c;

    static {
        wj1 wj1Var = new wj1("OnFollowClicked", 0);
        f251824a = wj1Var;
        wj1 wj1Var2 = new wj1("OnUnfollowClicked", 1);
        f251825b = wj1Var2;
        f251826c = new wj1[]{wj1Var, wj1Var2};
    }

    public static wj1 valueOf(String str) {
        return (wj1) Enum.valueOf(wj1.class, str);
    }

    public static wj1[] values() {
        return (wj1[]) f251826c.clone();
    }
}
