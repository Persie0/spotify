package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class s0m0 {

    /* JADX INFO: renamed from: a */
    public static final s0m0 f204434a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ s0m0[] f204435b;

    static {
        s0m0 s0m0Var = new s0m0("Single", 0);
        f204434a = s0m0Var;
        f204435b = new s0m0[]{s0m0Var, new s0m0("Multiple", 1)};
    }

    public static s0m0 valueOf(String str) {
        return (s0m0) Enum.valueOf(s0m0.class, str);
    }

    public static s0m0[] values() {
        return (s0m0[]) f204435b.clone();
    }
}
