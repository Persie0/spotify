package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dlo0 {

    /* JADX INFO: renamed from: a */
    public static final dlo0 f50290a;

    /* JADX INFO: renamed from: b */
    public static final dlo0 f50291b;

    /* JADX INFO: renamed from: c */
    public static final dlo0 f50292c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ dlo0[] f50293d;

    static {
        dlo0 dlo0Var = new dlo0("PLAYING", 0);
        f50290a = dlo0Var;
        dlo0 dlo0Var2 = new dlo0("PAUSED", 1);
        f50291b = dlo0Var2;
        dlo0 dlo0Var3 = new dlo0("NONE", 2);
        f50292c = dlo0Var3;
        f50293d = new dlo0[]{dlo0Var, dlo0Var2, dlo0Var3};
    }

    public static dlo0 valueOf(String str) {
        return (dlo0) Enum.valueOf(dlo0.class, str);
    }

    public static dlo0[] values() {
        return (dlo0[]) f50293d.clone();
    }
}
