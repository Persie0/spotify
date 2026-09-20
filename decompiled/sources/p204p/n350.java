package p204p;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class n350 extends AbstractC1733c9 implements ud50, RandomAccess, cer0 {

    /* JADX INFO: renamed from: d */
    public static final int[] f149934d;

    /* JADX INFO: renamed from: e */
    public static final n350 f149935e;

    /* JADX INFO: renamed from: b */
    public int[] f149936b;

    /* JADX INFO: renamed from: c */
    public int f149937c;

    static {
        int[] iArr = new int[0];
        f149934d = iArr;
        f149935e = new n350(iArr, 0, false);
    }

    public n350() {
        this(f149934d, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m31802a();
        if (i < 0 || i > (i2 = this.f149937c)) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f149937c, ", Size:"));
        }
        int[] iArr = this.f149936b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[s571.m77242a(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f149936b, 0, iArr2, 0, i);
            System.arraycopy(this.f149936b, i, iArr2, i + 1, this.f149937c - i);
            this.f149936b = iArr2;
        }
        this.f149936b[i] = iIntValue;
        this.f149937c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m31802a();
        Charset charset = ee50.f58680a;
        collection.getClass();
        if (!(collection instanceof n350)) {
            return super.addAll(collection);
        }
        n350 n350Var = (n350) collection;
        int i = n350Var.f149937c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f149937c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f149936b;
        if (i3 > iArr.length) {
            this.f149936b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(n350Var.f149936b, 0, this.f149936b, this.f149937c, n350Var.f149937c);
        this.f149937c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m63581b(int i) {
        m31802a();
        int i2 = this.f149937c;
        int[] iArr = this.f149936b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[s571.m77242a(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f149936b, 0, iArr2, 0, this.f149937c);
            this.f149936b = iArr2;
        }
        int[] iArr3 = this.f149936b;
        int i3 = this.f149937c;
        this.f149937c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m63582d(int i) {
        if (i < 0 || i >= this.f149937c) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f149937c, ", Size:"));
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m63583e(int i) {
        m63582d(i);
        return this.f149936b[i];
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n350)) {
            return super.equals(obj);
        }
        n350 n350Var = (n350) obj;
        if (this.f149937c != n350Var.f149937c) {
            return false;
        }
        int[] iArr = n350Var.f149936b;
        for (int i = 0; i < this.f149937c; i++) {
            if (this.f149936b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.ae50
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final n350 mo25687h(int i) {
        if (i >= this.f149937c) {
            return new n350(i == 0 ? f149934d : Arrays.copyOf(this.f149936b, i), this.f149937c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(m63583e(i));
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f149937c; i2++) {
            i = (i * 31) + this.f149936b[i2];
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final int m63585i(int i, int i2) {
        m31802a();
        m63582d(i);
        int[] iArr = this.f149936b;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f149937c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f149936b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m31802a();
        m63582d(i);
        int[] iArr = this.f149936b;
        int i2 = iArr[i];
        int i3 = this.f149937c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f149937c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m31802a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f149936b;
        System.arraycopy(iArr, i2, iArr, i, this.f149937c - i2);
        this.f149937c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Integer.valueOf(m63585i(i, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f149937c;
    }

    public n350(int[] iArr, int i, boolean z) {
        super(z);
        this.f149936b = iArr;
        this.f149937c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m63581b(((Integer) obj).intValue());
        return true;
    }
}
