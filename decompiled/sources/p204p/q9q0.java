package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class q9q0 extends sgz {

    /* JADX INFO: renamed from: d */
    public final Object f186657d;

    public q9q0(int i) {
        super(i);
        this.f186657d = new Object();
    }

    @Override // p204p.sgz
    /* JADX INFO: renamed from: a */
    public final Object mo72406a() {
        Object objMo72406a;
        synchronized (this.f186657d) {
            objMo72406a = super.mo72406a();
        }
        return objMo72406a;
    }

    @Override // p204p.sgz
    /* JADX INFO: renamed from: g */
    public final boolean mo72407g(Object obj) {
        boolean zMo72407g;
        synchronized (this.f186657d) {
            zMo72407g = super.mo72407g(obj);
        }
        return zMo72407g;
    }
}
