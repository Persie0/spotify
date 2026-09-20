package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class yf81 {

    /* JADX INFO: renamed from: a */
    public static final yf81 f272179a;

    /* JADX INFO: renamed from: b */
    public static final yf81 f272180b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ yf81[] f272181c;

    static {
        yf81 yf81Var = new yf81("TitleHit", 0);
        f272179a = yf81Var;
        yf81 yf81Var2 = new yf81("SubtitleHit", 1);
        f272180b = yf81Var2;
        f272181c = new yf81[]{yf81Var, yf81Var2};
    }

    public static yf81 valueOf(String str) {
        return (yf81) Enum.valueOf(yf81.class, str);
    }

    public static yf81[] values() {
        return (yf81[]) f272181c.clone();
    }
}
