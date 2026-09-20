package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class lr31 {

    /* JADX INFO: renamed from: a */
    public static final lr31 f136215a;

    /* JADX INFO: renamed from: b */
    public static final lr31 f136216b;

    /* JADX INFO: renamed from: c */
    public static final lr31 f136217c;

    /* JADX INFO: renamed from: d */
    public static final lr31 f136218d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ lr31[] f136219e;

    static {
        lr31 lr31Var = new lr31("SHOW_NAME", 0);
        f136215a = lr31Var;
        lr31 lr31Var2 = new lr31("RECENTLY_ADDED", 1);
        f136216b = lr31Var2;
        lr31 lr31Var3 = new lr31("RELEASE_DATE", 2);
        f136217c = lr31Var3;
        lr31 lr31Var4 = new lr31("CUSTOM", 3);
        f136218d = lr31Var4;
        f136219e = new lr31[]{lr31Var, lr31Var2, lr31Var3, lr31Var4};
    }

    public static lr31 valueOf(String str) {
        return (lr31) Enum.valueOf(lr31.class, str);
    }

    public static lr31[] values() {
        return (lr31[]) f136219e.clone();
    }
}
