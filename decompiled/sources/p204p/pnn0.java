package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class pnn0 {

    /* JADX INFO: renamed from: a */
    public static final pnn0 f179442a;

    /* JADX INFO: renamed from: b */
    public static final pnn0 f179443b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ pnn0[] f179444c;

    static {
        pnn0 pnn0Var = new pnn0("GRANTED", 0);
        f179442a = pnn0Var;
        pnn0 pnn0Var2 = new pnn0("DENIED", 1);
        f179443b = pnn0Var2;
        f179444c = new pnn0[]{pnn0Var, pnn0Var2, new pnn0("PERMANENTLY_DENIED", 2)};
    }

    public static pnn0 valueOf(String str) {
        return (pnn0) Enum.valueOf(pnn0.class, str);
    }

    public static pnn0[] values() {
        return (pnn0[]) f179444c.clone();
    }
}
