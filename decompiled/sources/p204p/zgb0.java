package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class zgb0 {

    /* JADX INFO: renamed from: a */
    public static final zgb0 f282575a;

    /* JADX INFO: renamed from: b */
    public static final zgb0 f282576b;

    /* JADX INFO: renamed from: c */
    public static final zgb0 f282577c;

    /* JADX INFO: renamed from: d */
    public static final zgb0 f282578d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ zgb0[] f282579e;

    static {
        zgb0 zgb0Var = new zgb0("ALL_LYRICS_INCORRECT", 0);
        f282575a = zgb0Var;
        zgb0 zgb0Var2 = new zgb0("SOME_LYRICS_INCORRECT", 1);
        f282576b = zgb0Var2;
        zgb0 zgb0Var3 = new zgb0("SOME_TRANSLATIONS_INCORRECT", 2);
        f282577c = zgb0Var3;
        zgb0 zgb0Var4 = new zgb0("SYNC_INCORRECT", 3);
        f282578d = zgb0Var4;
        f282579e = new zgb0[]{zgb0Var, zgb0Var2, zgb0Var3, zgb0Var4};
    }

    public static zgb0 valueOf(String str) {
        return (zgb0) Enum.valueOf(zgb0.class, str);
    }

    public static zgb0[] values() {
        return (zgb0[]) f282579e.clone();
    }
}
