package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class zf81 {

    /* JADX INFO: renamed from: a */
    public static final zf81 f282250a;

    /* JADX INFO: renamed from: b */
    public static final zf81 f282251b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zf81[] f282252c;

    static {
        zf81 zf81Var = new zf81("TitleHit", 0);
        f282250a = zf81Var;
        zf81 zf81Var2 = new zf81("SubtitleHit", 1);
        f282251b = zf81Var2;
        f282252c = new zf81[]{zf81Var, zf81Var2};
    }

    public static zf81 valueOf(String str) {
        return (zf81) Enum.valueOf(zf81.class, str);
    }

    public static zf81[] values() {
        return (zf81[]) f282252c.clone();
    }
}
