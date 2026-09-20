package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gqn0 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final oj91[] f83498a;

    /* JADX INFO: renamed from: b */
    public int f83499b;

    /* JADX INFO: renamed from: c */
    public boolean f83500c = true;

    public gqn0(mj91 mj91Var, oj91[] oj91VarArr) {
        this.f83498a = oj91VarArr;
        oj91VarArr[0].m67106c(Integer.bitCount(mj91Var.f144208a) * 2, 0, mj91Var.f144211d);
        this.f83499b = 0;
        m45439a();
    }

    /* JADX INFO: renamed from: a */
    public final void m45439a() {
        int i = this.f83499b;
        oj91[] oj91VarArr = this.f83498a;
        oj91 oj91Var = oj91VarArr[i];
        if (oj91Var.f166020c < oj91Var.f166019b) {
            return;
        }
        while (-1 < i) {
            int iM45440b = m45440b(i);
            if (iM45440b == -1) {
                oj91 oj91Var2 = oj91VarArr[i];
                int i2 = oj91Var2.f166020c;
                Object[] objArr = oj91Var2.f166018a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    oj91Var2.f166020c = i2 + 1;
                    iM45440b = m45440b(i);
                }
            }
            if (iM45440b != -1) {
                this.f83499b = iM45440b;
                return;
            }
            if (i > 0) {
                oj91 oj91Var3 = oj91VarArr[i - 1];
                int i3 = oj91Var3.f166020c;
                int length2 = oj91Var3.f166018a.length;
                oj91Var3.f166020c = i3 + 1;
            }
            oj91VarArr[i].m67106c(0, 0, mj91.f144207e.f144211d);
            i--;
        }
        this.f83500c = false;
    }

    /* JADX INFO: renamed from: b */
    public final int m45440b(int i) {
        oj91[] oj91VarArr = this.f83498a;
        oj91 oj91Var = oj91VarArr[i];
        int i2 = oj91Var.f166020c;
        if (i2 < oj91Var.f166019b) {
            return i;
        }
        Object[] objArr = oj91Var.f166018a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        mj91 mj91Var = (mj91) objArr[i2];
        if (i == 6) {
            oj91 oj91Var2 = oj91VarArr[i + 1];
            Object[] objArr2 = mj91Var.f144211d;
            oj91Var2.m67106c(objArr2.length, 0, objArr2);
        } else {
            oj91VarArr[i + 1].m67106c(Integer.bitCount(mj91Var.f144208a) * 2, 0, mj91Var.f144211d);
        }
        return m45440b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83500c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f83500c) {
            throw new NoSuchElementException();
        }
        Object next = this.f83498a[this.f83499b].next();
        m45439a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
