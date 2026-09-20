package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a8e0 {

    /* JADX INFO: renamed from: a */
    public static final a8e0 f13268a;

    /* JADX INFO: renamed from: b */
    public static final a8e0 f13269b;

    /* JADX INFO: renamed from: c */
    public static final a8e0 f13270c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ a8e0[] f13271d;

    static {
        a8e0 a8e0Var = new a8e0("NO_MEETING", 0);
        f13268a = a8e0Var;
        a8e0 a8e0Var2 = new a8e0("MEETING", 1);
        f13269b = a8e0Var2;
        a8e0 a8e0Var3 = new a8e0("ADDON_SESSION", 2);
        f13270c = a8e0Var3;
        f13271d = new a8e0[]{a8e0Var, a8e0Var2, a8e0Var3};
    }

    public static a8e0 valueOf(String str) {
        return (a8e0) Enum.valueOf(a8e0.class, str);
    }

    public static a8e0[] values() {
        return (a8e0[]) f13271d.clone();
    }
}
