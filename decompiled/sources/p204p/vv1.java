package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vv1 {

    /* JADX INFO: renamed from: a */
    public static final vv1 f245112a;

    /* JADX INFO: renamed from: b */
    public static final vv1 f245113b;

    /* JADX INFO: renamed from: c */
    public static final vv1 f245114c;

    /* JADX INFO: renamed from: d */
    public static final vv1 f245115d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ vv1[] f245116e;

    static {
        vv1 vv1Var = new vv1("SESSION_ENDED_BY_USER", 0);
        f245112a = vv1Var;
        vv1 vv1Var2 = new vv1("MEETING_ENDED_BY_USER", 1);
        f245113b = vv1Var2;
        vv1 vv1Var3 = new vv1("SESSION_ENDED_UNEXPECTEDLY", 2);
        f245114c = vv1Var3;
        vv1 vv1Var4 = new vv1("SESSION_ENDED_DUE_TO_RECORDING_STATE_SYNC_ISSUE", 3);
        f245115d = vv1Var4;
        f245116e = new vv1[]{vv1Var, vv1Var2, vv1Var3, vv1Var4};
    }

    public static vv1 valueOf(String str) {
        return (vv1) Enum.valueOf(vv1.class, str);
    }

    public static vv1[] values() {
        return (vv1[]) f245116e.clone();
    }
}
