package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ze6 {

    /* JADX INFO: renamed from: a */
    public static final ze6 f281887a;

    /* JADX INFO: renamed from: b */
    public static final ze6 f281888b;

    /* JADX INFO: renamed from: c */
    public static final ze6 f281889c;

    /* JADX INFO: renamed from: d */
    public static final ze6 f281890d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ze6[] f281891e;

    static {
        ze6 ze6Var = new ze6("NO_CARDS_MIXED", 0);
        f281887a = ze6Var;
        ze6 ze6Var2 = new ze6("NO_CARDS_AUDIOBOOKS_ONLY", 1);
        f281888b = ze6Var2;
        ze6 ze6Var3 = new ze6("PERSONALIZED_RECOMMENDATIONS_DISABLED", 2);
        f281889c = ze6Var3;
        ze6 ze6Var4 = new ze6("NO_CONNECTION", 3);
        f281890d = ze6Var4;
        f281891e = new ze6[]{ze6Var, ze6Var2, ze6Var3, ze6Var4};
    }

    public static ze6 valueOf(String str) {
        return (ze6) Enum.valueOf(ze6.class, str);
    }

    public static ze6[] values() {
        return (ze6[]) f281891e.clone();
    }
}
