package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class v8z0 implements ol91 {

    /* JADX INFO: renamed from: a */
    public final u8z0 f238794a;

    /* JADX INFO: renamed from: b */
    public final l2n0 f238795b = new l2n0(32);

    /* JADX INFO: renamed from: c */
    public int f238796c;

    /* JADX INFO: renamed from: d */
    public int f238797d;

    /* JADX INFO: renamed from: e */
    public boolean f238798e;

    /* JADX INFO: renamed from: f */
    public boolean f238799f;

    public v8z0(u8z0 u8z0Var) {
        this.f238794a = u8z0Var;
    }

    @Override // p204p.ol91
    /* JADX INFO: renamed from: a */
    public final void mo67281a(int i, l2n0 l2n0Var) {
        int iM57917E;
        boolean z = (i & 1) != 0;
        if (z) {
            iM57917E = l2n0Var.f129055b + l2n0Var.m57917E();
        } else {
            iM57917E = -1;
        }
        if (this.f238799f) {
            if (!z) {
                return;
            }
            this.f238799f = false;
            l2n0Var.m57930R(iM57917E);
            this.f238797d = 0;
        }
        while (l2n0Var.m57932a() > 0) {
            int i2 = this.f238797d;
            l2n0 l2n0Var2 = this.f238795b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM57917E2 = l2n0Var.m57917E();
                    l2n0Var.m57930R(l2n0Var.f129055b - 1);
                    if (iM57917E2 == 255) {
                        this.f238799f = true;
                        return;
                    }
                }
                int iMin = Math.min(l2n0Var.m57932a(), 3 - this.f238797d);
                l2n0Var.m57943o(this.f238797d, l2n0Var2.f129054a, iMin);
                int i3 = this.f238797d + iMin;
                this.f238797d = i3;
                if (i3 == 3) {
                    l2n0Var2.m57930R(0);
                    l2n0Var2.m57929Q(3);
                    l2n0Var2.m57931S(1);
                    int iM57917E3 = l2n0Var2.m57917E();
                    int iM57917E4 = l2n0Var2.m57917E();
                    this.f238798e = (iM57917E3 & 128) != 0;
                    int i4 = (((iM57917E3 & 15) << 8) | iM57917E4) + 3;
                    this.f238796c = i4;
                    byte[] bArr = l2n0Var2.f129054a;
                    if (bArr.length < i4) {
                        l2n0Var2.m57934d(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(l2n0Var.m57932a(), this.f238796c - this.f238797d);
                l2n0Var.m57943o(this.f238797d, l2n0Var2.f129054a, iMin2);
                int i5 = this.f238797d + iMin2;
                this.f238797d = i5;
                int i6 = this.f238796c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f238798e) {
                        l2n0Var2.m57929Q(i6);
                    } else {
                        if (h0b1.m46329q(0, l2n0Var2.f129054a, i6, -1) != 0) {
                            this.f238799f = true;
                            return;
                        }
                        l2n0Var2.m57929Q(this.f238796c - 4);
                    }
                    l2n0Var2.m57930R(0);
                    this.f238794a.mo36099a(l2n0Var2);
                    this.f238797d = 0;
                }
            }
        }
    }

    @Override // p204p.ol91
    /* JADX INFO: renamed from: b */
    public final void mo67282b(qu71 qu71Var, e5y e5yVar, zmx0 zmx0Var) {
        this.f238794a.mo36100b(qu71Var, e5yVar, zmx0Var);
        this.f238799f = true;
    }

    @Override // p204p.ol91
    /* JADX INFO: renamed from: c */
    public final void mo67283c() {
        this.f238799f = true;
    }
}
