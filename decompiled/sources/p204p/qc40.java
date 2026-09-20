package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class qc40 {

    /* JADX INFO: renamed from: a */
    public static final qc40 f187252a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ qc40[] f187253b;

    /* JADX INFO: Fake field, exist only in values array */
    qc40 EF0;

    static {
        qc40 qc40Var = new qc40("DEFAULT", 0);
        qc40 qc40Var2 = new qc40("SMALL", 1);
        qc40 qc40Var3 = new qc40("LARGE", 2);
        f187252a = qc40Var3;
        f187253b = new qc40[]{qc40Var, qc40Var2, qc40Var3, new qc40("XLARGE", 3)};
    }

    public static qc40 valueOf(String str) {
        return (qc40) Enum.valueOf(qc40.class, str);
    }

    public static qc40[] values() {
        return (qc40[]) f187253b.clone();
    }
}
