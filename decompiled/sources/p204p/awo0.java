package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class awo0 {

    /* JADX INFO: renamed from: a */
    public static final awo0 f20568a;

    /* JADX INFO: renamed from: b */
    public static final awo0 f20569b;

    /* JADX INFO: renamed from: c */
    public static final awo0 f20570c;

    /* JADX INFO: renamed from: d */
    public static final awo0 f20571d;

    /* JADX INFO: renamed from: e */
    public static final awo0 f20572e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ awo0[] f20573f;

    static {
        awo0 awo0Var = new awo0("Explicit", 0);
        f20568a = awo0Var;
        awo0 awo0Var2 = new awo0("Age", 1);
        f20569b = awo0Var2;
        awo0 awo0Var3 = new awo0("UnavailableOffline", 2);
        f20570c = awo0Var3;
        awo0 awo0Var4 = new awo0("BlockedByAccountManager", 3);
        f20571d = awo0Var4;
        awo0 awo0Var5 = new awo0("Unknown", 4);
        f20572e = awo0Var5;
        f20573f = new awo0[]{awo0Var, awo0Var2, awo0Var3, awo0Var4, awo0Var5};
    }

    public static awo0 valueOf(String str) {
        return (awo0) Enum.valueOf(awo0.class, str);
    }

    public static awo0[] values() {
        return (awo0[]) f20573f.clone();
    }
}
