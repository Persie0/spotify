package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class kw40 {

    /* JADX INFO: renamed from: a */
    public static final kw40 f127004a;

    /* JADX INFO: renamed from: b */
    public static final kw40 f127005b;

    /* JADX INFO: renamed from: c */
    public static final kw40 f127006c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ kw40[] f127007d;

    static {
        kw40 kw40Var = new kw40("Focused", 0);
        f127004a = kw40Var;
        kw40 kw40Var2 = new kw40("UnfocusedEmpty", 1);
        f127005b = kw40Var2;
        kw40 kw40Var3 = new kw40("UnfocusedNotEmpty", 2);
        f127006c = kw40Var3;
        f127007d = new kw40[]{kw40Var, kw40Var2, kw40Var3};
    }

    public static kw40 valueOf(String str) {
        return (kw40) Enum.valueOf(kw40.class, str);
    }

    public static kw40[] values() {
        return (kw40[]) f127007d.clone();
    }
}
