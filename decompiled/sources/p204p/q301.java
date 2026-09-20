package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class q301 {

    /* JADX INFO: renamed from: a */
    public static final q301 f184770a;

    /* JADX INFO: renamed from: b */
    public static final q301 f184771b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ q301[] f184772c;

    static {
        q301 q301Var = new q301("UIVisible", 0);
        f184770a = q301Var;
        q301 q301Var2 = new q301("UIHidden", 1);
        f184771b = q301Var2;
        f184772c = new q301[]{q301Var, q301Var2};
    }

    public static q301 valueOf(String str) {
        return (q301) Enum.valueOf(q301.class, str);
    }

    public static q301[] values() {
        return (q301[]) f184772c.clone();
    }
}
