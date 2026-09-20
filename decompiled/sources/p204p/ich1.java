package p204p;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class ich1 extends y9h1 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f100819d;

    /* JADX INFO: renamed from: e */
    public static final ich1 f100820e;

    /* JADX INFO: renamed from: b */
    public Object[] f100821b;

    /* JADX INFO: renamed from: c */
    public int f100822c;

    static {
        Object[] objArr = new Object[0];
        f100819d = objArr;
        f100820e = new ich1(objArr, 0, false);
    }

    public ich1(Object[] objArr, int i, boolean z) {
        super(z);
        this.f100821b = objArr;
        this.f100822c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m93154a();
        if (i < 0 || i > (i2 = this.f100822c)) {
            throw new IndexOutOfBoundsException(kxf1.m57605H((byte) 13, this.f100822c, i, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.f100821b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f100821b, 0, objArr2, 0, i);
            System.arraycopy(this.f100821b, i, objArr2, i3, this.f100822c - i);
            this.f100821b = objArr2;
        }
        this.f100821b[i] = obj;
        this.f100822c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final void m50253b(int i) {
        if (i < 0 || i >= this.f100822c) {
            throw new IndexOutOfBoundsException(kxf1.m57605H((byte) 13, this.f100822c, i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m50253b(i);
        return this.f100821b[i];
    }

    @Override // p204p.y9h1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m93154a();
        m50253b(i);
        Object[] objArr = this.f100821b;
        Object obj = objArr[i];
        int i2 = this.f100822c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f100822c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m93154a();
        m50253b(i);
        Object[] objArr = this.f100821b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f100822c;
    }

    @Override // p204p.qbh1
    public final /* bridge */ /* synthetic */ qbh1 zzf(int i) {
        if (i >= this.f100822c) {
            return new ich1(i == 0 ? f100819d : Arrays.copyOf(this.f100821b, i), this.f100822c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m93154a();
        int i = this.f100822c;
        int length = this.f100821b.length;
        if (i == length) {
            this.f100821b = Arrays.copyOf(this.f100821b, s571.m77242a(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f100821b;
        int i2 = this.f100822c;
        this.f100822c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
