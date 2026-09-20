package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class x100 {

    /* JADX INFO: renamed from: a */
    public static final x100 f257022a;

    /* JADX INFO: renamed from: b */
    public static final x100 f257023b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ x100[] f257024c;

    static {
        x100 x100Var = new x100("OnGoToHomeClicked", 0);
        f257022a = x100Var;
        x100 x100Var2 = new x100("OnUnfollowClicked", 1);
        f257023b = x100Var2;
        f257024c = new x100[]{x100Var, x100Var2};
    }

    public static x100 valueOf(String str) {
        return (x100) Enum.valueOf(x100.class, str);
    }

    public static x100[] values() {
        return (x100[]) f257024c.clone();
    }
}
