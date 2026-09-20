package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class qp21 {

    /* JADX INFO: renamed from: a */
    public static final qp21 f191117a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ qp21[] f191118b;

    /* JADX INFO: Fake field, exist only in values array */
    qp21 EF0;

    static {
        qp21 qp21Var = new qp21("CONNECT_ACTIVATED", 0);
        qp21 qp21Var2 = new qp21("SLEEP_TIMER_ACTIVATED", 1);
        qp21 qp21Var3 = new qp21("UBIQUITY_SlEEP_TIMER_UNAVAILABLE", 2);
        f191117a = qp21Var3;
        f191118b = new qp21[]{qp21Var, qp21Var2, qp21Var3};
    }

    public static qp21 valueOf(String str) {
        return (qp21) Enum.valueOf(qp21.class, str);
    }

    public static qp21[] values() {
        return (qp21[]) f191118b.clone();
    }
}
