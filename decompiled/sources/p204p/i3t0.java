package p204p;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class i3t0 extends AbstractC1733c9 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f98269d;

    /* JADX INFO: renamed from: e */
    public static final i3t0 f98270e;

    /* JADX INFO: renamed from: b */
    public Object[] f98271b;

    /* JADX INFO: renamed from: c */
    public int f98272c;

    static {
        Object[] objArr = new Object[0];
        f98269d = objArr;
        f98270e = new i3t0(objArr, 0, false);
    }

    public i3t0(Object[] objArr, int i, boolean z) {
        super(z);
        this.f98271b = objArr;
        this.f98272c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m31802a();
        int i = this.f98272c;
        Object[] objArr = this.f98271b;
        if (i == objArr.length) {
            this.f98271b = Arrays.copyOf(this.f98271b, s571.m77242a(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f98271b;
        int i2 = this.f98272c;
        this.f98272c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m49630b(int i) {
        if (i < 0 || i >= this.f98272c) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f98272c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m49630b(i);
        return this.f98271b[i];
    }

    @Override // p204p.ae50
    /* JADX INFO: renamed from: h */
    public final ae50 mo25687h(int i) {
        if (i >= this.f98272c) {
            return new i3t0(i == 0 ? f98269d : Arrays.copyOf(this.f98271b, i), this.f98272c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m31802a();
        m49630b(i);
        Object[] objArr = this.f98271b;
        Object obj = objArr[i];
        int i2 = this.f98272c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f98272c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m31802a();
        m49630b(i);
        Object[] objArr = this.f98271b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f98272c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m31802a();
        if (i >= 0 && i <= (i2 = this.f98272c)) {
            Object[] objArr = this.f98271b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[s571.m77242a(objArr.length, 3, 2, 1, 10)];
                System.arraycopy(this.f98271b, 0, objArr2, 0, i);
                System.arraycopy(this.f98271b, i, objArr2, i + 1, this.f98272c - i);
                this.f98271b = objArr2;
            }
            this.f98271b[i] = obj;
            this.f98272c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f98272c, ", Size:"));
    }
}
