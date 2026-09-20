package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class yut0 {

    /* JADX INFO: renamed from: a */
    public static final yut0 f276470a;

    /* JADX INFO: renamed from: b */
    public static final yut0 f276471b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ yut0[] f276472c;

    static {
        yut0 yut0Var = new yut0("DARK", 0);
        f276470a = yut0Var;
        yut0 yut0Var2 = new yut0("LIGHT", 1);
        f276471b = yut0Var2;
        f276472c = new yut0[]{yut0Var, yut0Var2};
    }

    public static yut0 valueOf(String str) {
        return (yut0) Enum.valueOf(yut0.class, str);
    }

    public static yut0[] values() {
        return (yut0[]) f276472c.clone();
    }
}
