package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ypi0 {

    /* JADX INFO: renamed from: a */
    public float f274974a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f274975b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f274976c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f274977d = 0.0f;

    /* JADX INFO: renamed from: a */
    public final void m94307a(float f, float f2, float f3, float f4) {
        this.f274974a = Math.max(f, this.f274974a);
        this.f274975b = Math.max(f2, this.f274975b);
        this.f274976c = Math.min(f3, this.f274976c);
        this.f274977d = Math.min(f4, this.f274977d);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94308b() {
        return (this.f274974a >= this.f274976c) | (this.f274975b >= this.f274977d);
    }

    /* JADX INFO: renamed from: c */
    public final void m94309c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f274974a += fIntBitsToFloat;
        this.f274975b += fIntBitsToFloat2;
        this.f274976c += fIntBitsToFloat;
        this.f274977d += fIntBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + spg1.m78891A(this.f274974a) + ", " + spg1.m78891A(this.f274975b) + ", " + spg1.m78891A(this.f274976c) + ", " + spg1.m78891A(this.f274977d) + ')';
    }
}
