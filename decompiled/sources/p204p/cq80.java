package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cq80 {

    /* JADX INFO: renamed from: a */
    public static final cq80 f40793a;

    /* JADX INFO: renamed from: b */
    public static final cq80 f40794b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cq80[] f40795c;

    static {
        cq80 cq80Var = new cq80("PLAYLIST", 0);
        f40793a = cq80Var;
        cq80 cq80Var2 = new cq80("FOLDER", 1);
        f40794b = cq80Var2;
        f40795c = new cq80[]{cq80Var, cq80Var2};
    }

    public static cq80 valueOf(String str) {
        return (cq80) Enum.valueOf(cq80.class, str);
    }

    public static cq80[] values() {
        return (cq80[]) f40795c.clone();
    }
}
