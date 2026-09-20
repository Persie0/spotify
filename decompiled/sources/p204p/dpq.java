package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class dpq {

    /* JADX INFO: renamed from: a */
    public static final dpq f51380a;

    /* JADX INFO: renamed from: b */
    public static final dpq f51381b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ dpq[] f51382c;

    static {
        dpq dpqVar = new dpq("OnDeleteButtonClicked", 0);
        f51380a = dpqVar;
        dpq dpqVar2 = new dpq("OnCancelButtonClicked", 1);
        f51381b = dpqVar2;
        f51382c = new dpq[]{dpqVar, dpqVar2};
    }

    public static dpq valueOf(String str) {
        return (dpq) Enum.valueOf(dpq.class, str);
    }

    public static dpq[] values() {
        return (dpq[]) f51382c.clone();
    }
}
