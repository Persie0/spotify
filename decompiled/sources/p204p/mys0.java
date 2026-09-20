package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class mys0 {

    /* JADX INFO: renamed from: a */
    public static final mys0 f148507a;

    /* JADX INFO: renamed from: b */
    public static final mys0 f148508b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ mys0[] f148509c;

    /* JADX INFO: Fake field, exist only in values array */
    mys0 EF0;

    static {
        mys0 mys0Var = new mys0("PRETTY", 0);
        mys0 mys0Var2 = new mys0("DEBUG", 1);
        f148507a = mys0Var2;
        mys0 mys0Var3 = new mys0("NONE", 2);
        f148508b = mys0Var3;
        f148509c = new mys0[]{mys0Var, mys0Var2, mys0Var3};
    }

    public static mys0 valueOf(String str) {
        return (mys0) Enum.valueOf(mys0.class, str);
    }

    public static mys0[] values() {
        return (mys0[]) f148509c.clone();
    }
}
