package p204p;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class o9g1 extends xxf1 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f163033d;

    /* JADX INFO: renamed from: e */
    public static final o9g1 f163034e;

    /* JADX INFO: renamed from: b */
    public Object[] f163035b;

    /* JADX INFO: renamed from: c */
    public int f163036c;

    static {
        Object[] objArr = new Object[0];
        f163033d = objArr;
        f163034e = new o9g1(objArr, 0, false);
    }

    public o9g1(Object[] objArr, int i, boolean z) {
        super(z);
        this.f163035b = objArr;
        this.f163036c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m66463a(int i) {
        if (i < 0 || i >= this.f163036c) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f163036c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.f163036c)) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f163036c, ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.f163035b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f163035b, 0, objArr2, 0, i);
            System.arraycopy(this.f163035b, i, objArr2, i3, this.f163036c - i);
            this.f163035b = objArr2;
        }
        this.f163035b[i] = obj;
        this.f163036c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m66463a(i);
        return this.f163035b[i];
    }

    @Override // p204p.xxf1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        m66463a(i);
        Object[] objArr = this.f163035b;
        Object obj = objArr[i];
        int i2 = this.f163036c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f163036c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        m66463a(i);
        Object[] objArr = this.f163035b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f163036c;
    }

    @Override // p204p.l4g1
    public final /* bridge */ /* synthetic */ l4g1 zzd(int i) {
        if (i >= this.f163036c) {
            return new o9g1(i == 0 ? f163033d : Arrays.copyOf(this.f163035b, i), this.f163036c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.f163036c;
        int length = this.f163035b.length;
        if (i == length) {
            this.f163035b = Arrays.copyOf(this.f163035b, s571.m77242a(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f163035b;
        int i2 = this.f163036c;
        this.f163036c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
