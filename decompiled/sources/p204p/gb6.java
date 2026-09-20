package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gb6 {

    /* JADX INFO: renamed from: a */
    public static final gb6 f78205a;

    /* JADX INFO: renamed from: b */
    public static final gb6 f78206b;

    /* JADX INFO: renamed from: c */
    public static final gb6 f78207c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ gb6[] f78208d;

    static {
        gb6 gb6Var = new gb6("NOT_DOWNLOADED", 0);
        f78205a = gb6Var;
        gb6 gb6Var2 = new gb6("DOWNLOADING", 1);
        f78206b = gb6Var2;
        gb6 gb6Var3 = new gb6("DOWNLOADED", 2);
        f78207c = gb6Var3;
        f78208d = new gb6[]{gb6Var, gb6Var2, gb6Var3};
    }

    public static gb6 valueOf(String str) {
        return (gb6) Enum.valueOf(gb6.class, str);
    }

    public static gb6[] values() {
        return (gb6[]) f78208d.clone();
    }
}
