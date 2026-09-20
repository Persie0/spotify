package p204p;

import androidx.car.app.model.Alert;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class dbf1 extends l9f1 implements RandomAccess, yaf1, pbf1 {

    /* JADX INFO: renamed from: d */
    public static final long[] f47310d;

    /* JADX INFO: renamed from: e */
    public static final dbf1 f47311e;

    /* JADX INFO: renamed from: b */
    public long[] f47312b;

    /* JADX INFO: renamed from: c */
    public int f47313c;

    static {
        long[] jArr = new long[0];
        f47310d = jArr;
        f47311e = new dbf1(jArr, 0, false);
    }

    public dbf1(long[] jArr, int i, boolean z) {
        super(z);
        this.f47312b = jArr;
        this.f47313c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m58512a();
        if (i < 0 || i > (i2 = this.f47313c)) {
            throw new IndexOutOfBoundsException(n9f1.m63922a((byte) 13, this.f47313c, i, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        long[] jArr = this.f47312b;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f47312b, 0, jArr2, 0, i);
            System.arraycopy(this.f47312b, i, jArr2, i3, this.f47313c - i);
            this.f47312b = jArr2;
        }
        this.f47312b[i] = jLongValue;
        this.f47313c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.l9f1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m58512a();
        collection.getClass();
        if (!(collection instanceof dbf1)) {
            return super.addAll(collection);
        }
        dbf1 dbf1Var = (dbf1) collection;
        int i = dbf1Var.f47313c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f47313c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f47312b;
        if (i3 > jArr.length) {
            this.f47312b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(dbf1Var.f47312b, 0, this.f47312b, this.f47313c, dbf1Var.f47313c);
        this.f47313c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final long m35557b(int i) {
        m35559e(i);
        return this.f47312b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m35558d(long j) {
        m58512a();
        int i = this.f47313c;
        int length = this.f47312b.length;
        if (i == length) {
            long[] jArr = new long[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f47312b, 0, jArr, 0, this.f47313c);
            this.f47312b = jArr;
        }
        long[] jArr2 = this.f47312b;
        int i2 = this.f47313c;
        this.f47313c = i2 + 1;
        jArr2[i2] = j;
    }

    /* JADX INFO: renamed from: e */
    public final void m35559e(int i) {
        if (i < 0 || i >= this.f47313c) {
            throw new IndexOutOfBoundsException(n9f1.m63922a((byte) 13, this.f47313c, i, "Index:", ", Size:"));
        }
    }

    @Override // p204p.l9f1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbf1)) {
            return super.equals(obj);
        }
        dbf1 dbf1Var = (dbf1) obj;
        if (this.f47313c != dbf1Var.f47313c) {
            return false;
        }
        long[] jArr = dbf1Var.f47312b;
        for (int i = 0; i < this.f47313c; i++) {
            if (this.f47312b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m35559e(i);
        return Long.valueOf(this.f47312b[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f47313c; i2++) {
            long j = this.f47312b[i2];
            byte[] bArr = abf1.f14107a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f47313c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f47312b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.l9f1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m58512a();
        m35559e(i);
        long[] jArr = this.f47312b;
        long j = jArr[i];
        int i2 = this.f47313c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f47313c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m58512a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f47312b;
        System.arraycopy(jArr, i2, jArr, i, this.f47313c - i2);
        this.f47313c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m58512a();
        m35559e(i);
        long[] jArr = this.f47312b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47313c;
    }

    @Override // p204p.zaf1
    public final zaf1 zzg(int i) {
        if (i >= this.f47313c) {
            return new dbf1(i == 0 ? f47310d : Arrays.copyOf(this.f47312b, i), this.f47313c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m35558d(((Long) obj).longValue());
        return true;
    }
}
