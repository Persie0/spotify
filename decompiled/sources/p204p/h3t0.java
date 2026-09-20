package p204p;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class h3t0 extends AbstractC1696b9 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final h3t0 f87315d;

    /* JADX INFO: renamed from: b */
    public Object[] f87316b;

    /* JADX INFO: renamed from: c */
    public int f87317c;

    static {
        h3t0 h3t0Var = new h3t0(0, new Object[0]);
        f87315d = h3t0Var;
        h3t0Var.f24728a = false;
    }

    public h3t0(int i, Object[] objArr) {
        this.f87316b = objArr;
        this.f87317c = i;
    }

    @Override // p204p.AbstractC1696b9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m28442a();
        int i = this.f87317c;
        Object[] objArr = this.f87316b;
        if (i == objArr.length) {
            this.f87316b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f87316b;
        int i2 = this.f87317c;
        this.f87317c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m46603b(int i) {
        if (i < 0 || i >= this.f87317c) {
            StringBuilder sbM56838j = klh.m56838j(i, "Index:", ", Size:");
            sbM56838j.append(this.f87317c);
            throw new IndexOutOfBoundsException(sbM56838j.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m46603b(i);
        return this.f87316b[i];
    }

    @Override // p204p.zd50
    /* JADX INFO: renamed from: h */
    public final zd50 mo46604h(int i) {
        if (i < this.f87317c) {
            throw new IllegalArgumentException();
        }
        return new h3t0(this.f87317c, Arrays.copyOf(this.f87316b, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m28442a();
        m46603b(i);
        Object[] objArr = this.f87316b;
        Object obj = objArr[i];
        int i2 = this.f87317c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f87317c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m28442a();
        m46603b(i);
        Object[] objArr = this.f87316b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f87317c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m28442a();
        if (i >= 0 && i <= (i2 = this.f87317c)) {
            Object[] objArr = this.f87316b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[m5p0.m60873e(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f87316b, i, objArr2, i + 1, this.f87317c - i);
                this.f87316b = objArr2;
            }
            this.f87316b[i] = obj;
            this.f87317c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "Index:", ", Size:");
        sbM56838j.append(this.f87317c);
        throw new IndexOutOfBoundsException(sbM56838j.toString());
    }
}
