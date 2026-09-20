package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class na00 {
    public static final ma00 Companion;

    /* JADX INFO: renamed from: a */
    public static final Object f151900a;

    /* JADX INFO: renamed from: b */
    public static final na00 f151901b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ na00[] f151902c;

    static {
        na00 na00Var = new na00("PAGE_VIEW", 0);
        f151901b = na00Var;
        f151902c = new na00[]{na00Var};
        Companion = new ma00();
        f151900a = q3d0.m72078I(2, i4y.f98635R0);
    }

    public static na00 valueOf(String str) {
        return (na00) Enum.valueOf(na00.class, str);
    }

    public static na00[] values() {
        return (na00[]) f151902c.clone();
    }
}
