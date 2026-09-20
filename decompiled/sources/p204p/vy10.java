package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class vy10 {

    /* JADX INFO: renamed from: a */
    public static final vy10 f245890a;

    /* JADX INFO: renamed from: b */
    public static final vy10 f245891b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ vy10[] f245892c;

    static {
        vy10 vy10Var = new vy10("TitleHit", 0);
        f245890a = vy10Var;
        vy10 vy10Var2 = new vy10("SubtitleHit", 1);
        f245891b = vy10Var2;
        f245892c = new vy10[]{vy10Var, vy10Var2};
    }

    public static vy10 valueOf(String str) {
        return (vy10) Enum.valueOf(vy10.class, str);
    }

    public static vy10[] values() {
        return (vy10[]) f245892c.clone();
    }
}
