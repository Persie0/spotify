package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class cvb1 {

    /* JADX INFO: renamed from: a */
    public static final cvb1 f42346a;

    /* JADX INFO: renamed from: b */
    public static final cvb1 f42347b;

    /* JADX INFO: renamed from: c */
    public static final cvb1 f42348c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cvb1[] f42349d;

    static {
        cvb1 cvb1Var = new cvb1("Inactive", 0);
        f42346a = cvb1Var;
        cvb1 cvb1Var2 = new cvb1("UserToggled", 1);
        f42347b = cvb1Var2;
        cvb1 cvb1Var3 = new cvb1("ForcedByPlaylist", 2);
        f42348c = cvb1Var3;
        f42349d = new cvb1[]{cvb1Var, cvb1Var2, cvb1Var3};
    }

    public static cvb1 valueOf(String str) {
        return (cvb1) Enum.valueOf(cvb1.class, str);
    }

    public static cvb1[] values() {
        return (cvb1[]) f42349d.clone();
    }
}
