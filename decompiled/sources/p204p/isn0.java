package p204p;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class isn0 extends AbstractC2366s8 implements Collection, qq60 {

    /* JADX INFO: renamed from: a */
    public AbstractC2563x8 f105272a;

    /* JADX INFO: renamed from: b */
    public Object[] f105273b;

    /* JADX INFO: renamed from: c */
    public Object[] f105274c;

    /* JADX INFO: renamed from: d */
    public int f105275d;

    /* JADX INFO: renamed from: e */
    public on3 f105276e = new on3(false);

    /* JADX INFO: renamed from: f */
    public Object[] f105277f;

    /* JADX INFO: renamed from: g */
    public Object[] f105278g;

    /* JADX INFO: renamed from: h */
    public int f105279h;

    public isn0(AbstractC2563x8 abstractC2563x8, Object[] objArr, Object[] objArr2, int i) {
        this.f105272a = abstractC2563x8;
        this.f105273b = objArr;
        this.f105274c = objArr2;
        this.f105275d = i;
        this.f105277f = objArr;
        this.f105278g = objArr2;
        this.f105279h = abstractC2563x8.mo33075a();
    }

    /* JADX INFO: renamed from: e */
    public static void m51547e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX INFO: renamed from: A */
    public final int m51548A(gh00 gh00Var, Object[] objArr, int i, int i2, bre breVar, ArrayList arrayList, ArrayList arrayList2) {
        if (m51562n(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) breVar.f30082a;
        Object[] objArrM51566r = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) gh00Var.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArrM51566r = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m51566r();
                    i2 = 0;
                }
                objArrM51566r[i2] = obj;
                i2++;
            }
        }
        breVar.f30082a = objArrM51566r;
        if (objArr2 != objArrM51566r) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: B */
    public final int m51549B(gh00 gh00Var, Object[] objArr, int i, bre breVar) {
        Object[] objArrM51564p = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) gh00Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrM51564p = m51564p(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM51564p[i2] = obj;
                i2++;
            }
        }
        breVar.f30082a = objArrM51564p;
        return i2;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m51550C(gh00 gh00Var) {
        Object[] objArrM51571w;
        int i;
        gh00 gh00Var2 = gh00Var;
        int iM51556I = m51556I();
        Object[] objArrM51568t = null;
        bre breVar = new bre(null);
        boolean z = false;
        if (this.f105277f == null) {
            int iM51549B = m51549B(gh00Var2, this.f105278g, iM51556I, breVar);
            if (iM51549B == iM51556I) {
                iM51549B = iM51556I;
            } else {
                Object[] objArr = (Object[]) breVar.f30082a;
                Arrays.fill(objArr, iM51549B, iM51556I, (Object) null);
                this.f105278g = objArr;
                this.f105279h -= iM51556I - iM51549B;
            }
            if (iM51549B != iM51556I) {
                z = true;
            }
        } else {
            AbstractC2246p7 abstractC2246p7M51563o = m51563o(0);
            int iM51549B2 = 32;
            while (iM51549B2 == 32 && abstractC2246p7M51563o.hasNext()) {
                iM51549B2 = m51549B(gh00Var2, (Object[]) abstractC2246p7M51563o.next(), 32, breVar);
            }
            if (iM51549B2 == 32) {
                int iM51549B3 = m51549B(gh00Var2, this.f105278g, iM51556I, breVar);
                if (iM51549B3 == iM51556I) {
                    iM51549B3 = iM51556I;
                } else {
                    Object[] objArr2 = (Object[]) breVar.f30082a;
                    Arrays.fill(objArr2, iM51549B3, iM51556I, (Object) null);
                    this.f105278g = objArr2;
                    this.f105279h -= iM51556I - iM51549B3;
                }
                if (iM51549B3 == 0) {
                    m51570v(this.f105279h, this.f105275d, this.f105277f);
                }
                if (iM51549B3 != iM51556I) {
                }
            } else {
                int i2 = (abstractC2246p7M51563o.f174531a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM51548A = iM51549B2;
                while (abstractC2246p7M51563o.hasNext()) {
                    iM51548A = m51548A(gh00Var2, (Object[]) abstractC2246p7M51563o.next(), 32, iM51548A, breVar, arrayList2, arrayList);
                    gh00Var2 = gh00Var;
                }
                int iM51548A2 = m51548A(gh00Var, this.f105278g, iM51556I, iM51548A, breVar, arrayList2, arrayList);
                Object[] objArr3 = (Object[]) breVar.f30082a;
                Arrays.fill(objArr3, iM51548A2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrM51571w = this.f105277f;
                    wj50.m88279p(objArrM51571w);
                } else {
                    objArrM51571w = m51571w(this.f105277f, i2, this.f105275d, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    lfq0.m58913a("invalid size");
                }
                if (size == 0) {
                    this.f105275d = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.f105275d;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.f105275d = i - 5;
                        objArrM51571w = objArrM51571w[0];
                    }
                    objArrM51568t = m51568t(i3, i, objArrM51571w);
                }
                this.f105277f = objArrM51568t;
                this.f105278g = objArr3;
                this.f105279h = size + iM51548A2;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    /* JADX INFO: renamed from: D */
    public final Object[] m51551D(Object[] objArr, int i, int i2, bre breVar) {
        int iM44516w = geg1.m44516w(i2, i);
        if (i == 0) {
            Object obj = objArr[iM44516w];
            Object[] objArrM51564p = m51564p(objArr);
            int i3 = iM44516w + 1;
            System.arraycopy(objArr, i3, objArrM51564p, iM44516w, 32 - i3);
            objArrM51564p[31] = breVar.f30082a;
            breVar.f30082a = obj;
            return objArrM51564p;
        }
        int iM44516w2 = objArr[31] == null ? geg1.m44516w(m51553F() - 1, i) : 31;
        Object[] objArrM51564p2 = m51564p(objArr);
        int i4 = i - 5;
        int i5 = iM44516w + 1;
        if (i5 <= iM44516w2) {
            while (true) {
                objArrM51564p2[iM44516w2] = m51551D((Object[]) objArrM51564p2[iM44516w2], i4, 0, breVar);
                if (iM44516w2 == i5) {
                    break;
                }
                iM44516w2--;
            }
        }
        objArrM51564p2[iM44516w] = m51551D((Object[]) objArrM51564p2[iM44516w], i4, i2, breVar);
        return objArrM51564p2;
    }

    /* JADX INFO: renamed from: E */
    public final Object m51552E(Object[] objArr, int i, int i2, int i3) {
        int iMo47661a = mo47661a() - i;
        if (iMo47661a == 1) {
            Object obj = this.f105278g[0];
            m51570v(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.f105278g;
        Object obj2 = objArr2[i3];
        Object[] objArrM51564p = m51564p(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, objArrM51564p, i3, iMo47661a - i4);
        objArrM51564p[iMo47661a - 1] = null;
        this.f105277f = objArr;
        this.f105278g = objArrM51564p;
        this.f105279h = (i + iMo47661a) - 1;
        this.f105275d = i2;
        return obj2;
    }

    /* JADX INFO: renamed from: F */
    public final int m51553F() {
        int i = this.f105279h;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX INFO: renamed from: G */
    public final Object[] m51554G(Object[] objArr, int i, int i2, Object obj, bre breVar) {
        int iM44516w = geg1.m44516w(i2, i);
        Object[] objArrM51564p = m51564p(objArr);
        if (i != 0) {
            objArrM51564p[iM44516w] = m51554G((Object[]) objArrM51564p[iM44516w], i - 5, i2, obj, breVar);
            return objArrM51564p;
        }
        if (objArrM51564p != objArr) {
            ((AbstractList) this).modCount++;
        }
        breVar.f30082a = objArrM51564p[iM44516w];
        objArrM51564p[iM44516w] = obj;
        return objArrM51564p;
    }

    /* JADX INFO: renamed from: H */
    public final void m51555H(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM51566r;
        if (i3 < 1) {
            lfq0.m58913a("requires at least one nullBuffer");
        }
        Object[] objArrM51564p = m51564p(objArr);
        objArr2[0] = objArrM51564p;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            bk5.m29629p0(size + 1, i4, i2, objArrM51564p, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM51566r = objArrM51564p;
            } else {
                objArrM51566r = m51566r();
                i3--;
                objArr2[i3] = objArrM51566r;
            }
            int i7 = i2 - i6;
            bk5.m29629p0(0, i7, i2, objArrM51564p, objArr3);
            bk5.m29629p0(size + 1, i4, i7, objArrM51564p, objArrM51566r);
            objArr3 = objArrM51566r;
        }
        Iterator it = collection.iterator();
        m51547e(objArrM51564p, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM51566r2 = m51566r();
            m51547e(objArrM51566r2, 0, it);
            objArr2[i8] = objArrM51566r2;
        }
        m51547e(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: I */
    public final int m51556I() {
        int i = this.f105279h;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // p204p.AbstractC2366s8
    /* JADX INFO: renamed from: a */
    public final int mo47661a() {
        return this.f105279h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        hdi.m47242s(i, mo47661a());
        if (i == mo47661a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM51553F = m51553F();
        if (i >= iM51553F) {
            m51561l(i - iM51553F, obj, this.f105277f);
            return;
        }
        bre breVar = new bre(null);
        Object[] objArr = this.f105277f;
        wj50.m88279p(objArr);
        m51561l(0, breVar.f30082a, m51560j(objArr, this.f105275d, i, obj, breVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        isn0 isn0Var;
        Object[] objArrM51566r;
        hdi.m47242s(i, this.f105279h);
        if (i == this.f105279h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f105279h - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f105278g;
            Object[] objArrM51564p = m51564p(objArr);
            System.arraycopy(objArr, i3, objArrM51564p, size2 + 1, m51556I() - i3);
            m51547e(objArrM51564p, i3, collection.iterator());
            this.f105278g = objArrM51564p;
            this.f105279h = collection.size() + this.f105279h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM51556I = m51556I();
        int size3 = collection.size() + this.f105279h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m51553F()) {
            objArrM51566r = m51566r();
            collection2 = collection;
            m51555H(collection2, i, this.f105278g, iM51556I, objArr2, size, objArrM51566r);
            isn0Var = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            isn0Var = this;
            if (size3 > iM51556I) {
                int i4 = size3 - iM51556I;
                Object[] objArrM51565q = m51565q(i4, isn0Var.f105278g);
                isn0Var.m51559i(collection2, i, i4, objArr2, size, objArrM51565q);
                objArr2 = objArr2;
                objArrM51566r = objArrM51565q;
            } else {
                Object[] objArr3 = isn0Var.f105278g;
                objArrM51566r = m51566r();
                int i5 = iM51556I - size3;
                System.arraycopy(objArr3, i5, objArrM51566r, 0, iM51556I - i5);
                int i6 = 32 - i5;
                Object[] objArrM51565q2 = m51565q(i6, isn0Var.f105278g);
                int i7 = size - 1;
                objArr2[i7] = objArrM51565q2;
                isn0Var.m51559i(collection2, i, i6, objArr2, i7, objArrM51565q2);
                collection2 = collection2;
            }
        }
        isn0Var.f105277f = m51572x(isn0Var.f105277f, i2, objArr2);
        isn0Var.f105278g = objArrM51566r;
        isn0Var.f105279h = collection2.size() + isn0Var.f105279h;
        return true;
    }

    @Override // p204p.AbstractC2366s8
    /* JADX INFO: renamed from: b */
    public final Object mo47662b(int i) {
        hdi.m47241r(i, mo47661a());
        ((AbstractList) this).modCount++;
        int iM51553F = m51553F();
        if (i >= iM51553F) {
            return m51552E(this.f105277f, iM51553F, this.f105275d, i - iM51553F);
        }
        bre breVar = new bre(this.f105278g[0]);
        Object[] objArr = this.f105277f;
        wj50.m88279p(objArr);
        m51552E(m51551D(objArr, this.f105275d, i, breVar), iM51553F, this.f105275d, 0);
        return breVar.f30082a;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2563x8 m51557d() {
        AbstractC2563x8 gsn0Var;
        Object[] objArr = this.f105277f;
        if (objArr == this.f105273b && this.f105278g == this.f105274c) {
            gsn0Var = this.f105272a;
        } else {
            this.f105276e = new on3(false);
            this.f105273b = objArr;
            Object[] objArr2 = this.f105278g;
            this.f105274c = objArr2;
            if (objArr == null) {
                gsn0Var = objArr2.length == 0 ? mv21.f147495b : new mv21(Arrays.copyOf(this.f105278g, mo47661a()));
            } else {
                wj50.m88279p(objArr);
                gsn0Var = new gsn0(mo47661a(), this.f105275d, objArr, this.f105278g);
            }
        }
        this.f105272a = gsn0Var;
        return gsn0Var;
    }

    /* JADX INFO: renamed from: f */
    public final int m51558f() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        hdi.m47241r(i, mo47661a());
        if (m51553F() <= i) {
            objArr = this.f105278g;
        } else {
            objArr = this.f105277f;
            wj50.m88279p(objArr);
            for (int i2 = this.f105275d; i2 > 0; i2 -= 5) {
                objArr = (Object[]) objArr[geg1.m44516w(i, i2)];
            }
        }
        return objArr[i & 31];
    }

    /* JADX INFO: renamed from: i */
    public final void m51559i(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f105277f == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        AbstractC2246p7 abstractC2246p7M51563o = m51563o(m51553F() >> 5);
        int i5 = i3;
        Object[] objArrM51565q = objArr2;
        while (abstractC2246p7M51563o.f174531a - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC2246p7M51563o.previous();
            bk5.m29629p0(0, 32 - i2, 32, objArr3, objArrM51565q);
            objArrM51565q = m51565q(i2, objArr3);
            i5--;
            objArr[i5] = objArrM51565q;
        }
        Object[] objArr4 = (Object[]) abstractC2246p7M51563o.previous();
        int iM51553F = i3 - (((m51553F() >> 5) - 1) - i4);
        if (iM51553F < i3) {
            objArr2 = objArr[iM51553F];
            wj50.m88279p(objArr2);
        }
        m51555H(collection, i, objArr4, 32, objArr, iM51553F, objArr2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final Object[] m51560j(Object[] objArr, int i, int i2, Object obj, bre breVar) {
        Object obj2;
        int iM44516w = geg1.m44516w(i2, i);
        if (i == 0) {
            breVar.f30082a = objArr[31];
            Object[] objArrM51564p = m51564p(objArr);
            System.arraycopy(objArr, iM44516w, objArrM51564p, iM44516w + 1, 31 - iM44516w);
            objArrM51564p[iM44516w] = obj;
            return objArrM51564p;
        }
        Object[] objArrM51564p2 = m51564p(objArr);
        int i3 = i - 5;
        objArrM51564p2[iM44516w] = m51560j((Object[]) objArrM51564p2[iM44516w], i3, i2, obj, breVar);
        while (true) {
            iM44516w++;
            if (iM44516w >= 32 || (obj2 = objArrM51564p2[iM44516w]) == null) {
                break;
            }
            objArrM51564p2[iM44516w] = m51560j((Object[]) obj2, i3, 0, breVar.f30082a, breVar);
        }
        return objArrM51564p2;
    }

    /* JADX INFO: renamed from: l */
    public final void m51561l(int i, Object obj, Object[] objArr) {
        int iM51556I = m51556I();
        Object[] objArrM51564p = m51564p(this.f105278g);
        if (iM51556I >= 32) {
            Object[] objArr2 = this.f105278g;
            Object obj2 = objArr2[31];
            bk5.m29629p0(i + 1, i, 31, objArr2, objArrM51564p);
            objArrM51564p[i] = obj;
            m51573y(objArr, objArrM51564p, m51567s(obj2));
            return;
        }
        bk5.m29629p0(i + 1, i, iM51556I, this.f105278g, objArrM51564p);
        objArrM51564p[i] = obj;
        this.f105277f = objArr;
        this.f105278g = objArrM51564p;
        this.f105279h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        hdi.m47242s(i, this.f105279h);
        return new msn0(this, i);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m51562n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f105276e;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC2246p7 m51563o(int i) {
        Object[] objArr = this.f105277f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iM51553F = m51553F() >> 5;
        hdi.m47242s(i, iM51553F);
        int i2 = this.f105275d;
        return i2 == 0 ? new le21(objArr, i) : new kj91(objArr, i, iM51553F, i2 / 5);
    }

    /* JADX INFO: renamed from: p */
    public final Object[] m51564p(Object[] objArr) {
        if (objArr == null) {
            return m51566r();
        }
        if (m51562n(objArr)) {
            return objArr;
        }
        Object[] objArrM51566r = m51566r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        bk5.m29636u0(0, length, 6, objArr, objArrM51566r);
        return objArrM51566r;
    }

    /* JADX INFO: renamed from: q */
    public final Object[] m51565q(int i, Object[] objArr) {
        if (m51562n(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] objArrM51566r = m51566r();
        System.arraycopy(objArr, 0, objArrM51566r, i, 32 - i);
        return objArrM51566r;
    }

    /* JADX INFO: renamed from: r */
    public final Object[] m51566r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f105276e;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m51550C(new C2486v8(1, collection));
    }

    /* JADX INFO: renamed from: s */
    public final Object[] m51567s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f105276e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        hdi.m47241r(i, mo47661a());
        if (m51553F() > i) {
            bre breVar = new bre(null);
            Object[] objArr = this.f105277f;
            wj50.m88279p(objArr);
            this.f105277f = m51554G(objArr, this.f105275d, i, obj, breVar);
            return breVar.f30082a;
        }
        Object[] objArrM51564p = m51564p(this.f105278g);
        if (objArrM51564p != this.f105278g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM51564p[i2];
        objArrM51564p[i2] = obj;
        this.f105278g = objArrM51564p;
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public final Object[] m51568t(int i, int i2, Object[] objArr) {
        if (!(i2 >= 0)) {
            lfq0.m58913a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM44516w = geg1.m44516w(i, i2);
        Object objM51568t = m51568t(i, i2 - 5, (Object[]) objArr[iM44516w]);
        if (iM44516w < 31) {
            int i3 = iM44516w + 1;
            if (objArr[i3] != null) {
                if (m51562n(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM51566r = m51566r();
                System.arraycopy(objArr, 0, objArrM51566r, 0, i3);
                objArr = objArrM51566r;
            }
        }
        if (objM51568t == objArr[iM44516w]) {
            return objArr;
        }
        Object[] objArrM51564p = m51564p(objArr);
        objArrM51564p[iM44516w] = objM51568t;
        return objArrM51564p;
    }

    /* JADX INFO: renamed from: u */
    public final Object[] m51569u(Object[] objArr, int i, int i2, bre breVar) {
        Object[] objArrM51569u;
        int iM44516w = geg1.m44516w(i2 - 1, i);
        if (i == 5) {
            breVar.f30082a = objArr[iM44516w];
            objArrM51569u = null;
        } else {
            objArrM51569u = m51569u((Object[]) objArr[iM44516w], i - 5, i2, breVar);
        }
        if (objArrM51569u == null && iM44516w == 0) {
            return null;
        }
        Object[] objArrM51564p = m51564p(objArr);
        objArrM51564p[iM44516w] = objArrM51569u;
        return objArrM51564p;
    }

    /* JADX INFO: renamed from: v */
    public final void m51570v(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.f105277f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f105278g = objArr;
            this.f105279h = i;
            this.f105275d = i2;
            return;
        }
        bre breVar = new bre(null);
        wj50.m88279p(objArr);
        Object[] objArrM51569u = m51569u(objArr, i2, i, breVar);
        wj50.m88279p(objArrM51569u);
        this.f105278g = (Object[]) breVar.f30082a;
        this.f105279h = i;
        if (objArrM51569u[1] == null) {
            this.f105277f = (Object[]) objArrM51569u[0];
            this.f105275d = i2 - 5;
        } else {
            this.f105277f = objArrM51569u;
            this.f105275d = i2;
        }
    }

    /* JADX INFO: renamed from: w */
    public final Object[] m51571w(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            lfq0.m58913a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            lfq0.m58913a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM51564p = m51564p(objArr);
        int iM44516w = geg1.m44516w(i, i2);
        int i3 = i2 - 5;
        objArrM51564p[iM44516w] = m51571w((Object[]) objArrM51564p[iM44516w], i, i3, it);
        while (true) {
            iM44516w++;
            if (iM44516w >= 32 || !it.hasNext()) {
                break;
            }
            objArrM51564p[iM44516w] = m51571w((Object[]) objArrM51564p[iM44516w], 0, i3, it);
        }
        return objArrM51564p;
    }

    /* JADX INFO: renamed from: x */
    public final Object[] m51572x(Object[] objArr, int i, Object[][] objArr2) {
        C2042k7 c2042k7 = new C2042k7(objArr2, 1);
        int i2 = i >> 5;
        int i3 = this.f105275d;
        Object[] objArrM51571w = i2 < (1 << i3) ? m51571w(objArr, i, i3, c2042k7) : m51564p(objArr);
        while (c2042k7.hasNext()) {
            this.f105275d += 5;
            objArrM51571w = m51567s(objArrM51571w);
            int i4 = this.f105275d;
            m51571w(objArrM51571w, 1 << i4, i4, c2042k7);
        }
        return objArrM51571w;
    }

    /* JADX INFO: renamed from: y */
    public final void m51573y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f105279h;
        int i2 = i >> 5;
        int i3 = this.f105275d;
        if (i2 > (1 << i3)) {
            this.f105277f = m51574z(this.f105275d + 5, m51567s(objArr), objArr2);
            this.f105278g = objArr3;
            this.f105275d += 5;
            this.f105279h++;
            return;
        }
        if (objArr == null) {
            this.f105277f = objArr2;
            this.f105278g = objArr3;
            this.f105279h = i + 1;
        } else {
            this.f105277f = m51574z(i3, objArr, objArr2);
            this.f105278g = objArr3;
            this.f105279h++;
        }
    }

    /* JADX INFO: renamed from: z */
    public final Object[] m51574z(int i, Object[] objArr, Object[] objArr2) {
        int iM44516w = geg1.m44516w(mo47661a() - 1, i);
        Object[] objArrM51564p = m51564p(objArr);
        if (i == 5) {
            objArrM51564p[iM44516w] = objArr2;
            return objArrM51564p;
        }
        objArrM51564p[iM44516w] = m51574z(i - 5, (Object[]) objArrM51564p[iM44516w], objArr2);
        return objArrM51564p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM51556I = m51556I();
        if (iM51556I < 32) {
            Object[] objArrM51564p = m51564p(this.f105278g);
            objArrM51564p[iM51556I] = obj;
            this.f105278g = objArrM51564p;
            this.f105279h = mo47661a() + 1;
        } else {
            m51573y(this.f105277f, this.f105278g, m51567s(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM51556I = m51556I();
        Iterator it = collection.iterator();
        if (32 - iM51556I >= collection.size()) {
            Object[] objArrM51564p = m51564p(this.f105278g);
            m51547e(objArrM51564p, iM51556I, it);
            this.f105278g = objArrM51564p;
            this.f105279h = collection.size() + this.f105279h;
            return true;
        }
        int size = ((collection.size() + iM51556I) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM51564p2 = m51564p(this.f105278g);
        m51547e(objArrM51564p2, iM51556I, it);
        objArr[0] = objArrM51564p2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM51566r = m51566r();
            m51547e(objArrM51566r, 0, it);
            objArr[i] = objArrM51566r;
        }
        this.f105277f = m51572x(this.f105277f, m51553F(), objArr);
        Object[] objArrM51566r2 = m51566r();
        m51547e(objArrM51566r2, 0, it);
        this.f105278g = objArrM51566r2;
        this.f105279h = collection.size() + this.f105279h;
        return true;
    }
}
