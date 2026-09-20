package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class dw31 extends wz10 {

    /* JADX INFO: renamed from: e */
    public final bdv f53596e;

    /* JADX INFO: renamed from: f */
    public final int f53597f;

    public dw31(bdv bdvVar, int i) {
        this.f53596e = bdvVar;
        this.f53597f = i;
        this.f256438d = true;
        this.f256437c = true;
    }

    @Override // p204p.wz10
    /* JADX INFO: renamed from: f */
    public final int mo34488f(int i) {
        if (this.f53596e.m28856C(i).contains(hxv.CARD)) {
            return 1;
        }
        return this.f53597f;
    }
}
