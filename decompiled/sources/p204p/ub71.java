package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ub71 {

    /* JADX INFO: renamed from: a */
    public static final ub71 f228649a;

    /* JADX INFO: renamed from: b */
    public static final ub71 f228650b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ub71[] f228651c;

    static {
        ub71 ub71Var = new ub71("LONG", 0);
        f228649a = ub71Var;
        ub71 ub71Var2 = new ub71("SHORT", 1);
        f228650b = ub71Var2;
        f228651c = new ub71[]{ub71Var, ub71Var2};
    }

    public static ub71 valueOf(String str) {
        return (ub71) Enum.valueOf(ub71.class, str);
    }

    public static ub71[] values() {
        return (ub71[]) f228651c.clone();
    }
}
