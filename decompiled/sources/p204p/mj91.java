package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mj91 {

    /* JADX INFO: renamed from: e */
    public static final mj91 f144207e = new mj91(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f144208a;

    /* JADX INFO: renamed from: b */
    public int f144209b;

    /* JADX INFO: renamed from: c */
    public final on3 f144210c;

    /* JADX INFO: renamed from: d */
    public Object[] f144211d;

    public mj91(int i, int i2, Object[] objArr, on3 on3Var) {
        this.f144208a = i;
        this.f144209b = i2;
        this.f144210c = on3Var;
        this.f144211d = objArr;
    }

    /* JADX INFO: renamed from: j */
    public static mj91 m61939j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, on3 on3Var) {
        if (i3 > 30) {
            return new mj91(0, 0, new Object[]{obj, obj2, obj3, obj4}, on3Var);
        }
        int iM97058u = zuj0.m97058u(i, i3);
        int iM97058u2 = zuj0.m97058u(i2, i3);
        if (iM97058u != iM97058u2) {
            return new mj91((1 << iM97058u) | (1 << iM97058u2), 0, iM97058u < iM97058u2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, on3Var);
        }
        return new mj91(0, 1 << iM97058u, new Object[]{m61939j(i, obj, obj2, i2, obj3, obj4, i3 + 5, on3Var)}, on3Var);
    }

    /* JADX INFO: renamed from: a */
    public final Object[] m61940a(int i, int i2, int i3, Object obj, Object obj2, int i4, on3 on3Var) {
        Object obj3 = this.f144211d[i];
        return zuj0.m97045h(this.f144211d, i, m61958t(i2) + 1, m61939j(obj3 != null ? obj3.hashCode() : 0, obj3, m61962x(i), i3, obj, obj2, i4 + 5, on3Var));
    }

    /* JADX INFO: renamed from: b */
    public final int m61941b() {
        if (this.f144209b == 0) {
            return this.f144211d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f144208a);
        int length = this.f144211d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += m61957s(i).m61941b();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61942c(Object obj) {
        z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, this.f144211d.length), 2);
        int i = z350VarM63411S.f278778a;
        int i2 = z350VarM63411S.f278779b;
        int i3 = z350VarM63411S.f278780c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!wj50.m88271j(obj, this.f144211d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m61943d(int i, int i2, Object obj) {
        int iM97058u = 1 << zuj0.m97058u(i, i2);
        if (m61947h(iM97058u)) {
            return wj50.m88271j(obj, this.f144211d[m61945f(iM97058u)]);
        }
        if (!m61948i(iM97058u)) {
            return false;
        }
        mj91 mj91VarM61957s = m61957s(m61958t(iM97058u));
        return i2 == 30 ? mj91VarM61957s.m61942c(obj) : mj91VarM61957s.m61943d(i, i2 + 5, obj);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m61944e(mj91 mj91Var) {
        if (this == mj91Var) {
            return true;
        }
        if (this.f144209b == mj91Var.f144209b && this.f144208a == mj91Var.f144208a) {
            int length = this.f144211d.length;
            for (int i = 0; i < length; i++) {
                if (this.f144211d[i] == mj91Var.f144211d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m61945f(int i) {
        return Integer.bitCount((i - 1) & this.f144208a) * 2;
    }

    /* JADX INFO: renamed from: g */
    public final Object m61946g(int i, int i2, Object obj) {
        int iM97058u = 1 << zuj0.m97058u(i, i2);
        if (m61947h(iM97058u)) {
            int iM61945f = m61945f(iM97058u);
            if (wj50.m88271j(obj, this.f144211d[iM61945f])) {
                return m61962x(iM61945f);
            }
            return null;
        }
        if (!m61948i(iM97058u)) {
            return null;
        }
        mj91 mj91VarM61957s = m61957s(m61958t(iM97058u));
        if (i2 != 30) {
            return mj91VarM61957s.m61946g(i, i2 + 5, obj);
        }
        z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, mj91VarM61957s.f144211d.length), 2);
        int i3 = z350VarM63411S.f278778a;
        int i4 = z350VarM63411S.f278779b;
        int i5 = z350VarM63411S.f278780c;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (!wj50.m88271j(obj, mj91VarM61957s.f144211d[i3])) {
                if (i3 != i4) {
                    i3 += i5;
                }
            }
            return mj91VarM61957s.m61962x(i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m61947h(int i) {
        return (i & this.f144208a) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m61948i(int i) {
        return (i & this.f144209b) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final mj91 m61949k(int i, iqn0 iqn0Var) {
        iqn0Var.m51389f(iqn0Var.size() - 1);
        iqn0Var.f104808d = m61962x(i);
        Object[] objArr = this.f144211d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f144210c != iqn0Var.f104806b) {
            return new mj91(0, 0, zuj0.m97043f(i, objArr), iqn0Var.f104806b);
        }
        this.f144211d = zuj0.m97043f(i, objArr);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final mj91 m61950l(int i, Object obj, Object obj2, int i2, iqn0 iqn0Var) {
        iqn0 iqn0Var2;
        mj91 mj91VarM61950l;
        int iM97058u = 1 << zuj0.m97058u(i, i2);
        boolean zM61947h = m61947h(iM97058u);
        on3 on3Var = this.f144210c;
        if (zM61947h) {
            int iM61945f = m61945f(iM97058u);
            if (!wj50.m88271j(obj, this.f144211d[iM61945f])) {
                iqn0Var.m51389f(iqn0Var.size() + 1);
                on3 on3Var2 = iqn0Var.f104806b;
                if (on3Var != on3Var2) {
                    return new mj91(this.f144208a ^ iM97058u, this.f144209b | iM97058u, m61940a(iM61945f, iM97058u, i, obj, obj2, i2, on3Var2), on3Var2);
                }
                this.f144211d = m61940a(iM61945f, iM97058u, i, obj, obj2, i2, on3Var2);
                this.f144208a ^= iM97058u;
                this.f144209b |= iM97058u;
                return this;
            }
            iqn0Var.f104808d = m61962x(iM61945f);
            if (m61962x(iM61945f) == obj2) {
                return this;
            }
            if (on3Var == iqn0Var.f104806b) {
                this.f144211d[iM61945f + 1] = obj2;
                return this;
            }
            iqn0Var.f104809e++;
            Object[] objArr = this.f144211d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM61945f + 1] = obj2;
            return new mj91(this.f144208a, this.f144209b, objArrCopyOf, iqn0Var.f104806b);
        }
        if (!m61948i(iM97058u)) {
            iqn0Var.m51389f(iqn0Var.size() + 1);
            on3 on3Var3 = iqn0Var.f104806b;
            int iM61945f2 = m61945f(iM97058u);
            if (on3Var != on3Var3) {
                return new mj91(this.f144208a | iM97058u, this.f144209b, zuj0.m97042e(this.f144211d, iM61945f2, obj, obj2), on3Var3);
            }
            this.f144211d = zuj0.m97042e(this.f144211d, iM61945f2, obj, obj2);
            this.f144208a |= iM97058u;
            return this;
        }
        int iM61958t = m61958t(iM97058u);
        mj91 mj91VarM61957s = m61957s(iM61958t);
        if (i2 == 30) {
            z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, mj91VarM61957s.f144211d.length), 2);
            int i3 = z350VarM63411S.f278778a;
            int i4 = z350VarM63411S.f278779b;
            int i5 = z350VarM63411S.f278780c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!wj50.m88271j(obj, mj91VarM61957s.f144211d[i3])) {
                        if (i3 == i4) {
                            iqn0Var.m51389f(iqn0Var.size() + 1);
                            mj91VarM61950l = new mj91(0, 0, zuj0.m97042e(mj91VarM61957s.f144211d, 0, obj, obj2), iqn0Var.f104806b);
                            break;
                        }
                        i3 += i5;
                    } else {
                        iqn0Var.f104808d = mj91VarM61957s.m61962x(i3);
                        if (mj91VarM61957s.f144210c != iqn0Var.f104806b) {
                            iqn0Var.f104809e++;
                            Object[] objArr2 = mj91VarM61957s.f144211d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            mj91VarM61950l = new mj91(0, 0, objArrCopyOf2, iqn0Var.f104806b);
                            break;
                        }
                        mj91VarM61957s.f144211d[i3 + 1] = obj2;
                        mj91VarM61950l = mj91VarM61957s;
                        break;
                    }
                }
            } else {
                iqn0Var.m51389f(iqn0Var.size() + 1);
                mj91VarM61950l = new mj91(0, 0, zuj0.m97042e(mj91VarM61957s.f144211d, 0, obj, obj2), iqn0Var.f104806b);
                break;
            }
            iqn0Var2 = iqn0Var;
        } else {
            iqn0Var2 = iqn0Var;
            mj91VarM61950l = mj91VarM61957s.m61950l(i, obj, obj2, i2 + 5, iqn0Var2);
        }
        return mj91VarM61957s == mj91VarM61950l ? this : m61956r(iM61958t, mj91VarM61950l, iqn0Var2.f104806b);
    }

    /* JADX INFO: renamed from: m */
    public final mj91 m61951m(mj91 mj91Var, int i, bqq bqqVar, iqn0 iqn0Var) {
        mj91 mj91Var2;
        Object[] objArr;
        mj91 mj91VarM61939j;
        iqn0 iqn0Var2 = iqn0Var;
        if (this == mj91Var) {
            bqqVar.f29869a += m61941b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            on3 on3Var = iqn0Var2.f104806b;
            int i3 = mj91Var.f144209b;
            Object[] objArr2 = this.f144211d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + mj91Var.f144211d.length);
            int length = this.f144211d.length;
            z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, mj91Var.f144211d.length), 2);
            int i4 = z350VarM63411S.f278778a;
            int i5 = z350VarM63411S.f278779b;
            int i6 = z350VarM63411S.f278780c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (m61942c(mj91Var.f144211d[i4])) {
                        bqqVar.f29869a++;
                    } else {
                        Object[] objArr3 = mj91Var.f144211d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.f144211d.length) {
                if (length == mj91Var.f144211d.length) {
                    return mj91Var;
                }
                return length == objArrCopyOf.length ? new mj91(0, 0, objArrCopyOf, on3Var) : new mj91(0, 0, Arrays.copyOf(objArrCopyOf, length), on3Var);
            }
        } else {
            int i7 = this.f144209b | mj91Var.f144209b;
            int i8 = this.f144208a;
            int i9 = mj91Var.f144208a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (wj50.m88271j(this.f144211d[m61945f(iLowestOneBit)], mj91Var.f144211d[mj91Var.m61945f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                lfq0.m58914b("Check failed.");
            }
            if (wj50.m88271j(this.f144210c, iqn0Var2.f104806b) && this.f144208a == i12 && this.f144209b == i7) {
                mj91Var2 = this;
            } else {
                mj91Var2 = new mj91(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = mj91Var2.f144211d;
                int length2 = (objArr4.length - 1) - i14;
                if (m61948i(iLowestOneBit2)) {
                    mj91VarM61939j = m61957s(m61958t(iLowestOneBit2));
                    if (mj91Var.m61948i(iLowestOneBit2)) {
                        mj91VarM61939j = mj91VarM61939j.m61951m(mj91Var.m61957s(mj91Var.m61958t(iLowestOneBit2)), i + 5, bqqVar, iqn0Var2);
                        objArr = objArr4;
                    } else {
                        if (mj91Var.m61947h(iLowestOneBit2)) {
                            int iM61945f = mj91Var.m61945f(iLowestOneBit2);
                            Object obj = mj91Var.f144211d[iM61945f];
                            Object objM61962x = mj91Var.m61962x(iM61945f);
                            int size = iqn0Var2.size();
                            objArr = objArr4;
                            mj91VarM61939j = mj91VarM61939j.m61950l(obj != null ? obj.hashCode() : i2, obj, objM61962x, i + 5, iqn0Var2);
                            if (iqn0Var.size() == size) {
                                bqqVar.f29869a++;
                            }
                        } else {
                            objArr = objArr4;
                        }
                        iqn0Var2 = iqn0Var;
                    }
                } else {
                    objArr = objArr4;
                    if (mj91Var.m61948i(iLowestOneBit2)) {
                        mj91 mj91VarM61957s = mj91Var.m61957s(mj91Var.m61958t(iLowestOneBit2));
                        if (m61947h(iLowestOneBit2)) {
                            int iM61945f2 = m61945f(iLowestOneBit2);
                            Object obj2 = this.f144211d[iM61945f2];
                            int i15 = i + 5;
                            if (mj91VarM61957s.m61943d(obj2 != null ? obj2.hashCode() : 0, i15, obj2)) {
                                bqqVar.f29869a++;
                                iqn0Var2 = iqn0Var;
                                mj91VarM61939j = mj91VarM61957s;
                            } else {
                                iqn0Var2 = iqn0Var;
                                mj91VarM61939j = mj91VarM61957s.m61950l(obj2 != null ? obj2.hashCode() : 0, obj2, m61962x(iM61945f2), i15, iqn0Var2);
                            }
                        } else {
                            iqn0Var2 = iqn0Var;
                            mj91VarM61939j = mj91VarM61957s;
                        }
                    } else {
                        iqn0Var2 = iqn0Var;
                        int iM61945f3 = m61945f(iLowestOneBit2);
                        Object obj3 = this.f144211d[iM61945f3];
                        Object objM61962x2 = m61962x(iM61945f3);
                        int iM61945f4 = mj91Var.m61945f(iLowestOneBit2);
                        Object obj4 = mj91Var.f144211d[iM61945f4];
                        mj91VarM61939j = m61939j(obj3 != null ? obj3.hashCode() : 0, obj3, objM61962x2, obj4 != null ? obj4.hashCode() : 0, obj4, mj91Var.m61962x(iM61945f4), i + 5, iqn0Var2.f104806b);
                    }
                }
                objArr[length2] = mj91VarM61939j;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i16 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i17 = i16 * 2;
                if (mj91Var.m61947h(iLowestOneBit3)) {
                    int iM61945f5 = mj91Var.m61945f(iLowestOneBit3);
                    Object[] objArr5 = mj91Var2.f144211d;
                    objArr5[i17] = mj91Var.f144211d[iM61945f5];
                    objArr5[i17 + 1] = mj91Var.m61962x(iM61945f5);
                    if (m61947h(iLowestOneBit3)) {
                        bqqVar.f29869a++;
                    }
                } else {
                    int iM61945f6 = m61945f(iLowestOneBit3);
                    Object[] objArr6 = mj91Var2.f144211d;
                    objArr6[i17] = this.f144211d[iM61945f6];
                    objArr6[i17 + 1] = m61962x(iM61945f6);
                }
                i16++;
                i12 ^= iLowestOneBit3;
            }
            if (!m61944e(mj91Var2)) {
                return mj91Var.m61944e(mj91Var2) ? mj91Var : mj91Var2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final mj91 m61952n(int i, Object obj, int i2, iqn0 iqn0Var) {
        mj91 mj91VarM61952n;
        int iM97058u = 1 << zuj0.m97058u(i, i2);
        if (m61947h(iM97058u)) {
            int iM61945f = m61945f(iM97058u);
            if (wj50.m88271j(obj, this.f144211d[iM61945f])) {
                return m61954p(iM61945f, iM97058u, iqn0Var);
            }
        } else if (m61948i(iM97058u)) {
            int iM61958t = m61958t(iM97058u);
            mj91 mj91VarM61957s = m61957s(iM61958t);
            if (i2 == 30) {
                z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, mj91VarM61957s.f144211d.length), 2);
                int i3 = z350VarM63411S.f278778a;
                int i4 = z350VarM63411S.f278779b;
                int i5 = z350VarM63411S.f278780c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!wj50.m88271j(obj, mj91VarM61957s.f144211d[i3])) {
                            if (i3 == i4) {
                                mj91VarM61952n = mj91VarM61957s;
                                break;
                            }
                            i3 += i5;
                        } else {
                            mj91VarM61952n = mj91VarM61957s.m61949k(i3, iqn0Var);
                            break;
                        }
                    }
                } else {
                    mj91VarM61952n = mj91VarM61957s;
                    break;
                }
            } else {
                mj91VarM61952n = mj91VarM61957s.m61952n(i, obj, i2 + 5, iqn0Var);
            }
            return m61955q(mj91VarM61957s, mj91VarM61952n, iM61958t, iM97058u, iqn0Var.f104806b);
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final mj91 m61953o(int i, Object obj, Object obj2, int i2, iqn0 iqn0Var) {
        mj91 mj91Var;
        mj91 mj91VarM61953o;
        int iM97058u = 1 << zuj0.m97058u(i, i2);
        if (m61947h(iM97058u)) {
            int iM61945f = m61945f(iM97058u);
            if (wj50.m88271j(obj, this.f144211d[iM61945f]) && wj50.m88271j(obj2, m61962x(iM61945f))) {
                return m61954p(iM61945f, iM97058u, iqn0Var);
            }
        } else if (m61948i(iM97058u)) {
            int iM61958t = m61958t(iM97058u);
            mj91 mj91VarM61957s = m61957s(iM61958t);
            if (i2 == 30) {
                z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, mj91VarM61957s.f144211d.length), 2);
                int i3 = z350VarM63411S.f278778a;
                int i4 = z350VarM63411S.f278779b;
                int i5 = z350VarM63411S.f278780c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!wj50.m88271j(obj, mj91VarM61957s.f144211d[i3]) || !wj50.m88271j(obj2, mj91VarM61957s.m61962x(i3))) {
                            if (i3 == i4) {
                                mj91VarM61953o = mj91VarM61957s;
                                break;
                            }
                            i3 += i5;
                        } else {
                            mj91VarM61953o = mj91VarM61957s.m61949k(i3, iqn0Var);
                            break;
                        }
                    }
                } else {
                    mj91VarM61953o = mj91VarM61957s;
                    break;
                }
                mj91Var = mj91VarM61957s;
            } else {
                mj91Var = mj91VarM61957s;
                mj91VarM61953o = mj91Var.m61953o(i, obj, obj2, i2 + 5, iqn0Var);
            }
            return m61955q(mj91Var, mj91VarM61953o, iM61958t, iM97058u, iqn0Var.f104806b);
        }
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final mj91 m61954p(int i, int i2, iqn0 iqn0Var) {
        iqn0Var.m51389f(iqn0Var.size() - 1);
        iqn0Var.f104808d = m61962x(i);
        Object[] objArr = this.f144211d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f144210c != iqn0Var.f104806b) {
            return new mj91(i2 ^ this.f144208a, this.f144209b, zuj0.m97043f(i, objArr), iqn0Var.f104806b);
        }
        this.f144211d = zuj0.m97043f(i, objArr);
        this.f144208a ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final mj91 m61955q(mj91 mj91Var, mj91 mj91Var2, int i, int i2, on3 on3Var) {
        on3 on3Var2 = this.f144210c;
        if (mj91Var2 != null) {
            return (on3Var2 == on3Var || mj91Var != mj91Var2) ? m61956r(i, mj91Var2, on3Var) : this;
        }
        Object[] objArr = this.f144211d;
        if (objArr.length == 1) {
            return null;
        }
        if (on3Var2 != on3Var) {
            return new mj91(this.f144208a, i2 ^ this.f144209b, zuj0.m97044g(i, objArr), on3Var);
        }
        this.f144211d = zuj0.m97044g(i, objArr);
        this.f144209b ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final mj91 m61956r(int i, mj91 mj91Var, on3 on3Var) {
        Object[] objArr = this.f144211d;
        if (objArr.length == 1 && mj91Var.f144211d.length == 2 && mj91Var.f144209b == 0) {
            mj91Var.f144208a = this.f144209b;
            return mj91Var;
        }
        if (this.f144210c == on3Var) {
            objArr[i] = mj91Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = mj91Var;
        return new mj91(this.f144208a, this.f144209b, objArrCopyOf, on3Var);
    }

    /* JADX INFO: renamed from: s */
    public final mj91 m61957s(int i) {
        return (mj91) this.f144211d[i];
    }

    /* JADX INFO: renamed from: t */
    public final int m61958t(int i) {
        return (this.f144211d.length - 1) - Integer.bitCount((i - 1) & this.f144209b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        r14.m80323l(m61961w(r12, r4, r14.m80318c()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        return r14;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t9w0 m61959u(int i, Object obj, Object obj2, int i2) {
        t9w0 t9w0VarM61959u;
        int i3 = 1;
        int iM97058u = 1 << zuj0.m97058u(i, i2);
        int i4 = 0;
        if (m61947h(iM97058u)) {
            int iM61945f = m61945f(iM97058u);
            if (!wj50.m88271j(obj, this.f144211d[iM61945f])) {
                return new t9w0(new mj91(this.f144208a ^ iM97058u, this.f144209b | iM97058u, m61940a(iM61945f, iM97058u, i, obj, obj2, i2, null), null), i3, 6);
            }
            if (m61962x(iM61945f) != obj2) {
                Object[] objArr = this.f144211d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iM61945f + 1] = obj2;
                return new t9w0(new mj91(this.f144208a, this.f144209b, objArrCopyOf, null), i4, 6);
            }
        } else {
            if (!m61948i(iM97058u)) {
                return new t9w0(new mj91(this.f144208a | iM97058u, this.f144209b, zuj0.m97042e(this.f144211d, m61945f(iM97058u), obj, obj2), null), i3, 6);
            }
            int iM61958t = m61958t(iM97058u);
            mj91 mj91VarM61957s = m61957s(iM61958t);
            if (i2 == 30) {
                z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, mj91VarM61957s.f144211d.length), 2);
                int i5 = z350VarM63411S.f278778a;
                int i6 = z350VarM63411S.f278779b;
                int i7 = z350VarM63411S.f278780c;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        if (!wj50.m88271j(obj, mj91VarM61957s.f144211d[i5])) {
                            if (i5 == i6) {
                                t9w0VarM61959u = new t9w0(new mj91(0, 0, zuj0.m97042e(mj91VarM61957s.f144211d, 0, obj, obj2), null), i3, 6);
                                break;
                            }
                            i5 += i7;
                        } else {
                            if (obj2 != mj91VarM61957s.m61962x(i5)) {
                                Object[] objArr2 = mj91VarM61957s.f144211d;
                                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                objArrCopyOf2[i5 + 1] = obj2;
                                t9w0VarM61959u = new t9w0(new mj91(0, 0, objArrCopyOf2, null), i4, 6);
                                break;
                            }
                            t9w0VarM61959u = null;
                            break;
                        }
                    }
                } else {
                    t9w0VarM61959u = new t9w0(new mj91(0, 0, zuj0.m97042e(mj91VarM61957s.f144211d, 0, obj, obj2), null), i3, 6);
                    break;
                }
            } else {
                t9w0VarM61959u = mj91VarM61957s.m61959u(i, obj, obj2, i2 + 5);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final mj91 m61960v(int i, int i2, Object obj) {
        mj91 mj91VarM61960v;
        int iM97058u = 1 << zuj0.m97058u(i, i2);
        if (m61947h(iM97058u)) {
            int iM61945f = m61945f(iM97058u);
            if (wj50.m88271j(obj, this.f144211d[iM61945f])) {
                Object[] objArr = this.f144211d;
                if (objArr.length == 2) {
                    return null;
                }
                return new mj91(this.f144208a ^ iM97058u, this.f144209b, zuj0.m97043f(iM61945f, objArr), null);
            }
        } else if (m61948i(iM97058u)) {
            int iM61958t = m61958t(iM97058u);
            mj91 mj91VarM61957s = m61957s(iM61958t);
            if (i2 == 30) {
                z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, mj91VarM61957s.f144211d.length), 2);
                int i3 = z350VarM63411S.f278778a;
                int i4 = z350VarM63411S.f278779b;
                int i5 = z350VarM63411S.f278780c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!wj50.m88271j(obj, mj91VarM61957s.f144211d[i3])) {
                            if (i3 == i4) {
                                mj91VarM61960v = mj91VarM61957s;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = mj91VarM61957s.f144211d;
                            if (objArr2.length != 2) {
                                mj91VarM61960v = new mj91(0, 0, zuj0.m97043f(i3, objArr2), null);
                                break;
                            }
                            mj91VarM61960v = null;
                            break;
                        }
                    }
                } else {
                    mj91VarM61960v = mj91VarM61957s;
                    break;
                }
            } else {
                mj91VarM61960v = mj91VarM61957s.m61960v(i, i2 + 5, obj);
            }
            if (mj91VarM61960v == null) {
                Object[] objArr3 = this.f144211d;
                if (objArr3.length == 1) {
                    return null;
                }
                return new mj91(this.f144208a, iM97058u ^ this.f144209b, zuj0.m97044g(iM61958t, objArr3), null);
            }
            if (mj91VarM61957s != mj91VarM61960v) {
                return m61961w(iM61958t, iM97058u, mj91VarM61960v);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final mj91 m61961w(int i, int i2, mj91 mj91Var) {
        Object[] objArr = mj91Var.f144211d;
        if (objArr.length != 2 || mj91Var.f144209b != 0) {
            Object[] objArr2 = this.f144211d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = mj91Var;
            return new mj91(this.f144208a, this.f144209b, objArrCopyOf, null);
        }
        if (this.f144211d.length == 1) {
            mj91Var.f144208a = this.f144209b;
            return mj91Var;
        }
        return new mj91(this.f144208a ^ i2, i2 ^ this.f144209b, zuj0.m97046i(i, m61945f(i2), objArr[0], objArr[1], this.f144211d), null);
    }

    /* JADX INFO: renamed from: x */
    public final Object m61962x(int i) {
        return this.f144211d[i + 1];
    }
}
