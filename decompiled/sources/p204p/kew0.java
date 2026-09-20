package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kew0 {

    /* JADX INFO: renamed from: a */
    public static final kew0 f121986a;

    /* JADX INFO: renamed from: b */
    public static final kew0 f121987b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ kew0[] f121988c;

    static {
        kew0 kew0Var = new kew0("PLAYING", 0);
        f121986a = kew0Var;
        kew0 kew0Var2 = new kew0("NOT_PLAYING", 1);
        f121987b = kew0Var2;
        f121988c = new kew0[]{kew0Var, kew0Var2};
        new r46(23);
    }

    public static kew0 valueOf(String str) {
        return (kew0) Enum.valueOf(kew0.class, str);
    }

    public static kew0[] values() {
        return (kew0[]) f121988c.clone();
    }
}
