package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class teo0 {

    /* JADX INFO: renamed from: a */
    public static final teo0 f219770a;

    /* JADX INFO: renamed from: b */
    public static final teo0 f219771b;

    /* JADX INFO: renamed from: c */
    public static final teo0 f219772c;

    /* JADX INFO: renamed from: d */
    public static final teo0 f219773d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ teo0[] f219774e;

    static {
        teo0 teo0Var = new teo0("OnPauseClicked", 0);
        f219770a = teo0Var;
        teo0 teo0Var2 = new teo0("OnResumeClicked", 1);
        f219771b = teo0Var2;
        teo0 teo0Var3 = new teo0("OnPlayLinearClicked", 2);
        f219772c = teo0Var3;
        teo0 teo0Var4 = new teo0("OnPlayShuffleClicked", 3);
        f219773d = teo0Var4;
        f219774e = new teo0[]{teo0Var, teo0Var2, teo0Var3, teo0Var4};
    }

    public static teo0 valueOf(String str) {
        return (teo0) Enum.valueOf(teo0.class, str);
    }

    public static teo0[] values() {
        return (teo0[]) f219774e.clone();
    }
}
