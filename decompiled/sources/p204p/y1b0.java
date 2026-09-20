package p204p;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class y1b0 extends AbstractC1733c9 implements xd50, RandomAccess, cer0 {

    /* JADX INFO: renamed from: d */
    public static final long[] f268221d;

    /* JADX INFO: renamed from: e */
    public static final y1b0 f268222e;

    /* JADX INFO: renamed from: b */
    public long[] f268223b;

    /* JADX INFO: renamed from: c */
    public int f268224c;

    static {
        long[] jArr = new long[0];
        f268221d = jArr;
        f268222e = new y1b0(jArr, 0, false);
    }

    public y1b0() {
        this(f268221d, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m31802a();
        if (i < 0 || i > (i2 = this.f268224c)) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f268224c, ", Size:"));
        }
        long[] jArr = this.f268223b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[s571.m77242a(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f268223b, 0, jArr2, 0, i);
            System.arraycopy(this.f268223b, i, jArr2, i + 1, this.f268224c - i);
            this.f268223b = jArr2;
        }
        this.f268223b[i] = jLongValue;
        this.f268224c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m31802a();
        Charset charset = ee50.f58680a;
        collection.getClass();
        if (!(collection instanceof y1b0)) {
            return super.addAll(collection);
        }
        y1b0 y1b0Var = (y1b0) collection;
        int i = y1b0Var.f268224c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f268224c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f268223b;
        if (i3 > jArr.length) {
            this.f268223b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(y1b0Var.f268223b, 0, this.f268223b, this.f268224c, y1b0Var.f268224c);
        this.f268224c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m92642b(long j) {
        m31802a();
        int i = this.f268224c;
        long[] jArr = this.f268223b;
        if (i == jArr.length) {
            long[] jArr2 = new long[s571.m77242a(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f268223b, 0, jArr2, 0, this.f268224c);
            this.f268223b = jArr2;
        }
        long[] jArr3 = this.f268223b;
        int i2 = this.f268224c;
        this.f268224c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m92643d(int i) {
        if (i < 0 || i >= this.f268224c) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f268224c, ", Size:"));
        }
    }

    /* JADX INFO: renamed from: e */
    public final long m92644e(int i) {
        m92643d(i);
        return this.f268223b[i];
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1b0)) {
            return super.equals(obj);
        }
        y1b0 y1b0Var = (y1b0) obj;
        if (this.f268224c != y1b0Var.f268224c) {
            return false;
        }
        long[] jArr = y1b0Var.f268223b;
        for (int i = 0; i < this.f268224c; i++) {
            if (this.f268223b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.ae50
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final y1b0 mo25687h(int i) {
        if (i >= this.f268224c) {
            return new y1b0(i == 0 ? f268221d : Arrays.copyOf(this.f268223b, i), this.f268224c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(m92644e(i));
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM38646b = 1;
        for (int i = 0; i < this.f268224c; i++) {
            iM38646b = (iM38646b * 31) + ee50.m38646b(this.f268223b[i]);
        }
        return iM38646b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f268224c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f268223b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m31802a();
        m92643d(i);
        long[] jArr = this.f268223b;
        long j = jArr[i];
        int i2 = this.f268224c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f268224c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m31802a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f268223b;
        System.arraycopy(jArr, i2, jArr, i, this.f268224c - i2);
        this.f268224c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m31802a();
        m92643d(i);
        long[] jArr = this.f268223b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f268224c;
    }

    public y1b0(long[] jArr, int i, boolean z) {
        super(z);
        this.f268223b = jArr;
        this.f268224c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m92642b(((Long) obj).longValue());
        return true;
    }
}
