package p204p;

import androidx.car.app.model.Alert;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mec0 implements Map, Serializable, tq60 {

    /* JADX INFO: renamed from: L0 */
    public static final mec0 f142663L0;

    /* JADX INFO: renamed from: X */
    public oec0 f142664X;

    /* JADX INFO: renamed from: Y */
    public nec0 f142665Y;

    /* JADX INFO: renamed from: Z */
    public boolean f142666Z;

    /* JADX INFO: renamed from: a */
    public Object[] f142667a;

    /* JADX INFO: renamed from: b */
    public Object[] f142668b;

    /* JADX INFO: renamed from: c */
    public int[] f142669c;

    /* JADX INFO: renamed from: d */
    public int[] f142670d;

    /* JADX INFO: renamed from: e */
    public int f142671e;

    /* JADX INFO: renamed from: f */
    public int f142672f;

    /* JADX INFO: renamed from: g */
    public int f142673g;

    /* JADX INFO: renamed from: h */
    public int f142674h;

    /* JADX INFO: renamed from: i */
    public int f142675i;

    /* JADX INFO: renamed from: t */
    public nec0 f142676t;

    static {
        new t36(16);
        mec0 mec0Var = new mec0(0);
        mec0Var.f142666Z = true;
        f142663L0 = mec0Var;
    }

    public mec0() {
        this(8);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f142666Z) {
            return new duz0(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* JADX INFO: renamed from: a */
    public final int m61539a(Object obj) {
        m61541c();
        while (true) {
            int iM61546h = m61546h(obj);
            int i = this.f142671e * 2;
            int length = this.f142670d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f142670d;
                int i3 = iArr[iM61546h];
                if (i3 == 0) {
                    int i4 = this.f142672f;
                    Object[] objArr = this.f142667a;
                    if (i4 >= objArr.length) {
                        m61543e(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f142672f = i5;
                    objArr[i4] = obj;
                    this.f142669c[i4] = iM61546h;
                    iArr[iM61546h] = i5;
                    this.f142675i++;
                    this.f142674h++;
                    if (i2 > this.f142671e) {
                        this.f142671e = i2;
                    }
                    return i4;
                }
                if (wj50.m88271j(this.f142667a[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    m61547i(this.f142670d.length * 2);
                    break;
                }
                iM61546h = iM61546h == 0 ? this.f142670d.length - 1 : iM61546h - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final mec0 m61540b() {
        m61541c();
        this.f142666Z = true;
        return this.f142675i > 0 ? this : f142663L0;
    }

    /* JADX INFO: renamed from: c */
    public final void m61541c() {
        if (this.f142666Z) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        m61541c();
        int i = this.f142672f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f142669c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f142670d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        pp91.m70545z(0, this.f142672f, this.f142667a);
        Object[] objArr = this.f142668b;
        if (objArr != null) {
            pp91.m70545z(0, this.f142672f, objArr);
        }
        this.f142675i = 0;
        this.f142672f = 0;
        this.f142674h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m61544f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m61545g(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m61542d(boolean z) {
        int i;
        Object[] objArr = this.f142668b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f142672f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f142669c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f142667a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f142670d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        pp91.m70545z(i3, i, this.f142667a);
        if (objArr != null) {
            pp91.m70545z(i3, this.f142672f, objArr);
        }
        this.f142672f = i3;
    }

    /* JADX INFO: renamed from: e */
    public final void m61543e(int i) {
        Object[] objArr = this.f142667a;
        int length = objArr.length;
        int i2 = this.f142672f;
        int i3 = length - i2;
        int i4 = i2 - this.f142675i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m61542d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Alert.DURATION_SHOW_INDEFINITELY : 2147483639;
            }
            this.f142667a = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f142668b;
            this.f142668b = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f142669c = Arrays.copyOf(this.f142669c, i6);
            int iM79965a = t36.m79965a(i6);
            if (iM79965a > this.f142670d.length) {
                m61547i(iM79965a);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        nec0 nec0Var = this.f142665Y;
        if (nec0Var != null) {
            return nec0Var;
        }
        nec0 nec0Var2 = new nec0(this, 0);
        this.f142665Y = nec0Var2;
        return nec0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        boolean zM88271j;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f142675i == map.size()) {
                    Iterator it = map.entrySet().iterator();
                    do {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (next == null) {
                                break;
                            }
                            try {
                                Map.Entry entry = (Map.Entry) next;
                                int iM61544f = m61544f(entry.getKey());
                                if (iM61544f < 0) {
                                    zM88271j = false;
                                } else {
                                    Object[] objArr = this.f142668b;
                                    wj50.m88279p(objArr);
                                    zM88271j = wj50.m88271j(objArr[iM61544f], entry.getValue());
                                }
                            } catch (ClassCastException unused) {
                            }
                        } else {
                            z = true;
                        }
                        if (z) {
                        }
                    } while (zM88271j);
                    z = false;
                    if (z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m61544f(Object obj) {
        int iM61546h = m61546h(obj);
        int i = this.f142671e;
        while (true) {
            int i2 = this.f142670d[iM61546h];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (wj50.m88271j(this.f142667a[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM61546h = iM61546h == 0 ? this.f142670d.length - 1 : iM61546h - 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m61545g(Object obj) {
        int i = this.f142672f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f142669c[i] >= 0) {
                Object[] objArr = this.f142668b;
                wj50.m88279p(objArr);
                if (wj50.m88271j(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM61544f = m61544f(obj);
        if (iM61544f < 0) {
            return null;
        }
        Object[] objArr = this.f142668b;
        wj50.m88279p(objArr);
        return objArr[iM61544f];
    }

    /* JADX INFO: renamed from: h */
    public final int m61546h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f142673g;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iM53091p = 0;
        jec0 jec0Var = new jec0(this, iM53091p);
        while (jec0Var.hasNext()) {
            iM53091p += jec0Var.m53091p();
        }
        return iM53091p;
    }

    /* JADX INFO: renamed from: i */
    public final void m61547i(int i) {
        int[] iArr;
        this.f142674h++;
        int i2 = 0;
        if (this.f142672f > this.f142675i) {
            m61542d(false);
        }
        this.f142670d = new int[i];
        this.f142673g = t36.m79966e(i);
        while (i2 < this.f142672f) {
            int i3 = i2 + 1;
            int iM61546h = m61546h(this.f142667a[i2]);
            int i4 = this.f142671e;
            while (true) {
                iArr = this.f142670d;
                if (iArr[iM61546h] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM61546h = iM61546h == 0 ? iArr.length - 1 : iM61546h - 1;
            }
            iArr[iM61546h] = i3;
            this.f142669c[i2] = iM61546h;
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f142675i == 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m61548j(int i) {
        int i2;
        int i3;
        int iM61546h;
        int[] iArr;
        this.f142667a[i] = null;
        Object[] objArr = this.f142668b;
        if (objArr != null) {
            objArr[i] = null;
        }
        int length = this.f142669c[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.f142670d.length - 1 : length - 1;
                int[] iArr2 = this.f142670d;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.f142671e) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iM61546h = m61546h(this.f142667a[i3]) - length;
                    iArr = this.f142670d;
                }
            } while ((iM61546h & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.f142669c[i3] = i4;
        }
        this.f142669c[i] = -1;
        this.f142675i--;
        this.f142674h++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        nec0 nec0Var = this.f142676t;
        if (nec0Var != null) {
            return nec0Var;
        }
        nec0 nec0Var2 = new nec0(this, 1);
        this.f142676t = nec0Var2;
        return nec0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m61541c();
        int iM61539a = m61539a(obj);
        Object[] objArr = this.f142668b;
        if (objArr == null) {
            int length = this.f142667a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f142668b = objArr;
        }
        if (iM61539a >= 0) {
            objArr[iM61539a] = obj2;
            return null;
        }
        int i = (-iM61539a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m61541c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m61543e(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM61539a = m61539a(entry.getKey());
            Object[] objArr = this.f142668b;
            if (objArr == null) {
                int length = this.f142667a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f142668b = objArr;
            }
            if (iM61539a >= 0) {
                objArr[iM61539a] = entry.getValue();
            } else {
                int i = (-iM61539a) - 1;
                if (!wj50.m88271j(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m61541c();
        int iM61544f = m61544f(obj);
        if (iM61544f < 0) {
            return null;
        }
        Object[] objArr = this.f142668b;
        wj50.m88279p(objArr);
        Object obj2 = objArr[iM61544f];
        m61548j(iM61544f);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f142675i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f142675i * 3) + 2);
        sb.append("{");
        int i = 0;
        jec0 jec0Var = new jec0(this, i);
        while (jec0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            jec0Var.m53090o(sb);
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        oec0 oec0Var = this.f142664X;
        if (oec0Var != null) {
            return oec0Var;
        }
        oec0 oec0Var2 = new oec0(this, 0);
        this.f142664X = oec0Var2;
        return oec0Var2;
    }

    public mec0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iM79965a = t36.m79965a(i);
        this.f142667a = objArr;
        this.f142668b = null;
        this.f142669c = iArr;
        this.f142670d = new int[iM79965a];
        this.f142671e = 2;
        this.f142672f = 0;
        this.f142673g = t36.m79966e(iM79965a);
    }
}
