package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class xe50 {

    /* JADX INFO: renamed from: a */
    public static final xe50 f260637a;

    /* JADX INFO: renamed from: b */
    public static final xe50 f260638b;

    /* JADX INFO: renamed from: c */
    public static final xe50 f260639c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ xe50[] f260640d;

    static {
        xe50 xe50Var = new xe50("ALWAYS_SHOW", 0);
        f260637a = xe50Var;
        xe50 xe50Var2 = new xe50("HIDE_EXPLICIT", 1);
        f260638b = xe50Var2;
        xe50 xe50Var3 = new xe50("ALWAYS_HIDE", 2);
        f260639c = xe50Var3;
        f260640d = new xe50[]{xe50Var, xe50Var2, xe50Var3};
    }

    public static xe50 valueOf(String str) {
        return (xe50) Enum.valueOf(xe50.class, str);
    }

    public static xe50[] values() {
        return (xe50[]) f260640d.clone();
    }
}
