package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class jn50 {

    /* JADX INFO: renamed from: a */
    public static final jn50 f114018a;

    /* JADX INFO: renamed from: b */
    public static final jn50 f114019b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jn50[] f114020c;

    static {
        jn50 jn50Var = new jn50("QrCode", 0);
        f114018a = jn50Var;
        jn50 jn50Var2 = new jn50("ShareLink", 1);
        f114019b = jn50Var2;
        f114020c = new jn50[]{jn50Var, jn50Var2};
    }

    public static jn50 valueOf(String str) {
        return (jn50) Enum.valueOf(jn50.class, str);
    }

    public static jn50[] values() {
        return (jn50[]) f114020c.clone();
    }
}
