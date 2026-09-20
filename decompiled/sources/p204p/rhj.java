package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rhj {

    /* JADX INFO: renamed from: a */
    public static final rhj f199233a;

    /* JADX INFO: renamed from: b */
    public static final rhj f199234b;

    /* JADX INFO: renamed from: c */
    public static final rhj f199235c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ rhj[] f199236d;

    static {
        rhj rhjVar = new rhj("UNSPECIFIED", 0);
        f199233a = rhjVar;
        rhj rhjVar2 = new rhj("MUSIC", 1);
        f199234b = rhjVar2;
        rhj rhjVar3 = new rhj("TALK", 2);
        f199235c = rhjVar3;
        f199236d = new rhj[]{rhjVar, rhjVar2, rhjVar3};
    }

    public static rhj valueOf(String str) {
        return (rhj) Enum.valueOf(rhj.class, str);
    }

    public static rhj[] values() {
        return (rhj[]) f199236d.clone();
    }
}
