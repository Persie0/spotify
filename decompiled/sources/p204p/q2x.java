package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class q2x {

    /* JADX INFO: renamed from: a */
    public static final q2x f184720a;

    /* JADX INFO: renamed from: b */
    public static final q2x f184721b;

    /* JADX INFO: renamed from: c */
    public static final q2x f184722c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ q2x[] f184723d;

    static {
        q2x q2xVar = new q2x("RowClicked", 0);
        f184720a = q2xVar;
        q2x q2xVar2 = new q2x("RowLongClicked", 1);
        f184721b = q2xVar2;
        q2x q2xVar3 = new q2x("OnContextMenuClicked", 2);
        f184722c = q2xVar3;
        f184723d = new q2x[]{q2xVar, q2xVar2, q2xVar3};
    }

    public static q2x valueOf(String str) {
        return (q2x) Enum.valueOf(q2x.class, str);
    }

    public static q2x[] values() {
        return (q2x[]) f184723d.clone();
    }
}
