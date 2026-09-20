package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class f6i0 {

    /* JADX INFO: renamed from: a */
    public static final f6i0 f66415a;

    /* JADX INFO: renamed from: b */
    public static final f6i0 f66416b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ f6i0[] f66417c;

    static {
        f6i0 f6i0Var = new f6i0("TEXT", 0);
        f66415a = f6i0Var;
        f6i0 f6i0Var2 = new f6i0("VOICE", 1);
        f66416b = f6i0Var2;
        f66417c = new f6i0[]{f6i0Var, f6i0Var2};
    }

    public static f6i0 valueOf(String str) {
        return (f6i0) Enum.valueOf(f6i0.class, str);
    }

    public static f6i0[] values() {
        return (f6i0[]) f66417c.clone();
    }
}
