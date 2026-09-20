package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ff11 {

    /* JADX INFO: renamed from: a */
    public static final ff11 f68880a;

    /* JADX INFO: renamed from: b */
    public static final ff11 f68881b;

    /* JADX INFO: renamed from: c */
    public static final ff11 f68882c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ff11[] f68883d;

    static {
        ff11 ff11Var = new ff11("START", 0);
        f68880a = ff11Var;
        ff11 ff11Var2 = new ff11("STOP", 1);
        f68881b = ff11Var2;
        ff11 ff11Var3 = new ff11("STOP_AND_RESET_REPLAY_CACHE", 2);
        f68882c = ff11Var3;
        f68883d = new ff11[]{ff11Var, ff11Var2, ff11Var3};
    }

    public static ff11 valueOf(String str) {
        return (ff11) Enum.valueOf(ff11.class, str);
    }

    public static ff11[] values() {
        return (ff11[]) f68883d.clone();
    }
}
