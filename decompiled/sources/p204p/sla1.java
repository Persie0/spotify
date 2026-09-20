package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class sla1 {

    /* JADX INFO: renamed from: a */
    public static final sla1 f210344a;

    /* JADX INFO: renamed from: b */
    public static final sla1 f210345b;

    /* JADX INFO: renamed from: c */
    public static final sla1 f210346c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ sla1[] f210347d;

    static {
        sla1 sla1Var = new sla1("VisibleCanHide", 0);
        f210344a = sla1Var;
        sla1 sla1Var2 = new sla1("HiddenCanUnhide", 1);
        f210345b = sla1Var2;
        sla1 sla1Var3 = new sla1("NotEligible", 2);
        f210346c = sla1Var3;
        f210347d = new sla1[]{sla1Var, sla1Var2, sla1Var3};
    }

    public static sla1 valueOf(String str) {
        return (sla1) Enum.valueOf(sla1.class, str);
    }

    public static sla1[] values() {
        return (sla1[]) f210347d.clone();
    }
}
