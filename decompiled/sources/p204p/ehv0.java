package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ehv0 {

    /* JADX INFO: renamed from: a */
    public static final ehv0 f59678a;

    /* JADX INFO: renamed from: b */
    public static final ehv0 f59679b;

    /* JADX INFO: renamed from: c */
    public static final ehv0 f59680c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ehv0[] f59681d;

    static {
        ehv0 ehv0Var = new ehv0("UNKNOWN", 0);
        f59678a = ehv0Var;
        ehv0 ehv0Var2 = new ehv0("NOT_RECORDING", 1);
        f59679b = ehv0Var2;
        ehv0 ehv0Var3 = new ehv0("RECORDING", 2);
        f59680c = ehv0Var3;
        f59681d = new ehv0[]{ehv0Var, ehv0Var2, ehv0Var3};
    }

    public static ehv0 valueOf(String str) {
        return (ehv0) Enum.valueOf(ehv0.class, str);
    }

    public static ehv0[] values() {
        return (ehv0[]) f59681d.clone();
    }
}
