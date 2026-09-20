package p204p;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class g3t0 extends AbstractC1659a9 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final g3t0 f76281d = new g3t0(new Object[0], 0, false);

    /* JADX INFO: renamed from: b */
    public Object[] f76282b;

    /* JADX INFO: renamed from: c */
    public int f76283c;

    public g3t0(Object[] objArr, int i, boolean z) {
        this.f13439a = z;
        this.f76282b = objArr;
        this.f76283c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m25061a();
        int i = this.f76283c;
        Object[] objArr = this.f76282b;
        if (i == objArr.length) {
            this.f76282b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f76282b;
        int i2 = this.f76283c;
        this.f76283c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m43513b(int i) {
        if (i < 0 || i >= this.f76283c) {
            StringBuilder sbM56838j = klh.m56838j(i, "Index:", ", Size:");
            sbM56838j.append(this.f76283c);
            throw new IndexOutOfBoundsException(sbM56838j.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public final g3t0 m43514d(int i) {
        if (i >= this.f76283c) {
            return new g3t0(Arrays.copyOf(this.f76282b, i), this.f76283c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m43513b(i);
        return this.f76282b[i];
    }

    @Override // p204p.AbstractC1659a9, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m25061a();
        m43513b(i);
        Object[] objArr = this.f76282b;
        Object obj = objArr[i];
        int i2 = this.f76283c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f76283c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m25061a();
        m43513b(i);
        Object[] objArr = this.f76282b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f76283c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m25061a();
        if (i >= 0 && i <= (i2 = this.f76283c)) {
            Object[] objArr = this.f76282b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[m5p0.m60873e(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f76282b, i, objArr2, i + 1, this.f76283c - i);
                this.f76282b = objArr2;
            }
            this.f76282b[i] = obj;
            this.f76283c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "Index:", ", Size:");
        sbM56838j.append(this.f76283c);
        throw new IndexOutOfBoundsException(sbM56838j.toString());
    }
}
