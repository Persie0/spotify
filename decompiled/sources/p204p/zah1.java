package p204p;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class zah1 extends y9h1 implements RandomAccess, mbh1 {

    /* JADX INFO: renamed from: d */
    public static final float[] f281069d;

    /* JADX INFO: renamed from: e */
    public static final zah1 f281070e;

    /* JADX INFO: renamed from: b */
    public float[] f281071b;

    /* JADX INFO: renamed from: c */
    public int f281072c;

    static {
        float[] fArr = new float[0];
        f281069d = fArr;
        f281070e = new zah1(fArr, 0, false);
    }

    public zah1(float[] fArr, int i, boolean z) {
        super(z);
        this.f281071b = fArr;
        this.f281072c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m93154a();
        if (i < 0 || i > (i2 = this.f281072c)) {
            throw new IndexOutOfBoundsException(kxf1.m57605H((byte) 13, this.f281072c, i, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        float[] fArr = this.f281071b;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f281071b, 0, fArr2, 0, i);
            System.arraycopy(this.f281071b, i, fArr2, i3, this.f281072c - i);
            this.f281071b = fArr2;
        }
        this.f281071b[i] = fFloatValue;
        this.f281072c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.y9h1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m93154a();
        Charset charset = rbh1.f197602a;
        collection.getClass();
        if (!(collection instanceof zah1)) {
            return super.addAll(collection);
        }
        zah1 zah1Var = (zah1) collection;
        int i = zah1Var.f281072c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f281072c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f281071b;
        if (i3 > fArr.length) {
            this.f281071b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(zah1Var.f281071b, 0, this.f281071b, this.f281072c, zah1Var.f281072c);
        this.f281072c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m95795b(int i) {
        if (i < 0 || i >= this.f281072c) {
            throw new IndexOutOfBoundsException(kxf1.m57605H((byte) 13, this.f281072c, i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p204p.y9h1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zah1)) {
            return super.equals(obj);
        }
        zah1 zah1Var = (zah1) obj;
        if (this.f281072c != zah1Var.f281072c) {
            return false;
        }
        float[] fArr = zah1Var.f281071b;
        for (int i = 0; i < this.f281072c; i++) {
            if (Float.floatToIntBits(this.f281071b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m95795b(i);
        return Float.valueOf(this.f281071b[i]);
    }

    @Override // p204p.y9h1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f281072c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f281071b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f281072c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f281071b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.y9h1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m93154a();
        m95795b(i);
        float[] fArr = this.f281071b;
        float f = fArr[i];
        int i2 = this.f281072c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f281072c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m93154a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f281071b;
        System.arraycopy(fArr, i2, fArr, i, this.f281072c - i2);
        this.f281072c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m93154a();
        m95795b(i);
        float[] fArr = this.f281071b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f281072c;
    }

    @Override // p204p.qbh1
    public final qbh1 zzf(int i) {
        if (i >= this.f281072c) {
            return new zah1(i == 0 ? f281069d : Arrays.copyOf(this.f281071b, i), this.f281072c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m93154a();
        int i = this.f281072c;
        int length = this.f281071b.length;
        if (i == length) {
            float[] fArr = new float[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f281071b, 0, fArr, 0, this.f281072c);
            this.f281071b = fArr;
        }
        float[] fArr2 = this.f281071b;
        int i2 = this.f281072c;
        this.f281072c = i2 + 1;
        fArr2[i2] = fFloatValue;
        return true;
    }
}
