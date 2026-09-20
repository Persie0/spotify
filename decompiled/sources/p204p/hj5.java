package p204p;

import androidx.car.app.model.Alert;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class hj5 extends AbstractC2366s8 {

    /* JADX INFO: renamed from: d */
    public static final Object[] f91961d = new Object[0];

    /* JADX INFO: renamed from: a */
    public int f91962a;

    /* JADX INFO: renamed from: b */
    public Object[] f91963b;

    /* JADX INFO: renamed from: c */
    public int f91964c;

    public hj5() {
        this.f91963b = f91961d;
    }

    @Override // p204p.AbstractC2366s8
    /* JADX INFO: renamed from: a */
    public final int mo47661a() {
        return this.f91964c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f91964c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i2, ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m47671p();
        m47664e(this.f91964c + 1);
        int iM47670o = m47670o(this.f91962a + i);
        int i3 = this.f91964c;
        if (i < ((i3 + 1) >> 1)) {
            int length = iM47670o == 0 ? this.f91963b.length - 1 : iM47670o - 1;
            int i4 = this.f91962a;
            int length2 = i4 == 0 ? this.f91963b.length - 1 : i4 - 1;
            if (length >= i4) {
                Object[] objArr = this.f91963b;
                objArr[length2] = objArr[i4];
                bk5.m29629p0(i4, i4 + 1, length + 1, objArr, objArr);
            } else {
                Object[] objArr2 = this.f91963b;
                bk5.m29629p0(i4 - 1, i4, objArr2.length, objArr2, objArr2);
                Object[] objArr3 = this.f91963b;
                objArr3[objArr3.length - 1] = objArr3[0];
                bk5.m29629p0(0, 1, length + 1, objArr3, objArr3);
            }
            this.f91963b[length] = obj;
            this.f91962a = length2;
        } else {
            int iM47670o2 = m47670o(i3 + this.f91962a);
            if (iM47670o < iM47670o2) {
                Object[] objArr4 = this.f91963b;
                bk5.m29629p0(iM47670o + 1, iM47670o, iM47670o2, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f91963b;
                bk5.m29629p0(1, 0, iM47670o2, objArr5, objArr5);
                Object[] objArr6 = this.f91963b;
                objArr6[0] = objArr6[objArr6.length - 1];
                bk5.m29629p0(iM47670o + 1, iM47670o, objArr6.length - 1, objArr6, objArr6);
            }
            this.f91963b[iM47670o] = obj;
        }
        this.f91964c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f91964c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i2, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f91964c) {
            return addAll(collection);
        }
        m47671p();
        m47664e(collection.size() + this.f91964c);
        int iM47670o = m47670o(this.f91964c + this.f91962a);
        int iM47670o2 = m47670o(this.f91962a + i);
        int size = collection.size();
        if (i >= ((this.f91964c + 1) >> 1)) {
            int i3 = iM47670o2 + size;
            if (iM47670o2 < iM47670o) {
                int i4 = size + iM47670o;
                Object[] objArr = this.f91963b;
                if (i4 <= objArr.length) {
                    bk5.m29629p0(i3, iM47670o2, iM47670o, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    bk5.m29629p0(i3 - objArr.length, iM47670o2, iM47670o, objArr, objArr);
                } else {
                    int length = iM47670o - (i4 - objArr.length);
                    bk5.m29629p0(0, length, iM47670o, objArr, objArr);
                    Object[] objArr2 = this.f91963b;
                    bk5.m29629p0(i3, iM47670o2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f91963b;
                bk5.m29629p0(size, 0, iM47670o, objArr3, objArr3);
                Object[] objArr4 = this.f91963b;
                if (i3 >= objArr4.length) {
                    bk5.m29629p0(i3 - objArr4.length, iM47670o2, objArr4.length, objArr4, objArr4);
                } else {
                    bk5.m29629p0(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f91963b;
                    bk5.m29629p0(i3, iM47670o2, objArr5.length - size, objArr5, objArr5);
                }
            }
            m47663d(iM47670o2, collection);
            return true;
        }
        int i5 = this.f91962a;
        int length2 = i5 - size;
        if (iM47670o2 < i5) {
            Object[] objArr6 = this.f91963b;
            bk5.m29629p0(length2, i5, objArr6.length, objArr6, objArr6);
            if (size >= iM47670o2) {
                Object[] objArr7 = this.f91963b;
                bk5.m29629p0(objArr7.length - size, 0, iM47670o2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f91963b;
                bk5.m29629p0(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f91963b;
                bk5.m29629p0(0, size, iM47670o2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f91963b;
            bk5.m29629p0(length2, i5, iM47670o2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f91963b;
            length2 += objArr11.length;
            int i6 = iM47670o2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                bk5.m29629p0(length2, i5, iM47670o2, objArr11, objArr11);
            } else {
                bk5.m29629p0(length2, i5, i5 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f91963b;
                bk5.m29629p0(0, this.f91962a + length3, iM47670o2, objArr12, objArr12);
            }
        }
        this.f91962a = length2;
        m47663d(m47668l(iM47670o2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m47671p();
        m47664e(this.f91964c + 1);
        int length = this.f91962a;
        if (length == 0) {
            length = this.f91963b.length;
        }
        int i = length - 1;
        this.f91962a = i;
        this.f91963b[i] = obj;
        this.f91964c++;
    }

    public final void addLast(Object obj) {
        m47671p();
        m47664e(mo47661a() + 1);
        this.f91963b[m47670o(mo47661a() + this.f91962a)] = obj;
        this.f91964c = mo47661a() + 1;
    }

    @Override // p204p.AbstractC2366s8
    /* JADX INFO: renamed from: b */
    public final Object mo47662b(int i) {
        int i2 = this.f91964c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i2, ", size: "));
        }
        if (i == h6f.m46714K(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m47671p();
        int iM47670o = m47670o(this.f91962a + i);
        Object[] objArr = this.f91963b;
        Object obj = objArr[iM47670o];
        if (i < (this.f91964c >> 1)) {
            int i3 = this.f91962a;
            if (iM47670o >= i3) {
                bk5.m29629p0(i3 + 1, i3, iM47670o, objArr, objArr);
            } else {
                bk5.m29629p0(1, 0, iM47670o, objArr, objArr);
                Object[] objArr2 = this.f91963b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f91962a;
                bk5.m29629p0(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f91963b;
            int i5 = this.f91962a;
            objArr3[i5] = null;
            this.f91962a = m47666i(i5);
        } else {
            int iM47670o2 = m47670o(h6f.m46714K(this) + this.f91962a);
            if (iM47670o <= iM47670o2) {
                Object[] objArr4 = this.f91963b;
                bk5.m29629p0(iM47670o, iM47670o + 1, iM47670o2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f91963b;
                bk5.m29629p0(iM47670o, iM47670o + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f91963b;
                objArr6[objArr6.length - 1] = objArr6[0];
                bk5.m29629p0(0, 1, iM47670o2 + 1, objArr6, objArr6);
            }
            this.f91963b[iM47670o2] = null;
        }
        this.f91964c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m47671p();
            m47669n(this.f91962a, m47670o(mo47661a() + this.f91962a));
        }
        this.f91962a = 0;
        this.f91964c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m47663d(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f91963b.length;
        while (i < length && it.hasNext()) {
            this.f91963b[i] = it.next();
            i++;
        }
        int i2 = this.f91962a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f91963b[i3] = it.next();
        }
        this.f91964c = collection.size() + this.f91964c;
    }

    /* JADX INFO: renamed from: e */
    public final void m47664e(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f91963b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f91961d) {
            if (i < 10) {
                i = 10;
            }
            this.f91963b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Alert.DURATION_SHOW_INDEFINITELY : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        bk5.m29629p0(0, this.f91962a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f91963b;
        int length2 = objArr3.length;
        int i3 = this.f91962a;
        bk5.m29629p0(length2 - i3, 0, i3, objArr3, objArr2);
        this.f91962a = 0;
        this.f91963b = objArr2;
    }

    /* JADX INFO: renamed from: f */
    public final Object m47665f() {
        if (isEmpty()) {
            return null;
        }
        return this.f91963b[this.f91962a];
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f91963b[this.f91962a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo47661a = mo47661a();
        if (i < 0 || i >= iMo47661a) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", iMo47661a, ", size: "));
        }
        return this.f91963b[m47670o(this.f91962a + i)];
    }

    /* JADX INFO: renamed from: i */
    public final int m47666i(int i) {
        if (i == this.f91963b.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM47670o = m47670o(mo47661a() + this.f91962a);
        int length = this.f91962a;
        if (length < iM47670o) {
            while (length < iM47670o) {
                if (wj50.m88271j(obj, this.f91963b[length])) {
                    i = this.f91962a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f91962a) < iM47670o) {
            return -1;
        }
        int length2 = this.f91963b.length;
        while (length < length2) {
            if (wj50.m88271j(obj, this.f91963b[length])) {
                i = this.f91962a;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM47670o; i2++) {
            if (wj50.m88271j(obj, this.f91963b[i2])) {
                length = i2 + this.f91963b.length;
                i = this.f91962a;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo47661a() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m47667j() {
        if (isEmpty()) {
            return null;
        }
        return this.f91963b[m47670o(h6f.m46714K(this) + this.f91962a)];
    }

    /* JADX INFO: renamed from: l */
    public final int m47668l(int i) {
        return i < 0 ? i + this.f91963b.length : i;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f91963b[m47670o(h6f.m46714K(this) + this.f91962a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM47670o = m47670o(mo47661a() + this.f91962a);
        int i2 = this.f91962a;
        if (i2 < iM47670o) {
            length = iM47670o - 1;
            if (i2 <= length) {
                while (!wj50.m88271j(obj, this.f91963b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f91962a;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f91962a >= iM47670o) {
            for (int i3 = iM47670o - 1; -1 < i3; i3--) {
                if (wj50.m88271j(obj, this.f91963b[i3])) {
                    length = i3 + this.f91963b.length;
                    i = this.f91962a;
                    return length - i;
                }
            }
            length = this.f91963b.length - 1;
            int i4 = this.f91962a;
            if (i4 <= length) {
                while (!wj50.m88271j(obj, this.f91963b[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.f91962a;
                return length - i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public final void m47669n(int i, int i2) {
        if (i < i2) {
            bk5.m29578A0(this.f91963b, null, i, i2);
            return;
        }
        Object[] objArr = this.f91963b;
        bk5.m29578A0(objArr, null, i, objArr.length);
        bk5.m29578A0(this.f91963b, null, 0, i2);
    }

    /* JADX INFO: renamed from: o */
    public final int m47670o(int i) {
        Object[] objArr = this.f91963b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: p */
    public final void m47671p() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo47662b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM47670o;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f91963b.length != 0) {
            int iM47670o2 = m47670o(this.f91964c + this.f91962a);
            int i = this.f91962a;
            if (i < iM47670o2) {
                iM47670o = i;
                while (i < iM47670o2) {
                    Object obj = this.f91963b[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f91963b[iM47670o] = obj;
                        iM47670o++;
                    }
                    i++;
                }
                bk5.m29578A0(this.f91963b, null, iM47670o, iM47670o2);
            } else {
                int length = this.f91963b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f91963b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f91963b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM47670o = m47670o(i2);
                for (int i3 = 0; i3 < iM47670o2; i3++) {
                    Object[] objArr2 = this.f91963b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f91963b[iM47670o] = obj3;
                        iM47670o = m47666i(iM47670o);
                    }
                }
                z = z2;
            }
            if (z) {
                m47671p();
                this.f91964c = m47668l(iM47670o - this.f91962a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m47671p();
        Object[] objArr = this.f91963b;
        int i = this.f91962a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f91962a = m47666i(i);
        this.f91964c = mo47661a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m47671p();
        int iM47670o = m47670o(h6f.m46714K(this) + this.f91962a);
        Object[] objArr = this.f91963b;
        Object obj = objArr[iM47670o];
        objArr[iM47670o] = null;
        this.f91964c = mo47661a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        bga.m29093o(i, i2, this.f91964c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f91964c) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo47662b(i);
            return;
        }
        m47671p();
        if (i < this.f91964c - i2) {
            int iM47670o = m47670o(this.f91962a + (i - 1));
            int iM47670o2 = m47670o(this.f91962a + (i2 - 1));
            while (i > 0) {
                int i4 = iM47670o + 1;
                int iMin = Math.min(i, Math.min(i4, iM47670o2 + 1));
                Object[] objArr = this.f91963b;
                int i5 = iM47670o2 - iMin;
                int i6 = iM47670o - iMin;
                bk5.m29629p0(i5 + 1, i6 + 1, i4, objArr, objArr);
                iM47670o = m47668l(i6);
                iM47670o2 = m47668l(i5);
                i -= iMin;
            }
            int iM47670o3 = m47670o(this.f91962a + i3);
            m47669n(this.f91962a, iM47670o3);
            this.f91962a = iM47670o3;
        } else {
            int iM47670o4 = m47670o(this.f91962a + i2);
            int iM47670o5 = m47670o(this.f91962a + i);
            int i7 = this.f91964c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f91963b;
                i2 = Math.min(i7, Math.min(objArr2.length - iM47670o4, objArr2.length - iM47670o5));
                Object[] objArr3 = this.f91963b;
                int i8 = iM47670o4 + i2;
                bk5.m29629p0(iM47670o5, iM47670o4, i8, objArr3, objArr3);
                iM47670o4 = m47670o(i8);
                iM47670o5 = m47670o(iM47670o5 + i2);
            }
            int iM47670o6 = m47670o(this.f91964c + this.f91962a);
            m47669n(m47668l(iM47670o6 - i3), iM47670o6);
        }
        this.f91964c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM47670o;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f91963b.length != 0) {
            int iM47670o2 = m47670o(this.f91964c + this.f91962a);
            int i = this.f91962a;
            if (i < iM47670o2) {
                iM47670o = i;
                while (i < iM47670o2) {
                    Object obj = this.f91963b[i];
                    if (collection.contains(obj)) {
                        this.f91963b[iM47670o] = obj;
                        iM47670o++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                bk5.m29578A0(this.f91963b, null, iM47670o, iM47670o2);
            } else {
                int length = this.f91963b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f91963b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f91963b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM47670o = m47670o(i2);
                for (int i3 = 0; i3 < iM47670o2; i3++) {
                    Object[] objArr2 = this.f91963b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f91963b[iM47670o] = obj3;
                        iM47670o = m47666i(iM47670o);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m47671p();
                this.f91964c = m47668l(iM47670o - this.f91962a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo47661a = mo47661a();
        if (i < 0 || i >= iMo47661a) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", iMo47661a, ", size: "));
        }
        int iM47670o = m47670o(this.f91962a + i);
        Object[] objArr = this.f91963b;
        Object obj2 = objArr[iM47670o];
        objArr[iM47670o] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo47661a()]);
    }

    public hj5(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f91961d;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(s571.m77246e(i, "Illegal Capacity: "));
        }
        this.f91963b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f91964c;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iM47670o = m47670o(this.f91964c + this.f91962a);
        int i2 = this.f91962a;
        if (i2 < iM47670o) {
            bk5.m29636u0(i2, iM47670o, 2, this.f91963b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f91963b;
            bk5.m29629p0(0, this.f91962a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f91963b;
            bk5.m29629p0(objArr3.length - this.f91962a, 0, iM47670o, objArr3, objArr);
        }
        geg1.m44492E(this.f91964c, objArr);
        return objArr;
    }

    public hj5(List list) {
        Object[] array = list.toArray(new Object[0]);
        this.f91963b = array;
        this.f91964c = array.length;
        if (array.length == 0) {
            this.f91963b = f91961d;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        m47671p();
        m47664e(collection.size() + mo47661a());
        m47663d(m47670o(mo47661a() + this.f91962a), collection);
        return true;
    }
}
