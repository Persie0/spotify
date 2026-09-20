package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class l761 {

    /* JADX INFO: renamed from: a */
    public static final l761 f130579a;

    /* JADX INFO: renamed from: b */
    public static final l761 f130580b;

    /* JADX INFO: renamed from: c */
    public static final l761 f130581c;

    /* JADX INFO: renamed from: d */
    public static final l761 f130582d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ l761[] f130583e;

    static {
        l761 l761Var = new l761("TRANSITION_READ_ONLY", 0);
        f130579a = l761Var;
        l761 l761Var2 = new l761("CUSTOM_TRANSITION", 1);
        f130580b = l761Var2;
        l761 l761Var3 = new l761("ADJUSTED_TRACK_SPEED", 2);
        f130581c = l761Var3;
        l761 l761Var4 = new l761("DISPLAY_FREQUENCY", 3);
        f130582d = l761Var4;
        f130583e = new l761[]{l761Var, l761Var2, l761Var3, l761Var4};
    }

    public static l761 valueOf(String str) {
        return (l761) Enum.valueOf(l761.class, str);
    }

    public static l761[] values() {
        return (l761[]) f130583e.clone();
    }
}
