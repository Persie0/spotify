package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class zo21 {

    /* JADX INFO: renamed from: a */
    public static final zo21 f284639a;

    /* JADX INFO: renamed from: b */
    public static final zo21 f284640b;

    /* JADX INFO: renamed from: c */
    public static final zo21 f284641c;

    /* JADX INFO: renamed from: d */
    public static final zo21 f284642d;

    /* JADX INFO: renamed from: e */
    public static final zo21 f284643e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ zo21[] f284644f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ nzv f284645g;

    static {
        zo21 zo21Var = new zo21("TRACK", 0);
        f284639a = zo21Var;
        zo21 zo21Var2 = new zo21("PODCAST_EPISODE", 1);
        f284640b = zo21Var2;
        zo21 zo21Var3 = new zo21("AUDIOBOOK_CHAPTER", 2);
        f284641c = zo21Var3;
        zo21 zo21Var4 = new zo21("PODCAST_CHAPTER", 3);
        f284642d = zo21Var4;
        zo21 zo21Var5 = new zo21("CLIP", 4);
        f284643e = zo21Var5;
        zo21[] zo21VarArr = {zo21Var, zo21Var2, zo21Var3, zo21Var4, zo21Var5};
        f284644f = zo21VarArr;
        f284645g = new nzv(zo21VarArr);
    }

    public static zo21 valueOf(String str) {
        return (zo21) Enum.valueOf(zo21.class, str);
    }

    public static zo21[] values() {
        return (zo21[]) f284644f.clone();
    }
}
