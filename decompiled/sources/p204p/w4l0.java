package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class w4l0 extends p3x0 {

    /* JADX INFO: renamed from: b */
    public final ayd0 f247849b;

    /* JADX INFO: renamed from: c */
    public final long f247850c;

    public w4l0(ayd0 ayd0Var, long j) {
        this.f247849b = ayd0Var;
        this.f247850c = j;
    }

    @Override // p204p.p3x0
    /* JADX INFO: renamed from: C1 */
    public final gqa mo28080C1() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // p204p.p3x0
    /* JADX INFO: renamed from: e */
    public final long mo28081e() {
        return this.f247850c;
    }

    @Override // p204p.p3x0
    /* JADX INFO: renamed from: f */
    public final ayd0 mo28082f() {
        return this.f247849b;
    }
}
