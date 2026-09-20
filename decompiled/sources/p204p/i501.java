package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i501 {

    /* JADX INFO: renamed from: a */
    public static final i501 f98726a;

    /* JADX INFO: renamed from: b */
    public static final i501 f98727b;

    /* JADX INFO: renamed from: c */
    public static final i501 f98728c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ i501[] f98729d;

    static {
        i501 i501Var = new i501("ACCEPTED", 0);
        f98726a = i501Var;
        i501 i501Var2 = new i501("BAD_REQUEST", 1);
        f98727b = i501Var2;
        i501 i501Var3 = new i501("UNRECOGNIZED", 2);
        f98728c = i501Var3;
        f98729d = new i501[]{i501Var, i501Var2, i501Var3};
    }

    public static i501 valueOf(String str) {
        return (i501) Enum.valueOf(i501.class, str);
    }

    public static i501[] values() {
        return (i501[]) f98729d.clone();
    }
}
