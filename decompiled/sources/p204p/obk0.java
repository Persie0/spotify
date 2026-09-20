package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class obk0 {

    /* JADX INFO: renamed from: a */
    public static final obk0 f163674a;

    /* JADX INFO: renamed from: b */
    public static final obk0 f163675b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ obk0[] f163676c;

    static {
        obk0 obk0Var = new obk0("STANDARD", 0);
        f163674a = obk0Var;
        obk0 obk0Var2 = new obk0("FULLSCREEN_VIDEO", 1);
        f163675b = obk0Var2;
        f163676c = new obk0[]{obk0Var, obk0Var2};
    }

    public static obk0 valueOf(String str) {
        return (obk0) Enum.valueOf(obk0.class, str);
    }

    public static obk0[] values() {
        return (obk0[]) f163676c.clone();
    }
}
