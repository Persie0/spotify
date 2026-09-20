package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a5d0 {

    /* JADX INFO: renamed from: a */
    public static final a5d0 f12492a;

    /* JADX INFO: renamed from: b */
    public static final a5d0 f12493b;

    /* JADX INFO: renamed from: c */
    public static final a5d0 f12494c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ a5d0[] f12495d;

    static {
        a5d0 a5d0Var = new a5d0("Loading", 0);
        f12492a = a5d0Var;
        a5d0 a5d0Var2 = new a5d0("Loaded", 1);
        f12493b = a5d0Var2;
        a5d0 a5d0Var3 = new a5d0("Failed", 2);
        f12494c = a5d0Var3;
        f12495d = new a5d0[]{a5d0Var, a5d0Var2, a5d0Var3};
    }

    public static a5d0 valueOf(String str) {
        return (a5d0) Enum.valueOf(a5d0.class, str);
    }

    public static a5d0[] values() {
        return (a5d0[]) f12495d.clone();
    }
}
