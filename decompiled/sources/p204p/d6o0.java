package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class d6o0 extends vpc1 {
    @Override // p204p.vpc1
    /* JADX INFO: renamed from: Z */
    public final void mo35147Z(int i, int i2, int i3, int i4) {
        int iM84886s = this.f243659A0 + this.f243660B0;
        int iM84882m = this.f243666w0 + this.f243667x0;
        if (this.f114775v0 > 0) {
            iM84886s += this.f114774u0[0].m84886s();
            iM84882m += this.f114774u0[0].m84882m();
        }
        int iMax = Math.max(this.f238233d0, iM84886s);
        int iMax2 = Math.max(this.f238235e0, iM84882m);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(iMax, i2);
            } else {
                i2 = i == 0 ? iMax : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(iMax2, i4);
            } else {
                i4 = i3 == 0 ? iMax2 : 0;
            }
        }
        this.f243662D0 = i2;
        this.f243663E0 = i4;
        m84872T(i2);
        m84867O(i4);
        this.f243661C0 = this.f114775v0 > 0;
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: c */
    public final void mo35148c(kl80 kl80Var, boolean z) {
        super.mo35148c(kl80Var, z);
        if (this.f114775v0 > 0) {
            v7j v7jVar = this.f114774u0[0];
            v7jVar.m84860F();
            v7jVar.f238239g0 = 0.5f;
            v7jVar.f238237f0 = 0.5f;
            v7jVar.m84877f(2, this, 2, 0);
            v7jVar.m84877f(4, this, 4, 0);
            v7jVar.m84877f(3, this, 3, 0);
            v7jVar.m84877f(5, this, 5, 0);
        }
    }
}
