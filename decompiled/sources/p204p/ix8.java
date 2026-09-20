package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ix8 extends jq20 {

    /* JADX INFO: renamed from: w0 */
    public int f106616w0 = 0;

    /* JADX INFO: renamed from: x0 */
    public boolean f106617x0 = true;

    /* JADX INFO: renamed from: y0 */
    public int f106618y0 = 0;

    /* JADX INFO: renamed from: z0 */
    public boolean f106619z0 = false;

    @Override // p204p.v7j
    /* JADX INFO: renamed from: C */
    public final boolean mo51861C() {
        return this.f106619z0;
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: D */
    public final boolean mo51862D() {
        return this.f106619z0;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m51863Z() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f114775v0;
            if (i4 >= i) {
                break;
            }
            v7j v7jVar = this.f114774u0[i4];
            if ((this.f106617x0 || v7jVar.mo51865d()) && ((((i2 = this.f106616w0) == 0 || i2 == 1) && !v7jVar.mo51861C()) || (((i3 = this.f106616w0) == 2 || i3 == 3) && !v7jVar.mo51862D()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f114775v0; i5++) {
            v7j v7jVar2 = this.f114774u0[i5];
            if (this.f106617x0 || v7jVar2.mo51865d()) {
                if (!z2) {
                    int i6 = this.f106616w0;
                    if (i6 == 0) {
                        iMax = v7jVar2.mo55866k(2).m31570d();
                    } else if (i6 == 1) {
                        iMax = v7jVar2.mo55866k(4).m31570d();
                    } else if (i6 == 2) {
                        iMax = v7jVar2.mo55866k(3).m31570d();
                    } else if (i6 == 3) {
                        iMax = v7jVar2.mo55866k(5).m31570d();
                    }
                    z2 = true;
                }
                int i7 = this.f106616w0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, v7jVar2.mo55866k(2).m31570d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, v7jVar2.mo55866k(4).m31570d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, v7jVar2.mo55866k(3).m31570d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, v7jVar2.mo55866k(5).m31570d());
                }
            }
        }
        int i8 = iMax + this.f106618y0;
        int i9 = this.f106616w0;
        if (i9 == 0 || i9 == 1) {
            m84865M(i8, i8);
        } else {
            m84866N(i8, i8);
        }
        this.f106619z0 = true;
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final int m51864a0() {
        int i = this.f106616w0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: c */
    public final void mo35148c(kl80 kl80Var, boolean z) {
        boolean z2;
        int i;
        c6j[] c6jVarArr = this.f238217R;
        c6j c6jVar = this.f238209J;
        c6jVarArr[0] = c6jVar;
        int i2 = 2;
        c6j c6jVar2 = this.f238210K;
        c6jVarArr[2] = c6jVar2;
        c6j c6jVar3 = this.f238211L;
        c6jVarArr[1] = c6jVar3;
        c6j c6jVar4 = this.f238212M;
        c6jVarArr[3] = c6jVar4;
        for (c6j c6jVar5 : c6jVarArr) {
            c6jVar5.f34554i = kl80Var.m56811k(c6jVar5);
        }
        int i3 = this.f106616w0;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        c6j c6jVar6 = c6jVarArr[i3];
        if (!this.f106619z0) {
            m51863Z();
        }
        if (this.f106619z0) {
            this.f106619z0 = false;
            int i4 = this.f106616w0;
            if (i4 == 0 || i4 == 1) {
                kl80Var.m56804d(c6jVar.f34554i, this.f238227a0);
                kl80Var.m56804d(c6jVar3.f34554i, this.f238227a0);
                return;
            } else {
                if (i4 == 2 || i4 == 3) {
                    kl80Var.m56804d(c6jVar2.f34554i, this.f238229b0);
                    kl80Var.m56804d(c6jVar4.f34554i, this.f238229b0);
                    return;
                }
                return;
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.f114775v0) {
                z2 = false;
                break;
            }
            v7j v7jVar = this.f114774u0[i5];
            if (this.f106617x0 || v7jVar.mo51865d()) {
                int i6 = this.f106616w0;
                u7j u7jVar = u7j.f227712c;
                if (((i6 == 0 || i6 == 1) && v7jVar.f238220U[0] == u7jVar && v7jVar.f238209J.f34551f != null && v7jVar.f238211L.f34551f != null) || ((i6 == 2 || i6 == 3) && v7jVar.f238220U[1] == u7jVar && v7jVar.f238210K.f34551f != null && v7jVar.f238212M.f34551f != null)) {
                    z2 = true;
                    break;
                }
            }
            i5++;
        }
        boolean z3 = c6jVar.m31573g() || c6jVar3.m31573g();
        boolean z4 = c6jVar2.m31573g() || c6jVar4.m31573g();
        int i7 = !(!z2 && (((i = this.f106616w0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f114775v0) {
            v7j v7jVar2 = this.f114774u0[i8];
            if (this.f106617x0 || v7jVar2.mo51865d()) {
                rk31 rk31VarM56811k = kl80Var.m56811k(v7jVar2.f238217R[this.f106616w0]);
                c6j[] c6jVarArr2 = v7jVar2.f238217R;
                int i9 = this.f106616w0;
                c6j c6jVar7 = c6jVarArr2[i9];
                c6jVar7.f34554i = rk31VarM56811k;
                c6j c6jVar8 = c6jVar7.f34551f;
                int i10 = (c6jVar8 == null || c6jVar8.f34549d != this) ? 0 : c6jVar7.f34552g;
                if (i9 == 0 || i9 == i2) {
                    rk31 rk31Var = c6jVar6.f34554i;
                    int i11 = this.f106618y0 - i10;
                    yj5 yj5VarM56812l = kl80Var.m56812l();
                    rk31 rk31VarM56813m = kl80Var.m56813m();
                    rk31VarM56813m.f199970d = 0;
                    yj5VarM56812l.m93847c(rk31Var, rk31VarM56811k, rk31VarM56813m, i11);
                    kl80Var.m56803c(yj5VarM56812l);
                } else {
                    rk31 rk31Var2 = c6jVar6.f34554i;
                    int i12 = this.f106618y0 + i10;
                    yj5 yj5VarM56812l2 = kl80Var.m56812l();
                    rk31 rk31VarM56813m2 = kl80Var.m56813m();
                    rk31VarM56813m2.f199970d = 0;
                    yj5VarM56812l2.m93846b(rk31Var2, rk31VarM56811k, rk31VarM56813m2, i12);
                    kl80Var.m56803c(yj5VarM56812l2);
                }
                kl80Var.m56805e(c6jVar6.f34554i, rk31VarM56811k, this.f106618y0 + i10, i7);
            }
            i8++;
            i2 = 2;
        }
        int i13 = this.f106616w0;
        if (i13 == 0) {
            kl80Var.m56805e(c6jVar3.f34554i, c6jVar.f34554i, 0, 8);
            kl80Var.m56805e(c6jVar.f34554i, this.f238221V.f238211L.f34554i, 0, 4);
            kl80Var.m56805e(c6jVar.f34554i, this.f238221V.f238209J.f34554i, 0, 0);
            return;
        }
        if (i13 == 1) {
            kl80Var.m56805e(c6jVar.f34554i, c6jVar3.f34554i, 0, 8);
            kl80Var.m56805e(c6jVar.f34554i, this.f238221V.f238209J.f34554i, 0, 4);
            kl80Var.m56805e(c6jVar.f34554i, this.f238221V.f238211L.f34554i, 0, 0);
        } else if (i13 == 2) {
            kl80Var.m56805e(c6jVar4.f34554i, c6jVar2.f34554i, 0, 8);
            kl80Var.m56805e(c6jVar2.f34554i, this.f238221V.f238212M.f34554i, 0, 4);
            kl80Var.m56805e(c6jVar2.f34554i, this.f238221V.f238210K.f34554i, 0, 0);
        } else if (i13 == 3) {
            kl80Var.m56805e(c6jVar2.f34554i, c6jVar4.f34554i, 0, 8);
            kl80Var.m56805e(c6jVar2.f34554i, this.f238221V.f238210K.f34554i, 0, 4);
            kl80Var.m56805e(c6jVar2.f34554i, this.f238221V.f238212M.f34554i, 0, 0);
        }
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: d */
    public final boolean mo51865d() {
        return true;
    }

    @Override // p204p.jq20, p204p.v7j
    /* JADX INFO: renamed from: h */
    public final void mo44861h(v7j v7jVar, HashMap map) {
        super.mo44861h(v7jVar, map);
        ix8 ix8Var = (ix8) v7jVar;
        this.f106616w0 = ix8Var.f106616w0;
        this.f106617x0 = ix8Var.f106617x0;
        this.f106618y0 = ix8Var.f106618y0;
    }

    @Override // p204p.v7j
    public final String toString() {
        String strM36616p = dq60.m36616p(this.f238247k0, " {", new StringBuilder("[Barrier] "));
        for (int i = 0; i < this.f114775v0; i++) {
            v7j v7jVar = this.f114774u0[i];
            if (i > 0) {
                strM36616p = s571.m77250i(strM36616p, ", ");
            }
            StringBuilder sbM36620t = dq60.m36620t(strM36616p);
            sbM36620t.append(v7jVar.f238247k0);
            strM36616p = sbM36620t.toString();
        }
        return s571.m77250i(strM36616p, "}");
    }
}
