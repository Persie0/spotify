package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class bo81 {

    /* JADX INFO: renamed from: a */
    public static final bo81 f29042a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ bo81[] f29043b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f29044c;

    /* JADX INFO: Fake field, exist only in values array */
    bo81 EF0;

    static {
        bo81 bo81Var = new bo81("UP", 0);
        bo81 bo81Var2 = new bo81("DOWN", 1);
        bo81 bo81Var3 = new bo81("NEW", 2);
        bo81 bo81Var4 = new bo81("NONE", 3);
        f29042a = bo81Var4;
        bo81[] bo81VarArr = {bo81Var, bo81Var2, bo81Var3, bo81Var4};
        f29043b = bo81VarArr;
        f29044c = new nzv(bo81VarArr);
    }

    public static bo81 valueOf(String str) {
        return (bo81) Enum.valueOf(bo81.class, str);
    }

    public static bo81[] values() {
        return (bo81[]) f29043b.clone();
    }
}
