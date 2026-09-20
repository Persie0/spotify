package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ro41 extends mze1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final long[] f201067a;

    /* JADX INFO: renamed from: b */
    public final hze1[] f201068b;

    /* JADX INFO: renamed from: c */
    public final long[] f201069c;

    /* JADX INFO: renamed from: d */
    public final lba0[] f201070d;

    /* JADX INFO: renamed from: e */
    public final hze1[] f201071e;

    /* JADX INFO: renamed from: f */
    public final jze1[] f201072f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f201073g = new ConcurrentHashMap();

    public ro41(long[] jArr, hze1[] hze1VarArr, long[] jArr2, hze1[] hze1VarArr2, jze1[] jze1VarArr) {
        this.f201067a = jArr;
        this.f201068b = hze1VarArr;
        this.f201069c = jArr2;
        this.f201071e = hze1VarArr2;
        this.f201072f = jze1VarArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            int i2 = i + 1;
            ize1 ize1Var = new ize1(jArr2[i], hze1VarArr2[i], hze1VarArr2[i2]);
            if (ize1Var.m51999g()) {
                arrayList.add(ize1Var.m51994b());
                arrayList.add(ize1Var.m51993a());
            } else {
                arrayList.add(ize1Var.m51993a());
                arrayList.add(ize1Var.m51994b());
            }
            i = i2;
        }
        this.f201070d = (lba0[]) arrayList.toArray(new lba0[arrayList.size()]);
    }

    private Object writeReplace() {
        return new itz0((byte) 1, this);
    }

    @Override // p204p.mze1
    /* JADX INFO: renamed from: a */
    public final hze1 mo60301a(z050 z050Var) {
        long j = z050Var.f277962d;
        int length = this.f201072f.length;
        hze1[] hze1VarArr = this.f201071e;
        long[] jArr = this.f201069c;
        if (length <= 0 || (jArr.length != 0 && j <= jArr[jArr.length - 1])) {
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return hze1VarArr[iBinarySearch + 1];
        }
        ize1[] ize1VarArrM76014g = m76014g(jba0.m52878A6(jlg1.m53707q(((long) hze1VarArr[hze1VarArr.length - 1].f96910b) + j, 86400L)).f110722d);
        ize1 ize1Var = null;
        for (int i = 0; i < ize1VarArrM76014g.length; i++) {
            ize1Var = ize1VarArrM76014g[i];
            if (j < ize1Var.toEpochSecond()) {
                return ize1Var.m51997e();
            }
        }
        return ize1Var.m51996d();
    }

    @Override // p204p.mze1
    /* JADX INFO: renamed from: b */
    public final ize1 mo60302b(lba0 lba0Var) {
        Object objM76015h = m76015h(lba0Var);
        if (objM76015h instanceof ize1) {
            return (ize1) objM76015h;
        }
        return null;
    }

    @Override // p204p.mze1
    /* JADX INFO: renamed from: c */
    public final List mo60303c(lba0 lba0Var) {
        Object objM76015h = m76015h(lba0Var);
        return objM76015h instanceof ize1 ? ((ize1) objM76015h).m51998f() : Collections.singletonList((hze1) objM76015h);
    }

    @Override // p204p.mze1
    /* JADX INFO: renamed from: d */
    public final boolean mo60304d(z050 z050Var) {
        int iBinarySearch = Arrays.binarySearch(this.f201067a, z050Var.f277962d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return !this.f201068b[iBinarySearch + 1].equals(mo60301a(z050Var));
    }

    @Override // p204p.mze1
    /* JADX INFO: renamed from: e */
    public final boolean mo60305e() {
        return this.f201069c.length == 0 && this.f201072f.length == 0 && this.f201071e[0].equals(this.f201068b[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ro41) {
            ro41 ro41Var = (ro41) obj;
            return Arrays.equals(this.f201067a, ro41Var.f201067a) && Arrays.equals(this.f201068b, ro41Var.f201068b) && Arrays.equals(this.f201069c, ro41Var.f201069c) && Arrays.equals(this.f201071e, ro41Var.f201071e) && Arrays.equals(this.f201072f, ro41Var.f201072f);
        }
        if ((obj instanceof lze1) && mo60305e()) {
            z050 z050Var = z050.f277960f;
            if (mo60301a(z050Var).equals(((lze1) obj).mo60301a(z050Var))) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.mze1
    /* JADX INFO: renamed from: f */
    public final boolean mo60306f(lba0 lba0Var, hze1 hze1Var) {
        return mo60303c(lba0Var).contains(hze1Var);
    }

    /* JADX INFO: renamed from: g */
    public final ize1[] m76014g(int i) {
        jba0 jba0VarM52881n6;
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.f201073g;
        ize1[] ize1VarArr = (ize1[]) concurrentHashMap.get(numValueOf);
        if (ize1VarArr != null) {
            return ize1VarArr;
        }
        jze1[] jze1VarArr = this.f201072f;
        ize1[] ize1VarArr2 = new ize1[jze1VarArr.length];
        for (int i2 = 0; i2 < jze1VarArr.length; i2++) {
            jze1 jze1Var = jze1VarArr[i2];
            hze1 hze1Var = jze1Var.f117717h;
            ioo iooVar = jze1Var.f117712c;
            eyh0 eyh0Var = jze1Var.f117710a;
            byte b = jze1Var.f117711b;
            if (b < 0) {
                np50 np50Var = np50.f156881a;
                long j = i;
                int iM40315o = eyh0Var.m40315o(np50.isLeapYear(j)) + 1 + b;
                jba0 jba0Var = jba0.f110719g;
                dce.YEAR.m35645f(j);
                dce.DAY_OF_MONTH.m35645f(iM40315o);
                jba0VarM52881n6 = jba0.m52881n6(i, eyh0Var, iM40315o);
                if (iooVar != null) {
                    jba0VarM52881n6 = jba0VarM52881n6.mo27572b(arg1.m26946n(iooVar));
                }
            } else {
                jba0 jba0Var2 = jba0.f110719g;
                dce.YEAR.m35645f(i);
                jlg1.m53716z(eyh0Var, "month");
                dce.DAY_OF_MONTH.m35645f(b);
                jba0VarM52881n6 = jba0.m52881n6(i, eyh0Var, b);
                if (iooVar != null) {
                    jba0VarM52881n6 = jba0VarM52881n6.mo27572b(arg1.m26945m(iooVar));
                }
            }
            ize1VarArr2[i2] = new ize1(t3d1.m79986a(jze1Var.f117715f, lba0.m58641v6(jba0VarM52881n6.m52888D6(jze1Var.f117714e), jze1Var.f117713d), jze1Var.f117716g, hze1Var), hze1Var, jze1Var.f117718i);
        }
        if (i < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, ize1VarArr2);
        }
        return ize1VarArr2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX INFO: renamed from: h */
    public final Object m76015h(lba0 lba0Var) {
        hze1 hze1VarM51997e;
        int length = this.f201072f.length;
        int i = 0;
        lba0[] lba0VarArr = this.f201070d;
        if (length <= 0 || !(lba0VarArr.length == 0 || lba0Var.m58654s6(lba0VarArr[lba0VarArr.length - 1]))) {
            int iBinarySearch = Arrays.binarySearch(lba0VarArr, lba0Var);
            hze1[] hze1VarArr = this.f201071e;
            if (iBinarySearch == -1) {
                return hze1VarArr[0];
            }
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            } else if (iBinarySearch < lba0VarArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (lba0VarArr[iBinarySearch].equals(lba0VarArr[i2])) {
                    iBinarySearch = i2;
                }
            }
            if ((iBinarySearch & 1) != 0) {
                return hze1VarArr[(iBinarySearch / 2) + 1];
            }
            lba0 lba0Var2 = lba0VarArr[iBinarySearch];
            lba0 lba0Var3 = lba0VarArr[iBinarySearch + 1];
            int i3 = iBinarySearch / 2;
            hze1 hze1Var = hze1VarArr[i3];
            hze1 hze1Var2 = hze1VarArr[i3 + 1];
            return hze1Var2.f96910b > hze1Var.f96910b ? new ize1(lba0Var2, hze1Var, hze1Var2) : new ize1(lba0Var3, hze1Var, hze1Var2);
        }
        ize1[] ize1VarArrM76014g = m76014g(lba0Var.f131611d.f110722d);
        int length2 = ize1VarArrM76014g.length;
        hze1 hze1Var3 = null;
        while (i < length2) {
            ize1 ize1Var = ize1VarArrM76014g[i];
            lba0 lba0VarM51994b = ize1Var.m51994b();
            if (ize1Var.m51999g()) {
                if (lba0Var.m58655t6(lba0VarM51994b)) {
                    hze1VarM51997e = ize1Var.m51997e();
                } else if (lba0Var.m58655t6(ize1Var.m51993a())) {
                    hze1VarM51997e = ize1Var;
                } else {
                    hze1VarM51997e = ize1Var.m51996d();
                }
            } else if (!lba0Var.m58655t6(lba0VarM51994b)) {
                hze1VarM51997e = ize1Var.m51996d();
            } else if (lba0Var.m58655t6(ize1Var.m51993a())) {
                hze1VarM51997e = ize1Var.m51997e();
            } else {
                hze1VarM51997e = ize1Var;
            }
            if ((hze1VarM51997e instanceof ize1) || hze1VarM51997e.equals(ize1Var.m51997e())) {
                return hze1VarM51997e;
            }
            i++;
            hze1Var3 = hze1VarM51997e;
        }
        return hze1Var3;
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f201067a) ^ Arrays.hashCode(this.f201068b)) ^ Arrays.hashCode(this.f201069c)) ^ Arrays.hashCode(this.f201071e)) ^ Arrays.hashCode(this.f201072f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StandardZoneRules[currentStandardOffset=");
        hze1[] hze1VarArr = this.f201068b;
        sb.append(hze1VarArr[hze1VarArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
