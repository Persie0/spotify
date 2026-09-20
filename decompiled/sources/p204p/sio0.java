package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class sio0 {

    /* JADX INFO: renamed from: a */
    public static final sio0 f209577a;

    /* JADX INFO: renamed from: b */
    public static final sio0 f209578b;

    /* JADX INFO: renamed from: c */
    public static final sio0 f209579c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ sio0[] f209580d;

    static {
        sio0 sio0Var = new sio0("Playing", 0);
        f209577a = sio0Var;
        sio0 sio0Var2 = new sio0("Paused", 1);
        f209578b = sio0Var2;
        sio0 sio0Var3 = new sio0("None", 2);
        f209579c = sio0Var3;
        f209580d = new sio0[]{sio0Var, sio0Var2, sio0Var3};
    }

    public static sio0 valueOf(String str) {
        return (sio0) Enum.valueOf(sio0.class, str);
    }

    public static sio0[] values() {
        return (sio0[]) f209580d.clone();
    }
}
