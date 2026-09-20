package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class pg30 {

    /* JADX INFO: renamed from: a */
    public static final pg30 f177212a;

    /* JADX INFO: renamed from: b */
    public static final pg30 f177213b;

    /* JADX INFO: renamed from: c */
    public static final pg30 f177214c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ pg30[] f177215d;

    static {
        pg30 pg30Var = new pg30("BASIC", 0);
        f177212a = pg30Var;
        pg30 pg30Var2 = new pg30("DIGEST", 1);
        f177213b = pg30Var2;
        pg30 pg30Var3 = new pg30("X_ABLY_TOKEN", 2);
        f177214c = pg30Var3;
        f177215d = new pg30[]{pg30Var, pg30Var2, pg30Var3};
    }

    public static pg30 valueOf(String str) {
        return (pg30) Enum.valueOf(pg30.class, str);
    }

    public static pg30[] values() {
        return (pg30[]) f177215d.clone();
    }
}
