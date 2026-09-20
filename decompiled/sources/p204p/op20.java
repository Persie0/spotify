package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class op20 {

    /* JADX INFO: renamed from: a */
    public static final op20 f167738a;

    /* JADX INFO: renamed from: b */
    public static final op20 f167739b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ op20[] f167740c;

    static {
        op20 op20Var = new op20("PLUGGED", 0);
        f167738a = op20Var;
        op20 op20Var2 = new op20("UNPLUGGED", 1);
        f167739b = op20Var2;
        f167740c = new op20[]{op20Var, op20Var2};
    }

    public static op20 valueOf(String str) {
        return (op20) Enum.valueOf(op20.class, str);
    }

    public static op20[] values() {
        return (op20[]) f167740c.clone();
    }
}
