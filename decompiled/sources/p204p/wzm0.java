package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class wzm0 {

    /* JADX INFO: renamed from: a */
    public static final wzm0 f256627a;

    /* JADX INFO: renamed from: b */
    public static final wzm0 f256628b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ wzm0[] f256629c;

    static {
        wzm0 wzm0Var = new wzm0("EXPLICIT", 0);
        f256627a = wzm0Var;
        wzm0 wzm0Var2 = new wzm0("VIDEOS", 1);
        f256628b = wzm0Var2;
        f256629c = new wzm0[]{wzm0Var, wzm0Var2};
    }

    public static wzm0 valueOf(String str) {
        return (wzm0) Enum.valueOf(wzm0.class, str);
    }

    public static wzm0[] values() {
        return (wzm0[]) f256629c.clone();
    }
}
