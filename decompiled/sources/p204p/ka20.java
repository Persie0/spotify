package p204p;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ka20 extends v7j {

    /* JADX INFO: renamed from: u0 */
    public float f120760u0 = -1.0f;

    /* JADX INFO: renamed from: v0 */
    public int f120761v0 = -1;

    /* JADX INFO: renamed from: w0 */
    public int f120762w0 = -1;

    /* JADX INFO: renamed from: x0 */
    public c6j f120763x0 = this.f238210K;

    /* JADX INFO: renamed from: y0 */
    public int f120764y0 = 0;

    /* JADX INFO: renamed from: z0 */
    public boolean f120765z0;

    public ka20() {
        this.f238218S.clear();
        this.f238218S.add(this.f120763x0);
        int length = this.f238217R.length;
        for (int i = 0; i < length; i++) {
            this.f238217R[i] = this.f120763x0;
        }
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: C */
    public final boolean mo51861C() {
        return this.f120765z0;
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: D */
    public final boolean mo51862D() {
        return this.f120765z0;
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: V */
    public final void mo55863V(kl80 kl80Var, boolean z) {
        if (this.f238221V == null) {
            return;
        }
        c6j c6jVar = this.f120763x0;
        kl80Var.getClass();
        int iM56800n = kl80.m56800n(c6jVar);
        if (this.f120764y0 == 1) {
            this.f238227a0 = iM56800n;
            this.f238229b0 = 0;
            m84867O(this.f238221V.m84882m());
            m84872T(0);
            return;
        }
        this.f238227a0 = 0;
        this.f238229b0 = iM56800n;
        m84872T(this.f238221V.m84886s());
        m84867O(0);
    }

    /* JADX INFO: renamed from: W */
    public final void m55864W(int i) {
        this.f120763x0.m31578l(i);
        this.f120765z0 = true;
    }

    /* JADX INFO: renamed from: X */
    public final void m55865X(int i) {
        if (this.f120764y0 == i) {
            return;
        }
        this.f120764y0 = i;
        ArrayList arrayList = this.f238218S;
        arrayList.clear();
        if (this.f120764y0 == 1) {
            this.f120763x0 = this.f238209J;
        } else {
            this.f120763x0 = this.f238210K;
        }
        arrayList.add(this.f120763x0);
        c6j[] c6jVarArr = this.f238217R;
        int length = c6jVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c6jVarArr[i2] = this.f120763x0;
        }
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: c */
    public final void mo35148c(kl80 kl80Var, boolean z) {
        w7j w7jVar = (w7j) this.f238221V;
        if (w7jVar == null) {
            return;
        }
        Object objMo55866k = w7jVar.mo55866k(2);
        Object objMo55866k2 = w7jVar.mo55866k(4);
        v7j v7jVar = this.f238221V;
        u7j u7jVar = u7j.f227711b;
        boolean z2 = v7jVar != null && v7jVar.f238220U[0] == u7jVar;
        if (this.f120764y0 == 0) {
            objMo55866k = w7jVar.mo55866k(3);
            objMo55866k2 = w7jVar.mo55866k(5);
            v7j v7jVar2 = this.f238221V;
            z2 = v7jVar2 != null && v7jVar2.f238220U[1] == u7jVar;
        }
        if (this.f120765z0) {
            c6j c6jVar = this.f120763x0;
            if (c6jVar.f34548c) {
                rk31 rk31VarM56811k = kl80Var.m56811k(c6jVar);
                kl80Var.m56804d(rk31VarM56811k, this.f120763x0.m31570d());
                if (this.f120761v0 != -1) {
                    if (z2) {
                        kl80Var.m56806f(kl80Var.m56811k(objMo55866k2), rk31VarM56811k, 0, 5);
                    }
                } else if (this.f120762w0 != -1 && z2) {
                    rk31 rk31VarM56811k2 = kl80Var.m56811k(objMo55866k2);
                    kl80Var.m56806f(rk31VarM56811k, kl80Var.m56811k(objMo55866k), 0, 5);
                    kl80Var.m56806f(rk31VarM56811k2, rk31VarM56811k, 0, 5);
                }
                this.f120765z0 = false;
                return;
            }
        }
        if (this.f120761v0 != -1) {
            rk31 rk31VarM56811k3 = kl80Var.m56811k(this.f120763x0);
            kl80Var.m56805e(rk31VarM56811k3, kl80Var.m56811k(objMo55866k), this.f120761v0, 8);
            if (z2) {
                kl80Var.m56806f(kl80Var.m56811k(objMo55866k2), rk31VarM56811k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f120762w0 != -1) {
            rk31 rk31VarM56811k4 = kl80Var.m56811k(this.f120763x0);
            rk31 rk31VarM56811k5 = kl80Var.m56811k(objMo55866k2);
            kl80Var.m56805e(rk31VarM56811k4, rk31VarM56811k5, -this.f120762w0, 8);
            if (z2) {
                kl80Var.m56806f(rk31VarM56811k4, kl80Var.m56811k(objMo55866k), 0, 5);
                kl80Var.m56806f(rk31VarM56811k5, rk31VarM56811k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f120760u0 != -1.0f) {
            rk31 rk31VarM56811k6 = kl80Var.m56811k(this.f120763x0);
            rk31 rk31VarM56811k7 = kl80Var.m56811k(objMo55866k2);
            float f = this.f120760u0;
            yj5 yj5VarM56812l = kl80Var.m56812l();
            yj5VarM56812l.f273290d.m53522g(rk31VarM56811k6, -1.0f);
            yj5VarM56812l.f273290d.m53522g(rk31VarM56811k7, f);
            kl80Var.m56803c(yj5VarM56812l);
        }
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: d */
    public final boolean mo51865d() {
        return true;
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: h */
    public final void mo44861h(v7j v7jVar, HashMap map) {
        super.mo44861h(v7jVar, map);
        ka20 ka20Var = (ka20) v7jVar;
        this.f120760u0 = ka20Var.f120760u0;
        this.f120761v0 = ka20Var.f120761v0;
        this.f120762w0 = ka20Var.f120762w0;
        m55865X(ka20Var.f120764y0);
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: k */
    public final c6j mo55866k(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C != 1) {
            if (iM38547C != 2) {
                if (iM38547C != 3) {
                    if (iM38547C != 4) {
                        return null;
                    }
                }
            }
            if (this.f120764y0 == 0) {
                return this.f120763x0;
            }
            return null;
        }
        if (this.f120764y0 == 1) {
            return this.f120763x0;
        }
        return null;
    }
}
