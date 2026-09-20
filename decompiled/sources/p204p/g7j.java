package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class g7j implements h7j {

    /* JADX INFO: renamed from: a */
    public boolean f77277a;

    /* JADX INFO: renamed from: b */
    public String f77278b;

    /* JADX INFO: renamed from: c */
    public String f77279c;

    /* JADX INFO: renamed from: d */
    public float f77280d;

    /* JADX INFO: renamed from: e */
    public float f77281e;

    @Override // p204p.h7j
    public final float value() {
        float f = this.f77280d;
        if (f >= this.f77281e) {
            this.f77277a = true;
        }
        if (!this.f77277a) {
            this.f77280d = f + 1.0f;
        }
        return this.f77280d;
    }
}
