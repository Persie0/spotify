package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class e3v0 {

    /* JADX INFO: renamed from: a */
    public static final e3v0 f55891a;

    /* JADX INFO: renamed from: b */
    public static final e3v0 f55892b;

    /* JADX INFO: renamed from: c */
    public static final e3v0 f55893c;

    /* JADX INFO: renamed from: d */
    public static final e3v0 f55894d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ e3v0[] f55895e;

    static {
        e3v0 e3v0Var = new e3v0("MIXED_SHOWS", 0);
        f55891a = e3v0Var;
        e3v0 e3v0Var2 = new e3v0("AUDIO_SHOWS", 1);
        f55892b = e3v0Var2;
        e3v0 e3v0Var3 = new e3v0("VIDEO_SHOWS", 2);
        f55893c = e3v0Var3;
        e3v0 e3v0Var4 = new e3v0("TRACKS", 3);
        f55894d = e3v0Var4;
        f55895e = new e3v0[]{e3v0Var, e3v0Var2, e3v0Var3, e3v0Var4};
    }

    public static e3v0 valueOf(String str) {
        return (e3v0) Enum.valueOf(e3v0.class, str);
    }

    public static e3v0[] values() {
        return (e3v0[]) f55895e.clone();
    }
}
