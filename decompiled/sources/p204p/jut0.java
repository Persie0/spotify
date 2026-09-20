package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class jut0 {

    /* JADX INFO: renamed from: a */
    public static final jut0 f116167a;

    /* JADX INFO: renamed from: b */
    public static final jut0 f116168b;

    /* JADX INFO: renamed from: c */
    public static final jut0 f116169c;

    /* JADX INFO: renamed from: d */
    public static final jut0 f116170d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ jut0[] f116171e;

    static {
        jut0 jut0Var = new jut0("AddClicked", 0);
        f116167a = jut0Var;
        jut0 jut0Var2 = new jut0("HeartClicked", 1);
        jut0 jut0Var3 = new jut0("HideClicked", 2);
        f116168b = jut0Var3;
        jut0 jut0Var4 = new jut0("BanClicked", 3);
        f116169c = jut0Var4;
        jut0 jut0Var5 = new jut0("ProfileClicked", 4);
        f116170d = jut0Var5;
        f116171e = new jut0[]{jut0Var, jut0Var2, jut0Var3, jut0Var4, jut0Var5};
    }

    public static jut0 valueOf(String str) {
        return (jut0) Enum.valueOf(jut0.class, str);
    }

    public static jut0[] values() {
        return (jut0[]) f116171e.clone();
    }
}
