package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class nw6 {

    /* JADX INFO: renamed from: a */
    public static final nw6 f159029a;

    /* JADX INFO: renamed from: b */
    public static final nw6 f159030b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nw6[] f159031c;

    static {
        nw6 nw6Var = new nw6("ENABLED", 0);
        f159029a = nw6Var;
        nw6 nw6Var2 = new nw6("DISABLED", 1);
        f159030b = nw6Var2;
        f159031c = new nw6[]{nw6Var, nw6Var2};
    }

    public static nw6 valueOf(String str) {
        return (nw6) Enum.valueOf(nw6.class, str);
    }

    public static nw6[] values() {
        return (nw6[]) f159031c.clone();
    }
}
