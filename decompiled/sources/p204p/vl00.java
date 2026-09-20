package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vl00 {

    /* JADX INFO: renamed from: a */
    public static final vl00 f242336a;

    /* JADX INFO: renamed from: b */
    public static final vl00 f242337b;

    /* JADX INFO: renamed from: c */
    public static final vl00 f242338c;

    /* JADX INFO: renamed from: d */
    public static final vl00 f242339d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ vl00[] f242340e;

    static {
        vl00 vl00Var = new vl00("LOADING", 0);
        f242336a = vl00Var;
        vl00 vl00Var2 = new vl00("READY", 1);
        vl00 vl00Var3 = new vl00("PLAYING", 2);
        f242337b = vl00Var3;
        vl00 vl00Var4 = new vl00("PAUSED", 3);
        vl00 vl00Var5 = new vl00("DYING", 4);
        f242338c = vl00Var5;
        vl00 vl00Var6 = new vl00("GAME_OVER", 5);
        f242339d = vl00Var6;
        f242340e = new vl00[]{vl00Var, vl00Var2, vl00Var3, vl00Var4, vl00Var5, vl00Var6};
    }

    public static vl00 valueOf(String str) {
        return (vl00) Enum.valueOf(vl00.class, str);
    }

    public static vl00[] values() {
        return (vl00[]) f242340e.clone();
    }
}
