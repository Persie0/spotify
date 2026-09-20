package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class uro0 {

    /* JADX INFO: renamed from: a */
    public static final uro0 f233416a;

    /* JADX INFO: renamed from: b */
    public static final uro0 f233417b;

    /* JADX INFO: renamed from: c */
    public static final uro0 f233418c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ uro0[] f233419d;

    static {
        uro0 uro0Var = new uro0("PLAYING", 0);
        f233416a = uro0Var;
        uro0 uro0Var2 = new uro0("PAUSED", 1);
        f233417b = uro0Var2;
        uro0 uro0Var3 = new uro0("NONE", 2);
        f233418c = uro0Var3;
        f233419d = new uro0[]{uro0Var, uro0Var2, uro0Var3};
    }

    public static uro0 valueOf(String str) {
        return (uro0) Enum.valueOf(uro0.class, str);
    }

    public static uro0[] values() {
        return (uro0[]) f233419d.clone();
    }
}
