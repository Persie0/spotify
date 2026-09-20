package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class di20 {

    /* JADX INFO: renamed from: a */
    public static final di20 f49213a;

    /* JADX INFO: renamed from: b */
    public static final di20 f49214b;

    /* JADX INFO: renamed from: c */
    public static final di20 f49215c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ di20[] f49216d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f49217e;

    static {
        di20 di20Var = new di20("Normal", 0);
        f49213a = di20Var;
        di20 di20Var2 = new di20("Compact", 1);
        f49214b = di20Var2;
        di20 di20Var3 = new di20("FullBleed", 2);
        f49215c = di20Var3;
        di20[] di20VarArr = {di20Var, di20Var2, di20Var3};
        f49216d = di20VarArr;
        f49217e = new nzv(di20VarArr);
    }

    public static di20 valueOf(String str) {
        return (di20) Enum.valueOf(di20.class, str);
    }

    public static di20[] values() {
        return (di20[]) f49216d.clone();
    }
}
