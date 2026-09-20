package p204p;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class dqf1 extends kbf1 implements RandomAccess, enf1, gtf1 {

    /* JADX INFO: renamed from: d */
    public static final dqf1 f51986d;

    /* JADX INFO: renamed from: b */
    public long[] f51987b;

    /* JADX INFO: renamed from: c */
    public int f51988c;

    static {
        dqf1 dqf1Var = new dqf1(new long[0], 0);
        f51986d = dqf1Var;
        dqf1Var.f121199a = false;
    }

    public dqf1(long[] jArr, int i) {
        this.f51987b = jArr;
        this.f51988c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m55944a();
        if (i < 0 || i > (i2 = this.f51988c)) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f51988c, ", Size:"));
        }
        long[] jArr = this.f51987b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[m5p0.m60873e(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f51987b, i, jArr2, i + 1, this.f51988c - i);
            this.f51987b = jArr2;
        }
        this.f51987b[i] = jLongValue;
        this.f51988c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.kbf1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m55944a();
        Charset charset = nnf1.f156416a;
        collection.getClass();
        if (!(collection instanceof dqf1)) {
            return super.addAll(collection);
        }
        dqf1 dqf1Var = (dqf1) collection;
        int i = dqf1Var.f51988c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f51988c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f51987b;
        if (i3 > jArr.length) {
            this.f51987b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(dqf1Var.f51987b, 0, this.f51987b, this.f51988c, dqf1Var.f51988c);
        this.f51988c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m36638b(long j) {
        m55944a();
        int i = this.f51988c;
        long[] jArr = this.f51987b;
        if (i == jArr.length) {
            long[] jArr2 = new long[m5p0.m60873e(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f51987b = jArr2;
        }
        long[] jArr3 = this.f51987b;
        int i2 = this.f51988c;
        this.f51988c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m36639d(int i) {
        if (i < 0 || i >= this.f51988c) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f51988c, ", Size:"));
        }
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqf1)) {
            return super.equals(obj);
        }
        dqf1 dqf1Var = (dqf1) obj;
        if (this.f51988c != dqf1Var.f51988c) {
            return false;
        }
        long[] jArr = dqf1Var.f51987b;
        for (int i = 0; i < this.f51988c; i++) {
            if (this.f51987b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m36639d(i);
        return Long.valueOf(this.f51987b[i]);
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM65206a = 1;
        for (int i = 0; i < this.f51988c; i++) {
            iM65206a = (iM65206a * 31) + nnf1.m65206a(this.f51987b[i]);
        }
        return iM65206a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f51988c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f51987b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m55944a();
        m36639d(i);
        long[] jArr = this.f51987b;
        long j = jArr[i];
        int i2 = this.f51988c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f51988c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m55944a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f51987b;
        System.arraycopy(jArr, i2, jArr, i, this.f51988c - i2);
        this.f51988c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m55944a();
        m36639d(i);
        long[] jArr = this.f51987b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51988c;
    }

    @Override // p204p.gnf1
    public final gnf1 zzd(int i) {
        if (i >= this.f51988c) {
            return new dqf1(Arrays.copyOf(this.f51987b, i), this.f51988c);
        }
        throw new IllegalArgumentException();
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m36638b(((Long) obj).longValue());
        return true;
    }
}
