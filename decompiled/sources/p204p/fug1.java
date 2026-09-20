package p204p;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fug1 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: t */
    public static final Object f73495t = new Object();

    /* JADX INFO: renamed from: a */
    public transient Object f73496a;

    /* JADX INFO: renamed from: b */
    public transient int[] f73497b;

    /* JADX INFO: renamed from: c */
    public transient Object[] f73498c;

    /* JADX INFO: renamed from: d */
    public transient Object[] f73499d;

    /* JADX INFO: renamed from: e */
    public transient int f73500e = xtf1.m92025M(3, 1);

    /* JADX INFO: renamed from: f */
    public transient int f73501f;

    /* JADX INFO: renamed from: g */
    public transient xtg1 f73502g;

    /* JADX INFO: renamed from: h */
    public transient xtg1 f73503h;

    /* JADX INFO: renamed from: i */
    public transient C2247p8 f73504i;

    /* JADX INFO: renamed from: a */
    public final Object[] m42729a() {
        Object[] objArr = this.f73498c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m42730b() {
        Object[] objArr = this.f73499d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m42731c() {
        return this.f73496a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m42731c()) {
            return;
        }
        this.f73500e += 32;
        Map mapM42732d = m42732d();
        if (mapM42732d != null) {
            this.f73500e = xtf1.m92025M(size(), 3);
            mapM42732d.clear();
            this.f73496a = null;
            this.f73501f = 0;
            return;
        }
        Arrays.fill(m42729a(), 0, this.f73501f, (Object) null);
        Arrays.fill(m42730b(), 0, this.f73501f, (Object) null);
        Object obj = this.f73496a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m42738j(), 0, this.f73501f, 0);
        this.f73501f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM42732d = m42732d();
        if (mapM42732d != null) {
            return mapM42732d.containsKey(obj);
        }
        return m42736h(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM42732d = m42732d();
        if (mapM42732d != null) {
            return mapM42732d.containsValue(obj);
        }
        for (int i = 0; i < this.f73501f; i++) {
            if (Objects.equals(obj, m42730b()[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Map m42732d() {
        Object obj = this.f73496a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m42733e(int i, int i2) {
        Object obj = this.f73496a;
        Objects.requireNonNull(obj);
        int[] iArrM42738j = m42738j();
        Object[] objArrM42729a = m42729a();
        Object[] objArrM42730b = m42730b();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrM42729a[i] = null;
            objArrM42730b[i] = null;
            iArrM42738j[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrM42729a[i3];
        objArrM42729a[i] = obj2;
        objArrM42730b[i] = objArrM42730b[i3];
        objArrM42729a[i3] = null;
        objArrM42730b[i3] = null;
        iArrM42738j[i] = iArrM42738j[i3];
        iArrM42738j[i3] = 0;
        int iM39680P = epv0.m39680P(obj2) & i2;
        int iM92077X = xtm0.m92077X(iM39680P, obj);
        if (iM92077X == size) {
            xtm0.m92078Y(iM39680P, i4, obj);
            return;
        }
        while (true) {
            int i5 = iM92077X - 1;
            int i6 = iArrM42738j[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrM42738j[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            iM92077X = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        xtg1 xtg1Var = this.f73503h;
        if (xtg1Var != null) {
            return xtg1Var;
        }
        xtg1 xtg1Var2 = new xtg1(this, 0);
        this.f73503h = xtg1Var2;
        return xtg1Var2;
    }

    /* JADX INFO: renamed from: f */
    public final int m42734f() {
        return (1 << (this.f73500e & 31)) - 1;
    }

    /* JADX INFO: renamed from: g */
    public final int m42735g(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objM92076W = xtm0.m92076W(i2);
        if (i4 != 0) {
            xtm0.m92078Y(i3 & i5, i4 + 1, objM92076W);
        }
        Object obj = this.f73496a;
        Objects.requireNonNull(obj);
        int[] iArrM42738j = m42738j();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM92077X = xtm0.m92077X(i6, obj);
            while (iM92077X != 0) {
                int i7 = iM92077X - 1;
                int i8 = iArrM42738j[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM92077X2 = xtm0.m92077X(i10, objM92076W);
                xtm0.m92078Y(i10, iM92077X, objM92076W);
                iArrM42738j[i7] = ((~i5) & i9) | (iM92077X2 & i5);
                iM92077X = i8 & i;
            }
        }
        this.f73496a = objM92076W;
        this.f73500e = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.f73500e & (-32));
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM42732d = m42732d();
        if (mapM42732d != null) {
            return mapM42732d.get(obj);
        }
        int iM42736h = m42736h(obj);
        if (iM42736h == -1) {
            return null;
        }
        return m42730b()[iM42736h];
    }

    /* JADX INFO: renamed from: h */
    public final int m42736h(Object obj) {
        if (m42731c()) {
            return -1;
        }
        int iM39680P = epv0.m39680P(obj);
        int iM42734f = m42734f();
        Object obj2 = this.f73496a;
        Objects.requireNonNull(obj2);
        int iM92077X = xtm0.m92077X(iM39680P & iM42734f, obj2);
        if (iM92077X != 0) {
            int i = ~iM42734f;
            int i2 = iM39680P & i;
            do {
                int i3 = iM92077X - 1;
                int i4 = m42738j()[i3];
                if ((i4 & i) == i2 && Objects.equals(obj, m42729a()[i3])) {
                    return i3;
                }
                iM92077X = i4 & iM42734f;
            } while (iM92077X != 0);
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public final Object m42737i(Object obj) {
        if (!m42731c()) {
            int iM42734f = m42734f();
            Object obj2 = this.f73496a;
            Objects.requireNonNull(obj2);
            int iM92079Z = xtm0.m92079Z(obj, null, iM42734f, obj2, m42738j(), m42729a(), null);
            if (iM92079Z != -1) {
                Object obj3 = m42730b()[iM92079Z];
                m42733e(iM92079Z, iM42734f);
                this.f73501f--;
                this.f73500e += 32;
                return obj3;
            }
        }
        return f73495t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final int[] m42738j() {
        int[] iArr = this.f73497b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        xtg1 xtg1Var = this.f73502g;
        if (xtg1Var != null) {
            return xtg1Var;
        }
        xtg1 xtg1Var2 = new xtg1(this, 1);
        this.f73502g = xtg1Var2;
        return xtg1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (m42731c()) {
            bnf1.m29983s(m42731c(), "Arrays already allocated");
            int i3 = this.f73500e;
            int iMax = Math.max(i3 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f73496a = xtm0.m92076W(iMax2);
            this.f73500e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f73500e & (-32));
            this.f73497b = new int[i3];
            this.f73498c = new Object[i3];
            this.f73499d = new Object[i3];
        }
        Map mapM42732d = m42732d();
        if (mapM42732d != null) {
            return mapM42732d.put(obj, obj2);
        }
        int[] iArrM42738j = m42738j();
        Object[] objArrM42729a = m42729a();
        Object[] objArrM42730b = m42730b();
        int i4 = this.f73501f;
        int i5 = i4 + 1;
        int iM39680P = epv0.m39680P(obj);
        int iM42734f = m42734f();
        int i6 = iM39680P & iM42734f;
        Object obj3 = this.f73496a;
        Objects.requireNonNull(obj3);
        int iM92077X = xtm0.m92077X(i6, obj3);
        if (iM92077X == 0) {
            if (i5 > iM42734f) {
                iM42734f = m42735g(iM42734f, (iM42734f + 1) * (iM42734f < 32 ? 4 : 2), iM39680P, i4);
            } else {
                Object obj4 = this.f73496a;
                Objects.requireNonNull(obj4);
                xtm0.m92078Y(i6, i5, obj4);
            }
            i = 1;
        } else {
            int i7 = ~iM42734f;
            int i8 = iM39680P & i7;
            int i9 = 0;
            while (true) {
                int i10 = iM92077X - 1;
                int i11 = iArrM42738j[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && Objects.equals(obj, objArrM42729a[i10])) {
                    Object obj5 = objArrM42730b[i10];
                    objArrM42730b[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & iM42734f;
                int i15 = i9 + 1;
                if (i14 == 0) {
                    if (i15 < 9) {
                        if (i5 <= iM42734f) {
                            iArrM42738j[i10] = (i5 & iM42734f) | i12;
                            break;
                        }
                        iM42734f = m42735g(iM42734f, (iM42734f + 1) * (iM42734f < i13 ? 4 : 2), iM39680P, i4);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m42734f() + 1, 1.0f);
                    int i16 = isEmpty() ? -1 : 0;
                    while (i16 >= 0) {
                        linkedHashMap.put(m42729a()[i16], m42730b()[i16]);
                        int i17 = i16 + 1;
                        i16 = i17 < this.f73501f ? i17 : -1;
                    }
                    this.f73496a = linkedHashMap;
                    this.f73497b = null;
                    this.f73498c = null;
                    this.f73499d = null;
                    this.f73500e += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                i9 = i15;
                iM92077X = i14;
                i2 = i13;
            }
        }
        int length = m42738j().length;
        if (i5 > length) {
            int i18 = i;
            int iMin = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (iMin != length) {
                this.f73497b = Arrays.copyOf(m42738j(), iMin);
                this.f73498c = Arrays.copyOf(m42729a(), iMin);
                this.f73499d = Arrays.copyOf(m42730b(), iMin);
            }
        }
        m42738j()[i4] = (~iM42734f) & iM39680P;
        m42729a()[i4] = obj;
        m42730b()[i4] = obj2;
        this.f73501f = i5;
        this.f73500e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM42732d = m42732d();
        if (mapM42732d != null) {
            return mapM42732d.remove(obj);
        }
        Object objM42737i = m42737i(obj);
        if (objM42737i == f73495t) {
            return null;
        }
        return objM42737i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM42732d = m42732d();
        return mapM42732d != null ? mapM42732d.size() : this.f73501f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C2247p8 c2247p8 = this.f73504i;
        if (c2247p8 != null) {
            return c2247p8;
        }
        C2247p8 c2247p9 = new C2247p8((Object) this, 7);
        this.f73504i = c2247p9;
        return c2247p9;
    }
}
