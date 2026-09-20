package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class apo0 {

    /* JADX INFO: renamed from: a */
    public static final apo0 f17989a;

    /* JADX INFO: renamed from: b */
    public static final apo0 f17990b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ apo0[] f17991c;

    static {
        apo0 apo0Var = new apo0("PlayHit", 0);
        f17989a = apo0Var;
        apo0 apo0Var2 = new apo0("PauseHit", 1);
        f17990b = apo0Var2;
        f17991c = new apo0[]{apo0Var, apo0Var2};
    }

    public static apo0 valueOf(String str) {
        return (apo0) Enum.valueOf(apo0.class, str);
    }

    public static apo0[] values() {
        return (apo0[]) f17991c.clone();
    }
}
