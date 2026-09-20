package p204p;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class e8a extends AbstractC1733c9 implements ld50, RandomAccess, cer0 {

    /* JADX INFO: renamed from: d */
    public static final boolean[] f57116d;

    /* JADX INFO: renamed from: e */
    public static final e8a f57117e;

    /* JADX INFO: renamed from: b */
    public boolean[] f57118b;

    /* JADX INFO: renamed from: c */
    public int f57119c;

    static {
        boolean[] zArr = new boolean[0];
        f57116d = zArr;
        f57117e = new e8a(zArr, 0, false);
    }

    public e8a(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f57118b = zArr;
        this.f57119c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m31802a();
        if (i < 0 || i > (i2 = this.f57119c)) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f57119c, ", Size:"));
        }
        boolean[] zArr = this.f57118b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[s571.m77242a(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f57118b, 0, zArr2, 0, i);
            System.arraycopy(this.f57118b, i, zArr2, i + 1, this.f57119c - i);
            this.f57118b = zArr2;
        }
        this.f57118b[i] = zBooleanValue;
        this.f57119c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m31802a();
        Charset charset = ee50.f58680a;
        collection.getClass();
        if (!(collection instanceof e8a)) {
            return super.addAll(collection);
        }
        e8a e8aVar = (e8a) collection;
        int i = e8aVar.f57119c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f57119c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f57118b;
        if (i3 > zArr.length) {
            this.f57118b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(e8aVar.f57118b, 0, this.f57118b, this.f57119c, e8aVar.f57119c);
        this.f57119c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m38085b(boolean z) {
        m31802a();
        int i = this.f57119c;
        boolean[] zArr = this.f57118b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[s571.m77242a(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f57118b, 0, zArr2, 0, this.f57119c);
            this.f57118b = zArr2;
        }
        boolean[] zArr3 = this.f57118b;
        int i2 = this.f57119c;
        this.f57119c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m38086d(int i) {
        if (i < 0 || i >= this.f57119c) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f57119c, ", Size:"));
        }
    }

    @Override // p204p.ae50
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final e8a mo25687h(int i) {
        if (i >= this.f57119c) {
            return new e8a(i == 0 ? f57116d : Arrays.copyOf(this.f57118b, i), this.f57119c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8a)) {
            return super.equals(obj);
        }
        e8a e8aVar = (e8a) obj;
        if (this.f57119c != e8aVar.f57119c) {
            return false;
        }
        boolean[] zArr = e8aVar.f57118b;
        for (int i = 0; i < this.f57119c; i++) {
            if (this.f57118b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m38086d(i);
        return Boolean.valueOf(this.f57118b[i]);
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f57119c; i2++) {
            int i3 = i * 31;
            boolean z = this.f57118b[i2];
            Charset charset = ee50.f58680a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f57119c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f57118b[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m31802a();
        m38086d(i);
        boolean[] zArr = this.f57118b;
        boolean z = zArr[i];
        int i2 = this.f57119c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f57119c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m31802a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f57118b;
        System.arraycopy(zArr, i2, zArr, i, this.f57119c - i2);
        this.f57119c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m31802a();
        m38086d(i);
        boolean[] zArr = this.f57118b;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f57119c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m38085b(((Boolean) obj).booleanValue());
        return true;
    }
}
