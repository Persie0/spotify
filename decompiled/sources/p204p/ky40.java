package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ky40 {

    /* JADX INFO: renamed from: a */
    public static final ky40 f127648a;

    /* JADX INFO: renamed from: b */
    public static final ky40 f127649b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ky40[] f127650c;

    static {
        ky40 ky40Var = new ky40("Track", 0);
        f127648a = ky40Var;
        ky40 ky40Var2 = new ky40("Artist", 1);
        f127649b = ky40Var2;
        f127650c = new ky40[]{ky40Var, ky40Var2};
    }

    public static ky40 valueOf(String str) {
        return (ky40) Enum.valueOf(ky40.class, str);
    }

    public static ky40[] values() {
        return (ky40[]) f127650c.clone();
    }
}
