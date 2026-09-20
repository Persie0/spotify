package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class y920 {

    /* JADX INFO: renamed from: a */
    public static final y920 f270469a;

    /* JADX INFO: renamed from: b */
    public static final y920 f270470b;

    /* JADX INFO: renamed from: c */
    public static final y920 f270471c;

    /* JADX INFO: renamed from: d */
    public static final y920 f270472d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ y920[] f270473e;

    static {
        y920 y920Var = new y920("UNKNOWN", 0);
        f270469a = y920Var;
        y920 y920Var2 = new y920("GROUPED", 1);
        f270470b = y920Var2;
        y920 y920Var3 = new y920("GROUPABLE", 2);
        f270471c = y920Var3;
        y920 y920Var4 = new y920("CONNECTING", 3);
        f270472d = y920Var4;
        f270473e = new y920[]{y920Var, y920Var2, y920Var3, y920Var4};
    }

    public static y920 valueOf(String str) {
        return (y920) Enum.valueOf(y920.class, str);
    }

    public static y920[] values() {
        return (y920[]) f270473e.clone();
    }
}
