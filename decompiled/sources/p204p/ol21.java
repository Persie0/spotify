package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ol21 {

    /* JADX INFO: renamed from: a */
    public static final ol21 f166734a;

    /* JADX INFO: renamed from: b */
    public static final ol21 f166735b;

    /* JADX INFO: renamed from: c */
    public static final ol21 f166736c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ol21[] f166737d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f166738e;

    static {
        ol21 ol21Var = new ol21("FIFTEEN_SECONDS", 0);
        f166735b = ol21Var;
        ol21 ol21Var2 = new ol21("NEXT_CHAPTER", 1);
        f166736c = ol21Var2;
        ol21[] ol21VarArr = {ol21Var, ol21Var2};
        f166737d = ol21VarArr;
        f166738e = new nzv(ol21VarArr);
        f166734a = ol21Var2;
    }

    public static ol21 valueOf(String str) {
        return (ol21) Enum.valueOf(ol21.class, str);
    }

    public static ol21[] values() {
        return (ol21[]) f166737d.clone();
    }
}
