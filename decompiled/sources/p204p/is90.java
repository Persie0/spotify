package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class is90 {

    /* JADX INFO: renamed from: a */
    public static final is90 f105193a;

    /* JADX INFO: renamed from: b */
    public static final is90 f105194b;

    /* JADX INFO: renamed from: c */
    public static final is90 f105195c;

    /* JADX INFO: renamed from: d */
    public static final is90 f105196d;

    /* JADX INFO: renamed from: e */
    public static final is90 f105197e;

    /* JADX INFO: renamed from: f */
    public static final is90 f105198f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ is90[] f105199g;

    static {
        is90 is90Var = new is90("UpcomingControl", 0);
        f105193a = is90Var;
        is90 is90Var2 = new is90("LiveControl", 1);
        f105194b = is90Var2;
        is90 is90Var3 = new is90("EndedControl", 2);
        f105195c = is90Var3;
        is90 is90Var4 = new is90("HostSection", 3);
        f105196d = is90Var4;
        is90 is90Var5 = new is90("Description", 4);
        f105197e = is90Var5;
        is90 is90Var6 = new is90("ChatSection", 5);
        f105198f = is90Var6;
        f105199g = new is90[]{is90Var, is90Var2, is90Var3, is90Var4, is90Var5, is90Var6};
    }

    public static is90 valueOf(String str) {
        return (is90) Enum.valueOf(is90.class, str);
    }

    public static is90[] values() {
        return (is90[]) f105199g.clone();
    }
}
