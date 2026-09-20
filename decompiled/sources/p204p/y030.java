package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y030 implements Comparable {

    /* JADX INFO: renamed from: X */
    public final boolean f267878X;

    /* JADX INFO: renamed from: a */
    public final String f267879a;

    /* JADX INFO: renamed from: b */
    public final x030 f267880b;

    /* JADX INFO: renamed from: c */
    public final long f267881c;

    /* JADX INFO: renamed from: d */
    public final int f267882d;

    /* JADX INFO: renamed from: e */
    public final long f267883e;

    /* JADX INFO: renamed from: f */
    public final ahs f267884f;

    /* JADX INFO: renamed from: g */
    public final String f267885g;

    /* JADX INFO: renamed from: h */
    public final String f267886h;

    /* JADX INFO: renamed from: i */
    public final long f267887i;

    /* JADX INFO: renamed from: t */
    public final long f267888t;

    public y030(String str, x030 x030Var, long j, int i, long j2, ahs ahsVar, String str2, String str3, long j3, long j4, boolean z) {
        this.f267879a = str;
        this.f267880b = x030Var;
        this.f267881c = j;
        this.f267882d = i;
        this.f267883e = j2;
        this.f267884f = ahsVar;
        this.f267885g = str2;
        this.f267886h = str3;
        this.f267887i = j3;
        this.f267888t = j4;
        this.f267878X = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.f267883e;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
