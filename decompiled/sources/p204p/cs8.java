package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class cs8 {

    /* JADX INFO: renamed from: a */
    public static final cs8 f41488a;

    /* JADX INFO: renamed from: b */
    public static final cs8 f41489b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cs8[] f41490c;

    static {
        cs8 cs8Var = new cs8("BanHit", 0);
        f41488a = cs8Var;
        cs8 cs8Var2 = new cs8("UnbanHit", 1);
        f41489b = cs8Var2;
        f41490c = new cs8[]{cs8Var, cs8Var2};
    }

    public static cs8 valueOf(String str) {
        return (cs8) Enum.valueOf(cs8.class, str);
    }

    public static cs8[] values() {
        return (cs8[]) f41490c.clone();
    }
}
