package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fqn0 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final nj91[] f72238a;

    /* JADX INFO: renamed from: b */
    public int f72239b;

    /* JADX INFO: renamed from: c */
    public boolean f72240c = true;

    public fqn0(lj91 lj91Var, nj91[] nj91VarArr) {
        this.f72238a = nj91VarArr;
        nj91VarArr[0].m64602a(Integer.bitCount(lj91Var.f134016a) * 2, 0, lj91Var.f134019d);
        this.f72239b = 0;
        m42435a();
    }

    /* JADX INFO: renamed from: a */
    public final void m42435a() {
        int i = this.f72239b;
        nj91[] nj91VarArr = this.f72238a;
        nj91 nj91Var = nj91VarArr[i];
        if (nj91Var.f154534c < nj91Var.f154533b) {
            return;
        }
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                int iM42436b = m42436b(i);
                if (iM42436b == -1) {
                    nj91 nj91Var2 = nj91VarArr[i];
                    int i3 = nj91Var2.f154534c;
                    Object[] objArr = nj91Var2.f154532a;
                    if (i3 < objArr.length) {
                        int length = objArr.length;
                        nj91Var2.f154534c = i3 + 1;
                        iM42436b = m42436b(i);
                    }
                }
                if (iM42436b != -1) {
                    this.f72239b = iM42436b;
                    return;
                }
                if (i > 0) {
                    nj91 nj91Var3 = nj91VarArr[i - 1];
                    int i4 = nj91Var3.f154534c;
                    int length2 = nj91Var3.f154532a.length;
                    nj91Var3.f154534c = i4 + 1;
                }
                nj91VarArr[i].m64602a(0, 0, lj91.f134015e.f134019d);
                if (i2 < 0) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        this.f72240c = false;
    }

    /* JADX INFO: renamed from: b */
    public final int m42436b(int i) {
        nj91[] nj91VarArr = this.f72238a;
        nj91 nj91Var = nj91VarArr[i];
        int i2 = nj91Var.f154534c;
        if (i2 < nj91Var.f154533b) {
            return i;
        }
        Object[] objArr = nj91Var.f154532a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        }
        lj91 lj91Var = (lj91) obj;
        if (i == 6) {
            nj91 nj91Var2 = nj91VarArr[i + 1];
            Object[] objArr2 = lj91Var.f134019d;
            nj91Var2.m64602a(objArr2.length, 0, objArr2);
        } else {
            nj91VarArr[i + 1].m64602a(Integer.bitCount(lj91Var.f134016a) * 2, 0, lj91Var.f134019d);
        }
        return m42436b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72240c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f72240c) {
            throw new NoSuchElementException();
        }
        Object next = this.f72238a[this.f72239b].next();
        m42435a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
