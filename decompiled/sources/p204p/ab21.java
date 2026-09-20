package p204p;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ab21 {

    /* JADX INFO: renamed from: a */
    public int[] f13974a;

    /* JADX INFO: renamed from: b */
    public Object[] f13975b;

    /* JADX INFO: renamed from: c */
    public int f13976c;

    public ab21(int i) {
        this.f13974a = i == 0 ? fem.f68796a : new int[i];
        this.f13975b = i == 0 ? fem.f68798c : new Object[i << 1];
    }

    /* JADX INFO: renamed from: a */
    public final int m25307a(Object obj) {
        int i = this.f13976c * 2;
        Object[] objArr = this.f13975b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m25308b(int i) {
        int i2 = this.f13976c;
        int[] iArr = this.f13974a;
        if (iArr.length < i) {
            this.f13974a = Arrays.copyOf(iArr, i);
            this.f13975b = Arrays.copyOf(this.f13975b, i * 2);
        }
        if (this.f13976c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m25309c(int i, Object obj) {
        int i2 = this.f13976c;
        if (i2 == 0) {
            return -1;
        }
        int iM41459g = fem.m41459g(i2, i, this.f13974a);
        if (iM41459g < 0 || wj50.m88271j(obj, this.f13975b[iM41459g << 1])) {
            return iM41459g;
        }
        int i3 = iM41459g + 1;
        while (i3 < i2 && this.f13974a[i3] == i) {
            if (wj50.m88271j(obj, this.f13975b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM41459g - 1; i4 >= 0 && this.f13974a[i4] == i; i4--) {
            if (wj50.m88271j(obj, this.f13975b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        if (this.f13976c > 0) {
            this.f13974a = fem.f68796a;
            this.f13975b = fem.f68798c;
            this.f13976c = 0;
        }
        if (this.f13976c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m25310d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m25307a(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m25310d(Object obj) {
        return obj == null ? m25311e() : m25309c(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: e */
    public final int m25311e() {
        int i = this.f13976c;
        if (i == 0) {
            return -1;
        }
        int iM41459g = fem.m41459g(i, 0, this.f13974a);
        if (iM41459g < 0 || this.f13975b[iM41459g << 1] == null) {
            return iM41459g;
        }
        int i2 = iM41459g + 1;
        while (i2 < i && this.f13974a[i2] == 0) {
            if (this.f13975b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM41459g - 1; i3 >= 0 && this.f13974a[i3] == 0; i3--) {
            if (this.f13975b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof ab21) {
                int i = this.f13976c;
                if (i != ((ab21) obj).f13976c) {
                    return false;
                }
                ab21 ab21Var = (ab21) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM25312f = m25312f(i2);
                    Object objM25315i = m25315i(i2);
                    Object obj2 = ab21Var.get(objM25312f);
                    if (objM25315i == null) {
                        if (obj2 != null || !ab21Var.containsKey(objM25312f)) {
                            return false;
                        }
                    } else if (!objM25315i.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f13976c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f13976c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM25312f2 = m25312f(i4);
                Object objM25315i2 = m25315i(i4);
                Object obj3 = ((Map) obj).get(objM25312f2);
                if (objM25315i2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM25312f2)) {
                        return false;
                    }
                } else if (!objM25315i2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m25312f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f13976c) {
            z = true;
        }
        if (z) {
            return this.f13975b[i << 1];
        }
        epv0.m39674J("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m25313g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f13976c)) {
            epv0.m39674J("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f13975b;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f13974a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                bk5.m29627o0(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.f13975b;
                bk5.m29629p0(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f13975b;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f13974a = Arrays.copyOf(iArr, i7);
            this.f13975b = Arrays.copyOf(this.f13975b, i7 << 1);
            if (i2 != this.f13976c) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                bk5.m29627o0(0, 0, i, iArr, this.f13974a);
                bk5.m29629p0(0, 0, i3, objArr, this.f13975b);
            }
            if (i < i4) {
                int i8 = i + 1;
                bk5.m29627o0(i, i8, i2, iArr, this.f13974a);
                bk5.m29629p0(i3, i8 << 1, i2 << 1, objArr, this.f13975b);
            }
        }
        if (i2 != this.f13976c) {
            throw new ConcurrentModificationException();
        }
        this.f13976c = i4;
        return obj;
    }

    public Object get(Object obj) {
        int iM25310d = m25310d(obj);
        if (iM25310d >= 0) {
            return this.f13975b[(iM25310d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM25310d = m25310d(obj);
        return iM25310d >= 0 ? this.f13975b[(iM25310d << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public final Object m25314h(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.f13976c) {
            z = true;
        }
        if (!z) {
            epv0.m39674J("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f13975b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f13974a;
        Object[] objArr = this.f13975b;
        int i = this.f13976c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final Object m25315i(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f13976c) {
            z = true;
        }
        if (z) {
            return this.f13975b[(i << 1) + 1];
        }
        epv0.m39674J("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f13976c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f13976c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM25309c = obj != null ? m25309c(iHashCode, obj) : m25311e();
        if (iM25309c >= 0) {
            int i2 = (iM25309c << 1) + 1;
            Object[] objArr = this.f13975b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM25309c;
        int[] iArr = this.f13974a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f13974a = Arrays.copyOf(iArr, i4);
            this.f13975b = Arrays.copyOf(this.f13975b, i4 << 1);
            if (i != this.f13976c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f13974a;
            int i5 = i3 + 1;
            bk5.m29627o0(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.f13975b;
            bk5.m29629p0(i5 << 1, i3 << 1, this.f13976c << 1, objArr2, objArr2);
        }
        int i6 = this.f13976c;
        if (i == i6) {
            int[] iArr3 = this.f13974a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f13975b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f13976c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM25310d = m25310d(obj);
        if (iM25310d >= 0) {
            return m25313g(iM25310d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM25310d = m25310d(obj);
        if (iM25310d >= 0) {
            return m25314h(iM25310d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f13976c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f13976c * 28);
        sb.append('{');
        int i = this.f13976c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM25312f = m25312f(i2);
            if (objM25312f != sb) {
                sb.append(objM25312f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM25315i = m25315i(i2);
            if (objM25315i != sb) {
                sb.append(objM25315i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM25310d = m25310d(obj);
        if (iM25310d < 0 || !wj50.m88271j(obj2, m25315i(iM25310d))) {
            return false;
        }
        m25313g(iM25310d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM25310d = m25310d(obj);
        if (iM25310d < 0 || !wj50.m88271j(obj2, m25315i(iM25310d))) {
            return false;
        }
        m25314h(iM25310d, obj3);
        return true;
    }
}
