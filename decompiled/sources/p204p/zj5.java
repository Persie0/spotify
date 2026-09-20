package p204p;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zj5 implements Collection, Set, qq60, cr60 {

    /* JADX INFO: renamed from: a */
    public int[] f283360a;

    /* JADX INFO: renamed from: b */
    public Object[] f283361b;

    /* JADX INFO: renamed from: c */
    public int f283362c;

    public zj5(int i) {
        this.f283360a = fem.f68796a;
        this.f283361b = fem.f68798c;
        if (i > 0) {
            this.f283360a = new int[i];
            this.f283361b = new Object[i];
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m96230a(int i) {
        int i2 = this.f283362c;
        Object[] objArr = this.f283361b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f283360a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                bk5.m29627o0(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.f283361b;
                bk5.m29629p0(i, i4, i2, objArr2, objArr2);
            }
            this.f283361b[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f283360a = iArr2;
            this.f283361b = new Object[i5];
            if (i > 0) {
                bk5.m29635t0(0, i, 6, iArr, iArr2);
                bk5.m29636u0(0, i, 6, objArr, this.f283361b);
            }
            if (i < i3) {
                int i6 = i + 1;
                bk5.m29627o0(i, i6, i2, iArr, this.f283360a);
                bk5.m29629p0(i, i6, i2, objArr, this.f283361b);
            }
        }
        if (i2 != this.f283362c) {
            throw new ConcurrentModificationException();
        }
        this.f283362c = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM54968C;
        int i2 = this.f283362c;
        if (obj == null) {
            iM54968C = k0e1.m54968C(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM54968C = k0e1.m54968C(this, obj, iHashCode);
        }
        if (iM54968C >= 0) {
            return false;
        }
        int i3 = ~iM54968C;
        int[] iArr = this.f283360a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f283361b;
            int[] iArr2 = new int[i4];
            this.f283360a = iArr2;
            this.f283361b = new Object[i4];
            if (i2 != this.f283362c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                bk5.m29635t0(0, iArr.length, 6, iArr, iArr2);
                bk5.m29636u0(0, objArr.length, 6, objArr, this.f283361b);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f283360a;
            int i5 = i3 + 1;
            bk5.m29627o0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.f283361b;
            bk5.m29629p0(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.f283362c;
        if (i2 == i6) {
            int[] iArr4 = this.f283360a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f283361b[i3] = obj;
                this.f283362c = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f283362c;
        int i = this.f283362c;
        int[] iArr = this.f283360a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f283361b;
            int[] iArr2 = new int[size];
            this.f283360a = iArr2;
            this.f283361b = new Object[size];
            if (i > 0) {
                bk5.m29635t0(0, i, 6, iArr, iArr2);
                bk5.m29636u0(0, this.f283362c, 6, objArr, this.f283361b);
            }
        }
        if (this.f283362c != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f283362c != 0) {
            this.f283360a = fem.f68796a;
            this.f283361b = fem.f68798c;
            this.f283362c = 0;
        }
        if (this.f283362c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? k0e1.m54968C(this, null, 0) : k0e1.m54968C(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f283362c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f283362c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f283361b[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f283360a;
        int i = this.f283362c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f283362c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new sj5(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM54968C = obj == null ? k0e1.m54968C(this, null, 0) : k0e1.m54968C(this, obj, obj.hashCode());
        if (iM54968C < 0) {
            return false;
        }
        m96230a(iM54968C);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f283362c - 1; -1 < i; i--) {
            if (!g6f.m43725i0(collection, this.f283361b[i])) {
                m96230a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f283362c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return bk5.m29640y0(0, this.f283362c, this.f283361b);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f283362c * 14);
        sb.append('{');
        int i = this.f283362c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f283361b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Object[] objArrM33176y = ckf1.m33176y(this.f283362c, objArr);
        bk5.m29629p0(0, 0, this.f283362c, this.f283361b, objArrM33176y);
        return objArrM33176y;
    }
}
