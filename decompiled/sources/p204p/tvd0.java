package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class tvd0 {

    /* JADX INFO: renamed from: a */
    public static final tvd0 f224146a;

    /* JADX INFO: renamed from: b */
    public static final tvd0 f224147b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ tvd0[] f224148c;

    static {
        tvd0 tvd0Var = new tvd0("VIDEO", 0);
        f224146a = tvd0Var;
        tvd0 tvd0Var2 = new tvd0("AUDIO", 1);
        f224147b = tvd0Var2;
        f224148c = new tvd0[]{tvd0Var, tvd0Var2};
    }

    public static tvd0 valueOf(String str) {
        return (tvd0) Enum.valueOf(tvd0.class, str);
    }

    public static tvd0[] values() {
        return (tvd0[]) f224148c.clone();
    }
}
