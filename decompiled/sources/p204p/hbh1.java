package p204p;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class hbh1 extends y9h1 implements RandomAccess, nbh1 {

    /* JADX INFO: renamed from: d */
    public static final int[] f89540d;

    /* JADX INFO: renamed from: e */
    public static final hbh1 f89541e;

    /* JADX INFO: renamed from: b */
    public int[] f89542b;

    /* JADX INFO: renamed from: c */
    public int f89543c;

    static {
        int[] iArr = new int[0];
        f89540d = iArr;
        f89541e = new hbh1(iArr, 0, false);
    }

    public hbh1(int[] iArr, int i, boolean z) {
        super(z);
        this.f89542b = iArr;
        this.f89543c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m93154a();
        if (i < 0 || i > (i2 = this.f89543c)) {
            throw new IndexOutOfBoundsException(kxf1.m57605H((byte) 13, this.f89543c, i, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.f89542b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f89542b, 0, iArr2, 0, i);
            System.arraycopy(this.f89542b, i, iArr2, i3, this.f89543c - i);
            this.f89542b = iArr2;
        }
        this.f89542b[i] = iIntValue;
        this.f89543c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.y9h1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m93154a();
        Charset charset = rbh1.f197602a;
        collection.getClass();
        if (!(collection instanceof hbh1)) {
            return super.addAll(collection);
        }
        hbh1 hbh1Var = (hbh1) collection;
        int i = hbh1Var.f89543c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f89543c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f89542b;
        if (i3 > iArr.length) {
            this.f89542b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(hbh1Var.f89542b, 0, this.f89542b, this.f89543c, hbh1Var.f89543c);
        this.f89543c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p204p.qbh1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hbh1 zzf(int i) {
        if (i >= this.f89543c) {
            return new hbh1(i == 0 ? f89540d : Arrays.copyOf(this.f89542b, i), this.f89543c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final int m47052d(int i) {
        m47053e(i);
        return this.f89542b[i];
    }

    /* JADX INFO: renamed from: e */
    public final void m47053e(int i) {
        if (i < 0 || i >= this.f89543c) {
            throw new IndexOutOfBoundsException(kxf1.m57605H((byte) 13, this.f89543c, i, "Index:", ", Size:"));
        }
    }

    @Override // p204p.y9h1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbh1)) {
            return super.equals(obj);
        }
        hbh1 hbh1Var = (hbh1) obj;
        if (this.f89543c != hbh1Var.f89543c) {
            return false;
        }
        int[] iArr = hbh1Var.f89542b;
        for (int i = 0; i < this.f89543c; i++) {
            if (this.f89542b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m47053e(i);
        return Integer.valueOf(this.f89542b[i]);
    }

    @Override // p204p.y9h1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f89543c; i2++) {
            i = (i * 31) + this.f89542b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f89543c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f89542b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.y9h1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m93154a();
        m47053e(i);
        int[] iArr = this.f89542b;
        int i2 = iArr[i];
        int i3 = this.f89543c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f89543c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m93154a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f89542b;
        System.arraycopy(iArr, i2, iArr, i, this.f89543c - i2);
        this.f89543c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m93154a();
        m47053e(i);
        int[] iArr = this.f89542b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f89543c;
    }

    public final void zzh(int i) {
        m93154a();
        int i2 = this.f89543c;
        int length = this.f89542b.length;
        if (i2 == length) {
            int[] iArr = new int[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f89542b, 0, iArr, 0, this.f89543c);
            this.f89542b = iArr;
        }
        int[] iArr2 = this.f89542b;
        int i3 = this.f89543c;
        this.f89543c = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
