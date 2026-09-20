package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c361 implements vj51 {

    /* JADX INFO: renamed from: a */
    public double f33582a;

    /* JADX INFO: renamed from: b */
    public boolean f33583b;

    @Override // p204p.vj51
    /* JADX INFO: renamed from: c */
    public final ybf0 mo31363c() {
        if (!this.f33583b) {
            return null;
        }
        double d = this.f33582a;
        this.f33582a = 0.0d;
        this.f33583b = false;
        return new xbf0(d);
    }

    @Override // p204p.vj51
    public final ybf0 peek() {
        if (this.f33583b) {
            return new xbf0(this.f33582a);
        }
        return null;
    }

    @Override // p204p.vj51
    public final void record(double d) {
        this.f33583b = true;
        this.f33582a += d;
    }
}
