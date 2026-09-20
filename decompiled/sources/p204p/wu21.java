package p204p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wu21 {

    /* JADX INFO: renamed from: a */
    public final ou21 f255070a;

    /* JADX INFO: renamed from: b */
    public int[] f255071b;

    /* JADX INFO: renamed from: c */
    public Object[] f255072c;

    /* JADX INFO: renamed from: d */
    public ArrayList f255073d;

    /* JADX INFO: renamed from: e */
    public HashMap f255074e;

    /* JADX INFO: renamed from: f */
    public toi0 f255075f;

    /* JADX INFO: renamed from: g */
    public int f255076g;

    /* JADX INFO: renamed from: h */
    public int f255077h;

    /* JADX INFO: renamed from: i */
    public int f255078i;

    /* JADX INFO: renamed from: j */
    public int f255079j;

    /* JADX INFO: renamed from: k */
    public int f255080k;

    /* JADX INFO: renamed from: l */
    public int f255081l;

    /* JADX INFO: renamed from: m */
    public int f255082m;

    /* JADX INFO: renamed from: n */
    public int f255083n;

    /* JADX INFO: renamed from: o */
    public int f255084o;

    /* JADX INFO: renamed from: p */
    public final sgz f255085p;

    /* JADX INFO: renamed from: q */
    public final sgz f255086q;

    /* JADX INFO: renamed from: r */
    public final sgz f255087r;

    /* JADX INFO: renamed from: s */
    public toi0 f255088s;

    /* JADX INFO: renamed from: t */
    public int f255089t;

    /* JADX INFO: renamed from: u */
    public int f255090u;

    /* JADX INFO: renamed from: v */
    public int f255091v;

    /* JADX INFO: renamed from: w */
    public boolean f255092w;

    /* JADX INFO: renamed from: x */
    public soi0 f255093x;

    static {
        new x74(26);
    }

    public wu21(ou21 ou21Var) {
        this.f255070a = ou21Var;
        int[] iArr = ou21Var.f170146a;
        this.f255071b = iArr;
        Object[] objArr = ou21Var.f170148c;
        this.f255072c = objArr;
        this.f255073d = ou21Var.f170154i;
        this.f255074e = ou21Var.f170155t;
        this.f255075f = ou21Var.f170145X;
        int i = ou21Var.f170147b;
        this.f255076g = i;
        this.f255077h = (iArr.length / 5) - i;
        int i2 = ou21Var.f170149d;
        this.f255080k = i2;
        this.f255081l = objArr.length - i2;
        this.f255082m = i;
        this.f255085p = new sgz(2, (byte) 0);
        this.f255086q = new sgz(2, (byte) 0);
        this.f255087r = new sgz(2, (byte) 0);
        this.f255090u = i;
        this.f255091v = -1;
    }

    /* JADX INFO: renamed from: i */
    public static int m88961i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    /* JADX INFO: renamed from: z */
    public static void m88962z(wu21 wu21Var) {
        int i = wu21Var.f255091v;
        int iM89003r = wu21Var.m89003r(i);
        int[] iArr = wu21Var.f255071b;
        int i2 = (iM89003r * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        wu21Var.m88985W(wu21Var.m88969G(iArr, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final void m88963A(ou21 ou21Var, int i) {
        if (this.f255083n <= 0) {
            vph.m86124a("Check failed");
        }
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0 && this.f255089t == 0 && this.f255070a.f170147b == 0) {
            int[] iArr = ou21Var.f170146a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = ou21Var.f170147b;
            if (i2 == i3) {
                int[] iArr2 = this.f255071b;
                Object[] objArr3 = this.f255072c;
                ArrayList arrayList = this.f255073d;
                HashMap map = this.f255074e;
                toi0 toi0Var = this.f255075f;
                Object[] objArr4 = ou21Var.f170148c;
                int i4 = ou21Var.f170149d;
                HashMap map2 = ou21Var.f170155t;
                toi0 toi0Var2 = ou21Var.f170145X;
                this.f255071b = iArr;
                this.f255072c = objArr4;
                this.f255073d = ou21Var.f170154i;
                this.f255076g = i3;
                this.f255077h = (iArr.length / 5) - i3;
                this.f255080k = i4;
                this.f255081l = objArr4.length - i4;
                this.f255082m = i3;
                this.f255074e = map2;
                this.f255075f = toi0Var2;
                ou21Var.f170146a = iArr2;
                ou21Var.f170147b = objArr2 == true ? 1 : 0;
                ou21Var.f170148c = objArr3;
                ou21Var.f170149d = objArr == true ? 1 : 0;
                ou21Var.f170154i = arrayList;
                ou21Var.f170155t = map;
                ou21Var.f170145X = toi0Var;
                return;
            }
        }
        wu21 wu21VarM68080i = ou21Var.m68080i();
        try {
            x74.m90124y(wu21VarM68080i, i, this, true, true, false);
            boolean z2 = true;
        } finally {
            wu21VarM68080i.m88991e(z);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m88964B(int i) {
        rq00 rq00Var;
        int i2;
        rq00 rq00Var2;
        int i3;
        int i4;
        int i5 = this.f255077h;
        int i6 = this.f255076g;
        if (i6 != i) {
            if (!this.f255073d.isEmpty()) {
                int iM89000o = m89000o() - this.f255077h;
                if (i6 < i) {
                    for (int iM73867a = qu21.m73867a(this.f255073d, i6, iM89000o); iM73867a < this.f255073d.size() && (i3 = (rq00Var2 = (rq00) this.f255073d.get(iM73867a)).f201675a) < 0 && (i4 = i3 + iM89000o) < i; iM73867a++) {
                        rq00Var2.f201675a = i4;
                    }
                } else {
                    for (int iM73867a2 = qu21.m73867a(this.f255073d, i, iM89000o); iM73867a2 < this.f255073d.size() && (i2 = (rq00Var = (rq00) this.f255073d.get(iM73867a2)).f201675a) >= 0; iM73867a2++) {
                        rq00Var.f201675a = -(iM89000o - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.f255071b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    bk5.m29627o0(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    bk5.m29627o0(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iM89000o2 = m89000o();
            if (i6 >= iM89000o2) {
                vph.m86124a("Check failed");
            }
            while (i6 < iM89000o2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.f255071b[i10];
                int iM89001p = i11 > -2 ? i11 : (m89001p() + i11) - (-2);
                if (iM89001p >= i) {
                    iM89001p = -((m89001p() - iM89001p) - (-2));
                }
                if (iM89001p != i11) {
                    this.f255071b[i10] = iM89001p;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f255076g = i;
    }

    /* JADX INFO: renamed from: C */
    public final void m88965C(int i, int i2) {
        int i3 = this.f255081l;
        int i4 = this.f255080k;
        int i5 = this.f255082m;
        if (i4 != i) {
            Object[] objArr = this.f255072c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, m89001p());
        if (i5 != iMin) {
            int length = this.f255072c.length - i3;
            if (iMin < i5) {
                int iM89003r = m89003r(iMin);
                int iM89003r2 = m89003r(i5);
                int i7 = this.f255076g;
                while (iM89003r < iM89003r2) {
                    int i8 = (iM89003r * 5) + 4;
                    int i9 = this.f255071b[i8];
                    if (!(i9 >= 0)) {
                        vph.m86124a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f255071b[i8] = -((length - i9) + 1);
                    iM89003r++;
                    if (iM89003r == i7) {
                        iM89003r += this.f255077h;
                    }
                }
            } else {
                int iM89003r3 = m89003r(i5);
                int iM89003r4 = m89003r(iMin);
                while (iM89003r3 < iM89003r4) {
                    int i10 = (iM89003r3 * 5) + 4;
                    int i11 = this.f255071b[i10];
                    if (!(i11 < 0)) {
                        vph.m86124a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f255071b[i10] = i11 + length + 1;
                    iM89003r3++;
                    if (iM89003r3 == this.f255076g) {
                        iM89003r3 += this.f255077h;
                    }
                }
            }
            this.f255082m = iMin;
        }
        this.f255080k = i;
    }

    /* JADX INFO: renamed from: D */
    public final List m88966D(rq00 rq00Var, wu21 wu21Var) {
        if (wu21Var.f255083n <= 0) {
            vph.m86124a("Check failed");
        }
        if (this.f255083n != 0) {
            vph.m86124a("Check failed");
        }
        if (!rq00Var.m76206a()) {
            vph.m86124a("Check failed");
        }
        int iM88989c = m88989c(rq00Var) + 1;
        int i = this.f255089t;
        if (i > iM88989c || iM88989c >= this.f255090u) {
            vph.m86124a("Check failed");
        }
        int iM88969G = m88969G(this.f255071b, iM88989c);
        int iM89006u = m89006u(iM88989c);
        int iM88968F = m89010y(iM88989c) ? 1 : m88968F(iM88989c);
        List listM90124y = x74.m90124y(this, iM88989c, wu21Var, false, false, true);
        m88985W(iM88969G);
        boolean z = iM88968F > 0;
        while (iM88969G >= i) {
            int iM89003r = m89003r(iM88969G);
            int[] iArr = this.f255071b;
            int i2 = iM89003r * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - iM89006u;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    qu21.m73869c(iM89003r, (i4 & 67108863) - iM88968F, iArr);
                }
            }
            iM88969G = m88969G(this.f255071b, iM88969G);
        }
        if (z) {
            if (this.f255084o < iM88968F) {
                vph.m86124a("Check failed");
            }
            this.f255084o -= iM88968F;
        }
        return listM90124y;
    }

    /* JADX INFO: renamed from: E */
    public final Object m88967E(int i) {
        int iM89003r = m89003r(i);
        int[] iArr = this.f255071b;
        if ((iArr[(iM89003r * 5) + 1] & 1073741824) != 0) {
            return this.f255072c[m88994h(m88993g(iArr, iM89003r))];
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public final int m88968F(int i) {
        return this.f255071b[(m89003r(i) * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: G */
    public final int m88969G(int[] iArr, int i) {
        int i2 = iArr[(m89003r(i) * 5) + 2];
        return i2 > -2 ? i2 : (m89001p() + i2) - (-2);
    }

    /* JADX INFO: renamed from: H */
    public final Object m88970H(Object obj) {
        if (this.f255083n > 0) {
            m89009x(1, this.f255091v);
        }
        Object[] objArr = this.f255072c;
        int i = this.f255078i;
        this.f255078i = i + 1;
        Object obj2 = objArr[m88994h(i)];
        if (this.f255078i > this.f255079j) {
            vph.m86124a("Writing to an invalid slot");
        }
        this.f255072c[m88994h(this.f255078i - 1)] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: I */
    public final void m88971I() {
        int i;
        soi0 soi0Var = this.f255093x;
        if (soi0Var != null) {
            while (xtf1.m92016D(soi0Var)) {
                int iM92023K = xtf1.m92023K(soi0Var);
                int iM89003r = m89003r(iM92023K);
                int iM89006u = iM92023K + 1;
                int iM89006u2 = m89006u(iM92023K) + iM92023K;
                while (true) {
                    if (iM89006u >= iM89006u2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f255071b[(m89003r(iM89006u) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iM89006u += m89006u(iM89006u);
                    }
                }
                int[] iArr = this.f255071b;
                int i2 = (iM89003r * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iM88969G = m88969G(iArr, iM92023K);
                    if (iM88969G >= 0) {
                        xtf1.m92048w(soi0Var, iM88969G);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final boolean m88972J() {
        if (this.f255083n != 0) {
            vph.m86124a("Cannot remove group while inserting");
        }
        int i = this.f255089t;
        int i2 = this.f255078i;
        int iM88993g = m88993g(this.f255071b, m89003r(i));
        int iM88976N = m88976N();
        m88979Q(this.f255091v);
        soi0 soi0Var = this.f255093x;
        if (soi0Var != null) {
            while (xtf1.m92016D(soi0Var) && xtf1.m92019G(soi0Var) >= i) {
                xtf1.m92023K(soi0Var);
            }
        }
        boolean zM88973K = m88973K(i, this.f255089t - i);
        m88974L(iM88993g, this.f255078i - iM88993g, i - 1);
        this.f255089t = i;
        this.f255078i = i2;
        this.f255084o -= iM88976N;
        return zM88973K;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m88973K(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.f255073d;
            m88964B(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f255074e;
                int i3 = i + i2;
                int iM73867a = qu21.m73867a(this.f255073d, i3, m89000o() - this.f255077h);
                if (iM73867a >= this.f255073d.size()) {
                    iM73867a--;
                }
                int i4 = iM73867a + 1;
                int i5 = 0;
                while (iM73867a >= 0) {
                    rq00 rq00Var = (rq00) this.f255073d.get(iM73867a);
                    int iM88989c = m88989c(rq00Var);
                    if (iM88989c < i) {
                        break;
                    }
                    if (iM88989c < i3) {
                        rq00Var.f201675a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iM73867a + 1;
                        }
                        i4 = iM73867a;
                    }
                    iM73867a--;
                }
                z = i4 < i5;
                if (z) {
                    this.f255073d.subList(i4, i5).clear();
                }
            }
            this.f255076g = i;
            this.f255077h += i2;
            int i6 = this.f255082m;
            if (i6 > i) {
                this.f255082m = Math.max(i, i6 - i2);
            }
            int i7 = this.f255090u;
            if (i7 >= this.f255076g) {
                this.f255090u = i7 - i2;
            }
            int i8 = this.f255091v;
            if (i8 >= 0 && (this.f255071b[(m89003r(i8) * 5) + 1] & 67108864) != 0) {
                m88985W(i8);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: L */
    public final void m88974L(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f255081l;
            int i5 = i + i2;
            m88965C(i5, i3);
            this.f255080k = i;
            this.f255081l = i4 + i2;
            bk5.m29578A0(this.f255072c, null, i, i5);
            int i6 = this.f255079j;
            if (i6 >= i) {
                this.f255079j = i6 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final Object m88975M(int i, int i2, Object obj) {
        int iM88978P = m88978P(this.f255071b, m89003r(i));
        int iM88993g = m88993g(this.f255071b, m89003r(i + 1));
        int i3 = iM88978P + i2;
        if (i3 < iM88978P || i3 >= iM88993g) {
            vph.m86124a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iM88994h = m88994h(i3);
        Object[] objArr = this.f255072c;
        Object obj2 = objArr[iM88994h];
        objArr[iM88994h] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: N */
    public final int m88976N() {
        int iM89003r = m89003r(this.f255089t);
        int i = this.f255089t;
        int[] iArr = this.f255071b;
        int i2 = iM89003r * 5;
        int i3 = iArr[i2 + 3] + i;
        this.f255089t = i3;
        this.f255078i = m88993g(iArr, m89003r(i3));
        int i4 = this.f255071b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    /* JADX INFO: renamed from: O */
    public final void m88977O() {
        int i = this.f255090u;
        this.f255089t = i;
        this.f255078i = m88993g(this.f255071b, m89003r(i));
    }

    /* JADX INFO: renamed from: P */
    public final int m88978P(int[] iArr, int i) {
        if (i >= m89000o()) {
            return this.f255072c.length - this.f255081l;
        }
        int iM73868b = qu21.m73868b(iArr, i);
        return iM73868b < 0 ? (this.f255072c.length - this.f255081l) + iM73868b + 1 : iM73868b;
    }

    /* JADX INFO: renamed from: Q */
    public final zq00 m88979Q(int i) {
        rq00 rq00VarM88982T;
        HashMap map = this.f255074e;
        if (map == null || (rq00VarM88982T = m88982T(i)) == null) {
            return null;
        }
        return (zq00) map.get(rq00VarM88982T);
    }

    /* JADX INFO: renamed from: R */
    public final void m88980R() {
        if (this.f255083n != 0) {
            vph.m86124a("Key must be supplied when inserting");
        }
        ia7 ia7Var = t6x0.f217647t;
        m88981S(ia7Var, ia7Var, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final void m88981S(Object obj, Object obj2, boolean z, int i) {
        int i2;
        ia7 ia7Var = t6x0.f217647t;
        int i3 = this.f255091v;
        Object[] objArr = this.f255083n > 0;
        this.f255087r.m78119f(this.f255084o);
        if (objArr == true) {
            int i4 = this.f255089t;
            int iM88993g = m88993g(this.f255071b, m89003r(i4));
            m89008w(1);
            this.f255078i = iM88993g;
            this.f255079j = iM88993g;
            int iM89003r = m89003r(i4);
            int i5 = obj != ia7Var ? 1 : 0;
            int i6 = (z || obj2 == ia7Var) ? 0 : 1;
            int iM88961i = m88961i(iM88993g, this.f255080k, this.f255081l, this.f255072c.length);
            if (iM88961i >= 0 && this.f255082m < i4) {
                iM88961i = -(((this.f255072c.length - this.f255081l) - iM88961i) + 1);
            }
            int[] iArr = this.f255071b;
            int i7 = this.f255091v;
            int i8 = iM89003r * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iM88961i;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                m89009x(i9, i4);
                Object[] objArr2 = this.f255072c;
                int i10 = this.f255078i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.f255078i = i10;
            }
            this.f255084o = 0;
            i2 = i4 + 1;
            this.f255091v = i4;
            this.f255089t = i2;
            if (i3 >= 0) {
                m88979Q(i3);
            }
        } else {
            this.f255085p.m78119f(i3);
            this.f255086q.m78119f((m89000o() - this.f255077h) - this.f255090u);
            int i11 = this.f255089t;
            int iM89003r2 = m89003r(i11);
            if (!wj50.m88271j(obj2, ia7Var)) {
                if (z) {
                    m88986X(this.f255089t, obj2);
                } else {
                    m88984V(obj2);
                }
            }
            this.f255078i = m88978P(this.f255071b, iM89003r2);
            this.f255079j = m88993g(this.f255071b, m89003r(this.f255089t + 1));
            int[] iArr2 = this.f255071b;
            int i12 = iM89003r2 * 5;
            this.f255084o = iArr2[i12 + 1] & 67108863;
            this.f255091v = i11;
            this.f255089t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.f255090u = i2;
    }

    /* JADX INFO: renamed from: T */
    public final rq00 m88982T(int i) {
        ArrayList arrayList;
        int iM73871e;
        if (i < 0 || i >= m89001p() || (iM73871e = qu21.m73871e((arrayList = this.f255073d), i, m89001p())) < 0) {
            return null;
        }
        return (rq00) arrayList.get(iM73871e);
    }

    /* JADX INFO: renamed from: U */
    public final void m88983U(Object obj) {
        if (this.f255083n <= 0 || this.f255078i == this.f255080k) {
            m88970H(obj);
            return;
        }
        toi0 toi0Var = this.f255088s;
        if (toi0Var == null) {
            toi0Var = new toi0();
        }
        this.f255088s = toi0Var;
        int i = this.f255091v;
        Object objM87103b = toi0Var.m87103b(i);
        if (objM87103b == null) {
            objM87103b = new jpi0();
            toi0Var.m81201i(i, objM87103b);
        }
        ((jpi0) objM87103b).m53954a(obj);
    }

    /* JADX INFO: renamed from: V */
    public final void m88984V(Object obj) {
        int iM89003r = m89003r(this.f255089t);
        int i = (iM89003r * 5) + 1;
        if ((this.f255071b[i] & 268435456) == 0) {
            vph.m86124a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f255072c;
        int[] iArr = this.f255071b;
        objArr[m88994h(Integer.bitCount(iArr[i] >> 29) + m88993g(iArr, iM89003r))] = obj;
    }

    /* JADX INFO: renamed from: W */
    public final void m88985W(int i) {
        if (i >= 0) {
            soi0 soi0VarM92049x = this.f255093x;
            if (soi0VarM92049x == null) {
                soi0VarM92049x = xtf1.m92049x();
                this.f255093x = soi0VarM92049x;
            }
            xtf1.m92048w(soi0VarM92049x, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: X */
    public final void m88986X(int i, Object obj) {
        boolean z;
        int iM89003r = m89003r(i);
        int[] iArr = this.f255071b;
        if (iM89003r < iArr.length) {
            z = (iArr[(iM89003r * 5) + 1] & 1073741824) != 0;
        }
        if (!z) {
            vph.m86124a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f255072c[m88994h(m88993g(this.f255071b, iM89003r))] = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m88987a(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            vph.m86124a("Cannot seek backwards");
        }
        if (!(this.f255083n <= 0)) {
            lfq0.m58914b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f255089t + i;
        if (i2 >= this.f255091v && i2 <= this.f255090u) {
            z = true;
        }
        if (!z) {
            vph.m86124a("Cannot seek outside the current group (" + this.f255091v + '-' + this.f255090u + ')');
        }
        this.f255089t = i2;
        int iM88993g = m88993g(this.f255071b, m89003r(i2));
        this.f255078i = iM88993g;
        this.f255079j = iM88993g;
    }

    /* JADX INFO: renamed from: b */
    public final rq00 m88988b(int i) {
        ArrayList arrayList = this.f255073d;
        int iM73871e = qu21.m73871e(arrayList, i, m89001p());
        if (iM73871e >= 0) {
            return (rq00) arrayList.get(iM73871e);
        }
        if (i > this.f255076g) {
            i = -(m89001p() - i);
        }
        rq00 rq00Var = new rq00(i);
        arrayList.add(-(iM73871e + 1), rq00Var);
        return rq00Var;
    }

    /* JADX INFO: renamed from: c */
    public final int m88989c(rq00 rq00Var) {
        int i = rq00Var.f201675a;
        return i < 0 ? m89001p() + i : i;
    }

    /* JADX INFO: renamed from: d */
    public final void m88990d() {
        int i = this.f255083n;
        this.f255083n = i + 1;
        if (i == 0) {
            this.f255086q.m78119f((m89000o() - this.f255077h) - this.f255090u);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m88991e(boolean z) {
        this.f255092w = true;
        if (z && this.f255085p.f208958b == 0) {
            m88964B(m89001p());
            m88965C(this.f255072c.length - this.f255081l, this.f255076g);
            int i = this.f255080k;
            bk5.m29578A0(this.f255072c, null, i, this.f255081l + i);
            m88971I();
        }
        int[] iArr = this.f255071b;
        int i2 = this.f255076g;
        Object[] objArr = this.f255072c;
        int i3 = this.f255080k;
        ArrayList arrayList = this.f255073d;
        HashMap map = this.f255074e;
        toi0 toi0Var = this.f255075f;
        ou21 ou21Var = this.f255070a;
        if (!ou21Var.f170152g) {
            lfq0.m58913a("Unexpected writer close()");
        }
        ou21Var.f170152g = false;
        ou21Var.f170146a = iArr;
        ou21Var.f170147b = i2;
        ou21Var.f170148c = objArr;
        ou21Var.f170149d = i3;
        ou21Var.f170154i = arrayList;
        ou21Var.f170155t = map;
        ou21Var.f170145X = toi0Var;
    }

    /* JADX INFO: renamed from: f */
    public final int m88992f(int i) {
        return m88993g(this.f255071b, m89003r(i));
    }

    /* JADX INFO: renamed from: g */
    public final int m88993g(int[] iArr, int i) {
        if (i >= m89000o()) {
            return this.f255072c.length - this.f255081l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f255072c.length - this.f255081l) + i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: h */
    public final int m88994h(int i) {
        return (this.f255081l * (i < this.f255080k ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: j */
    public final void m88995j() {
        jpi0 jpi0Var;
        boolean z = this.f255083n > 0;
        int i = this.f255089t;
        int i2 = this.f255090u;
        int i3 = this.f255091v;
        int iM89003r = m89003r(i3);
        int i4 = this.f255084o;
        int i5 = i - i3;
        int i6 = iM89003r * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.f255071b[i7] & 1073741824) != 0;
        sgz sgzVar = this.f255087r;
        if (z) {
            toi0 toi0Var = this.f255088s;
            if (toi0Var != null && (jpi0Var = (jpi0) toi0Var.m87103b(i3)) != null) {
                Object[] objArr = jpi0Var.f114675a;
                int i8 = jpi0Var.f114676b;
                for (int i9 = 0; i9 < i8; i9++) {
                    m88970H(objArr[i9]);
                }
            }
            int[] iArr = this.f255071b;
            iArr[i6 + 3] = i5;
            qu21.m73869c(iM89003r, i4, iArr);
            int iM78118e = sgzVar.m78118e();
            if (z2) {
                i4 = 1;
            }
            this.f255084o = iM78118e + i4;
            int iM88969G = m88969G(this.f255071b, i3);
            this.f255091v = iM88969G;
            int iM89001p = iM88969G < 0 ? m89001p() : m89003r(iM88969G + 1);
            int iM88993g = iM89001p >= 0 ? m88993g(this.f255071b, iM89001p) : 0;
            this.f255078i = iM88993g;
            this.f255079j = iM88993g;
            return;
        }
        if (i != i2) {
            vph.m86124a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f255071b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        qu21.m73869c(iM89003r, i4, iArr2);
        int iM78118e2 = this.f255085p.m78118e();
        this.f255090u = (m89000o() - this.f255077h) - this.f255086q.m78118e();
        this.f255091v = iM78118e2;
        int iM88969G2 = m88969G(this.f255071b, i3);
        int iM78118e3 = sgzVar.m78118e();
        this.f255084o = iM78118e3;
        if (iM88969G2 == iM78118e2) {
            this.f255084o = iM78118e3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iM88969G2 != 0 && iM88969G2 != iM78118e2 && (i14 != 0 || i13 != 0)) {
                int iM89003r2 = m89003r(iM88969G2);
                if (i13 != 0) {
                    int[] iArr3 = this.f255071b;
                    int i15 = (iM89003r2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.f255071b;
                    qu21.m73869c(iM89003r2, (iArr4[(iM89003r2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.f255071b;
                if ((iArr5[(iM89003r2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iM88969G2 = m88969G(iArr5, iM88969G2);
            }
        }
        this.f255084o += i14;
    }

    /* JADX INFO: renamed from: k */
    public final void m88996k() {
        if (this.f255083n <= 0) {
            lfq0.m58914b("Unbalanced begin/end insert");
        }
        int i = this.f255083n - 1;
        this.f255083n = i;
        if (i == 0) {
            if (this.f255087r.f208958b != this.f255085p.f208958b) {
                vph.m86124a("startGroup/endGroup mismatch while inserting");
            }
            this.f255090u = (m89000o() - this.f255077h) - this.f255086q.m78118e();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m88997l(int i) {
        boolean z = false;
        if (!(this.f255083n <= 0)) {
            vph.m86124a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.f255091v;
        if (i2 != i) {
            if (i >= i2 && i < this.f255090u) {
                z = true;
            }
            if (!z) {
                vph.m86124a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.f255089t;
            int i4 = this.f255078i;
            int i5 = this.f255079j;
            this.f255089t = i;
            m88980R();
            this.f255089t = i3;
            this.f255078i = i4;
            this.f255079j = i5;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m88998m(int i, int i2, int i3) {
        if (i >= this.f255076g) {
            i = -((m89001p() - i) + 2);
        }
        while (i3 < i2) {
            this.f255071b[(m89003r(i3) * 5) + 2] = i;
            int i4 = this.f255071b[(m89003r(i3) * 5) + 3] + i3;
            m88998m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m88999n(int i, th00 th00Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int iM88969G = m88969G(this.f255071b, i);
        int iM89001p = m89001p();
        int iM89006u = m89006u(i) + i;
        int i6 = i;
        uoi0 uoi0Var = null;
        soi0 soi0Var = null;
        while (i6 < iM89006u) {
            int iM88992f = m88992f(i6);
            int i7 = i6 + 1;
            int iM88992f2 = m88992f(i7);
            while (iM88992f < iM88992f2) {
                Object obj = this.f255072c[m88994h(iM88992f)];
                if (!(obj instanceof f9w0) || (i5 = riw0.m75632z((f9w0) obj).f29926b) < 0) {
                    i4 = iM88969G;
                    th00Var.invoke(Integer.valueOf(iM88992f), obj);
                } else {
                    int iM89006u2 = m89006u(i6) + i6;
                    int i8 = i7;
                    int i9 = 0;
                    while (i8 < iM89006u2 && i9 < i5) {
                        int iM89003r = m89003r(i8);
                        int i10 = iM88969G;
                        int[] iArr = this.f255071b;
                        int i11 = iM89003r * 5;
                        i8 = iArr[i11 + 3] + i8;
                        if (i8 < iM89006u2 && (iArr[i11 + 1] & 536870912) == 0) {
                            i9++;
                        }
                        iM88969G = i10;
                    }
                    i4 = iM88969G;
                    if (uoi0Var == null) {
                        int[] iArr2 = f450.f65676a;
                        uoi0Var = new uoi0();
                    }
                    if (soi0Var == null) {
                        soi0Var = new soi0();
                    }
                    uoi0Var.m83620a(i8);
                    soi0Var.m78648a(i8);
                    soi0Var.m78648a(iM88992f);
                }
                iM88992f++;
                iM88969G = i4;
            }
            int i12 = iM88969G;
            iM88969G = i7 < iM89001p ? m88969G(this.f255071b, i7) : -1;
            if (iM88969G != i6) {
                int iM88969G2 = i12;
                while (true) {
                    if (soi0Var == null || uoi0Var == null || !uoi0Var.m83626g(i6)) {
                        i2 = iM89001p;
                    } else {
                        int i13 = soi0Var.f211200b;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int i18 = iM89001p;
                            int iM78650c = soi0Var.m78650c(i17);
                            if (iM78650c == i6) {
                                int iM78650c2 = soi0Var.m78650c(i17 + 1);
                                th00Var.invoke(Integer.valueOf(iM78650c2), this.f255072c[m88994h(iM78650c2)]);
                            } else if (i17 != i16) {
                                int i19 = i16 + 1;
                                soi0Var.m78654g(i16, iM78650c);
                                i16 += 2;
                                soi0Var.m78654g(i19, soi0Var.m78650c(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            th00Var = th00Var;
                            iM89001p = i18;
                        }
                        i2 = iM89001p;
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i3 = soi0Var.f211200b) || i13 < 0 || i13 > i3) {
                                epv0.m39675K("Index must be between 0 and size");
                                throw null;
                            }
                            if (i13 < i16) {
                                epv0.m39674J("The end index must be < start index");
                                throw null;
                            }
                            if (i13 != i16) {
                                if (i13 < i3) {
                                    int[] iArr3 = soi0Var.f211199a;
                                    bk5.m29627o0(i16, i13, i3, iArr3, iArr3);
                                }
                                soi0Var.f211200b -= i13 - i16;
                            }
                        }
                    }
                    if (i6 == i || iM88969G2 == iM88969G) {
                        break;
                    }
                    i6 = iM88969G2;
                    iM89001p = i2;
                    iM88969G2 = m88969G(this.f255071b, iM88969G2);
                    th00Var = th00Var;
                }
            } else {
                i2 = iM89001p;
            }
            i6 = i7;
            iM89001p = i2;
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m89000o() {
        return this.f255071b.length / 5;
    }

    /* JADX INFO: renamed from: p */
    public final int m89001p() {
        return m89000o() - this.f255077h;
    }

    /* JADX INFO: renamed from: q */
    public final Object m89002q(int i) {
        int iM89003r = m89003r(i);
        int[] iArr = this.f255071b;
        int i2 = (iM89003r * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return t6x0.f217647t;
        }
        return this.f255072c[Integer.bitCount(iArr[i2] >> 29) + m88993g(iArr, iM89003r)];
    }

    /* JADX INFO: renamed from: r */
    public final int m89003r(int i) {
        return (this.f255077h * (i < this.f255076g ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: s */
    public final int m89004s(int i) {
        return this.f255071b[m89003r(i) * 5];
    }

    /* JADX INFO: renamed from: t */
    public final Object m89005t(int i) {
        int iM89003r = m89003r(i);
        int[] iArr = this.f255071b;
        int i2 = iM89003r * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f255072c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f255089t + " end=" + this.f255090u + " size = " + m89001p() + " gap=" + this.f255076g + '-' + (this.f255076g + this.f255077h) + ')';
    }

    /* JADX INFO: renamed from: u */
    public final int m89006u(int i) {
        return this.f255071b[(m89003r(i) * 5) + 3];
    }

    /* JADX INFO: renamed from: v */
    public final boolean m89007v(int i, int i2) {
        int iM89000o;
        int iM89006u;
        if (i2 == this.f255091v) {
            iM89000o = this.f255090u;
        } else {
            sgz sgzVar = this.f255085p;
            if (i2 > sgzVar.m78117d(0)) {
                iM89006u = m89006u(i2);
            } else {
                int[] iArr = (int[]) sgzVar.f208959c;
                int iMin = Math.min(iArr.length, sgzVar.f208958b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iM89006u = m89006u(i2);
                } else {
                    iM89000o = (m89000o() - this.f255077h) - ((int[]) this.f255086q.f208959c)[i3];
                }
            }
            iM89000o = iM89006u + i2;
        }
        return i > i2 && i < iM89000o;
    }

    /* JADX INFO: renamed from: w */
    public final void m89008w(int i) {
        if (i > 0) {
            int i2 = this.f255089t;
            m88964B(i2);
            int i3 = this.f255076g;
            int i4 = this.f255077h;
            int[] iArr = this.f255071b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                bk5.m29627o0(0, 0, i3 * 5, iArr, iArr2);
                bk5.m29627o0((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.f255071b = iArr2;
                i4 = i6;
            }
            int i7 = this.f255090u;
            if (i7 >= i3) {
                this.f255090u = i7 + i;
            }
            int i8 = i3 + i;
            this.f255076g = i8;
            this.f255077h = i4 - i;
            int iM88961i = m88961i(i5 > 0 ? m88992f(i2 + i) : 0, this.f255082m >= i3 ? this.f255080k : 0, this.f255081l, this.f255072c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.f255071b[(i9 * 5) + 4] = iM88961i;
            }
            int i10 = this.f255082m;
            if (i10 >= i3) {
                this.f255082m = i10 + i;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m89009x(int i, int i2) {
        if (i > 0) {
            m88965C(this.f255078i, i2);
            int i3 = this.f255080k;
            int i4 = this.f255081l;
            if (i4 < i) {
                Object[] objArr = this.f255072c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.f255072c = objArr2;
                i4 = i7;
            }
            int i9 = this.f255079j;
            if (i9 >= i3) {
                this.f255079j = i9 + i;
            }
            this.f255080k = i3 + i;
            this.f255081l = i4 - i;
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m89010y(int i) {
        return (this.f255071b[(m89003r(i) * 5) + 1] & 1073741824) != 0;
    }
}
