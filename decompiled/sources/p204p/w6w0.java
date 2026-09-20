package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class w6w0 {

    /* JADX INFO: renamed from: a */
    public static final w6w0 f248479a;

    /* JADX INFO: renamed from: b */
    public static final w6w0 f248480b;

    /* JADX INFO: renamed from: c */
    public static final w6w0 f248481c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ w6w0[] f248482d;

    static {
        w6w0 w6w0Var = new w6w0("UNKNOWN", 0);
        f248479a = w6w0Var;
        w6w0 w6w0Var2 = new w6w0("LATEST_RELEASE", 1);
        f248480b = w6w0Var2;
        w6w0 w6w0Var3 = new w6w0("PRE_RELEASE", 2);
        f248481c = w6w0Var3;
        f248482d = new w6w0[]{w6w0Var, w6w0Var2, w6w0Var3};
    }

    public static w6w0 valueOf(String str) {
        return (w6w0) Enum.valueOf(w6w0.class, str);
    }

    public static w6w0[] values() {
        return (w6w0[]) f248482d.clone();
    }
}
