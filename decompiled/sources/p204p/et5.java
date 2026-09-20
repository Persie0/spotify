package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class et5 {

    /* JADX INFO: renamed from: a */
    public static final et5 f62621a;

    /* JADX INFO: renamed from: b */
    public static final et5 f62622b;

    /* JADX INFO: renamed from: c */
    public static final et5 f62623c;

    /* JADX INFO: renamed from: d */
    public static final et5 f62624d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ et5[] f62625e;

    static {
        et5 et5Var = new et5("RowClicked", 0);
        f62621a = et5Var;
        et5 et5Var2 = new et5("FollowButtonClicked", 1);
        f62622b = et5Var2;
        et5 et5Var3 = new et5("ConcertClicked", 2);
        f62623c = et5Var3;
        et5 et5Var4 = new et5("ConcertSaveButtonClicked", 3);
        f62624d = et5Var4;
        f62625e = new et5[]{et5Var, et5Var2, et5Var3, et5Var4};
    }

    public static et5 valueOf(String str) {
        return (et5) Enum.valueOf(et5.class, str);
    }

    public static et5[] values() {
        return (et5[]) f62625e.clone();
    }
}
