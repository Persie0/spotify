package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class x460 {

    /* JADX INFO: renamed from: a */
    public static final x460 f257991a;

    /* JADX INFO: renamed from: b */
    public static final x460 f257992b;

    /* JADX INFO: renamed from: c */
    public static final x460 f257993c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ x460[] f257994d;

    static {
        x460 x460Var = new x460("ToggleVolumeControl", 0);
        f257991a = x460Var;
        x460 x460Var2 = new x460("ToggleQueueOnlyMode", 1);
        f257992b = x460Var2;
        x460 x460Var3 = new x460("NavigateBack", 2);
        f257993c = x460Var3;
        f257994d = new x460[]{x460Var, x460Var2, x460Var3};
    }

    public static x460 valueOf(String str) {
        return (x460) Enum.valueOf(x460.class, str);
    }

    public static x460[] values() {
        return (x460[]) f257994d.clone();
    }
}
