package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class cm80 {

    /* JADX INFO: renamed from: a */
    public static final cm80 f39609a;

    /* JADX INFO: renamed from: b */
    public static final cm80 f39610b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cm80[] f39611c;

    static {
        cm80 cm80Var = new cm80("SOURCE", 0);
        f39609a = cm80Var;
        cm80 cm80Var2 = new cm80("INTERNAL", 1);
        f39610b = cm80Var2;
        f39611c = new cm80[]{cm80Var, cm80Var2};
    }

    public static cm80 valueOf(String str) {
        return (cm80) Enum.valueOf(cm80.class, str);
    }

    public static cm80[] values() {
        return (cm80[]) f39611c.clone();
    }
}
