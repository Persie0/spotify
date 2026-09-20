package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class q05 implements rv41 {

    /* JADX INFO: renamed from: a */
    public final tm91 f183905a;

    /* JADX INFO: renamed from: b */
    public final yum0 f183906b;

    /* JADX INFO: renamed from: c */
    public w05 f183907c;

    /* JADX INFO: renamed from: d */
    public long f183908d;

    /* JADX INFO: renamed from: e */
    public long f183909e;

    /* JADX INFO: renamed from: f */
    public boolean f183910f;

    public /* synthetic */ q05(tm91 tm91Var, Object obj, w05 w05Var, int i) {
        this(tm91Var, obj, (i & 4) != 0 ? null : w05Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: a */
    public final Object m71791a() {
        return this.f183905a.f221638b.invoke(this.f183907c);
    }

    @Override // p204p.rv41
    public final Object getValue() {
        return this.f183906b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f183906b.getValue() + ", velocity=" + m71791a() + ", isRunning=" + this.f183910f + ", lastFrameTimeNanos=" + this.f183908d + ", finishedTimeNanos=" + this.f183909e + ')';
    }

    public q05(tm91 tm91Var, Object obj, w05 w05Var, long j, long j2, boolean z) {
        this.f183905a = tm91Var;
        this.f183906b = sam.m77645B(obj);
        this.f183907c = w05Var != null ? ja61.m52791m(w05Var) : el51.m39342l(tm91Var, obj);
        this.f183908d = j;
        this.f183909e = j2;
        this.f183910f = z;
    }
}
