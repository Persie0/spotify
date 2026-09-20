package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a3t0 {

    /* JADX INFO: renamed from: a */
    public static final a3t0 f12071a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ a3t0[] f12072b;

    static {
        a3t0 a3t0Var = new a3t0("DEFAULT", 0);
        f12071a = a3t0Var;
        f12072b = new a3t0[]{a3t0Var, new a3t0("SIGNED", 1), new a3t0("FIXED", 2)};
    }

    public static a3t0 valueOf(String str) {
        return (a3t0) Enum.valueOf(a3t0.class, str);
    }

    public static a3t0[] values() {
        return (a3t0[]) f12072b.clone();
    }
}
