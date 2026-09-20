package p204p;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zif1 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: t */
    public static final Object f283154t = new Object();

    /* JADX INFO: renamed from: a */
    public transient Object f283155a;

    /* JADX INFO: renamed from: b */
    public transient int[] f283156b;

    /* JADX INFO: renamed from: c */
    public transient Object[] f283157c;

    /* JADX INFO: renamed from: d */
    public transient Object[] f283158d;

    /* JADX INFO: renamed from: e */
    public transient int f283159e = Math.min(Math.max(12, 1), 1073741823);

    /* JADX INFO: renamed from: f */
    public transient int f283160f;

    /* JADX INFO: renamed from: g */
    public transient qhf1 f283161g;

    /* JADX INFO: renamed from: h */
    public transient qhf1 f283162h;

    /* JADX INFO: renamed from: i */
    public transient C2247p8 f283163i;

    /* JADX INFO: renamed from: a */
    public final int[] m96204a() {
        int[] iArr = this.f283156b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m96205b() {
        Object[] objArr = this.f283157c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    public final Object[] m96206c() {
        Object[] objArr = this.f283158d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m96209f()) {
            return;
        }
        this.f283159e += 32;
        Map mapM96207d = m96207d();
        if (mapM96207d != null) {
            this.f283159e = Math.min(Math.max(size(), 3), 1073741823);
            mapM96207d.clear();
            this.f283155a = null;
            this.f283160f = 0;
            return;
        }
        Arrays.fill(m96205b(), 0, this.f283160f, (Object) null);
        Arrays.fill(m96206c(), 0, this.f283160f, (Object) null);
        Object obj = this.f283155a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m96204a(), 0, this.f283160f, 0);
        this.f283160f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM96207d = m96207d();
        if (mapM96207d != null) {
            return mapM96207d.containsKey(obj);
        }
        return m96211h(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM96207d = m96207d();
        if (mapM96207d != null) {
            return mapM96207d.containsValue(obj);
        }
        for (int i = 0; i < this.f283160f; i++) {
            if (qvf1.m74003H(obj, m96206c()[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Map m96207d() {
        Object obj = this.f283155a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m96208e(int i, int i2) {
        Object obj = this.f283155a;
        Objects.requireNonNull(obj);
        int[] iArrM96204a = m96204a();
        Object[] objArrM96205b = m96205b();
        Object[] objArrM96206c = m96206c();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrM96205b[i] = null;
            objArrM96206c[i] = null;
            iArrM96204a[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrM96205b[i3];
        objArrM96205b[i] = obj2;
        objArrM96206c[i] = objArrM96206c[i3];
        objArrM96205b[i3] = null;
        objArrM96206c[i3] = null;
        iArrM96204a[i] = iArrM96204a[i3];
        iArrM96204a[i3] = 0;
        int iM52804z = ja61.m52804z(obj2) & i2;
        int iM39350t = el51.m39350t(iM52804z, obj);
        if (iM39350t == size) {
            el51.m39352v(iM52804z, i4, obj);
            return;
        }
        while (true) {
            int i5 = iM39350t - 1;
            int i6 = iArrM96204a[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrM96204a[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            iM39350t = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        qhf1 qhf1Var = this.f283162h;
        if (qhf1Var != null) {
            return qhf1Var;
        }
        qhf1 qhf1Var2 = new qhf1(this, 0);
        this.f283162h = qhf1Var2;
        return qhf1Var2;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m96209f() {
        return this.f283155a == null;
    }

    /* JADX INFO: renamed from: g */
    public final int m96210g() {
        return (1 << (this.f283159e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM96207d = m96207d();
        if (mapM96207d != null) {
            return mapM96207d.get(obj);
        }
        int iM96211h = m96211h(obj);
        if (iM96211h == -1) {
            return null;
        }
        return m96206c()[iM96211h];
    }

    /* JADX INFO: renamed from: h */
    public final int m96211h(Object obj) {
        if (m96209f()) {
            return -1;
        }
        int iM52804z = ja61.m52804z(obj);
        int iM96210g = m96210g();
        Object obj2 = this.f283155a;
        Objects.requireNonNull(obj2);
        int iM39350t = el51.m39350t(iM52804z & iM96210g, obj2);
        if (iM39350t != 0) {
            int i = ~iM96210g;
            int i2 = iM52804z & i;
            do {
                int i3 = iM39350t - 1;
                int i4 = m96204a()[i3];
                if ((i4 & i) == i2 && qvf1.m74003H(obj, m96205b()[i3])) {
                    return i3;
                }
                iM39350t = i4 & iM96210g;
            } while (iM39350t != 0);
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public final int m96212i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objM39351u = el51.m39351u(i2);
        if (i4 != 0) {
            el51.m39352v(i3 & i5, i4 + 1, objM39351u);
        }
        Object obj = this.f283155a;
        Objects.requireNonNull(obj);
        int[] iArrM96204a = m96204a();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM39350t = el51.m39350t(i6, obj);
            while (iM39350t != 0) {
                int i7 = iM39350t - 1;
                int i8 = iArrM96204a[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM39350t2 = el51.m39350t(i10, objM39351u);
                el51.m39352v(i10, iM39350t, objM39351u);
                iArrM96204a[i7] = ((~i5) & i9) | (iM39350t2 & i5);
                iM39350t = i8 & i;
            }
        }
        this.f283155a = objM39351u;
        this.f283159e = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.f283159e & (-32));
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m96213j(Object obj) {
        if (!m96209f()) {
            int iM96210g = m96210g();
            Object obj2 = this.f283155a;
            Objects.requireNonNull(obj2);
            int iM39349s = el51.m39349s(obj, null, iM96210g, obj2, m96204a(), m96205b(), null);
            if (iM39349s != -1) {
                Object obj3 = m96206c()[iM39349s];
                m96208e(iM39349s, iM96210g);
                this.f283160f--;
                this.f283159e += 32;
                return obj3;
            }
        }
        return f283154t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        qhf1 qhf1Var = this.f283161g;
        if (qhf1Var != null) {
            return qhf1Var;
        }
        qhf1 qhf1Var2 = new qhf1(this, 1);
        this.f283161g = qhf1Var2;
        return qhf1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (m96209f()) {
            if (!m96209f()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i3 = this.f283159e;
            int iMax = Math.max(i3 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f283155a = el51.m39351u(iMax2);
            this.f283159e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f283159e & (-32));
            this.f283156b = new int[i3];
            this.f283157c = new Object[i3];
            this.f283158d = new Object[i3];
        }
        Map mapM96207d = m96207d();
        if (mapM96207d != null) {
            return mapM96207d.put(obj, obj2);
        }
        int[] iArrM96204a = m96204a();
        Object[] objArrM96205b = m96205b();
        Object[] objArrM96206c = m96206c();
        int i4 = this.f283160f;
        int i5 = i4 + 1;
        int iM52804z = ja61.m52804z(obj);
        int iM96210g = m96210g();
        int i6 = iM52804z & iM96210g;
        Object obj3 = this.f283155a;
        Objects.requireNonNull(obj3);
        int iM39350t = el51.m39350t(i6, obj3);
        if (iM39350t == 0) {
            if (i5 > iM96210g) {
                iM96210g = m96212i(iM96210g, (iM96210g + 1) * (iM96210g < 32 ? 4 : 2), iM52804z, i4);
            } else {
                Object obj4 = this.f283155a;
                Objects.requireNonNull(obj4);
                el51.m39352v(i6, i5, obj4);
            }
            i = 1;
        } else {
            int i7 = ~iM96210g;
            int i8 = iM52804z & i7;
            int i9 = 0;
            while (true) {
                int i10 = iM39350t - 1;
                int i11 = iArrM96204a[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && qvf1.m74003H(obj, objArrM96205b[i10])) {
                    Object obj5 = objArrM96206c[i10];
                    objArrM96206c[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & iM96210g;
                int i15 = i9 + 1;
                if (i14 == 0) {
                    if (i15 < 9) {
                        if (i5 <= iM96210g) {
                            iArrM96204a[i10] = (i5 & iM96210g) | i12;
                            break;
                        }
                        iM96210g = m96212i(iM96210g, (iM96210g + 1) * (iM96210g < i13 ? 4 : 2), iM52804z, i4);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m96210g() + 1, 1.0f);
                    int i16 = isEmpty() ? -1 : 0;
                    while (i16 >= 0) {
                        linkedHashMap.put(m96205b()[i16], m96206c()[i16]);
                        int i17 = i16 + 1;
                        i16 = i17 < this.f283160f ? i17 : -1;
                    }
                    this.f283155a = linkedHashMap;
                    this.f283156b = null;
                    this.f283157c = null;
                    this.f283158d = null;
                    this.f283159e += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                i9 = i15;
                iM39350t = i14;
                i2 = i13;
            }
        }
        int length = m96204a().length;
        if (i5 > length) {
            int i18 = i;
            int iMin = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (iMin != length) {
                this.f283156b = Arrays.copyOf(m96204a(), iMin);
                this.f283157c = Arrays.copyOf(m96205b(), iMin);
                this.f283158d = Arrays.copyOf(m96206c(), iMin);
            }
        }
        m96204a()[i4] = (~iM96210g) & iM52804z;
        m96205b()[i4] = obj;
        m96206c()[i4] = obj2;
        this.f283160f = i5;
        this.f283159e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM96207d = m96207d();
        if (mapM96207d != null) {
            return mapM96207d.remove(obj);
        }
        Object objM96213j = m96213j(obj);
        if (objM96213j == f283154t) {
            return null;
        }
        return objM96213j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM96207d = m96207d();
        return mapM96207d != null ? mapM96207d.size() : this.f283160f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C2247p8 c2247p8 = this.f283163i;
        if (c2247p8 != null) {
            return c2247p8;
        }
        C2247p8 c2247p9 = new C2247p8((Object) this, 5);
        this.f283163i = c2247p9;
        return c2247p9;
    }
}
