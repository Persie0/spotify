package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f6q0 {

    /* JADX INFO: renamed from: a */
    public static final f6q0 f66485a;

    /* JADX INFO: renamed from: b */
    public static final f6q0 f66486b;

    /* JADX INFO: renamed from: c */
    public static final f6q0 f66487c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ f6q0[] f66488d;

    static {
        f6q0 f6q0Var = new f6q0("Initial", 0);
        f66485a = f6q0Var;
        f6q0 f6q0Var2 = new f6q0("Main", 1);
        f66486b = f6q0Var2;
        f6q0 f6q0Var3 = new f6q0("Final", 2);
        f66487c = f6q0Var3;
        f66488d = new f6q0[]{f6q0Var, f6q0Var2, f6q0Var3};
    }

    public static f6q0 valueOf(String str) {
        return (f6q0) Enum.valueOf(f6q0.class, str);
    }

    public static f6q0[] values() {
        return (f6q0[]) f66488d.clone();
    }
}
