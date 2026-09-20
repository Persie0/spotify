package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p9l {

    /* JADX INFO: renamed from: a */
    public static final p9l f175263a;

    /* JADX INFO: renamed from: b */
    public static final p9l f175264b;

    /* JADX INFO: renamed from: c */
    public static final p9l f175265c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ p9l[] f175266d;

    static {
        p9l p9lVar = new p9l("Top", 0);
        f175263a = p9lVar;
        p9l p9lVar2 = new p9l("Center", 1);
        f175264b = p9lVar2;
        p9l p9lVar3 = new p9l("Bottom", 2);
        f175265c = p9lVar3;
        f175266d = new p9l[]{p9lVar, p9lVar2, p9lVar3};
    }

    public static p9l valueOf(String str) {
        return (p9l) Enum.valueOf(p9l.class, str);
    }

    public static p9l[] values() {
        return (p9l[]) f175266d.clone();
    }
}
