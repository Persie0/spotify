package p204p;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class ecb implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58299a;

    /* JADX INFO: renamed from: b */
    public static final ecb f58290b = new ecb(0);

    /* JADX INFO: renamed from: c */
    public static final ecb f58291c = new ecb(1);

    /* JADX INFO: renamed from: d */
    public static final ecb f58292d = new ecb(2);

    /* JADX INFO: renamed from: e */
    public static final ecb f58293e = new ecb(3);

    /* JADX INFO: renamed from: f */
    public static final ecb f58294f = new ecb(4);

    /* JADX INFO: renamed from: g */
    public static final ecb f58295g = new ecb(5);

    /* JADX INFO: renamed from: h */
    public static final ecb f58296h = new ecb(6);

    /* JADX INFO: renamed from: i */
    public static final ecb f58297i = new ecb(7);

    /* JADX INFO: renamed from: t */
    public static final ecb f58298t = new ecb(8);

    /* JADX INFO: renamed from: X */
    public static final ecb f58287X = new ecb(9);

    /* JADX INFO: renamed from: Y */
    public static final ecb f58288Y = new ecb(10);

    /* JADX INFO: renamed from: Z */
    public static final ecb f58289Z = new ecb(11);

    /* JADX INFO: renamed from: L0 */
    public static final ecb f58285L0 = new ecb(12);

    /* JADX INFO: renamed from: M0 */
    public static final ecb f58286M0 = new ecb(13);

    public /* synthetic */ ecb(int i) {
        this.f58299a = i;
    }

    /* JADX INFO: renamed from: a */
    public static int m38490a(oqo oqoVar) {
        if (oqoVar == null) {
            rxq.m76663a(36);
            throw null;
        }
        if (rxq.m76674l(oqoVar, 4)) {
            return 8;
        }
        if (oqoVar instanceof k8j) {
            return 7;
        }
        if (oqoVar instanceof nys0) {
            return ((nys0) oqoVar).mo32017Q() == null ? 6 : 5;
        }
        if (oqoVar instanceof mi00) {
            return ((mi00) oqoVar).mo32017Q() == null ? 4 : 3;
        }
        if (oqoVar instanceof nfe) {
            return 2;
        }
        return oqoVar instanceof cn91 ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:182:0x03f2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object[] objArr;
        Object[] objArr2;
        Integer numValueOf = null;
        int i = 0;
        switch (this.f58299a) {
            case 0:
                return ((gcb) obj).f78532c.compareTo(((gcb) obj2).f78532c);
            case 1:
                tvq tvqVar = (tvq) obj;
                tvq tvqVar2 = (tvq) obj2;
                zr60 zr60VarM58579a = lay.m58579a((List) tvqVar.f224214g.invoke(), (List) tvqVar2.f224214g.invoke());
                if (zr60VarM58579a == null) {
                    throw new IllegalStateException(("Intersection overrides can't have different type parameters sizes. It must have been reported by the compiler. The following members appear to be violating intersection overrides: '" + tvqVar + "' '" + tvqVar2 + '\'').toString());
                }
                sr60 sr60VarMo25530i = tvqVar.mo25530i();
                zr60 zr60Var = zr60.f285551b;
                sr60 sr60Var = zr60VarM58579a.m96756a(1, sr60VarMo25530i).f265275b;
                if (sr60Var == null) {
                    lay.m58584f(tvqVar.getName());
                    throw null;
                }
                sr60 sr60VarMo25530i2 = tvqVar2.mo25530i();
                boolean zM93075v = y85.m93075v(sr60Var, sr60VarMo25530i2);
                boolean zM93075v2 = y85.m93075v(sr60VarMo25530i2, sr60Var);
                if (zM93075v && !zM93075v2) {
                    return -1;
                }
                if (!zM93075v2 || zM93075v) {
                    AbstractC1969i7 abstractC1969i7 = sr60Var instanceof AbstractC1969i7 ? (AbstractC1969i7) sr60Var : null;
                    if (abstractC1969i7 == null) {
                        objArr = false;
                    } else {
                        if (abstractC1969i7.mo32817N() == null) {
                            abstractC1969i7 = null;
                        }
                        if (abstractC1969i7 != null) {
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                    }
                    AbstractC1969i7 abstractC1969i8 = sr60VarMo25530i2 instanceof AbstractC1969i7 ? (AbstractC1969i7) sr60VarMo25530i2 : null;
                    if (abstractC1969i8 == null) {
                        objArr2 = false;
                    } else {
                        if ((abstractC1969i8.mo32817N() != null ? abstractC1969i8 : null) != null) {
                            objArr2 = true;
                        } else {
                            objArr2 = false;
                        }
                    }
                    if (objArr2 == true && objArr != true) {
                        return -1;
                    }
                    if (objArr == false || objArr2 != false) {
                        return 0;
                    }
                }
                return 1;
            case 2:
                pqz pqzVar = (pqz) obj;
                pqz pqzVar2 = (pqz) obj2;
                if (pp91.m70541v(pqzVar) && pp91.m70541v(pqzVar2)) {
                    lp70 lp70VarM88319I = wjg1.m88319I(pqzVar);
                    lp70 lp70VarM88319I2 = wjg1.m88319I(pqzVar2);
                    if (!wj50.m88271j(lp70VarM88319I, lp70VarM88319I2)) {
                        Object[] objArr3 = new lp70[16];
                        int i2 = 0;
                        while (lp70VarM88319I != null) {
                            int i3 = i2 + 1;
                            if (objArr3.length < i3) {
                                int length = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i3, length * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length);
                                objArr3 = objArr4;
                            }
                            if (i2 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i2 + 0);
                            }
                            objArr3[0] = lp70VarM88319I;
                            i2++;
                            lp70VarM88319I = lp70VarM88319I.m59645v();
                        }
                        Object[] objArr5 = new lp70[16];
                        int i4 = 0;
                        while (lp70VarM88319I2 != null) {
                            int i5 = i4 + 1;
                            if (objArr5.length < i5) {
                                int length2 = objArr5.length;
                                Object[] objArr6 = new Object[Math.max(i5, length2 * 2)];
                                System.arraycopy(objArr5, 0, objArr6, 0, length2);
                                objArr5 = objArr6;
                            }
                            if (i4 != 0) {
                                System.arraycopy(objArr5, 0, objArr5, 0 + 1, i4 + 0);
                            }
                            objArr5[0] = lp70VarM88319I2;
                            i4++;
                            lp70VarM88319I2 = lp70VarM88319I2.m59645v();
                        }
                        int iMin = Math.min(i2 - 1, i4 - 1);
                        if (iMin >= 0) {
                            while (wj50.m88271j(objArr3[i], objArr5[i])) {
                                if (i != iMin) {
                                    i++;
                                }
                            }
                            return wj50.m88282u(((lp70) objArr3[i]).m59646w(), ((lp70) objArr5[i]).m59646w());
                        }
                        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (pp91.m70541v(pqzVar)) {
                        return -1;
                    }
                    if (pp91.m70541v(pqzVar2)) {
                        return 1;
                    }
                }
                return 0;
            case 3:
                return ((r300) obj).m74566c() - ((r300) obj2).m74566c();
            case 4:
                return ((r300) obj).m74566c() - ((r300) obj2).m74566c();
            case 5:
                return wj50.m88283v(Long.valueOf(((pbu0) obj).f175909b.f195112a).longValue(), Long.valueOf(((pbu0) obj2).f175909b.f195112a).longValue());
            case 6:
                tiv0 tiv0VarM33577h = ((cpz0) obj).m33577h();
                tiv0 tiv0VarM33577h2 = ((cpz0) obj2).m33577h();
                int iCompare = Float.compare(tiv0VarM33577h.f220751a, tiv0VarM33577h2.f220751a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(tiv0VarM33577h.f220752b, tiv0VarM33577h2.f220752b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(tiv0VarM33577h.f220754d, tiv0VarM33577h2.f220754d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(tiv0VarM33577h.f220753c, tiv0VarM33577h2.f220753c);
            case 7:
                oqo oqoVar = (oqo) obj;
                oqo oqoVar2 = (oqo) obj2;
                int iM38490a = m38490a(oqoVar2) - m38490a(oqoVar);
                if (iM38490a != 0) {
                    numValueOf = Integer.valueOf(iM38490a);
                } else if (rxq.m76674l(oqoVar, 4) && rxq.m76674l(oqoVar2, 4)) {
                    numValueOf = 0;
                } else {
                    int iCompareTo = oqoVar.getName().f192387a.compareTo(oqoVar2.getName().f192387a);
                    if (iCompareTo != 0) {
                        numValueOf = Integer.valueOf(iCompareTo);
                    }
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            case 8:
                lp70 lp70Var = (lp70) obj;
                lp70 lp70Var2 = (lp70) obj2;
                int iM88282u = wj50.m88282u(lp70Var2.f135654O0, lp70Var.f135654O0);
                return iM88282u != 0 ? iM88282u : wj50.m88282u(lp70Var.hashCode(), lp70Var2.hashCode());
            case 9:
                return jlg1.m53703m(Long.valueOf(((d5u0) obj).f45494e), Long.valueOf(((d5u0) obj2).f45494e));
            case 10:
                return wj50.m88283v(Long.valueOf(((pbu0) obj).f175909b.f195112a).longValue(), Long.valueOf(((pbu0) obj2).f175909b.f195112a).longValue());
            case 11:
                tiv0 tiv0VarM33577h3 = ((cpz0) obj).m33577h();
                tiv0 tiv0VarM33577h4 = ((cpz0) obj2).m33577h();
                int iCompare4 = Float.compare(tiv0VarM33577h4.f220753c, tiv0VarM33577h3.f220753c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(tiv0VarM33577h3.f220752b, tiv0VarM33577h4.f220752b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(tiv0VarM33577h3.f220754d, tiv0VarM33577h4.f220754d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(tiv0VarM33577h4.f220751a, tiv0VarM33577h3.f220751a);
            case 12:
                pqm0 pqm0Var = (pqm0) obj;
                pqm0 pqm0Var2 = (pqm0) obj2;
                int iCompare7 = Float.compare(((tiv0) pqm0Var.f180350a).f220752b, ((tiv0) pqm0Var2.f180350a).f220752b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((tiv0) pqm0Var.f180350a).f220754d, ((tiv0) pqm0Var2.f180350a).f220754d);
            case 13:
                return wj50.m88283v(Long.valueOf(((qbu0) obj).f187173b.f195112a).longValue(), Long.valueOf(((qbu0) obj2).f187173b.f195112a).longValue());
            case 14:
                return jlg1.m53703m(((kj0) obj).f123190b, ((kj0) obj2).f123190b);
            case 15:
                return jlg1.m53703m(Integer.valueOf(((mh0) obj).f143678a), Integer.valueOf(((mh0) obj2).f143678a));
            case 16:
                return jlg1.m53703m(Boolean.valueOf(((lo2) obj2).f135282d), Boolean.valueOf(((lo2) obj).f135282d));
            case 17:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 18:
                return jlg1.m53703m(Integer.valueOf(((i15) obj).f97389b), Integer.valueOf(((i15) obj2).f97389b));
            case 19:
                return jlg1.m53703m(Integer.valueOf(((i15) obj).f97389b), Integer.valueOf(((i15) obj2).f97389b));
            case 20:
                pw5 pw5Var = ((lw5) obj).f137449a;
                pw5 pw5Var2 = pw5.AI_PERSONA;
                return jlg1.m53703m(Integer.valueOf(pw5Var == pw5Var2 ? 0 : 1), Integer.valueOf(((lw5) obj2).f137449a == pw5Var2 ? 0 : 1));
            case 21:
                return jlg1.m53703m(Integer.valueOf(((kq8) obj).mo42399a()), Integer.valueOf(((kq8) obj2).mo42399a()));
            case 22:
                return jlg1.m53703m(((af31) obj).f15014a, ((af31) obj2).f15014a);
            case 23:
                EnumC2166nj enumC2166nj = ((xe21) obj).f260619a;
                EnumC2166nj enumC2166nj2 = EnumC2166nj.f154402c;
                return jlg1.m53703m(Integer.valueOf(enumC2166nj == enumC2166nj2 ? 0 : 1), Integer.valueOf(((xe21) obj2).f260619a == enumC2166nj2 ? 0 : 1));
            case 24:
                return jlg1.m53703m((String) obj, (String) obj2);
            case 25:
                return jlg1.m53703m((String) obj, (String) obj2);
            case 26:
                String str = ((pla1) obj).f178682b;
                Locale locale = Locale.ROOT;
                return jlg1.m53703m(str.toLowerCase(locale), ((pla1) obj2).f178682b.toLowerCase(locale));
            case 27:
                String str2 = ((akk) obj).f16560a.f178682b;
                Locale locale2 = Locale.ROOT;
                return jlg1.m53703m(str2.toLowerCase(locale2), ((akk) obj2).f16560a.f178682b.toLowerCase(locale2));
            case 28:
                return jlg1.m53703m(Long.valueOf(((pck) obj2).f176150d), Long.valueOf(((pck) obj).f176150d));
            default:
                return jlg1.m53703m(Long.valueOf(((pck) obj2).f176150d), Long.valueOf(((pck) obj).f176150d));
        }
    }
}
