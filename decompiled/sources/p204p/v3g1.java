package p204p;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class v3g1 extends xxf1 implements RandomAccess, h4g1 {

    /* JADX INFO: renamed from: d */
    public static final int[] f236883d;

    /* JADX INFO: renamed from: e */
    public static final v3g1 f236884e;

    /* JADX INFO: renamed from: b */
    public int[] f236885b;

    /* JADX INFO: renamed from: c */
    public int f236886c;

    static {
        int[] iArr = new int[0];
        f236883d = iArr;
        f236884e = new v3g1(iArr, 0, false);
    }

    public v3g1(int[] iArr, int i, boolean z) {
        super(z);
        this.f236885b = iArr;
        this.f236886c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m84566a(int i) {
        zza();
        int i2 = this.f236886c;
        int length = this.f236885b.length;
        if (i2 == length) {
            int[] iArr = new int[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f236885b, 0, iArr, 0, this.f236886c);
            this.f236885b = iArr;
        }
        int[] iArr2 = this.f236885b;
        int i3 = this.f236886c;
        this.f236886c = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i < 0 || i > (i2 = this.f236886c)) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f236886c, ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.f236885b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f236885b, 0, iArr2, 0, i);
            System.arraycopy(this.f236885b, i, iArr2, i3, this.f236886c - i);
            this.f236885b = iArr2;
        }
        this.f236885b[i] = iIntValue;
        this.f236886c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.xxf1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = a5g1.f12516a;
        collection.getClass();
        if (!(collection instanceof v3g1)) {
            return super.addAll(collection);
        }
        v3g1 v3g1Var = (v3g1) collection;
        int i = v3g1Var.f236886c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f236886c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f236885b;
        if (i3 > iArr.length) {
            this.f236885b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(v3g1Var.f236885b, 0, this.f236885b, this.f236886c, v3g1Var.f236886c);
        this.f236886c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m84567b(int i) {
        if (i < 0 || i >= this.f236886c) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Index:", this.f236886c, ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p204p.xxf1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3g1)) {
            return super.equals(obj);
        }
        v3g1 v3g1Var = (v3g1) obj;
        if (this.f236886c != v3g1Var.f236886c) {
            return false;
        }
        int[] iArr = v3g1Var.f236885b;
        for (int i = 0; i < this.f236886c; i++) {
            if (this.f236885b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m84567b(i);
        return Integer.valueOf(this.f236885b[i]);
    }

    @Override // p204p.xxf1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f236886c; i2++) {
            i = (i * 31) + this.f236885b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f236886c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f236885b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.xxf1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        m84567b(i);
        int[] iArr = this.f236885b;
        int i2 = iArr[i];
        int i3 = this.f236886c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f236886c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f236885b;
        System.arraycopy(iArr, i2, iArr, i, this.f236886c - i2);
        this.f236886c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        m84567b(i);
        int[] iArr = this.f236885b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f236886c;
    }

    @Override // p204p.l4g1
    public final /* bridge */ /* synthetic */ l4g1 zzd(int i) {
        if (i >= this.f236886c) {
            return new v3g1(i == 0 ? f236883d : Arrays.copyOf(this.f236885b, i), this.f236886c, true);
        }
        throw new IllegalArgumentException();
    }

    public final int zze(int i) {
        m84567b(i);
        return this.f236885b[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m84566a(((Integer) obj).intValue());
        return true;
    }
}
