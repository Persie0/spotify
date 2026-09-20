package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class oze0 {

    /* JADX INFO: renamed from: a */
    public static final oze0 f172255a;

    /* JADX INFO: renamed from: b */
    public static final oze0 f172256b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ oze0[] f172257c;

    static {
        oze0 oze0Var = new oze0("OnMaybeLaterClicked", 0);
        f172255a = oze0Var;
        oze0 oze0Var2 = new oze0("OnExplorePremiumClicked", 1);
        f172256b = oze0Var2;
        f172257c = new oze0[]{oze0Var, oze0Var2};
    }

    public static oze0 valueOf(String str) {
        return (oze0) Enum.valueOf(oze0.class, str);
    }

    public static oze0[] values() {
        return (oze0[]) f172257c.clone();
    }
}
