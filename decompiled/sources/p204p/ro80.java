package p204p;

import androidx.car.app.model.Alert;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class ro80 extends AbstractC2366s8 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d */
    public static final ro80 f201177d;

    /* JADX INFO: renamed from: a */
    public Object[] f201178a;

    /* JADX INFO: renamed from: b */
    public int f201179b;

    /* JADX INFO: renamed from: c */
    public boolean f201180c;

    static {
        ro80 ro80Var = new ro80(0);
        ro80Var.f201180c = true;
        f201177d = ro80Var;
    }

    public ro80(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f201178a = new Object[i];
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f201180c) {
            return new wtz0(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // p204p.AbstractC2366s8
    /* JADX INFO: renamed from: a */
    public final int mo47661a() {
        return this.f201179b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m76025i();
        int i = this.f201179b;
        ((AbstractList) this).modCount++;
        m76026j(i, 1);
        this.f201178a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m76025i();
        int size = collection.size();
        m76023e(this.f201179b, collection, size);
        return size > 0;
    }

    @Override // p204p.AbstractC2366s8
    /* JADX INFO: renamed from: b */
    public final Object mo47662b(int i) {
        m76025i();
        int i2 = this.f201179b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i2, ", size: "));
        }
        return m76027l(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m76025i();
        m76028n(0, this.f201179b);
    }

    /* JADX INFO: renamed from: e */
    public final void m76023e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m76026j(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f201178a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f201178a;
            int i = this.f201179b;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (wj50.m88271j(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m76024f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m76026j(i, 1);
        this.f201178a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f201179b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i2, ", size: "));
        }
        return this.f201178a[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f201178a;
        int i = this.f201179b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m76025i() {
        if (this.f201180c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f201179b; i++) {
            if (wj50.m88271j(this.f201178a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f201179b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final void m76026j(int i, int i2) {
        int i3 = this.f201179b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f201178a;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Alert.DURATION_SHOW_INDEFINITELY : 2147483639;
            }
            this.f201178a = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.f201178a;
        bk5.m29629p0(i + i2, i, this.f201179b, objArr2, objArr2);
        this.f201179b += i2;
    }

    /* JADX INFO: renamed from: l */
    public final Object m76027l(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f201178a;
        Object obj = objArr[i];
        bk5.m29629p0(i, i + 1, this.f201179b, objArr, objArr);
        Object[] objArr2 = this.f201178a;
        int i2 = this.f201179b;
        objArr2[i2 - 1] = null;
        this.f201179b = i2 - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f201179b - 1; i >= 0; i--) {
            if (wj50.m88271j(this.f201178a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: n */
    public final void m76028n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f201178a;
        bk5.m29629p0(i, i + i2, this.f201179b, objArr, objArr);
        Object[] objArr2 = this.f201178a;
        int i3 = this.f201179b;
        pp91.m70545z(i3 - i2, i3, objArr2);
        this.f201179b -= i2;
    }

    /* JADX INFO: renamed from: o */
    public final int m76029o(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f201178a[i5]) == z) {
                Object[] objArr = this.f201178a;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f201178a;
        bk5.m29629p0(i + i4, i2 + i, this.f201179b, objArr2, objArr2);
        Object[] objArr3 = this.f201178a;
        int i7 = this.f201179b;
        pp91.m70545z(i7 - i6, i7, objArr3);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f201179b -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m76025i();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo47662b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m76025i();
        return m76029o(0, this.f201179b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m76025i();
        return m76029o(0, this.f201179b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m76025i();
        int i2 = this.f201179b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i2, ", size: "));
        }
        Object[] objArr = this.f201178a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        bga.m29093o(i, i2, this.f201179b);
        return new po80(this.f201178a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f201179b;
        if (length < i) {
            return Arrays.copyOfRange(this.f201178a, 0, i, objArr.getClass());
        }
        bk5.m29629p0(0, 0, i, this.f201178a, objArr);
        geg1.m44492E(this.f201179b, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return pp91.m70526g(this.f201178a, 0, this.f201179b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f201179b;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i2, ", size: "));
        }
        return new qo80(i, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m76025i();
        int i2 = this.f201179b;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            m76023e(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i2, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return bk5.m29640y0(0, this.f201179b, this.f201178a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m76025i();
        int i2 = this.f201179b;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            m76026j(i, 1);
            this.f201178a[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i2, ", size: "));
    }
}
