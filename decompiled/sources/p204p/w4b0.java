package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class w4b0 {

    /* JADX INFO: renamed from: a */
    public static final w4b0 f247765a;

    /* JADX INFO: renamed from: b */
    public static final w4b0 f247766b;

    /* JADX INFO: renamed from: c */
    public static final w4b0 f247767c;

    /* JADX INFO: renamed from: d */
    public static final w4b0 f247768d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ w4b0[] f247769e;

    static {
        w4b0 w4b0Var = new w4b0("Phone", 0);
        f247765a = w4b0Var;
        w4b0 w4b0Var2 = new w4b0("Connect", 1);
        f247766b = w4b0Var2;
        w4b0 w4b0Var3 = new w4b0("Bluetooth", 2);
        f247767c = w4b0Var3;
        w4b0 w4b0Var4 = new w4b0("Desktop", 3);
        f247768d = w4b0Var4;
        f247769e = new w4b0[]{w4b0Var, w4b0Var2, w4b0Var3, w4b0Var4};
    }

    public static w4b0 valueOf(String str) {
        return (w4b0) Enum.valueOf(w4b0.class, str);
    }

    public static w4b0[] values() {
        return (w4b0[]) f247769e.clone();
    }
}
