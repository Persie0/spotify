package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class od10 {

    /* JADX INFO: renamed from: a */
    public static final od10 f164068a;

    /* JADX INFO: renamed from: b */
    public static final od10 f164069b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ od10[] f164070c;

    static {
        od10 od10Var = new od10("ButtonClicked", 0);
        f164068a = od10Var;
        od10 od10Var2 = new od10("CardClicked", 1);
        f164069b = od10Var2;
        f164070c = new od10[]{od10Var, od10Var2};
    }

    public static od10 valueOf(String str) {
        return (od10) Enum.valueOf(od10.class, str);
    }

    public static od10[] values() {
        return (od10[]) f164070c.clone();
    }
}
