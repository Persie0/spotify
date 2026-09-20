package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class czf0 {

    /* JADX INFO: renamed from: a */
    public static final czf0 f43549a;

    /* JADX INFO: renamed from: b */
    public static final czf0 f43550b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ czf0[] f43551c;

    static {
        czf0 czf0Var = new czf0("OnConfirmed", 0);
        f43549a = czf0Var;
        czf0 czf0Var2 = new czf0("OnDismissed", 1);
        f43550b = czf0Var2;
        f43551c = new czf0[]{czf0Var, czf0Var2};
    }

    public static czf0 valueOf(String str) {
        return (czf0) Enum.valueOf(czf0.class, str);
    }

    public static czf0[] values() {
        return (czf0[]) f43551c.clone();
    }
}
