package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class v6x0 {

    /* JADX INFO: renamed from: a */
    public static final v6x0 f237985a;

    /* JADX INFO: renamed from: b */
    public static final v6x0 f237986b;

    /* JADX INFO: renamed from: c */
    public static final v6x0 f237987c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ v6x0[] f237988d;

    static {
        v6x0 v6x0Var = new v6x0("Approved", 0);
        f237985a = v6x0Var;
        v6x0 v6x0Var2 = new v6x0("Denied", 1);
        f237986b = v6x0Var2;
        v6x0 v6x0Var3 = new v6x0("Cancelled", 2);
        f237987c = v6x0Var3;
        f237988d = new v6x0[]{v6x0Var, v6x0Var2, v6x0Var3};
    }

    public static v6x0 valueOf(String str) {
        return (v6x0) Enum.valueOf(v6x0.class, str);
    }

    public static v6x0[] values() {
        return (v6x0[]) f237988d.clone();
    }
}
