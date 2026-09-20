package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class es90 {

    /* JADX INFO: renamed from: a */
    public static final es90 f62311a;

    /* JADX INFO: renamed from: b */
    public static final es90 f62312b;

    /* JADX INFO: renamed from: c */
    public static final es90 f62313c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ es90[] f62314d;

    static {
        es90 es90Var = new es90("PlayClicked", 0);
        f62311a = es90Var;
        es90 es90Var2 = new es90("ShareClicked", 1);
        f62312b = es90Var2;
        es90 es90Var3 = new es90("ListenOnWebClicked", 2);
        f62313c = es90Var3;
        f62314d = new es90[]{es90Var, es90Var2, es90Var3};
    }

    public static es90 valueOf(String str) {
        return (es90) Enum.valueOf(es90.class, str);
    }

    public static es90[] values() {
        return (es90[]) f62314d.clone();
    }
}
