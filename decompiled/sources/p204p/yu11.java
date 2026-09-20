package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class yu11 {

    /* JADX INFO: renamed from: a */
    public static final yu11 f276249a;

    /* JADX INFO: renamed from: b */
    public static final yu11 f276250b;

    /* JADX INFO: renamed from: c */
    public static final yu11 f276251c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ yu11[] f276252d;

    static {
        yu11 yu11Var = new yu11("NONE", 0);
        f276249a = yu11Var;
        yu11 yu11Var2 = new yu11("DISCARD", 1);
        f276250b = yu11Var2;
        yu11 yu11Var3 = new yu11("SAVING", 2);
        f276251c = yu11Var3;
        f276252d = new yu11[]{yu11Var, yu11Var2, yu11Var3};
    }

    public static yu11 valueOf(String str) {
        return (yu11) Enum.valueOf(yu11.class, str);
    }

    public static yu11[] values() {
        return (yu11[]) f276252d.clone();
    }
}
