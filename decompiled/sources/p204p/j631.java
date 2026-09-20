package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j631 {

    /* JADX INFO: renamed from: a */
    public static final j631 f109210a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ j631[] f109211b;

    static {
        j631 j631Var = new j631("Short", 0);
        f109210a = j631Var;
        f109211b = new j631[]{j631Var, new j631("Long", 1), new j631("Indefinite", 2)};
    }

    public static j631 valueOf(String str) {
        return (j631) Enum.valueOf(j631.class, str);
    }

    public static j631[] values() {
        return (j631[]) f109211b.clone();
    }
}
