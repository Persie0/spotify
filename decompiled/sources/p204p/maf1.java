package p204p;

import androidx.car.app.model.Alert;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class maf1 extends l9f1 implements RandomAccess, xaf1, pbf1 {

    /* JADX INFO: renamed from: d */
    public static final int[] f141584d;

    /* JADX INFO: renamed from: e */
    public static final maf1 f141585e;

    /* JADX INFO: renamed from: b */
    public int[] f141586b;

    /* JADX INFO: renamed from: c */
    public int f141587c;

    static {
        int[] iArr = new int[0];
        f141584d = iArr;
        f141585e = new maf1(iArr, 0, false);
    }

    public maf1(int[] iArr, int i, boolean z) {
        super(z);
        this.f141586b = iArr;
        this.f141587c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m58512a();
        if (i < 0 || i > (i2 = this.f141587c)) {
            throw new IndexOutOfBoundsException(n9f1.m63922a((byte) 13, this.f141587c, i, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.f141586b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f141586b, 0, iArr2, 0, i);
            System.arraycopy(this.f141586b, i, iArr2, i3, this.f141587c - i);
            this.f141586b = iArr2;
        }
        this.f141586b[i] = iIntValue;
        this.f141587c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.l9f1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m58512a();
        collection.getClass();
        if (!(collection instanceof maf1)) {
            return super.addAll(collection);
        }
        maf1 maf1Var = (maf1) collection;
        int i = maf1Var.f141587c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f141587c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f141586b;
        if (i3 > iArr.length) {
            this.f141586b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(maf1Var.f141586b, 0, this.f141586b, this.f141587c, maf1Var.f141587c);
        this.f141587c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p204p.zaf1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final maf1 zzg(int i) {
        if (i >= this.f141587c) {
            return new maf1(i == 0 ? f141584d : Arrays.copyOf(this.f141586b, i), this.f141587c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final int m61289d(int i) {
        m61290e(i);
        return this.f141586b[i];
    }

    /* JADX INFO: renamed from: e */
    public final void m61290e(int i) {
        if (i < 0 || i >= this.f141587c) {
            throw new IndexOutOfBoundsException(n9f1.m63922a((byte) 13, this.f141587c, i, "Index:", ", Size:"));
        }
    }

    @Override // p204p.l9f1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maf1)) {
            return super.equals(obj);
        }
        maf1 maf1Var = (maf1) obj;
        if (this.f141587c != maf1Var.f141587c) {
            return false;
        }
        int[] iArr = maf1Var.f141586b;
        for (int i = 0; i < this.f141587c; i++) {
            if (this.f141586b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m61290e(i);
        return Integer.valueOf(this.f141586b[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f141587c; i2++) {
            i = (i * 31) + this.f141586b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f141587c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f141586b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.l9f1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m58512a();
        m61290e(i);
        int[] iArr = this.f141586b;
        int i2 = iArr[i];
        int i3 = this.f141587c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f141587c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m58512a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f141586b;
        System.arraycopy(iArr, i2, iArr, i, this.f141587c - i2);
        this.f141587c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m58512a();
        m61290e(i);
        int[] iArr = this.f141586b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f141587c;
    }

    public final void zzh(int i) {
        m58512a();
        int i2 = this.f141587c;
        int length = this.f141586b.length;
        if (i2 == length) {
            int[] iArr = new int[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f141586b, 0, iArr, 0, this.f141587c);
            this.f141586b = iArr;
        }
        int[] iArr2 = this.f141586b;
        int i3 = this.f141587c;
        this.f141587c = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
