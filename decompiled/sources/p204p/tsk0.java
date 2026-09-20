package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class tsk0 {

    /* JADX INFO: renamed from: a */
    public static final tsk0 f223335a;

    /* JADX INFO: renamed from: b */
    public static final tsk0 f223336b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ tsk0[] f223337c;

    static {
        tsk0 tsk0Var = new tsk0("ShareFriendLinkClicked", 0);
        f223335a = tsk0Var;
        tsk0 tsk0Var2 = new tsk0("ShowQrCodeClicked", 1);
        f223336b = tsk0Var2;
        f223337c = new tsk0[]{tsk0Var, tsk0Var2};
    }

    public static tsk0 valueOf(String str) {
        return (tsk0) Enum.valueOf(tsk0.class, str);
    }

    public static tsk0[] values() {
        return (tsk0[]) f223337c.clone();
    }
}
