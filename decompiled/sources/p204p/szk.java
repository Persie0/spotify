package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class szk {

    /* JADX INFO: renamed from: a */
    public static final szk f215606a;

    /* JADX INFO: renamed from: b */
    public static final szk f215607b;

    /* JADX INFO: renamed from: c */
    public static final szk f215608c;

    /* JADX INFO: renamed from: d */
    public static final szk f215609d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ szk[] f215610e;

    static {
        szk szkVar = new szk("NORMAL", 0);
        f215606a = szkVar;
        szk szkVar2 = new szk("SMALL", 1);
        f215607b = szkVar2;
        szk szkVar3 = new szk("LARGE", 2);
        f215608c = szkVar3;
        szk szkVar4 = new szk("XLARGE", 3);
        f215609d = szkVar4;
        f215610e = new szk[]{szkVar, szkVar2, szkVar3, szkVar4};
    }

    public static szk valueOf(String str) {
        return (szk) Enum.valueOf(szk.class, str);
    }

    public static szk[] values() {
        return (szk[]) f215610e.clone();
    }
}
