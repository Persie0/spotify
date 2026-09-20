package p204p;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes11.dex */
public final class hsn0 extends AbstractC2366s8 implements zqn0 {

    /* JADX INFO: renamed from: a */
    public AbstractC2524w8 f94762a;

    /* JADX INFO: renamed from: b */
    public Object[] f94763b;

    /* JADX INFO: renamed from: c */
    public Object[] f94764c;

    /* JADX INFO: renamed from: d */
    public int f94765d;

    /* JADX INFO: renamed from: e */
    public oh3 f94766e = new oh3(18);

    /* JADX INFO: renamed from: f */
    public Object[] f94767f;

    /* JADX INFO: renamed from: g */
    public Object[] f94768g;

    /* JADX INFO: renamed from: h */
    public int f94769h;

    public hsn0(AbstractC2524w8 abstractC2524w8, Object[] objArr, Object[] objArr2, int i) {
        this.f94762a = abstractC2524w8;
        this.f94763b = objArr;
        this.f94764c = objArr2;
        this.f94765d = i;
        this.f94767f = objArr;
        this.f94768g = objArr2;
        this.f94769h = abstractC2524w8.mo33075a();
    }

    /* JADX INFO: renamed from: e */
    public static void m48534e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX INFO: renamed from: A */
    public final int m48535A(y9q y9qVar, Object[] objArr, int i, int i2, m680 m680Var, ArrayList arrayList, ArrayList arrayList2) {
        if (m48549n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = m680Var.f140422b;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM48553r = objArr2;
        int i3 = 0;
        while (i3 < i) {
            i3++;
            Object obj2 = objArr[i3];
            if (!((Boolean) y9qVar.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM48553r = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m48553r();
                    i2 = 0;
                }
                objArrM48553r[i2] = obj2;
                i2++;
            }
        }
        m680Var.f140422b = objArrM48553r;
        if (objArr2 != objArrM48553r) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: B */
    public final int m48536B(y9q y9qVar, Object[] objArr, int i, m680 m680Var) {
        int i2 = 0;
        Object[] objArrM48551p = objArr;
        int i3 = i;
        boolean z = false;
        while (i2 < i) {
            int i4 = i2 + 1;
            Object obj = objArr[i2];
            if (((Boolean) y9qVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrM48551p = m48551p(objArr);
                    z = true;
                    i3 = i2;
                }
            } else if (z) {
                i2 = i3 + 1;
                objArrM48551p[i3] = obj;
                i3 = i2;
            }
            i2 = i4;
        }
        m680Var.f140422b = objArrM48551p;
        return i3;
    }

    /* JADX INFO: renamed from: C */
    public final int m48537C(y9q y9qVar, int i, m680 m680Var) {
        int iM48536B = m48536B(y9qVar, this.f94768g, i, m680Var);
        if (iM48536B == i) {
            return i;
        }
        Object obj = m680Var.f140422b;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM48536B, i, (Object) null);
        this.f94768g = objArr;
        this.f94769h -= i - iM48536B;
        return iM48536B;
    }

    /* JADX INFO: renamed from: D */
    public final Object[] m48538D(Object[] objArr, int i, int i2, m680 m680Var) {
        int iM38588i = edg1.m38588i(i2, i);
        if (i == 0) {
            Object obj = objArr[iM38588i];
            Object[] objArrM48551p = m48551p(objArr);
            int i3 = iM38588i + 1;
            System.arraycopy(objArr, i3, objArrM48551p, iM38588i, 32 - i3);
            objArrM48551p[31] = m680Var.f140422b;
            m680Var.f140422b = obj;
            return objArrM48551p;
        }
        int iM38588i2 = objArr[31] == null ? edg1.m38588i(m48540F() - 1, i) : 31;
        Object[] objArrM48551p2 = m48551p(objArr);
        int i4 = i - 5;
        int i5 = iM38588i + 1;
        if (i5 <= iM38588i2) {
            while (true) {
                int i6 = iM38588i2 - 1;
                Object obj2 = objArrM48551p2[iM38588i2];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArrM48551p2[iM38588i2] = m48538D((Object[]) obj2, i4, 0, m680Var);
                if (iM38588i2 == i5) {
                    break;
                }
                iM38588i2 = i6;
            }
        }
        Object obj3 = objArrM48551p2[iM38588i];
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrM48551p2[iM38588i] = m48538D((Object[]) obj3, i4, i2, m680Var);
        return objArrM48551p2;
    }

    /* JADX INFO: renamed from: E */
    public final Object m48539E(Object[] objArr, int i, int i2, int i3) {
        int iMo47661a = mo47661a() - i;
        if (iMo47661a == 1) {
            Object obj = this.f94768g[0];
            m48557v(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.f94768g;
        Object obj2 = objArr2[i3];
        Object[] objArrM48551p = m48551p(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, objArrM48551p, i3, iMo47661a - i4);
        objArrM48551p[iMo47661a - 1] = null;
        this.f94767f = objArr;
        this.f94768g = objArrM48551p;
        this.f94769h = (i + iMo47661a) - 1;
        this.f94765d = i2;
        return obj2;
    }

    /* JADX INFO: renamed from: F */
    public final int m48540F() {
        int i = this.f94769h;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX INFO: renamed from: G */
    public final Object[] m48541G(Object[] objArr, int i, int i2, Object obj, m680 m680Var) {
        int iM38588i = edg1.m38588i(i2, i);
        Object[] objArrM48551p = m48551p(objArr);
        if (i == 0) {
            if (objArrM48551p != objArr) {
                ((AbstractList) this).modCount++;
            }
            m680Var.f140422b = objArrM48551p[iM38588i];
            objArrM48551p[iM38588i] = obj;
            return objArrM48551p;
        }
        Object obj2 = objArrM48551p[iM38588i];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrM48551p[iM38588i] = m48541G((Object[]) obj2, i - 5, i2, obj, m680Var);
        return objArrM48551p;
    }

    /* JADX INFO: renamed from: H */
    public final void m48542H(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM48553r;
        if (i3 < 1) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] objArrM48551p = m48551p(objArr);
        objArr2[0] = objArrM48551p;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            bk5.m29629p0(size + 1, i4, i2, objArrM48551p, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM48553r = objArrM48551p;
            } else {
                objArrM48553r = m48553r();
                i3--;
                objArr2[i3] = objArrM48553r;
            }
            int i7 = i2 - i6;
            bk5.m29629p0(0, i7, i2, objArrM48551p, objArr3);
            bk5.m29629p0(size + 1, i4, i7, objArrM48551p, objArrM48553r);
            objArr3 = objArrM48553r;
        }
        Iterator it = collection.iterator();
        m48534e(objArrM48551p, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM48553r2 = m48553r();
            m48534e(objArrM48553r2, 0, it);
            objArr2[i8] = objArrM48553r2;
        }
        m48534e(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: I */
    public final int m48543I() {
        int i = this.f94769h;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // p204p.AbstractC2366s8
    /* JADX INFO: renamed from: a */
    public final int mo47661a() {
        return this.f94769h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        hxh.m49023j(i, mo47661a());
        if (i == mo47661a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM48540F = m48540F();
        if (i >= iM48540F) {
            m48548l(i - iM48540F, obj, this.f94767f);
            return;
        }
        m680 m680Var = new m680((Object) null, 28);
        Object[] objArr = this.f94767f;
        wj50.m88279p(objArr);
        m48548l(0, m680Var.f140422b, m48546i(objArr, this.f94765d, i, obj, m680Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        hsn0 hsn0Var;
        Object[] objArrM48553r;
        hxh.m49023j(i, this.f94769h);
        if (i == this.f94769h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f94769h - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f94768g;
            Object[] objArrM48551p = m48551p(objArr);
            System.arraycopy(objArr, i3, objArrM48551p, size2 + 1, m48543I() - i3);
            m48534e(objArrM48551p, i3, collection.iterator());
            this.f94768g = objArrM48551p;
            this.f94769h = collection.size() + this.f94769h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM48543I = m48543I();
        int size3 = collection.size() + this.f94769h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m48540F()) {
            objArrM48553r = m48553r();
            collection2 = collection;
            m48542H(collection2, i, this.f94768g, iM48543I, objArr2, size, objArrM48553r);
            hsn0Var = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            hsn0Var = this;
            if (size3 > iM48543I) {
                int i4 = size3 - iM48543I;
                Object[] objArrM48552q = m48552q(i4, hsn0Var.f94768g);
                hsn0Var.m48547j(collection2, i, i4, objArr2, size, objArrM48552q);
                objArr2 = objArr2;
                objArrM48553r = objArrM48552q;
            } else {
                Object[] objArr3 = hsn0Var.f94768g;
                objArrM48553r = m48553r();
                int i5 = iM48543I - size3;
                System.arraycopy(objArr3, i5, objArrM48553r, 0, iM48543I - i5);
                int i6 = 32 - i5;
                Object[] objArrM48552q2 = m48552q(i6, hsn0Var.f94768g);
                int i7 = size - 1;
                objArr2[i7] = objArrM48552q2;
                hsn0Var.m48547j(collection2, i, i6, objArr2, i7, objArrM48552q2);
                collection2 = collection2;
            }
        }
        hsn0Var.f94767f = m48559x(hsn0Var.f94767f, i2, objArr2);
        hsn0Var.f94768g = objArrM48553r;
        hsn0Var.f94769h = collection2.size() + hsn0Var.f94769h;
        return true;
    }

    @Override // p204p.AbstractC2366s8
    /* JADX INFO: renamed from: b */
    public final Object mo47662b(int i) {
        hxh.m49022i(i, mo47661a());
        ((AbstractList) this).modCount++;
        int iM48540F = m48540F();
        if (i >= iM48540F) {
            return m48539E(this.f94767f, iM48540F, this.f94765d, i - iM48540F);
        }
        m680 m680Var = new m680(this.f94768g[0], 28);
        Object[] objArr = this.f94767f;
        wj50.m88279p(objArr);
        m48539E(m48538D(objArr, this.f94765d, i, m680Var), iM48540F, this.f94765d, 0);
        return m680Var.f140422b;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2524w8 m48544d() {
        AbstractC2524w8 fsn0Var;
        Object[] objArr = this.f94767f;
        if (objArr == this.f94763b && this.f94768g == this.f94764c) {
            fsn0Var = this.f94762a;
        } else {
            this.f94766e = new oh3(18);
            this.f94763b = objArr;
            Object[] objArr2 = this.f94768g;
            this.f94764c = objArr2;
            if (objArr == null) {
                fsn0Var = objArr2.length == 0 ? lv21.f137205b : new lv21(Arrays.copyOf(objArr2, this.f94769h));
            } else {
                fsn0Var = new fsn0(this.f94769h, this.f94765d, objArr, objArr2);
            }
        }
        this.f94762a = fsn0Var;
        return fsn0Var;
    }

    /* JADX INFO: renamed from: f */
    public final int m48545f() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        hxh.m49022i(i, mo47661a());
        if (m48540F() <= i) {
            objArr = this.f94768g;
        } else {
            objArr = this.f94767f;
            wj50.m88279p(objArr);
            for (int i2 = this.f94765d; i2 > 0; i2 -= 5) {
                Object obj = objArr[edg1.m38588i(i, i2)];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    /* JADX INFO: renamed from: i */
    public final Object[] m48546i(Object[] objArr, int i, int i2, Object obj, m680 m680Var) {
        int iM38588i = edg1.m38588i(i2, i);
        if (i == 0) {
            m680Var.f140422b = objArr[31];
            Object[] objArrM48551p = m48551p(objArr);
            System.arraycopy(objArr, iM38588i, objArrM48551p, iM38588i + 1, 31 - iM38588i);
            objArrM48551p[iM38588i] = obj;
            return objArrM48551p;
        }
        Object[] objArrM48551p2 = m48551p(objArr);
        int i3 = i - 5;
        Object obj2 = objArrM48551p2[iM38588i];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrM48551p2[iM38588i] = m48546i((Object[]) obj2, i3, i2, obj, m680Var);
        int i4 = iM38588i + 1;
        while (i4 < 32) {
            int i5 = i4 + 1;
            Object obj3 = objArrM48551p2[i4];
            if (obj3 == null) {
                break;
            }
            objArrM48551p2[i4] = m48546i((Object[]) obj3, i3, 0, m680Var.f140422b, m680Var);
            i4 = i5;
        }
        return objArrM48551p2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final void m48547j(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f94767f == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i4 = i >> 5;
        AbstractC2204o7 abstractC2204o7M48550o = m48550o(m48540F() >> 5);
        int i5 = i3;
        Object[] objArrM48552q = objArr2;
        while (abstractC2204o7M48550o.f162442a - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC2204o7M48550o.previous();
            bk5.m29629p0(0, 32 - i2, 32, objArr3, objArrM48552q);
            objArrM48552q = m48552q(i2, objArr3);
            i5--;
            objArr[i5] = objArrM48552q;
        }
        Object[] objArr4 = (Object[]) abstractC2204o7M48550o.previous();
        int iM48540F = i3 - (((m48540F() >> 5) - 1) - i4);
        if (iM48540F < i3) {
            objArr2 = objArr[iM48540F];
            wj50.m88279p(objArr2);
        }
        m48542H(collection, i, objArr4, 32, objArr, iM48540F, objArr2);
    }

    /* JADX INFO: renamed from: l */
    public final void m48548l(int i, Object obj, Object[] objArr) {
        int iM48543I = m48543I();
        Object[] objArrM48551p = m48551p(this.f94768g);
        if (iM48543I >= 32) {
            Object[] objArr2 = this.f94768g;
            Object obj2 = objArr2[31];
            bk5.m29629p0(i + 1, i, 31, objArr2, objArrM48551p);
            objArrM48551p[i] = obj;
            m48560y(objArr, objArrM48551p, m48554s(obj2));
            return;
        }
        bk5.m29629p0(i + 1, i, iM48543I, this.f94768g, objArrM48551p);
        objArrM48551p[i] = obj;
        this.f94767f = objArr;
        this.f94768g = objArrM48551p;
        this.f94769h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        hxh.m49023j(i, this.f94769h);
        return new lsn0(this, i);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m48549n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f94766e;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC2204o7 m48550o(int i) {
        if (this.f94767f == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int iM48540F = m48540F() >> 5;
        hxh.m49023j(i, iM48540F);
        int i2 = this.f94765d;
        if (i2 == 0) {
            Object[] objArr = this.f94767f;
            wj50.m88279p(objArr);
            return new ke21(objArr, i);
        }
        Object[] objArr2 = this.f94767f;
        wj50.m88279p(objArr2);
        return new jj91(objArr2, i, iM48540F, i2 / 5);
    }

    /* JADX INFO: renamed from: p */
    public final Object[] m48551p(Object[] objArr) {
        if (objArr == null) {
            return m48553r();
        }
        if (m48549n(objArr)) {
            return objArr;
        }
        Object[] objArrM48553r = m48553r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        bk5.m29636u0(0, length, 6, objArr, objArrM48553r);
        return objArrM48553r;
    }

    /* JADX INFO: renamed from: q */
    public final Object[] m48552q(int i, Object[] objArr) {
        if (m48549n(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] objArrM48553r = m48553r();
        System.arraycopy(objArr, 0, objArrM48553r, i, 32 - i);
        return objArrM48553r;
    }

    /* JADX INFO: renamed from: r */
    public final Object[] m48553r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f94766e;
        return objArr;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        hsn0 hsn0Var;
        Object[] objArrM48558w;
        y9q y9qVar = new y9q(1, collection);
        int iM48543I = m48543I();
        Object[] objArrM48555t = null;
        m680 m680Var = new m680(objArrM48555t, 28);
        boolean z = false;
        if (this.f94767f != null) {
            AbstractC2204o7 abstractC2204o7M48550o = m48550o(0);
            int iM48536B = 32;
            while (iM48536B == 32 && abstractC2204o7M48550o.hasNext()) {
                iM48536B = m48536B(y9qVar, (Object[]) abstractC2204o7M48550o.next(), 32, m680Var);
            }
            if (iM48536B == 32) {
                int iM48537C = m48537C(y9qVar, iM48543I, m680Var);
                if (iM48537C == 0) {
                    m48557v(this.f94769h, this.f94765d, this.f94767f);
                }
                if (iM48537C != iM48543I) {
                    hsn0Var = this;
                } else {
                    hsn0Var = this;
                }
            } else {
                int i = (abstractC2204o7M48550o.f162442a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM48535A = iM48536B;
                while (abstractC2204o7M48550o.hasNext()) {
                    iM48535A = m48535A(y9qVar, (Object[]) abstractC2204o7M48550o.next(), 32, iM48535A, m680Var, arrayList2, arrayList);
                }
                hsn0Var = this;
                int iM48535A2 = hsn0Var.m48535A(y9qVar, hsn0Var.f94768g, iM48543I, iM48535A, m680Var, arrayList2, arrayList);
                Object obj = m680Var.f140422b;
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM48535A2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrM48558w = hsn0Var.f94767f;
                    wj50.m88279p(objArrM48558w);
                } else {
                    objArrM48558w = m48558w(hsn0Var.f94767f, i, hsn0Var.f94765d, arrayList.iterator());
                }
                int size = i + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (size != 0) {
                    int i2 = size - 1;
                    while (true) {
                        int i3 = hsn0Var.f94765d;
                        if ((i2 >> i3) != 0) {
                            objArrM48555t = m48555t(i2, i3, objArrM48558w);
                            break;
                        }
                        hsn0Var.f94765d = i3 - 5;
                        Object[] objArr2 = objArrM48558w[0];
                        if (objArr2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                        objArrM48558w = objArr2;
                    }
                } else {
                    hsn0Var.f94765d = 0;
                }
                hsn0Var.f94767f = objArrM48555t;
                hsn0Var.f94768g = objArr;
                hsn0Var.f94769h = size + iM48535A2;
            }
            z = true;
        } else if (m48537C(y9qVar, iM48543I, m680Var) != iM48543I) {
            hsn0Var = this;
            z = true;
        } else {
            hsn0Var = this;
        }
        if (z) {
            ((AbstractList) hsn0Var).modCount++;
        }
        return z;
    }

    /* JADX INFO: renamed from: s */
    public final Object[] m48554s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f94766e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        hxh.m49022i(i, mo47661a());
        if (m48540F() > i) {
            m680 m680Var = new m680((Object) null, 28);
            Object[] objArr = this.f94767f;
            wj50.m88279p(objArr);
            this.f94767f = m48541G(objArr, this.f94765d, i, obj, m680Var);
            return m680Var.f140422b;
        }
        Object[] objArrM48551p = m48551p(this.f94768g);
        if (objArrM48551p != this.f94768g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM48551p[i2];
        objArrM48551p[i2] = obj;
        this.f94768g = objArrM48551p;
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public final Object[] m48555t(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM38588i = edg1.m38588i(i, i2);
        Object obj = objArr[iM38588i];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object objM48555t = m48555t(i, i2 - 5, (Object[]) obj);
        if (iM38588i < 31) {
            int i3 = iM38588i + 1;
            if (objArr[i3] != null) {
                if (m48549n(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM48553r = m48553r();
                System.arraycopy(objArr, 0, objArrM48553r, 0, i3);
                objArr = objArrM48553r;
            }
        }
        if (objM48555t == objArr[iM38588i]) {
            return objArr;
        }
        Object[] objArrM48551p = m48551p(objArr);
        objArrM48551p[iM38588i] = objM48555t;
        return objArrM48551p;
    }

    /* JADX INFO: renamed from: u */
    public final Object[] m48556u(Object[] objArr, int i, int i2, m680 m680Var) {
        Object[] objArrM48556u;
        int iM38588i = edg1.m38588i(i2 - 1, i);
        if (i == 5) {
            m680Var.f140422b = objArr[iM38588i];
            objArrM48556u = null;
        } else {
            Object obj = objArr[iM38588i];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArrM48556u = m48556u((Object[]) obj, i - 5, i2, m680Var);
        }
        if (objArrM48556u == null && iM38588i == 0) {
            return null;
        }
        Object[] objArrM48551p = m48551p(objArr);
        objArrM48551p[iM38588i] = objArrM48556u;
        return objArrM48551p;
    }

    /* JADX INFO: renamed from: v */
    public final void m48557v(int i, int i2, Object[] objArr) {
        Object obj = null;
        if (i2 == 0) {
            this.f94767f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f94768g = objArr;
            this.f94769h = i;
            this.f94765d = i2;
            return;
        }
        m680 m680Var = new m680(obj, 28);
        wj50.m88279p(objArr);
        Object[] objArrM48556u = m48556u(objArr, i2, i, m680Var);
        wj50.m88279p(objArrM48556u);
        Object obj2 = m680Var.f140422b;
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        this.f94768g = (Object[]) obj2;
        this.f94769h = i;
        if (objArrM48556u[1] == null) {
            this.f94767f = (Object[]) objArrM48556u[0];
            this.f94765d = i2 - 5;
        } else {
            this.f94767f = objArrM48556u;
            this.f94765d = i2;
        }
    }

    /* JADX INFO: renamed from: w */
    public final Object[] m48558w(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM48551p = m48551p(objArr);
        int iM38588i = edg1.m38588i(i, i2);
        int i3 = i2 - 5;
        objArrM48551p[iM38588i] = m48558w((Object[]) objArrM48551p[iM38588i], i, i3, it);
        while (true) {
            iM38588i++;
            if (iM38588i >= 32 || !it.hasNext()) {
                break;
            }
            objArrM48551p[iM38588i] = m48558w((Object[]) objArrM48551p[iM38588i], 0, i3, it);
        }
        return objArrM48551p;
    }

    /* JADX INFO: renamed from: x */
    public final Object[] m48559x(Object[] objArr, int i, Object[][] objArr2) {
        C2042k7 c2042k7 = new C2042k7(objArr2, 1);
        int i2 = i >> 5;
        int i3 = this.f94765d;
        Object[] objArrM48558w = i2 < (1 << i3) ? m48558w(objArr, i, i3, c2042k7) : m48551p(objArr);
        while (c2042k7.hasNext()) {
            this.f94765d += 5;
            objArrM48558w = m48554s(objArrM48558w);
            int i4 = this.f94765d;
            m48558w(objArrM48558w, 1 << i4, i4, c2042k7);
        }
        return objArrM48558w;
    }

    /* JADX INFO: renamed from: y */
    public final void m48560y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f94769h;
        int i2 = i >> 5;
        int i3 = this.f94765d;
        if (i2 > (1 << i3)) {
            this.f94767f = m48561z(this.f94765d + 5, m48554s(objArr), objArr2);
            this.f94768g = objArr3;
            this.f94765d += 5;
            this.f94769h++;
            return;
        }
        if (objArr == null) {
            this.f94767f = objArr2;
            this.f94768g = objArr3;
            this.f94769h = i + 1;
        } else {
            this.f94767f = m48561z(i3, objArr, objArr2);
            this.f94768g = objArr3;
            this.f94769h++;
        }
    }

    /* JADX INFO: renamed from: z */
    public final Object[] m48561z(int i, Object[] objArr, Object[] objArr2) {
        int iM38588i = edg1.m38588i(mo47661a() - 1, i);
        Object[] objArrM48551p = m48551p(objArr);
        if (i == 5) {
            objArrM48551p[iM38588i] = objArr2;
            return objArrM48551p;
        }
        objArrM48551p[iM38588i] = m48561z(i - 5, (Object[]) objArrM48551p[iM38588i], objArr2);
        return objArrM48551p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM48543I = m48543I();
        if (iM48543I < 32) {
            Object[] objArrM48551p = m48551p(this.f94768g);
            objArrM48551p[iM48543I] = obj;
            this.f94768g = objArrM48551p;
            this.f94769h = mo47661a() + 1;
        } else {
            m48560y(this.f94767f, this.f94768g, m48554s(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM48543I = m48543I();
        Iterator it = collection.iterator();
        if (32 - iM48543I >= collection.size()) {
            Object[] objArrM48551p = m48551p(this.f94768g);
            m48534e(objArrM48551p, iM48543I, it);
            this.f94768g = objArrM48551p;
            this.f94769h = collection.size() + this.f94769h;
            return true;
        }
        int size = ((collection.size() + iM48543I) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM48551p2 = m48551p(this.f94768g);
        m48534e(objArrM48551p2, iM48543I, it);
        objArr[0] = objArrM48551p2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM48553r = m48553r();
            m48534e(objArrM48553r, 0, it);
            objArr[i] = objArrM48553r;
        }
        this.f94767f = m48559x(this.f94767f, m48540F(), objArr);
        Object[] objArrM48553r2 = m48553r();
        m48534e(objArrM48553r2, 0, it);
        this.f94768g = objArrM48553r2;
        this.f94769h = collection.size() + this.f94769h;
        return true;
    }
}
