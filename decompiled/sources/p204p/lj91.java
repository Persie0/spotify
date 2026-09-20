package p204p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lj91 {

    /* JADX INFO: renamed from: e */
    public static final lj91 f134015e = new lj91(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f134016a;

    /* JADX INFO: renamed from: b */
    public int f134017b;

    /* JADX INFO: renamed from: c */
    public final oh3 f134018c;

    /* JADX INFO: renamed from: d */
    public Object[] f134019d;

    public lj91(int i, int i2, Object[] objArr, oh3 oh3Var) {
        this.f134016a = i;
        this.f134017b = i2;
        this.f134018c = oh3Var;
        this.f134019d = objArr;
    }

    /* JADX INFO: renamed from: k */
    public static lj91 m59115k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, oh3 oh3Var) {
        if (i3 > 30) {
            return new lj91(0, 0, new Object[]{obj, obj2, obj3, obj4}, oh3Var);
        }
        int iM94503r = ysj0.m94503r(i, i3);
        int iM94503r2 = ysj0.m94503r(i2, i3);
        if (iM94503r != iM94503r2) {
            return new lj91((1 << iM94503r) | (1 << iM94503r2), 0, iM94503r < iM94503r2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, oh3Var);
        }
        return new lj91(0, 1 << iM94503r, new Object[]{m59115k(i, obj, obj2, i2, obj3, obj4, i3 + 5, oh3Var)}, oh3Var);
    }

    /* JADX INFO: renamed from: a */
    public final Object[] m59116a(int i, int i2, int i3, Object obj, Object obj2, int i4, oh3 oh3Var) {
        Object obj3 = this.f134019d[i];
        return ysj0.m94490e(this.f134019d, i, m59135u(i2) + 1, m59115k(obj3 == null ? 0 : obj3.hashCode(), obj3, m59139y(i), i3, obj, obj2, i4 + 5, oh3Var));
    }

    /* JADX INFO: renamed from: b */
    public final int m59117b() {
        if (this.f134017b == 0) {
            return this.f134019d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f134016a);
        int length = this.f134019d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += m59134t(i).m59117b();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: c */
    public final int m59118c(Object obj) {
        z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, this.f134019d.length), 2);
        int i = z350VarM63411S.f278778a;
        int i2 = z350VarM63411S.f278779b;
        int i3 = z350VarM63411S.f278780c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return -1;
        }
        while (true) {
            int i4 = i + i3;
            if (wj50.m88271j(obj, this.f134019d[i])) {
                return i;
            }
            if (i == i2) {
                return -1;
            }
            i = i4;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m59119d(int i, int i2, Object obj) {
        int iM94503r = 1 << ysj0.m94503r(i, i2);
        if (m59124i(iM94503r)) {
            return wj50.m88271j(obj, this.f134019d[m59121f(iM94503r)]);
        }
        if (!m59125j(iM94503r)) {
            return false;
        }
        lj91 lj91VarM59134t = m59134t(m59135u(iM94503r));
        if (i2 == 30) {
            return lj91VarM59134t.m59118c(obj) != -1;
        }
        return lj91VarM59134t.m59119d(i, i2 + 5, obj);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m59120e(lj91 lj91Var) {
        if (this == lj91Var) {
            return true;
        }
        if (this.f134017b == lj91Var.f134017b && this.f134016a == lj91Var.f134016a) {
            int length = this.f134019d.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (this.f134019d[i] == lj91Var.f134019d[i]) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m59121f(int i) {
        return Integer.bitCount((i - 1) & this.f134016a) * 2;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m59122g(lj91 lj91Var, th00 th00Var) {
        int i;
        if (this == lj91Var) {
            return true;
        }
        int i2 = this.f134016a;
        if (i2 != lj91Var.f134016a || (i = this.f134017b) != lj91Var.f134017b) {
            return false;
        }
        if (i2 == 0 && i == 0) {
            Object[] objArr = this.f134019d;
            if (objArr.length != lj91Var.f134019d.length) {
                return false;
            }
            Iterable iterableM63411S = n0e1.m63411S(n0e1.m63417Y(0, objArr.length), 2);
            if ((iterableM63411S instanceof Collection) && ((Collection) iterableM63411S).isEmpty()) {
                return true;
            }
            Iterator it = iterableM63411S.iterator();
            while (it.hasNext()) {
                int iNextInt = ((t350) it).nextInt();
                Object obj = lj91Var.f134019d[iNextInt];
                Object objM59139y = lj91Var.m59139y(iNextInt);
                int iM59118c = m59118c(obj);
                if (!(iM59118c != -1 ? ((Boolean) th00Var.invoke(m59139y(iM59118c), objM59139y)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        int iBitCount = Integer.bitCount(i2) * 2;
        z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, iBitCount), 2);
        int i3 = z350VarM63411S.f278778a;
        int i4 = z350VarM63411S.f278779b;
        int i5 = z350VarM63411S.f278780c;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (true) {
                int i6 = i3 + i5;
                if (!wj50.m88271j(this.f134019d[i3], lj91Var.f134019d[i3]) || !((Boolean) th00Var.invoke(m59139y(i3), lj91Var.m59139y(i3))).booleanValue()) {
                    return false;
                }
                if (i3 == i4) {
                    break;
                }
                i3 = i6;
            }
        }
        int length = this.f134019d.length;
        while (iBitCount < length) {
            int i7 = iBitCount + 1;
            if (!m59134t(iBitCount).m59122g(lj91Var.m59134t(iBitCount), th00Var)) {
                return false;
            }
            iBitCount = i7;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final Object m59123h(int i, int i2, Object obj) {
        int iM94503r = 1 << ysj0.m94503r(i, i2);
        if (m59124i(iM94503r)) {
            int iM59121f = m59121f(iM94503r);
            if (wj50.m88271j(obj, this.f134019d[iM59121f])) {
                return m59139y(iM59121f);
            }
            return null;
        }
        if (!m59125j(iM94503r)) {
            return null;
        }
        lj91 lj91VarM59134t = m59134t(m59135u(iM94503r));
        if (i2 != 30) {
            return lj91VarM59134t.m59123h(i, i2 + 5, obj);
        }
        int iM59118c = lj91VarM59134t.m59118c(obj);
        if (iM59118c != -1) {
            return lj91VarM59134t.m59139y(iM59118c);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m59124i(int i) {
        return (i & this.f134016a) != 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m59125j(int i) {
        return (i & this.f134017b) != 0;
    }

    /* JADX INFO: renamed from: l */
    public final lj91 m59126l(int i, hqn0 hqn0Var) {
        hqn0Var.m48307k(hqn0Var.size() - 1);
        hqn0Var.m48306j(m59139y(i));
        if (this.f134019d.length == 2) {
            return null;
        }
        if (this.f134018c != hqn0Var.m48304h()) {
            return new lj91(0, 0, ysj0.m94488c(i, this.f134019d), hqn0Var.m48304h());
        }
        this.f134019d = ysj0.m94488c(i, this.f134019d);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final lj91 m59127m(int i, Object obj, Object obj2, int i2, hqn0 hqn0Var) {
        hqn0 hqn0Var2;
        lj91 lj91VarM59127m;
        int iM94503r = 1 << ysj0.m94503r(i, i2);
        boolean zM59124i = m59124i(iM94503r);
        oh3 oh3Var = this.f134018c;
        if (zM59124i) {
            int iM59121f = m59121f(iM94503r);
            if (!wj50.m88271j(obj, this.f134019d[iM59121f])) {
                hqn0Var.m48307k(hqn0Var.size() + 1);
                oh3 oh3VarM48304h = hqn0Var.m48304h();
                if (oh3Var != oh3VarM48304h) {
                    return new lj91(this.f134016a ^ iM94503r, this.f134017b | iM94503r, m59116a(iM59121f, iM94503r, i, obj, obj2, i2, oh3VarM48304h), oh3VarM48304h);
                }
                this.f134019d = m59116a(iM59121f, iM94503r, i, obj, obj2, i2, oh3VarM48304h);
                this.f134016a ^= iM94503r;
                this.f134017b |= iM94503r;
                return this;
            }
            hqn0Var.m48306j(m59139y(iM59121f));
            if (m59139y(iM59121f) == obj2) {
                return this;
            }
            if (oh3Var == hqn0Var.m48304h()) {
                this.f134019d[iM59121f + 1] = obj2;
                return this;
            }
            hqn0Var.m48305i(hqn0Var.m48302f() + 1);
            Object[] objArr = this.f134019d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM59121f + 1] = obj2;
            return new lj91(this.f134016a, this.f134017b, objArrCopyOf, hqn0Var.m48304h());
        }
        if (!m59125j(iM94503r)) {
            hqn0Var.m48307k(hqn0Var.size() + 1);
            oh3 oh3VarM48304h2 = hqn0Var.m48304h();
            int iM59121f2 = m59121f(iM94503r);
            if (oh3Var != oh3VarM48304h2) {
                return new lj91(this.f134016a | iM94503r, this.f134017b, ysj0.m94487b(this.f134019d, iM59121f2, obj, obj2), oh3VarM48304h2);
            }
            this.f134019d = ysj0.m94487b(this.f134019d, iM59121f2, obj, obj2);
            this.f134016a |= iM94503r;
            return this;
        }
        int iM59135u = m59135u(iM94503r);
        lj91 lj91VarM59134t = m59134t(iM59135u);
        if (i2 == 30) {
            int iM59118c = lj91VarM59134t.m59118c(obj);
            if (iM59118c != -1) {
                hqn0Var.m48306j(lj91VarM59134t.m59139y(iM59118c));
                if (lj91VarM59134t.f134018c == hqn0Var.m48304h()) {
                    lj91VarM59134t.f134019d[iM59118c + 1] = obj2;
                    lj91VarM59127m = lj91VarM59134t;
                } else {
                    hqn0Var.m48305i(hqn0Var.m48302f() + 1);
                    Object[] objArr2 = lj91VarM59134t.f134019d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    objArrCopyOf2[iM59118c + 1] = obj2;
                    lj91VarM59127m = new lj91(0, 0, objArrCopyOf2, hqn0Var.m48304h());
                }
            } else {
                hqn0Var.m48307k(hqn0Var.size() + 1);
                lj91VarM59127m = new lj91(0, 0, ysj0.m94487b(lj91VarM59134t.f134019d, 0, obj, obj2), hqn0Var.m48304h());
            }
            hqn0Var2 = hqn0Var;
        } else {
            hqn0Var2 = hqn0Var;
            lj91VarM59127m = lj91VarM59134t.m59127m(i, obj, obj2, i2 + 5, hqn0Var2);
        }
        return lj91VarM59134t == lj91VarM59127m ? this : m59133s(iM59135u, lj91VarM59127m, hqn0Var2.m48304h());
    }

    /* JADX INFO: renamed from: n */
    public final lj91 m59128n(lj91 lj91Var, int i, aqq aqqVar, hqn0 hqn0Var) {
        lj91 lj91Var2;
        lj91 lj91VarM59115k;
        if (this == lj91Var) {
            aqqVar.m26889b(m59117b());
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            oh3 oh3VarM48304h = hqn0Var.m48304h();
            Object[] objArr = this.f134019d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + lj91Var.f134019d.length);
            int length = this.f134019d.length;
            z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, lj91Var.f134019d.length), 2);
            int i3 = z350VarM63411S.f278778a;
            int i4 = z350VarM63411S.f278779b;
            int i5 = z350VarM63411S.f278780c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    int i6 = i3 + i5;
                    if (m59118c(lj91Var.f134019d[i3]) != -1) {
                        aqqVar.m26890c(aqqVar.m26888a() + 1);
                    } else {
                        Object[] objArr2 = lj91Var.f134019d;
                        objArrCopyOf[length] = objArr2[i3];
                        objArrCopyOf[length + 1] = objArr2[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 = i6;
                }
            }
            if (length != this.f134019d.length) {
                if (length != lj91Var.f134019d.length) {
                    return length == objArrCopyOf.length ? new lj91(0, 0, objArrCopyOf, oh3VarM48304h) : new lj91(0, 0, Arrays.copyOf(objArrCopyOf, length), oh3VarM48304h);
                }
            }
            return this;
        }
        int i7 = this.f134017b | lj91Var.f134017b;
        int i8 = this.f134016a;
        int i9 = lj91Var.f134016a;
        int i10 = (i8 ^ i9) & (~i7);
        int i11 = i8 & i9;
        while (i11 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i11);
            if (wj50.m88271j(this.f134019d[m59121f(iLowestOneBit)], lj91Var.f134019d[lj91Var.m59121f(iLowestOneBit)])) {
                i10 |= iLowestOneBit;
            } else {
                i7 |= iLowestOneBit;
            }
            i11 ^= iLowestOneBit;
        }
        if ((i7 & i10) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (wj50.m88271j(this.f134018c, hqn0Var.m48304h()) && this.f134016a == i10 && this.f134017b == i7) {
            lj91Var2 = this;
        } else {
            lj91Var2 = new lj91(i10, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i10) * 2)], null);
        }
        int i12 = 0;
        while (i7 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i7);
            Object[] objArr3 = lj91Var2.f134019d;
            int length2 = (objArr3.length - 1) - i12;
            if (m59125j(iLowestOneBit2)) {
                lj91VarM59115k = m59134t(m59135u(iLowestOneBit2));
                if (lj91Var.m59125j(iLowestOneBit2)) {
                    lj91VarM59115k = lj91VarM59115k.m59128n(lj91Var.m59134t(lj91Var.m59135u(iLowestOneBit2)), i + 5, aqqVar, hqn0Var);
                } else if (lj91Var.m59124i(iLowestOneBit2)) {
                    int iM59121f = lj91Var.m59121f(iLowestOneBit2);
                    Object obj = lj91Var.f134019d[iM59121f];
                    Object objM59139y = lj91Var.m59139y(iM59121f);
                    int size = hqn0Var.size();
                    lj91VarM59115k = lj91VarM59115k.m59127m(obj == null ? i2 : obj.hashCode(), obj, objM59139y, i + 5, hqn0Var);
                    if (hqn0Var.size() == size) {
                        aqqVar.m26890c(aqqVar.m26888a() + 1);
                    }
                }
            } else if (lj91Var.m59125j(iLowestOneBit2)) {
                lj91 lj91VarM59134t = lj91Var.m59134t(lj91Var.m59135u(iLowestOneBit2));
                if (m59124i(iLowestOneBit2)) {
                    int iM59121f2 = m59121f(iLowestOneBit2);
                    Object obj2 = this.f134019d[iM59121f2];
                    int iHashCode = obj2 == null ? i2 : obj2.hashCode();
                    int i13 = i + 5;
                    if (lj91VarM59134t.m59119d(iHashCode, i13, obj2)) {
                        aqqVar.m26890c(aqqVar.m26888a() + 1);
                        lj91VarM59115k = lj91VarM59134t;
                    } else {
                        lj91VarM59115k = lj91VarM59134t.m59127m(obj2 == null ? 0 : obj2.hashCode(), obj2, m59139y(iM59121f2), i13, hqn0Var);
                    }
                } else {
                    lj91VarM59115k = lj91VarM59134t;
                }
            } else {
                int iM59121f3 = m59121f(iLowestOneBit2);
                Object obj3 = this.f134019d[iM59121f3];
                Object objM59139y2 = m59139y(iM59121f3);
                int iM59121f4 = lj91Var.m59121f(iLowestOneBit2);
                Object obj4 = lj91Var.f134019d[iM59121f4];
                lj91VarM59115k = m59115k(obj3 == null ? 0 : obj3.hashCode(), obj3, objM59139y2, obj4 == null ? 0 : obj4.hashCode(), obj4, lj91Var.m59139y(iM59121f4), i + 5, hqn0Var.m48304h());
            }
            objArr3[length2] = lj91VarM59115k;
            i12++;
            i7 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i14 = 0;
        while (i10 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i10);
            int i15 = i14 * 2;
            if (lj91Var.m59124i(iLowestOneBit3)) {
                int iM59121f5 = lj91Var.m59121f(iLowestOneBit3);
                Object[] objArr4 = lj91Var2.f134019d;
                objArr4[i15] = lj91Var.f134019d[iM59121f5];
                objArr4[i15 + 1] = lj91Var.m59139y(iM59121f5);
                if (m59124i(iLowestOneBit3)) {
                    aqqVar.m26890c(aqqVar.m26888a() + 1);
                }
            } else {
                int iM59121f6 = m59121f(iLowestOneBit3);
                Object[] objArr5 = lj91Var2.f134019d;
                objArr5[i15] = this.f134019d[iM59121f6];
                objArr5[i15 + 1] = m59139y(iM59121f6);
            }
            i14++;
            i10 ^= iLowestOneBit3;
        }
        if (!m59120e(lj91Var2)) {
            return lj91Var.m59120e(lj91Var2) ? lj91Var : lj91Var2;
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final lj91 m59129o(int i, Object obj, int i2, hqn0 hqn0Var) {
        lj91 lj91VarM59129o;
        int iM94503r = 1 << ysj0.m94503r(i, i2);
        if (m59124i(iM94503r)) {
            int iM59121f = m59121f(iM94503r);
            if (wj50.m88271j(obj, this.f134019d[iM59121f])) {
                return m59131q(iM59121f, iM94503r, hqn0Var);
            }
        } else if (m59125j(iM94503r)) {
            int iM59135u = m59135u(iM94503r);
            lj91 lj91VarM59134t = m59134t(iM59135u);
            if (i2 == 30) {
                int iM59118c = lj91VarM59134t.m59118c(obj);
                lj91VarM59129o = iM59118c != -1 ? lj91VarM59134t.m59126l(iM59118c, hqn0Var) : lj91VarM59134t;
            } else {
                lj91VarM59129o = lj91VarM59134t.m59129o(i, obj, i2 + 5, hqn0Var);
            }
            return m59132r(lj91VarM59134t, lj91VarM59129o, iM59135u, iM94503r, hqn0Var.m48304h());
        }
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final lj91 m59130p(int i, Object obj, Object obj2, int i2, hqn0 hqn0Var) {
        lj91 lj91VarM59130p;
        int iM94503r = 1 << ysj0.m94503r(i, i2);
        if (m59124i(iM94503r)) {
            int iM59121f = m59121f(iM94503r);
            if (wj50.m88271j(obj, this.f134019d[iM59121f]) && wj50.m88271j(obj2, m59139y(iM59121f))) {
                return m59131q(iM59121f, iM94503r, hqn0Var);
            }
        } else if (m59125j(iM94503r)) {
            int iM59135u = m59135u(iM94503r);
            lj91 lj91VarM59134t = m59134t(iM59135u);
            if (i2 == 30) {
                int iM59118c = lj91VarM59134t.m59118c(obj);
                lj91VarM59130p = (iM59118c == -1 || !wj50.m88271j(obj2, lj91VarM59134t.m59139y(iM59118c))) ? lj91VarM59134t : lj91VarM59134t.m59126l(iM59118c, hqn0Var);
            } else {
                lj91VarM59130p = lj91VarM59134t.m59130p(i, obj, obj2, i2 + 5, hqn0Var);
            }
            return m59132r(lj91VarM59134t, lj91VarM59130p, iM59135u, iM94503r, hqn0Var.m48304h());
        }
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final lj91 m59131q(int i, int i2, hqn0 hqn0Var) {
        hqn0Var.m48307k(hqn0Var.size() - 1);
        hqn0Var.m48306j(m59139y(i));
        if (this.f134019d.length == 2) {
            return null;
        }
        if (this.f134018c != hqn0Var.m48304h()) {
            return new lj91(i2 ^ this.f134016a, this.f134017b, ysj0.m94488c(i, this.f134019d), hqn0Var.m48304h());
        }
        this.f134019d = ysj0.m94488c(i, this.f134019d);
        this.f134016a ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final lj91 m59132r(lj91 lj91Var, lj91 lj91Var2, int i, int i2, oh3 oh3Var) {
        if (lj91Var2 != null) {
            return lj91Var != lj91Var2 ? m59133s(i, lj91Var2, oh3Var) : this;
        }
        Object[] objArr = this.f134019d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f134018c != oh3Var) {
            return new lj91(this.f134016a, i2 ^ this.f134017b, ysj0.m94489d(i, objArr), oh3Var);
        }
        this.f134019d = ysj0.m94489d(i, objArr);
        this.f134017b ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final lj91 m59133s(int i, lj91 lj91Var, oh3 oh3Var) {
        oh3 oh3Var2 = lj91Var.f134018c;
        Object[] objArr = this.f134019d;
        if (objArr.length == 1 && lj91Var.f134019d.length == 2 && lj91Var.f134017b == 0) {
            lj91Var.f134016a = this.f134017b;
            return lj91Var;
        }
        if (this.f134018c == oh3Var) {
            objArr[i] = lj91Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = lj91Var;
        return new lj91(this.f134016a, this.f134017b, objArrCopyOf, oh3Var);
    }

    /* JADX INFO: renamed from: t */
    public final lj91 m59134t(int i) {
        Object obj = this.f134019d[i];
        if (obj != null) {
            return (lj91) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    /* JADX INFO: renamed from: u */
    public final int m59135u(int i) {
        return (this.f134019d.length - 1) - Integer.bitCount((i - 1) & this.f134017b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        if (r14 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (r14 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        r14.m80322k(m59138x(r12, r4, r14.m80317b()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        return r14;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t9w0 m59136v(int i, Object obj, Object obj2, int i2) {
        t9w0 t9w0VarM59136v;
        int i3 = 1;
        int iM94503r = 1 << ysj0.m94503r(i, i2);
        int i4 = 0;
        if (m59124i(iM94503r)) {
            int iM59121f = m59121f(iM94503r);
            if (!wj50.m88271j(obj, this.f134019d[iM59121f])) {
                return new t9w0(new lj91(this.f134016a ^ iM94503r, this.f134017b | iM94503r, m59116a(iM59121f, iM94503r, i, obj, obj2, i2, null), null), i3, 5);
            }
            if (m59139y(iM59121f) != obj2) {
                Object[] objArr = this.f134019d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iM59121f + 1] = obj2;
                return new t9w0(new lj91(this.f134016a, this.f134017b, objArrCopyOf, null), i4, 5);
            }
        } else {
            if (!m59125j(iM94503r)) {
                return new t9w0(new lj91(this.f134016a | iM94503r, this.f134017b, ysj0.m94487b(this.f134019d, m59121f(iM94503r), obj, obj2), null), i3, 5);
            }
            int iM59135u = m59135u(iM94503r);
            lj91 lj91VarM59134t = m59134t(iM59135u);
            if (i2 == 30) {
                int iM59118c = lj91VarM59134t.m59118c(obj);
                if (iM59118c == -1) {
                    t9w0VarM59136v = new t9w0(new lj91(0, 0, ysj0.m94487b(lj91VarM59134t.f134019d, 0, obj, obj2), null), i3, 5);
                } else if (obj2 == lj91VarM59134t.m59139y(iM59118c)) {
                    t9w0VarM59136v = null;
                } else {
                    Object[] objArr2 = lj91VarM59134t.f134019d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    objArrCopyOf2[iM59118c + 1] = obj2;
                    t9w0VarM59136v = new t9w0(new lj91(0, 0, objArrCopyOf2, null), i4, 5);
                }
            } else {
                t9w0VarM59136v = lj91VarM59134t.m59136v(i, obj, obj2, i2 + 5);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final lj91 m59137w(int i, int i2, Object obj) {
        lj91 lj91VarM59137w;
        int iM94503r = 1 << ysj0.m94503r(i, i2);
        if (m59124i(iM94503r)) {
            int iM59121f = m59121f(iM94503r);
            if (wj50.m88271j(obj, this.f134019d[iM59121f])) {
                Object[] objArr = this.f134019d;
                if (objArr.length == 2) {
                    return null;
                }
                return new lj91(this.f134016a ^ iM94503r, this.f134017b, ysj0.m94488c(iM59121f, objArr), null);
            }
        } else if (m59125j(iM94503r)) {
            int iM59135u = m59135u(iM94503r);
            lj91 lj91VarM59134t = m59134t(iM59135u);
            if (i2 == 30) {
                int iM59118c = lj91VarM59134t.m59118c(obj);
                if (iM59118c != -1) {
                    Object[] objArr2 = lj91VarM59134t.f134019d;
                    lj91VarM59137w = objArr2.length == 2 ? null : new lj91(0, 0, ysj0.m94488c(iM59118c, objArr2), null);
                } else {
                    lj91VarM59137w = lj91VarM59134t;
                }
            } else {
                lj91VarM59137w = lj91VarM59134t.m59137w(i, i2 + 5, obj);
            }
            if (lj91VarM59137w == null) {
                Object[] objArr3 = this.f134019d;
                if (objArr3.length == 1) {
                    return null;
                }
                return new lj91(this.f134016a, iM94503r ^ this.f134017b, ysj0.m94489d(iM59135u, objArr3), null);
            }
            if (lj91VarM59134t != lj91VarM59137w) {
                return m59138x(iM59135u, iM94503r, lj91VarM59137w);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final lj91 m59138x(int i, int i2, lj91 lj91Var) {
        Object[] objArr = lj91Var.f134019d;
        if (objArr.length != 2 || lj91Var.f134017b != 0) {
            Object[] objArr2 = this.f134019d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = lj91Var;
            return new lj91(this.f134016a, this.f134017b, objArrCopyOf, null);
        }
        if (this.f134019d.length == 1) {
            lj91Var.f134016a = this.f134017b;
            return lj91Var;
        }
        return new lj91(this.f134016a ^ i2, i2 ^ this.f134017b, ysj0.m94491f(i, m59121f(i2), objArr[0], objArr[1], this.f134019d), null);
    }

    /* JADX INFO: renamed from: y */
    public final Object m59139y(int i) {
        return this.f134019d[i + 1];
    }
}
