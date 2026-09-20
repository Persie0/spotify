package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class xnn0 {

    /* JADX INFO: renamed from: a */
    public static final xnn0 f263694a;

    /* JADX INFO: renamed from: b */
    public static final xnn0 f263695b;

    /* JADX INFO: renamed from: c */
    public static final xnn0 f263696c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ xnn0[] f263697d;

    static {
        xnn0 xnn0Var = new xnn0("RequestClicked", 0);
        f263694a = xnn0Var;
        xnn0 xnn0Var2 = new xnn0("LeaveJamClicked", 1);
        f263695b = xnn0Var2;
        xnn0 xnn0Var3 = new xnn0("SystemDismissed", 2);
        f263696c = xnn0Var3;
        f263697d = new xnn0[]{xnn0Var, xnn0Var2, xnn0Var3};
    }

    public static xnn0 valueOf(String str) {
        return (xnn0) Enum.valueOf(xnn0.class, str);
    }

    public static xnn0[] values() {
        return (xnn0[]) f263697d.clone();
    }
}
