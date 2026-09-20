package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class mg40 {

    /* JADX INFO: renamed from: a */
    public static final mg40 f143307a;

    /* JADX INFO: renamed from: b */
    public static final mg40 f143308b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ mg40[] f143309c;

    static {
        mg40 mg40Var = new mg40("RetryClicked", 0);
        f143307a = mg40Var;
        mg40 mg40Var2 = new mg40("CancelClicked", 1);
        f143308b = mg40Var2;
        f143309c = new mg40[]{mg40Var, mg40Var2};
    }

    public static mg40 valueOf(String str) {
        return (mg40) Enum.valueOf(mg40.class, str);
    }

    public static mg40[] values() {
        return (mg40[]) f143309c.clone();
    }
}
