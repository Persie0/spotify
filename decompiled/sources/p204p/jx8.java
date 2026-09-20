package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class jx8 extends hq20 {

    /* JADX INFO: renamed from: n0 */
    public int f117050n0;

    /* JADX INFO: renamed from: o0 */
    public int f117051o0;

    /* JADX INFO: renamed from: p0 */
    public ix8 f117052p0;

    @Override // p204p.hq20
    /* JADX INFO: renamed from: a0 */
    public final jq20 mo43252a0() {
        if (this.f117052p0 == null) {
            this.f117052p0 = new ix8();
        }
        return this.f117052p0;
    }

    @Override // p204p.hq20, p204p.v6j, p204p.ulv0, p204p.e6y
    public final void apply() {
        mo43252a0();
        int iM38547C = edb.m38547C(this.f117050n0);
        int i = 1;
        if (iM38547C != 1 && iM38547C != 3) {
            if (iM38547C != 4) {
                i = iM38547C != 5 ? 0 : 3;
            } else {
                i = 2;
            }
        }
        ix8 ix8Var = this.f117052p0;
        ix8Var.f106616w0 = i;
        ix8Var.f106618y0 = this.f117051o0;
    }

    @Override // p204p.v6j
    /* JADX INFO: renamed from: y */
    public final v6j mo54625y(int i) {
        this.f117051o0 = i;
        return this;
    }

    @Override // p204p.v6j
    /* JADX INFO: renamed from: z */
    public final v6j mo54626z(Float f) {
        this.f117051o0 = this.f94001k0.m92122c(f);
        return this;
    }
}
