package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class no40 {

    /* JADX INFO: renamed from: a */
    public static final no40 f156576a;

    /* JADX INFO: renamed from: b */
    public static final no40 f156577b;

    /* JADX INFO: renamed from: c */
    public static final no40 f156578c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ no40[] f156579d;

    static {
        no40 no40Var = new no40("Hidden", 0);
        f156576a = no40Var;
        no40 no40Var2 = new no40("NextPageIndicatorVisible", 1);
        f156577b = no40Var2;
        no40 no40Var3 = new no40("PreviousPageIndicatorVisible", 2);
        f156578c = no40Var3;
        f156579d = new no40[]{no40Var, no40Var2, no40Var3};
    }

    public static no40 valueOf(String str) {
        return (no40) Enum.valueOf(no40.class, str);
    }

    public static no40[] values() {
        return (no40[]) f156579d.clone();
    }
}
