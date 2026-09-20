package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class htb1 {

    /* JADX INFO: renamed from: a */
    public static final htb1 f94977a;

    /* JADX INFO: renamed from: b */
    public static final htb1 f94978b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ htb1[] f94979c;

    static {
        htb1 htb1Var = new htb1("NONE", 0);
        f94977a = htb1Var;
        htb1 htb1Var2 = new htb1("ENABLED", 1);
        htb1 htb1Var3 = new htb1("DISABLED", 2);
        f94978b = htb1Var3;
        f94979c = new htb1[]{htb1Var, htb1Var2, htb1Var3};
    }

    public static htb1 valueOf(String str) {
        return (htb1) Enum.valueOf(htb1.class, str);
    }

    public static htb1[] values() {
        return (htb1[]) f94979c.clone();
    }
}
