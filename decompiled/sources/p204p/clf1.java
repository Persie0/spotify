package p204p;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class clf1 extends kbf1 implements RandomAccess, anf1, gtf1 {

    /* JADX INFO: renamed from: d */
    public static final clf1 f39277d;

    /* JADX INFO: renamed from: b */
    public float[] f39278b;

    /* JADX INFO: renamed from: c */
    public int f39279c;

    static {
        clf1 clf1Var = new clf1(0, new float[0]);
        f39277d = clf1Var;
        clf1Var.f121199a = false;
    }

    public clf1(int i, float[] fArr) {
        this.f39278b = fArr;
        this.f39279c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m55944a();
        if (i < 0 || i > (i2 = this.f39279c)) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f39279c, ", Size:"));
        }
        float[] fArr = this.f39278b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[m5p0.m60873e(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f39278b, i, fArr2, i + 1, this.f39279c - i);
            this.f39278b = fArr2;
        }
        this.f39278b[i] = fFloatValue;
        this.f39279c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.kbf1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m55944a();
        Charset charset = nnf1.f156416a;
        collection.getClass();
        if (!(collection instanceof clf1)) {
            return super.addAll(collection);
        }
        clf1 clf1Var = (clf1) collection;
        int i = clf1Var.f39279c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f39279c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f39278b;
        if (i3 > fArr.length) {
            this.f39278b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(clf1Var.f39278b, 0, this.f39278b, this.f39279c, clf1Var.f39279c);
        this.f39279c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m33272b(float f) {
        m55944a();
        int i = this.f39279c;
        float[] fArr = this.f39278b;
        if (i == fArr.length) {
            float[] fArr2 = new float[m5p0.m60873e(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f39278b = fArr2;
        }
        float[] fArr3 = this.f39278b;
        int i2 = this.f39279c;
        this.f39279c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m33273d(int i) {
        if (i < 0 || i >= this.f39279c) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f39279c, ", Size:"));
        }
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clf1)) {
            return super.equals(obj);
        }
        clf1 clf1Var = (clf1) obj;
        if (this.f39279c != clf1Var.f39279c) {
            return false;
        }
        float[] fArr = clf1Var.f39278b;
        for (int i = 0; i < this.f39279c; i++) {
            if (Float.floatToIntBits(this.f39278b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m33273d(i);
        return Float.valueOf(this.f39278b[i]);
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f39279c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f39278b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f39279c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f39278b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m55944a();
        m33273d(i);
        float[] fArr = this.f39278b;
        float f = fArr[i];
        int i2 = this.f39279c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f39279c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m55944a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f39278b;
        System.arraycopy(fArr, i2, fArr, i, this.f39279c - i2);
        this.f39279c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m55944a();
        m33273d(i);
        float[] fArr = this.f39278b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39279c;
    }

    @Override // p204p.gnf1
    public final gnf1 zzd(int i) {
        if (i < this.f39279c) {
            throw new IllegalArgumentException();
        }
        return new clf1(this.f39279c, Arrays.copyOf(this.f39278b, i));
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m33272b(((Float) obj).floatValue());
        return true;
    }
}
