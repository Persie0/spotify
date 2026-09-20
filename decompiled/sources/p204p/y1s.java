package p204p;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class y1s extends AbstractC1733c9 implements md50, RandomAccess, cer0 {

    /* JADX INFO: renamed from: d */
    public static final double[] f268379d;

    /* JADX INFO: renamed from: e */
    public static final y1s f268380e;

    /* JADX INFO: renamed from: b */
    public double[] f268381b;

    /* JADX INFO: renamed from: c */
    public int f268382c;

    static {
        double[] dArr = new double[0];
        f268379d = dArr;
        f268380e = new y1s(dArr, 0, false);
    }

    public y1s(double[] dArr, int i, boolean z) {
        super(z);
        this.f268381b = dArr;
        this.f268382c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m31802a();
        if (i < 0 || i > (i2 = this.f268382c)) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f268382c, ", Size:"));
        }
        double[] dArr = this.f268381b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[s571.m77242a(dArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f268381b, 0, dArr2, 0, i);
            System.arraycopy(this.f268381b, i, dArr2, i + 1, this.f268382c - i);
            this.f268381b = dArr2;
        }
        this.f268381b[i] = dDoubleValue;
        this.f268382c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m31802a();
        Charset charset = ee50.f58680a;
        collection.getClass();
        if (!(collection instanceof y1s)) {
            return super.addAll(collection);
        }
        y1s y1sVar = (y1s) collection;
        int i = y1sVar.f268382c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f268382c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f268381b;
        if (i3 > dArr.length) {
            this.f268381b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(y1sVar.f268381b, 0, this.f268381b, this.f268382c, y1sVar.f268382c);
        this.f268382c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m92666b(double d) {
        m31802a();
        int i = this.f268382c;
        double[] dArr = this.f268381b;
        if (i == dArr.length) {
            double[] dArr2 = new double[s571.m77242a(dArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f268381b, 0, dArr2, 0, this.f268382c);
            this.f268381b = dArr2;
        }
        double[] dArr3 = this.f268381b;
        int i2 = this.f268382c;
        this.f268382c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m92667d(int i) {
        if (i < 0 || i >= this.f268382c) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f268382c, ", Size:"));
        }
    }

    @Override // p204p.ae50
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final y1s mo25687h(int i) {
        if (i >= this.f268382c) {
            return new y1s(i == 0 ? f268379d : Arrays.copyOf(this.f268381b, i), this.f268382c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1s)) {
            return super.equals(obj);
        }
        y1s y1sVar = (y1s) obj;
        if (this.f268382c != y1sVar.f268382c) {
            return false;
        }
        double[] dArr = y1sVar.f268381b;
        for (int i = 0; i < this.f268382c; i++) {
            if (Double.doubleToLongBits(this.f268381b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m92667d(i);
        return Double.valueOf(this.f268381b[i]);
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM38646b = 1;
        for (int i = 0; i < this.f268382c; i++) {
            iM38646b = (iM38646b * 31) + ee50.m38646b(Double.doubleToLongBits(this.f268381b[i]));
        }
        return iM38646b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f268382c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f268381b[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m31802a();
        m92667d(i);
        double[] dArr = this.f268381b;
        double d = dArr[i];
        int i2 = this.f268382c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f268382c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m31802a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f268381b;
        System.arraycopy(dArr, i2, dArr, i, this.f268382c - i2);
        this.f268382c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m31802a();
        m92667d(i);
        double[] dArr = this.f268381b;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f268382c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m92666b(((Double) obj).doubleValue());
        return true;
    }
}
