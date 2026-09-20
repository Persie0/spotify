package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class td61 {

    /* JADX INFO: renamed from: a */
    public static final td61 f219241a;

    /* JADX INFO: renamed from: b */
    public static final td61 f219242b;

    /* JADX INFO: renamed from: c */
    public static final td61 f219243c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ td61[] f219244d;

    static {
        td61 td61Var = new td61("StartToEnd", 0);
        f219241a = td61Var;
        td61 td61Var2 = new td61("EndToStart", 1);
        f219242b = td61Var2;
        td61 td61Var3 = new td61("Settled", 2);
        f219243c = td61Var3;
        f219244d = new td61[]{td61Var, td61Var2, td61Var3};
    }

    public static td61 valueOf(String str) {
        return (td61) Enum.valueOf(td61.class, str);
    }

    public static td61[] values() {
        return (td61[]) f219244d.clone();
    }
}
