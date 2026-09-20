package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class de71 {

    /* JADX INFO: renamed from: a */
    public static final de71 f47999a;

    /* JADX INFO: renamed from: b */
    public static final de71 f48000b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ de71[] f48001c;

    static {
        de71 de71Var = new de71("START", 0);
        f47999a = de71Var;
        de71 de71Var2 = new de71("END", 1);
        f48000b = de71Var2;
        f48001c = new de71[]{de71Var, de71Var2};
    }

    public static de71 valueOf(String str) {
        return (de71) Enum.valueOf(de71.class, str);
    }

    public static de71[] values() {
        return (de71[]) f48001c.clone();
    }
}
