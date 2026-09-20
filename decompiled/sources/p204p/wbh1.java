package p204p;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class wbh1 extends y9h1 implements RandomAccess, pbh1 {

    /* JADX INFO: renamed from: d */
    public static final long[] f249759d;

    /* JADX INFO: renamed from: e */
    public static final wbh1 f249760e;

    /* JADX INFO: renamed from: b */
    public long[] f249761b;

    /* JADX INFO: renamed from: c */
    public int f249762c;

    static {
        long[] jArr = new long[0];
        f249759d = jArr;
        f249760e = new wbh1(jArr, 0, false);
    }

    public wbh1(long[] jArr, int i, boolean z) {
        super(z);
        this.f249761b = jArr;
        this.f249762c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m93154a();
        if (i < 0 || i > (i2 = this.f249762c)) {
            throw new IndexOutOfBoundsException(kxf1.m57605H((byte) 13, this.f249762c, i, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        long[] jArr = this.f249761b;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f249761b, 0, jArr2, 0, i);
            System.arraycopy(this.f249761b, i, jArr2, i3, this.f249762c - i);
            this.f249761b = jArr2;
        }
        this.f249761b[i] = jLongValue;
        this.f249762c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.y9h1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m93154a();
        Charset charset = rbh1.f197602a;
        collection.getClass();
        if (!(collection instanceof wbh1)) {
            return super.addAll(collection);
        }
        wbh1 wbh1Var = (wbh1) collection;
        int i = wbh1Var.f249762c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f249762c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f249761b;
        if (i3 > jArr.length) {
            this.f249761b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(wbh1Var.f249761b, 0, this.f249761b, this.f249762c, wbh1Var.f249762c);
        this.f249762c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final long m87667b(int i) {
        m87668d(i);
        return this.f249761b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m87668d(int i) {
        if (i < 0 || i >= this.f249762c) {
            throw new IndexOutOfBoundsException(kxf1.m57605H((byte) 13, this.f249762c, i, "Index:", ", Size:"));
        }
    }

    @Override // p204p.y9h1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbh1)) {
            return super.equals(obj);
        }
        wbh1 wbh1Var = (wbh1) obj;
        if (this.f249762c != wbh1Var.f249762c) {
            return false;
        }
        long[] jArr = wbh1Var.f249761b;
        for (int i = 0; i < this.f249762c; i++) {
            if (this.f249761b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m87668d(i);
        return Long.valueOf(this.f249761b[i]);
    }

    @Override // p204p.y9h1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f249762c; i2++) {
            long j = this.f249761b[i2];
            Charset charset = rbh1.f197602a;
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
        int i = this.f249762c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f249761b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.y9h1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m93154a();
        m87668d(i);
        long[] jArr = this.f249761b;
        long j = jArr[i];
        int i2 = this.f249762c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f249762c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m93154a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f249761b;
        System.arraycopy(jArr, i2, jArr, i, this.f249762c - i2);
        this.f249762c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m93154a();
        m87668d(i);
        long[] jArr = this.f249761b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f249762c;
    }

    @Override // p204p.qbh1
    public final qbh1 zzf(int i) {
        if (i >= this.f249762c) {
            return new wbh1(i == 0 ? f249759d : Arrays.copyOf(this.f249761b, i), this.f249762c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m93154a();
        int i = this.f249762c;
        int length = this.f249761b.length;
        if (i == length) {
            long[] jArr = new long[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f249761b, 0, jArr, 0, this.f249762c);
            this.f249761b = jArr;
        }
        long[] jArr2 = this.f249761b;
        int i2 = this.f249762c;
        this.f249762c = i2 + 1;
        jArr2[i2] = jLongValue;
        return true;
    }
}
