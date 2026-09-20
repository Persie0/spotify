package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class hav0 {

    /* JADX INFO: renamed from: a */
    public static final hav0 f89285a;

    /* JADX INFO: renamed from: b */
    public static final hav0 f89286b;

    /* JADX INFO: renamed from: c */
    public static final hav0 f89287c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ hav0[] f89288d;

    static {
        hav0 hav0Var = new hav0("NOT_IN_LIST", 0);
        f89285a = hav0Var;
        hav0 hav0Var2 = new hav0("IN_LIST", 1);
        f89286b = hav0Var2;
        hav0 hav0Var3 = new hav0("IN_LIST_AS_RECOMMENDATION", 2);
        f89287c = hav0Var3;
        f89288d = new hav0[]{hav0Var, hav0Var2, hav0Var3};
    }

    public static hav0 valueOf(String str) {
        return (hav0) Enum.valueOf(hav0.class, str);
    }

    public static hav0[] values() {
        return (hav0[]) f89288d.clone();
    }
}
