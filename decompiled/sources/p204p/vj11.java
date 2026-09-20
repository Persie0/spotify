package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class vj11 {

    /* JADX INFO: renamed from: a */
    public static final vj11 f241855a;

    /* JADX INFO: renamed from: b */
    public static final vj11 f241856b;

    /* JADX INFO: renamed from: c */
    public static final vj11 f241857c;

    /* JADX INFO: renamed from: d */
    public static final vj11 f241858d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ vj11[] f241859e;

    static {
        vj11 vj11Var = new vj11("UNKNOWN", 0);
        f241855a = vj11Var;
        vj11 vj11Var2 = new vj11("NOT_STARTED", 1);
        f241856b = vj11Var2;
        vj11 vj11Var3 = new vj11("IN_PROGRESS", 2);
        f241857c = vj11Var3;
        vj11 vj11Var4 = new vj11("COMPLETED", 3);
        f241858d = vj11Var4;
        f241859e = new vj11[]{vj11Var, vj11Var2, vj11Var3, vj11Var4};
        values();
    }

    public static vj11 valueOf(String str) {
        return (vj11) Enum.valueOf(vj11.class, str);
    }

    public static vj11[] values() {
        return (vj11[]) f241859e.clone();
    }
}
