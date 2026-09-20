package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class fc81 {

    /* JADX INFO: renamed from: a */
    public static final fc81 f68028a;

    /* JADX INFO: renamed from: b */
    public static final fc81 f68029b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fc81[] f68030c;

    static {
        fc81 fc81Var = new fc81("SwipeForward", 0);
        f68028a = fc81Var;
        fc81 fc81Var2 = new fc81("SwipeBackward", 1);
        f68029b = fc81Var2;
        f68030c = new fc81[]{fc81Var, fc81Var2};
    }

    public static fc81 valueOf(String str) {
        return (fc81) Enum.valueOf(fc81.class, str);
    }

    public static fc81[] values() {
        return (fc81[]) f68030c.clone();
    }
}
