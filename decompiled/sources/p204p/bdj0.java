package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class bdj0 {

    /* JADX INFO: renamed from: a */
    public static final bdj0 f26118a;

    /* JADX INFO: renamed from: b */
    public static final bdj0 f26119b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ bdj0[] f26120c;

    static {
        bdj0 bdj0Var = new bdj0("PermissionRequested", 0);
        f26118a = bdj0Var;
        bdj0 bdj0Var2 = new bdj0("NavigatedToSettings", 1);
        f26119b = bdj0Var2;
        f26120c = new bdj0[]{bdj0Var, bdj0Var2};
    }

    public static bdj0 valueOf(String str) {
        return (bdj0) Enum.valueOf(bdj0.class, str);
    }

    public static bdj0[] values() {
        return (bdj0[]) f26120c.clone();
    }
}
