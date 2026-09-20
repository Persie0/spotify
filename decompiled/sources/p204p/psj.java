package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class psj {

    /* JADX INFO: renamed from: a */
    public static final psj f180873a;

    /* JADX INFO: renamed from: b */
    public static final psj f180874b;

    /* JADX INFO: renamed from: c */
    public static final psj f180875c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ psj[] f180876d;

    static {
        psj psjVar = new psj("OVER19ONLY", 0);
        f180873a = psjVar;
        psj psjVar2 = new psj("EXPLICIT", 1);
        f180874b = psjVar2;
        psj psjVar3 = new psj("NONE", 2);
        f180875c = psjVar3;
        f180876d = new psj[]{psjVar, psjVar2, psjVar3};
    }

    public static psj valueOf(String str) {
        return (psj) Enum.valueOf(psj.class, str);
    }

    public static psj[] values() {
        return (psj[]) f180876d.clone();
    }
}
