package p204p;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class rbf1 extends l9f1 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f197589d;

    /* JADX INFO: renamed from: e */
    public static final rbf1 f197590e;

    /* JADX INFO: renamed from: b */
    public Object[] f197591b;

    /* JADX INFO: renamed from: c */
    public int f197592c;

    static {
        Object[] objArr = new Object[0];
        f197589d = objArr;
        f197590e = new rbf1(objArr, 0, false);
    }

    public rbf1(Object[] objArr, int i, boolean z) {
        super(z);
        this.f197591b = objArr;
        this.f197592c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m58512a();
        if (i < 0 || i > (i2 = this.f197592c)) {
            throw new IndexOutOfBoundsException(n9f1.m63922a((byte) 13, this.f197592c, i, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.f197591b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[s571.m77242a(length, 3, 2, 1, 10)];
            System.arraycopy(this.f197591b, 0, objArr2, 0, i);
            System.arraycopy(this.f197591b, i, objArr2, i3, this.f197592c - i);
            this.f197591b = objArr2;
        }
        this.f197591b[i] = obj;
        this.f197592c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final void m75175b(int i) {
        if (i < 0 || i >= this.f197592c) {
            throw new IndexOutOfBoundsException(n9f1.m63922a((byte) 13, this.f197592c, i, "Index:", ", Size:"));
        }
    }

    @Override // p204p.l9f1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.f197592c;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof rbf1)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.f197591b[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        rbf1 rbf1Var = (rbf1) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.f197591b[i3].equals(rbf1Var.f197591b[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m75175b(i);
        return this.f197591b[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f197592c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.f197591b[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // p204p.l9f1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m58512a();
        m75175b(i);
        Object[] objArr = this.f197591b;
        Object obj = objArr[i];
        int i2 = this.f197592c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f197592c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m58512a();
        m75175b(i);
        Object[] objArr = this.f197591b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f197592c;
    }

    @Override // p204p.zaf1
    public final /* bridge */ /* synthetic */ zaf1 zzg(int i) {
        if (i >= this.f197592c) {
            return new rbf1(i == 0 ? f197589d : Arrays.copyOf(this.f197591b, i), this.f197592c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m58512a();
        int i = this.f197592c;
        int length = this.f197591b.length;
        if (i == length) {
            this.f197591b = Arrays.copyOf(this.f197591b, s571.m77242a(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f197591b;
        int i2 = this.f197592c;
        this.f197592c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
