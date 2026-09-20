package p204p;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ttf1 extends kbf1 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final ttf1 f223589d;

    /* JADX INFO: renamed from: b */
    public Object[] f223590b;

    /* JADX INFO: renamed from: c */
    public int f223591c;

    static {
        ttf1 ttf1Var = new ttf1(0, new Object[0]);
        f223589d = ttf1Var;
        ttf1Var.f121199a = false;
    }

    public ttf1(int i, Object[] objArr) {
        this.f223590b = objArr;
        this.f223591c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m55944a();
        if (i < 0 || i > (i2 = this.f223591c)) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f223591c, ", Size:"));
        }
        Object[] objArr = this.f223590b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[m5p0.m60873e(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f223590b, i, objArr2, i + 1, this.f223591c - i);
            this.f223590b = objArr2;
        }
        this.f223590b[i] = obj;
        this.f223591c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final void m81505b(int i) {
        if (i < 0 || i >= this.f223591c) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f223591c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m81505b(i);
        return this.f223590b[i];
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m55944a();
        m81505b(i);
        Object[] objArr = this.f223590b;
        Object obj = objArr[i];
        int i2 = this.f223591c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f223591c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m55944a();
        m81505b(i);
        Object[] objArr = this.f223590b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f223591c;
    }

    @Override // p204p.gnf1
    public final /* bridge */ /* synthetic */ gnf1 zzd(int i) {
        if (i < this.f223591c) {
            throw new IllegalArgumentException();
        }
        return new ttf1(this.f223591c, Arrays.copyOf(this.f223590b, i));
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m55944a();
        int i = this.f223591c;
        Object[] objArr = this.f223590b;
        if (i == objArr.length) {
            this.f223590b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f223590b;
        int i2 = this.f223591c;
        this.f223591c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
