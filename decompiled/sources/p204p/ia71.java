package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ia71 {

    /* JADX INFO: renamed from: a */
    public static final ia71 f100168a;

    /* JADX INFO: renamed from: b */
    public static final ia71 f100169b;

    /* JADX INFO: renamed from: c */
    public static final ia71 f100170c;

    /* JADX INFO: renamed from: d */
    public static final ia71 f100171d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ia71[] f100172e;

    static {
        ia71 ia71Var = new ia71("StartInput", 0);
        f100168a = ia71Var;
        ia71 ia71Var2 = new ia71("StopInput", 1);
        f100169b = ia71Var2;
        ia71 ia71Var3 = new ia71("ShowKeyboard", 2);
        f100170c = ia71Var3;
        ia71 ia71Var4 = new ia71("HideKeyboard", 3);
        f100171d = ia71Var4;
        f100172e = new ia71[]{ia71Var, ia71Var2, ia71Var3, ia71Var4};
    }

    public static ia71 valueOf(String str) {
        return (ia71) Enum.valueOf(ia71.class, str);
    }

    public static ia71[] values() {
        return (ia71[]) f100172e.clone();
    }
}
