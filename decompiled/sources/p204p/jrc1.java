package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class jrc1 {

    /* JADX INFO: renamed from: a */
    public static final jrc1 f115139a;

    /* JADX INFO: renamed from: b */
    public static final jrc1 f115140b;

    /* JADX INFO: renamed from: c */
    public static final jrc1 f115141c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ jrc1[] f115142d;

    static {
        jrc1 jrc1Var = new jrc1("Loading", 0);
        f115139a = jrc1Var;
        jrc1 jrc1Var2 = new jrc1("Content", 1);
        f115140b = jrc1Var2;
        jrc1 jrc1Var3 = new jrc1("Error", 2);
        f115141c = jrc1Var3;
        f115142d = new jrc1[]{jrc1Var, jrc1Var2, jrc1Var3};
    }

    public static jrc1 valueOf(String str) {
        return (jrc1) Enum.valueOf(jrc1.class, str);
    }

    public static jrc1[] values() {
        return (jrc1[]) f115142d.clone();
    }
}
