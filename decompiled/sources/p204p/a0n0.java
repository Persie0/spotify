package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a0n0 {

    /* JADX INFO: renamed from: a */
    public static final a0n0 f11123a;

    /* JADX INFO: renamed from: b */
    public static final a0n0 f11124b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ a0n0[] f11125c;

    static {
        a0n0 a0n0Var = new a0n0("EXPLICIT", 0);
        f11123a = a0n0Var;
        a0n0 a0n0Var2 = new a0n0("VIDEOS", 1);
        f11124b = a0n0Var2;
        f11125c = new a0n0[]{a0n0Var, a0n0Var2};
    }

    public static a0n0 valueOf(String str) {
        return (a0n0) Enum.valueOf(a0n0.class, str);
    }

    public static a0n0[] values() {
        return (a0n0[]) f11125c.clone();
    }
}
