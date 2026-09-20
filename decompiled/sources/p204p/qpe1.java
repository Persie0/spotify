package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class qpe1 {

    /* JADX INFO: renamed from: a */
    public static final qpe1 f191284a;

    /* JADX INFO: renamed from: b */
    public static final qpe1 f191285b;

    /* JADX INFO: renamed from: c */
    public static final qpe1 f191286c;

    /* JADX INFO: renamed from: d */
    public static final qpe1 f191287d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ qpe1[] f191288e;

    static {
        qpe1 qpe1Var = new qpe1("ALBUM", 0);
        f191284a = qpe1Var;
        qpe1 qpe1Var2 = new qpe1("AUDIOBOOK", 1);
        f191285b = qpe1Var2;
        qpe1 qpe1Var3 = new qpe1("LIKED_SONGS", 2);
        f191286c = qpe1Var3;
        qpe1 qpe1Var4 = new qpe1("PLAYLIST", 3);
        f191287d = qpe1Var4;
        f191288e = new qpe1[]{qpe1Var, qpe1Var2, qpe1Var3, qpe1Var4};
    }

    public static qpe1 valueOf(String str) {
        return (qpe1) Enum.valueOf(qpe1.class, str);
    }

    public static qpe1[] values() {
        return (qpe1[]) f191288e.clone();
    }
}
