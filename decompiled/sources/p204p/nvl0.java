package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nvl0 {

    /* JADX INFO: renamed from: a */
    public static final nvl0 f158921a;

    /* JADX INFO: renamed from: b */
    public static final nvl0 f158922b;

    /* JADX INFO: renamed from: c */
    public static final nvl0 f158923c;

    /* JADX INFO: renamed from: d */
    public static final nvl0 f158924d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nvl0[] f158925e;

    static {
        nvl0 nvl0Var = new nvl0("NOT_LOADED", 0);
        f158921a = nvl0Var;
        nvl0 nvl0Var2 = new nvl0("LOADING", 1);
        f158922b = nvl0Var2;
        nvl0 nvl0Var3 = new nvl0("LOADED", 2);
        f158923c = nvl0Var3;
        nvl0 nvl0Var4 = new nvl0("FAILED_TO_LOAD", 3);
        f158924d = nvl0Var4;
        f158925e = new nvl0[]{nvl0Var, nvl0Var2, nvl0Var3, nvl0Var4};
    }

    public static nvl0 valueOf(String str) {
        return (nvl0) Enum.valueOf(nvl0.class, str);
    }

    public static nvl0[] values() {
        return (nvl0[]) f158925e.clone();
    }
}
