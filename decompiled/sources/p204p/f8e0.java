package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class f8e0 {

    /* JADX INFO: renamed from: a */
    public static final f8e0 f66962a;

    /* JADX INFO: renamed from: b */
    public static final f8e0 f66963b;

    /* JADX INFO: renamed from: c */
    public static final f8e0 f66964c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ f8e0[] f66965d;

    static {
        f8e0 f8e0Var = new f8e0("None", 0);
        f66962a = f8e0Var;
        f8e0 f8e0Var2 = new f8e0("CanBeFollowed", 1);
        f66963b = f8e0Var2;
        f8e0 f8e0Var3 = new f8e0("CanBeUnFollowed", 2);
        f66964c = f8e0Var3;
        f66965d = new f8e0[]{f8e0Var, f8e0Var2, f8e0Var3};
    }

    public static f8e0 valueOf(String str) {
        return (f8e0) Enum.valueOf(f8e0.class, str);
    }

    public static f8e0[] values() {
        return (f8e0[]) f66965d.clone();
    }
}
