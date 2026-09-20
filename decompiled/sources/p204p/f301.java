package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f301 {

    /* JADX INFO: renamed from: a */
    public static final f301 f65327a;

    /* JADX INFO: renamed from: b */
    public static final f301 f65328b;

    /* JADX INFO: renamed from: c */
    public static final f301 f65329c;

    /* JADX INFO: renamed from: d */
    public static final f301 f65330d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ f301[] f65331e;

    static {
        f301 f301Var = new f301("ONLINE_AND_LOGGED_IN", 0);
        f65327a = f301Var;
        f301 f301Var2 = new f301("NOT_LOGGED_IN", 1);
        f65328b = f301Var2;
        f301 f301Var3 = new f301("OFFLINE", 2);
        f65329c = f301Var3;
        f301 f301Var4 = new f301("TIMEOUT_ERROR", 3);
        f65330d = f301Var4;
        f65331e = new f301[]{f301Var, f301Var2, f301Var3, f301Var4};
    }

    public static f301 valueOf(String str) {
        return (f301) Enum.valueOf(f301.class, str);
    }

    public static f301[] values() {
        return (f301[]) f65331e.clone();
    }
}
