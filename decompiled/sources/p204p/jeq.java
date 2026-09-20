package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class jeq extends peq implements Comparable {

    /* JADX INFO: renamed from: e */
    public final int f111643e;

    /* JADX INFO: renamed from: f */
    public final int f111644f;

    public jeq(int i, kf81 kf81Var, int i2, meq meqVar, int i3) {
        super(i, kf81Var, i2);
        this.f111643e = o09.m65985u(i3, meqVar.f142818B0) ? 1 : 0;
        this.f111644f = this.f176833d.m74566c();
    }

    @Override // p204p.peq
    /* JADX INFO: renamed from: a */
    public final int mo50397a() {
        return this.f111643e;
    }

    @Override // p204p.peq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo50398b(peq peqVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f111644f, ((jeq) obj).f111644f);
    }
}
