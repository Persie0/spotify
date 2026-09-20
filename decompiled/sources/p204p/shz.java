package p204p;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class shz extends AbstractC1733c9 implements td50, RandomAccess, cer0 {

    /* JADX INFO: renamed from: d */
    public static final float[] f209297d;

    /* JADX INFO: renamed from: e */
    public static final shz f209298e;

    /* JADX INFO: renamed from: b */
    public float[] f209299b;

    /* JADX INFO: renamed from: c */
    public int f209300c;

    static {
        float[] fArr = new float[0];
        f209297d = fArr;
        f209298e = new shz(fArr, 0, false);
    }

    public shz(float[] fArr, int i, boolean z) {
        super(z);
        this.f209299b = fArr;
        this.f209300c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m31802a();
        if (i < 0 || i > (i2 = this.f209300c)) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f209300c, ", Size:"));
        }
        float[] fArr = this.f209299b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[s571.m77242a(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f209299b, 0, fArr2, 0, i);
            System.arraycopy(this.f209299b, i, fArr2, i + 1, this.f209300c - i);
            this.f209299b = fArr2;
        }
        this.f209299b[i] = fFloatValue;
        this.f209300c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m31802a();
        Charset charset = ee50.f58680a;
        collection.getClass();
        if (!(collection instanceof shz)) {
            return super.addAll(collection);
        }
        shz shzVar = (shz) collection;
        int i = shzVar.f209300c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f209300c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f209299b;
        if (i3 > fArr.length) {
            this.f209299b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(shzVar.f209299b, 0, this.f209299b, this.f209300c, shzVar.f209300c);
        this.f209300c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m78145b(float f) {
        m31802a();
        int i = this.f209300c;
        float[] fArr = this.f209299b;
        if (i == fArr.length) {
            float[] fArr2 = new float[s571.m77242a(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f209299b, 0, fArr2, 0, this.f209300c);
            this.f209299b = fArr2;
        }
        float[] fArr3 = this.f209299b;
        int i2 = this.f209300c;
        this.f209300c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m78146d(int i) {
        if (i < 0 || i >= this.f209300c) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f209300c, ", Size:"));
        }
    }

    @Override // p204p.ae50
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final shz mo25687h(int i) {
        if (i >= this.f209300c) {
            return new shz(i == 0 ? f209297d : Arrays.copyOf(this.f209299b, i), this.f209300c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shz)) {
            return super.equals(obj);
        }
        shz shzVar = (shz) obj;
        if (this.f209300c != shzVar.f209300c) {
            return false;
        }
        float[] fArr = shzVar.f209299b;
        for (int i = 0; i < this.f209300c; i++) {
            if (Float.floatToIntBits(this.f209299b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m78146d(i);
        return Float.valueOf(this.f209299b[i]);
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f209300c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f209299b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f209300c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f209299b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m31802a();
        m78146d(i);
        float[] fArr = this.f209299b;
        float f = fArr[i];
        int i2 = this.f209300c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f209300c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m31802a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f209299b;
        System.arraycopy(fArr, i2, fArr, i, this.f209300c - i2);
        this.f209300c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m31802a();
        m78146d(i);
        float[] fArr = this.f209299b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f209300c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m78145b(((Float) obj).floatValue());
        return true;
    }
}
