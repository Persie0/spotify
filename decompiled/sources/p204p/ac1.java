package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ac1 {

    /* JADX INFO: renamed from: a */
    public static final ac1 f14222a;

    /* JADX INFO: renamed from: b */
    public static final ac1 f14223b;

    /* JADX INFO: renamed from: c */
    public static final ac1 f14224c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ac1[] f14225d;

    static {
        ac1 ac1Var = new ac1("IDLE", 0);
        f14222a = ac1Var;
        ac1 ac1Var2 = new ac1("SENDING", 1);
        f14223b = ac1Var2;
        ac1 ac1Var3 = new ac1("REQUESTED", 2);
        f14224c = ac1Var3;
        f14225d = new ac1[]{ac1Var, ac1Var2, ac1Var3};
    }

    public static ac1 valueOf(String str) {
        return (ac1) Enum.valueOf(ac1.class, str);
    }

    public static ac1[] values() {
        return (ac1[]) f14225d.clone();
    }
}
