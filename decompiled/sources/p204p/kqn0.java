package p204p;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class kqn0 extends gqn0 {

    /* JADX INFO: renamed from: d */
    public final iqn0 f125352d;

    /* JADX INFO: renamed from: e */
    public Object f125353e;

    /* JADX INFO: renamed from: f */
    public boolean f125354f;

    /* JADX INFO: renamed from: g */
    public int f125355g;

    public kqn0(iqn0 iqn0Var, oj91[] oj91VarArr) {
        super(iqn0Var.f104807c, oj91VarArr);
        this.f125352d = iqn0Var;
        this.f125355g = iqn0Var.f104809e;
    }

    /* JADX INFO: renamed from: c */
    public final void m57116c(int i, mj91 mj91Var, Object obj, int i2) {
        int i3 = i2 * 5;
        oj91[] oj91VarArr = this.f83498a;
        if (i3 <= 30) {
            int iM97058u = 1 << zuj0.m97058u(i, i3);
            if (mj91Var.m61947h(iM97058u)) {
                oj91VarArr[i2].m67106c(Integer.bitCount(mj91Var.f144208a) * 2, mj91Var.m61945f(iM97058u), mj91Var.f144211d);
                this.f83499b = i2;
                return;
            }
            int iM61958t = mj91Var.m61958t(iM97058u);
            mj91 mj91VarM61957s = mj91Var.m61957s(iM61958t);
            oj91VarArr[i2].m67106c(Integer.bitCount(mj91Var.f144208a) * 2, iM61958t, mj91Var.f144211d);
            m57116c(i, mj91VarM61957s, obj, i2 + 1);
            return;
        }
        oj91 oj91Var = oj91VarArr[i2];
        Object[] objArr = mj91Var.f144211d;
        oj91Var.m67106c(objArr.length, 0, objArr);
        while (true) {
            oj91 oj91Var2 = oj91VarArr[i2];
            if (wj50.m88271j(oj91Var2.f166018a[oj91Var2.f166020c], obj)) {
                this.f83499b = i2;
                return;
            } else {
                oj91VarArr[i2].f166020c += 2;
            }
        }
    }

    @Override // p204p.gqn0, java.util.Iterator
    public final Object next() {
        if (this.f125352d.f104809e != this.f125355g) {
            throw new ConcurrentModificationException();
        }
        if (!this.f83500c) {
            throw new NoSuchElementException();
        }
        oj91 oj91Var = this.f83498a[this.f83499b];
        this.f125353e = oj91Var.f166018a[oj91Var.f166020c];
        this.f125354f = true;
        return super.next();
    }

    @Override // p204p.gqn0, java.util.Iterator
    public final void remove() {
        if (!this.f125354f) {
            throw new IllegalStateException();
        }
        boolean z = this.f83500c;
        iqn0 iqn0Var = this.f125352d;
        if (!z) {
            zn91.m96561l(iqn0Var).remove(this.f125353e);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            oj91 oj91Var = this.f83498a[this.f83499b];
            Object obj = oj91Var.f166018a[oj91Var.f166020c];
            zn91.m96561l(iqn0Var).remove(this.f125353e);
            m57116c(obj != null ? obj.hashCode() : 0, iqn0Var.f104807c, obj, 0);
        }
        this.f125353e = null;
        this.f125354f = false;
        this.f125355g = iqn0Var.f104809e;
    }
}
