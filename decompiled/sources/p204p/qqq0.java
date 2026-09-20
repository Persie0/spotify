package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class qqq0 {

    /* JADX INFO: renamed from: a */
    public static final qqq0 f191633a;

    /* JADX INFO: renamed from: b */
    public static final qqq0 f191634b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qqq0[] f191635c;

    static {
        qqq0 qqq0Var = new qqq0("LINEAR", 0);
        f191633a = qqq0Var;
        qqq0 qqq0Var2 = new qqq0("PREMIUM_PLAY_MODES_UPSELL", 1);
        f191634b = qqq0Var2;
        f191635c = new qqq0[]{qqq0Var, qqq0Var2};
    }

    public static qqq0 valueOf(String str) {
        return (qqq0) Enum.valueOf(qqq0.class, str);
    }

    public static qqq0[] values() {
        return (qqq0[]) f191635c.clone();
    }
}
