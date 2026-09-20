package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class rub1 {

    /* JADX INFO: renamed from: a */
    public static final rub1 f202792a;

    /* JADX INFO: renamed from: b */
    public static final rub1 f202793b;

    /* JADX INFO: renamed from: c */
    public static final rub1 f202794c;

    /* JADX INFO: renamed from: d */
    public static final rub1 f202795d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ rub1[] f202796e;

    static {
        rub1 rub1Var = new rub1("None", 0);
        f202792a = rub1Var;
        rub1 rub1Var2 = new rub1("AddFilter", 1);
        f202793b = rub1Var2;
        rub1 rub1Var3 = new rub1("RemoveFilter", 2);
        f202794c = rub1Var3;
        rub1 rub1Var4 = new rub1("DeactivateAndRemoveFilter", 3);
        f202795d = rub1Var4;
        f202796e = new rub1[]{rub1Var, rub1Var2, rub1Var3, rub1Var4};
    }

    public static rub1 valueOf(String str) {
        return (rub1) Enum.valueOf(rub1.class, str);
    }

    public static rub1[] values() {
        return (rub1[]) f202796e.clone();
    }
}
