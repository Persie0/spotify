package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class unn0 {

    /* JADX INFO: renamed from: a */
    public static final unn0 f232195a;

    /* JADX INFO: renamed from: b */
    public static final unn0 f232196b;

    /* JADX INFO: renamed from: c */
    public static final unn0 f232197c;

    /* JADX INFO: renamed from: d */
    public static final unn0 f232198d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ unn0[] f232199e;

    static {
        unn0 unn0Var = new unn0("GRANTED", 0);
        f232195a = unn0Var;
        unn0 unn0Var2 = new unn0("NEVER_ASKED", 1);
        f232196b = unn0Var2;
        unn0 unn0Var3 = new unn0("TEMPORARILY_DENIED", 2);
        f232197c = unn0Var3;
        unn0 unn0Var4 = new unn0("PERMANENTLY_DENIED", 3);
        f232198d = unn0Var4;
        f232199e = new unn0[]{unn0Var, unn0Var2, unn0Var3, unn0Var4};
    }

    public static unn0 valueOf(String str) {
        return (unn0) Enum.valueOf(unn0.class, str);
    }

    public static unn0[] values() {
        return (unn0[]) f232199e.clone();
    }
}
