package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mlm0 {

    /* JADX INFO: renamed from: a */
    public static final mlm0 f144862a;

    /* JADX INFO: renamed from: b */
    public static final mlm0 f144863b;

    /* JADX INFO: renamed from: c */
    public static final mlm0 f144864c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ mlm0[] f144865d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f144866e;

    static {
        mlm0 mlm0Var = new mlm0("PROMPTED_PLAYLIST", 0);
        f144862a = mlm0Var;
        mlm0 mlm0Var2 = new mlm0("BLUEJAY", 1);
        f144863b = mlm0Var2;
        mlm0 mlm0Var3 = new mlm0("PERSONALIZED_SET", 2);
        f144864c = mlm0Var3;
        mlm0[] mlm0VarArr = {mlm0Var, mlm0Var2, mlm0Var3};
        f144865d = mlm0VarArr;
        f144866e = new nzv(mlm0VarArr);
    }

    public static mlm0 valueOf(String str) {
        return (mlm0) Enum.valueOf(mlm0.class, str);
    }

    public static mlm0[] values() {
        return (mlm0[]) f144865d.clone();
    }
}
