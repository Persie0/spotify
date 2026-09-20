package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ixq0 {

    /* JADX INFO: renamed from: a */
    public static final ixq0 f106744a;

    /* JADX INFO: renamed from: b */
    public static final ixq0 f106745b;

    /* JADX INFO: renamed from: c */
    public static final ixq0 f106746c;

    /* JADX INFO: renamed from: d */
    public static final ixq0 f106747d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ixq0[] f106748e;

    static {
        ixq0 ixq0Var = new ixq0("ALBUM", 0);
        f106744a = ixq0Var;
        ixq0 ixq0Var2 = new ixq0("EP", 1);
        f106745b = ixq0Var2;
        ixq0 ixq0Var3 = new ixq0("SINGLE", 2);
        f106746c = ixq0Var3;
        ixq0 ixq0Var4 = new ixq0("UNKNOWN", 3);
        f106747d = ixq0Var4;
        f106748e = new ixq0[]{ixq0Var, ixq0Var2, ixq0Var3, ixq0Var4};
    }

    public static ixq0 valueOf(String str) {
        return (ixq0) Enum.valueOf(ixq0.class, str);
    }

    public static ixq0[] values() {
        return (ixq0[]) f106748e.clone();
    }
}
