package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class aze0 {

    /* JADX INFO: renamed from: a */
    public static final aze0 f21498a;

    /* JADX INFO: renamed from: b */
    public static final aze0 f21499b;

    /* JADX INFO: renamed from: c */
    public static final aze0 f21500c;

    /* JADX INFO: renamed from: d */
    public static final aze0 f21501d;

    /* JADX INFO: renamed from: e */
    public static final aze0 f21502e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ aze0[] f21503f;

    static {
        aze0 aze0Var = new aze0("DialogDismissed", 0);
        f21498a = aze0Var;
        aze0 aze0Var2 = new aze0("KeepCustomTransitionsClicked", 1);
        f21499b = aze0Var2;
        aze0 aze0Var3 = new aze0("ReorderAllTracksClicked", 2);
        f21500c = aze0Var3;
        aze0 aze0Var4 = new aze0("MoveTrackClicked", 3);
        f21501d = aze0Var4;
        aze0 aze0Var5 = new aze0("CancelClicked", 4);
        f21502e = aze0Var5;
        f21503f = new aze0[]{aze0Var, aze0Var2, aze0Var3, aze0Var4, aze0Var5};
    }

    public static aze0 valueOf(String str) {
        return (aze0) Enum.valueOf(aze0.class, str);
    }

    public static aze0[] values() {
        return (aze0[]) f21503f.clone();
    }
}
