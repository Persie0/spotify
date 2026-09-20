package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uoe0 {

    /* JADX INFO: renamed from: a */
    public static final uoe0 f232415a;

    /* JADX INFO: renamed from: b */
    public static final uoe0 f232416b;

    /* JADX INFO: renamed from: c */
    public static final uoe0 f232417c;

    /* JADX INFO: renamed from: d */
    public static final uoe0 f232418d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ uoe0[] f232419e;

    static {
        uoe0 uoe0Var = new uoe0("NONE", 0);
        f232415a = uoe0Var;
        uoe0 uoe0Var2 = new uoe0("SEND", 1);
        f232416b = uoe0Var2;
        uoe0 uoe0Var3 = new uoe0("SAVE_PLAYLIST", 2);
        f232417c = uoe0Var3;
        uoe0 uoe0Var4 = new uoe0("CREATE_PLAYLIST", 3);
        f232418d = uoe0Var4;
        f232419e = new uoe0[]{uoe0Var, uoe0Var2, uoe0Var3, uoe0Var4};
    }

    public static uoe0 valueOf(String str) {
        return (uoe0) Enum.valueOf(uoe0.class, str);
    }

    public static uoe0[] values() {
        return (uoe0[]) f232419e.clone();
    }
}
