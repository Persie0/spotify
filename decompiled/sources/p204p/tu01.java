package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class tu01 {

    /* JADX INFO: renamed from: a */
    public static final tu01 f223737a;

    /* JADX INFO: renamed from: b */
    public static final tu01 f223738b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ tu01[] f223739c;

    static {
        tu01 tu01Var = new tu01("VISIBLE", 0);
        f223737a = tu01Var;
        tu01 tu01Var2 = new tu01("HIDDEN", 1);
        f223738b = tu01Var2;
        f223739c = new tu01[]{tu01Var, tu01Var2};
    }

    public static tu01 valueOf(String str) {
        return (tu01) Enum.valueOf(tu01.class, str);
    }

    public static tu01[] values() {
        return (tu01[]) f223739c.clone();
    }
}
