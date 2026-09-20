package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class qjf0 {

    /* JADX INFO: renamed from: a */
    public static final qjf0 f189229a;

    /* JADX INFO: renamed from: b */
    public static final qjf0 f189230b;

    /* JADX INFO: renamed from: c */
    public static final qjf0 f189231c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ qjf0[] f189232d;

    static {
        qjf0 qjf0Var = new qjf0("OnPrimaryButtonClicked", 0);
        f189229a = qjf0Var;
        qjf0 qjf0Var2 = new qjf0("OnSecondaryButtonClicked", 1);
        f189230b = qjf0Var2;
        qjf0 qjf0Var3 = new qjf0("OnDismissRequest", 2);
        f189231c = qjf0Var3;
        f189232d = new qjf0[]{qjf0Var, qjf0Var2, qjf0Var3};
    }

    public static qjf0 valueOf(String str) {
        return (qjf0) Enum.valueOf(qjf0.class, str);
    }

    public static qjf0[] values() {
        return (qjf0[]) f189232d.clone();
    }
}
