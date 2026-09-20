package p204p;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public class jqn0 extends fqn0 {

    /* JADX INFO: renamed from: d */
    public final hqn0 f114929d;

    /* JADX INFO: renamed from: e */
    public Object f114930e;

    /* JADX INFO: renamed from: f */
    public boolean f114931f;

    /* JADX INFO: renamed from: g */
    public int f114932g;

    public jqn0(hqn0 hqn0Var, nj91[] nj91VarArr) {
        super(hqn0Var.f94224c, nj91VarArr);
        this.f114929d = hqn0Var;
        this.f114932g = hqn0Var.f94226e;
    }

    /* JADX INFO: renamed from: c */
    public final void m54110c(int i, lj91 lj91Var, Object obj, int i2) {
        int i3 = i2 * 5;
        nj91[] nj91VarArr = this.f72238a;
        if (i3 <= 30) {
            int iM94503r = 1 << ysj0.m94503r(i, i3);
            if (lj91Var.m59124i(iM94503r)) {
                nj91VarArr[i2].m64602a(Integer.bitCount(lj91Var.f134016a) * 2, lj91Var.m59121f(iM94503r), lj91Var.f134019d);
                this.f72239b = i2;
                return;
            }
            int iM59135u = lj91Var.m59135u(iM94503r);
            lj91 lj91VarM59134t = lj91Var.m59134t(iM59135u);
            nj91VarArr[i2].m64602a(Integer.bitCount(lj91Var.f134016a) * 2, iM59135u, lj91Var.f134019d);
            m54110c(i, lj91VarM59134t, obj, i2 + 1);
            return;
        }
        nj91 nj91Var = nj91VarArr[i2];
        Object[] objArr = lj91Var.f134019d;
        nj91Var.m64602a(objArr.length, 0, objArr);
        while (true) {
            nj91 nj91Var2 = nj91VarArr[i2];
            if (wj50.m88271j(nj91Var2.f154532a[nj91Var2.f154534c], obj)) {
                this.f72239b = i2;
                return;
            } else {
                nj91VarArr[i2].f154534c += 2;
            }
        }
    }

    @Override // p204p.fqn0, java.util.Iterator
    public final Object next() {
        if (this.f114929d.f94226e != this.f114932g) {
            throw new ConcurrentModificationException();
        }
        if (!this.f72240c) {
            throw new NoSuchElementException();
        }
        nj91 nj91Var = this.f72238a[this.f72239b];
        this.f114930e = nj91Var.f154532a[nj91Var.f154534c];
        this.f114931f = true;
        return super.next();
    }

    @Override // p204p.fqn0, java.util.Iterator
    public final void remove() {
        if (!this.f114931f) {
            throw new IllegalStateException();
        }
        boolean z = this.f72240c;
        hqn0 hqn0Var = this.f114929d;
        if (!z) {
            hqn0Var.remove(this.f114930e);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            nj91 nj91Var = this.f72238a[this.f72239b];
            Object obj = nj91Var.f154532a[nj91Var.f154534c];
            hqn0Var.remove(this.f114930e);
            m54110c(obj == null ? 0 : obj.hashCode(), hqn0Var.f94224c, obj, 0);
        }
        this.f114930e = null;
        this.f114931f = false;
        this.f114932g = hqn0Var.f94226e;
    }
}
