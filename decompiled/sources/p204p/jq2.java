package p204p;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class jq2 {

    /* JADX INFO: renamed from: a */
    public final el2 f114769a;

    /* JADX INFO: renamed from: b */
    public final qnk f114770b;

    /* JADX INFO: renamed from: c */
    public final ym2 f114771c;

    /* JADX INFO: renamed from: d */
    public final o3v f114772d;

    /* JADX INFO: renamed from: e */
    public final luk f114773e;

    public jq2(el2 el2Var, qnk qnkVar, ym2 ym2Var, o3v o3vVar, luk lukVar) {
        this.f114769a = el2Var;
        this.f114770b = qnkVar;
        this.f114771c = ym2Var;
        this.f114772d = o3vVar;
        this.f114773e = lukVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m54022e(jq2 jq2Var, String str, nk2 nk2Var, String str2, boolean z, String str3, String str4, String str5, ibk ibkVar, int i) {
        if ((i & 64) != 0) {
            str4 = null;
        }
        if ((i & 128) != 0) {
            str5 = null;
        }
        return jq2Var.m54026d(str, nk2Var, str2, z, false, str3, str4, str5, ibkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m54023a(String str, ibk ibkVar, boolean z) {
        eq2 eq2Var;
        if (ibkVar instanceof eq2) {
            eq2Var = (eq2) ibkVar;
            int i = eq2Var.f61764c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eq2Var.f61764c = i - Integer.MIN_VALUE;
            } else {
                eq2Var = new eq2(this, ibkVar);
            }
        } else {
            eq2Var = new eq2(this, ibkVar);
        }
        Object objM86755t = eq2Var.f61762a;
        int i2 = eq2Var.f61764c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            if (!z) {
                return str;
            }
            s5u s5uVarM66217a = this.f114772d.m66217a();
            eq2Var.f61764c = 1;
            objM86755t = vyf1.m86755t(s5uVarM66217a, eq2Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        return edb.m38564m("voice-", ((r0s) objM86755t).f194556c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m54024b(ibk ibkVar) {
        fq2 fq2Var;
        if (ibkVar instanceof fq2) {
            fq2Var = (fq2) ibkVar;
            int i = fq2Var.f72040c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fq2Var.f72040c = i - Integer.MIN_VALUE;
            } else {
                fq2Var = new fq2(this, ibkVar);
            }
        } else {
            fq2Var = new fq2(this, ibkVar);
        }
        Object objM94180a = fq2Var.f72038a;
        int i2 = fq2Var.f72040c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM94180a);
                ym2 ym2Var = this.f114771c;
                fq2Var.f72040c = 1;
                objM94180a = ym2Var.m94180a(fq2Var);
                yuk yukVar = yuk.f276404a;
                if (objM94180a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM94180a);
            }
            return (wm2) objM94180a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0156  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0123, code lost:
    
        if (((p204p.bpk) r9).m30127B(r0, r8) == r15) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0176, code lost:
    
        if (((p204p.bpk) r9).m30133H(r4, r8) == r15) goto L44;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m54025c(List list, String str, nk2 nk2Var, String str2, String str3, ibk ibkVar) throws Throwable {
        gq2 gq2Var;
        List list2;
        String str4;
        nk2 nk2Var2;
        String str5;
        Object obj;
        String str6;
        String str7;
        bn2 bn2Var;
        bn2 bn2Var2;
        String str8;
        List list3;
        String str9;
        String str10;
        String str11;
        String str12;
        List list4;
        zl2 zl2Var;
        String str13;
        String str14;
        om2 om2Var;
        if (ibkVar instanceof gq2) {
            gq2Var = (gq2) ibkVar;
            int i = gq2Var.f83318Y;
            if ((i & Integer.MIN_VALUE) != 0) {
                gq2Var.f83318Y = i - Integer.MIN_VALUE;
            } else {
                gq2Var = new gq2(this, ibkVar);
            }
        } else {
            gq2Var = new gq2(this, ibkVar);
        }
        gq2 gq2Var2 = gq2Var;
        Object objM89557A = gq2Var2.f83328t;
        int i2 = gq2Var2.f83318Y;
        qnk qnkVar = this.f114770b;
        luk lukVar = this.f114773e;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            list2 = list;
            gq2Var2.f83319a = list2;
            gq2Var2.f83320b = nk2Var;
            str4 = str2;
            gq2Var2.f83321c = str4;
            gq2Var2.f83322d = str3;
            gq2Var2.f83323e = str;
            gq2Var2.f83318Y = 1;
            Object objM54024b = m54024b(gq2Var2);
            if (objM54024b != obj2) {
                nk2Var2 = nk2Var;
                str5 = str;
                obj = objM54024b;
                str6 = str3;
            }
            return obj2;
        }
        if (i2 == 1) {
            str5 = (String) gq2Var2.f83323e;
            str6 = gq2Var2.f83322d;
            str4 = gq2Var2.f83321c;
            nk2Var2 = gq2Var2.f83320b;
            List list5 = gq2Var2.f83319a;
            bga.m29073P(objM89557A);
            obj = objM89557A;
            list2 = list5;
        } else if (i2 == 2) {
            String str15 = gq2Var2.f83324f;
            bn2 bn2Var3 = (bn2) gq2Var2.f83323e;
            String str16 = gq2Var2.f83322d;
            List list6 = gq2Var2.f83319a;
            bga.m29073P(objM89557A);
            list3 = list6;
            str7 = str16;
            bn2Var2 = bn2Var3;
            str8 = str15;
            zl2Var = (zl2) objM89557A;
            String strM96355b = zl2Var.m96355b();
            gq2Var2.f83319a = list3;
            gq2Var2.f83320b = null;
            gq2Var2.f83321c = null;
            gq2Var2.f83322d = str7;
            gq2Var2.f83323e = bn2Var2;
            gq2Var2.f83324f = str8;
            gq2Var2.f83325g = zl2Var;
            gq2Var2.f83318Y = 3;
        } else {
            if (i2 == 3) {
                zl2Var = (zl2) gq2Var2.f83325g;
                str8 = gq2Var2.f83324f;
                bn2Var2 = (bn2) gq2Var2.f83323e;
                str7 = gq2Var2.f83322d;
                list3 = gq2Var2.f83319a;
                bga.m29073P(objM89557A);
                String strM96355b2 = zl2Var.m96355b();
                String strM96356c = zl2Var.m96356c();
                String str17 = str7;
                str11 = str8;
                bn2Var = bn2Var2;
                list4 = list3;
                str9 = str17;
                str12 = strM96355b2;
                str10 = strM96356c;
                nd0 nd0Var = new nd0(this, str12, bn2Var, list4, str11, str9, (fbk) null);
                gq2Var2.f83319a = null;
                gq2Var2.f83320b = null;
                gq2Var2.f83321c = null;
                gq2Var2.f83322d = null;
                gq2Var2.f83323e = null;
                gq2Var2.f83324f = null;
                gq2Var2.f83325g = str12;
                gq2Var2.f83326h = str10;
                gq2Var2.f83318Y = 4;
                objM89557A = x0h1.m89557A(lukVar, nd0Var, gq2Var2);
                if (objM89557A != obj2) {
                    str13 = str12;
                    str14 = str10;
                    om2Var = (om2) objM89557A;
                    gq2Var2.f83319a = null;
                    gq2Var2.f83320b = null;
                    gq2Var2.f83321c = null;
                    gq2Var2.f83322d = null;
                    gq2Var2.f83323e = null;
                    gq2Var2.f83324f = null;
                    gq2Var2.f83325g = str13;
                    gq2Var2.f83326h = str14;
                    gq2Var2.f83327i = om2Var;
                    gq2Var2.f83318Y = 5;
                }
                return obj2;
            }
            if (i2 == 4) {
                String str18 = gq2Var2.f83326h;
                String str19 = (String) gq2Var2.f83325g;
                bga.m29073P(objM89557A);
                str13 = str19;
                str14 = str18;
                om2Var = (om2) objM89557A;
                gq2Var2.f83319a = null;
                gq2Var2.f83320b = null;
                gq2Var2.f83321c = null;
                gq2Var2.f83322d = null;
                gq2Var2.f83323e = null;
                gq2Var2.f83324f = null;
                gq2Var2.f83325g = str13;
                gq2Var2.f83326h = str14;
                gq2Var2.f83327i = om2Var;
                gq2Var2.f83318Y = 5;
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                om2Var = gq2Var2.f83327i;
                str14 = gq2Var2.f83326h;
                str13 = (String) gq2Var2.f83325g;
                bga.m29073P(objM89557A);
            }
        }
        return new kq2(str13, om2Var.m67314b(), om2Var.m67313a(), str14);
        nk2 nk2Var3 = nk2Var2;
        str7 = str6;
        bn2Var = new bn2(str5, (wm2) obj);
        String strM64653a = nk2Var3.m64653a();
        if (str4 != null) {
            str9 = str7;
            str10 = null;
            str11 = strM64653a;
            str12 = str4;
            list4 = list2;
            nd0 nd0Var2 = new nd0(this, str12, bn2Var, list4, str11, str9, (fbk) null);
            gq2Var2.f83319a = null;
            gq2Var2.f83320b = null;
            gq2Var2.f83321c = null;
            gq2Var2.f83322d = null;
            gq2Var2.f83323e = null;
            gq2Var2.f83324f = null;
            gq2Var2.f83325g = str12;
            gq2Var2.f83326h = str10;
            gq2Var2.f83318Y = 4;
            objM89557A = x0h1.m89557A(lukVar, nd0Var2, gq2Var2);
            if (objM89557A != obj2) {
                str13 = str12;
                str14 = str10;
                om2Var = (om2) objM89557A;
                gq2Var2.f83319a = null;
                gq2Var2.f83320b = null;
                gq2Var2.f83321c = null;
                gq2Var2.f83322d = null;
                gq2Var2.f83323e = null;
                gq2Var2.f83324f = null;
                gq2Var2.f83325g = str13;
                gq2Var2.f83326h = str14;
                gq2Var2.f83327i = om2Var;
                gq2Var2.f83318Y = 5;
            }
        } else {
            List list7 = list2;
            C1977ig c1977ig = new C1977ig(12, this, bn2Var, strM64653a, str7, (fbk) null);
            gq2Var2.f83319a = list7;
            gq2Var2.f83320b = null;
            gq2Var2.f83321c = null;
            gq2Var2.f83322d = str7;
            gq2Var2.f83323e = bn2Var;
            gq2Var2.f83324f = strM64653a;
            gq2Var2.f83318Y = 2;
            objM89557A = x0h1.m89557A(lukVar, c1977ig, gq2Var2);
            if (objM89557A != obj2) {
                bn2Var2 = bn2Var;
                str8 = strM64653a;
                list3 = list7;
                zl2Var = (zl2) objM89557A;
                String strM96355b3 = zl2Var.m96355b();
                gq2Var2.f83319a = list3;
                gq2Var2.f83320b = null;
                gq2Var2.f83321c = null;
                gq2Var2.f83322d = str7;
                gq2Var2.f83323e = bn2Var2;
                gq2Var2.f83324f = str8;
                gq2Var2.f83325g = zl2Var;
                gq2Var2.f83318Y = 3;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0050 A[PHI: r3 r7 r8 r9 r10
      0x0050: PHI (r3v18 boolean) = (r3v16 boolean), (r3v20 boolean) binds: [B:50:0x0212, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0050: PHI (r7v12 boolean) = (r7v10 boolean), (r7v13 boolean) binds: [B:50:0x0212, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0050: PHI (r8v24 p.zl2) = (r8v21 p.zl2), (r8v26 p.zl2) binds: [B:50:0x0212, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0050: PHI (r9v14 java.lang.String) = (r9v10 java.lang.String), (r9v19 java.lang.String) binds: [B:50:0x0212, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0050: PHI (r10v13 java.lang.String) = (r10v11 java.lang.String), (r10v14 java.lang.String) binds: [B:50:0x0212, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0127  */
    /* JADX WARN: Code duplicated, block: B:31:0x012e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0162  */
    /* JADX WARN: Code duplicated, block: B:38:0x0185  */
    /* JADX WARN: Code duplicated, block: B:41:0x0195  */
    /* JADX WARN: Code duplicated, block: B:44:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x021b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0238, code lost:
    
        if (((p204p.bpk) r4).m30144j(r1, r9, r2) == r6) goto L57;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m54026d(String str, nk2 nk2Var, String str2, boolean z, boolean z2, String str3, String str4, String str5, ibk ibkVar) throws Throwable {
        hq2 hq2Var;
        String str6;
        nk2 nk2Var2;
        String str7;
        boolean z3;
        String str8;
        boolean z4;
        String str9;
        String str10;
        bn2 bn2Var;
        bn2 bn2Var2;
        String str11;
        luk lukVar;
        String str12;
        String str13;
        String str14;
        om2 om2Var;
        om2 om2Var2;
        String str15;
        zl2 zl2Var;
        String strM96355b;
        String str16;
        String str17;
        zl2 zl2Var2;
        String strM96355b2;
        zl2 zl2Var3;
        if (ibkVar instanceof hq2) {
            hq2Var = (hq2) ibkVar;
            int i = hq2Var.f93990Y;
            if ((i & Integer.MIN_VALUE) != 0) {
                hq2Var.f93990Y = i - Integer.MIN_VALUE;
            } else {
                hq2Var = new hq2(this, ibkVar);
            }
        } else {
            hq2Var = new hq2(this, ibkVar);
        }
        Object objM54023a = hq2Var.f94000t;
        int i2 = hq2Var.f93990Y;
        qnk qnkVar = this.f114770b;
        Object obj = yuk.f276404a;
        switch (i2) {
            case 0:
                bga.m29073P(objM54023a);
                hq2Var.f93991a = nk2Var;
                hq2Var.f93992b = str2;
                hq2Var.f93993c = str3;
                hq2Var.f93994d = str4;
                str6 = str5;
                hq2Var.f93995e = str6;
                hq2Var.f93996f = str;
                hq2Var.f93998h = z;
                hq2Var.f93999i = z2;
                hq2Var.f93990Y = 1;
                Object objM54024b = m54024b(hq2Var);
                if (objM54024b != obj) {
                    nk2Var2 = nk2Var;
                    objM54023a = objM54024b;
                    str7 = str2;
                    z3 = z2;
                    str8 = str3;
                    z4 = z;
                    str9 = str4;
                    str10 = str;
                    bn2Var = new bn2(str10, b3h1.m28033p(str9, (wm2) objM54023a));
                    String strM64653a = nk2Var2.m64653a();
                    hq2Var.f93991a = null;
                    hq2Var.f93992b = str7;
                    hq2Var.f93993c = str8;
                    hq2Var.f93994d = str9;
                    hq2Var.f93995e = str6;
                    hq2Var.f93996f = bn2Var;
                    hq2Var.f93998h = z4;
                    hq2Var.f93999i = z3;
                    hq2Var.f93990Y = 2;
                    objM54023a = m54023a(strM64653a, hq2Var, z4);
                    if (objM54023a != obj) {
                        bn2Var2 = bn2Var;
                        str11 = (String) objM54023a;
                        lukVar = this.f114773e;
                        if (str7 == null) {
                            bn2 bn2Var3 = bn2Var2;
                            iq2 iq2Var = new iq2(this, bn2Var3, str11, z3, str8, null, 0);
                            hq2Var.f93991a = null;
                            hq2Var.f93992b = null;
                            hq2Var.f93993c = null;
                            hq2Var.f93994d = str9;
                            hq2Var.f93995e = str6;
                            hq2Var.f93996f = null;
                            hq2Var.f93998h = z4;
                            hq2Var.f93999i = z3;
                            hq2Var.f93990Y = 5;
                            objM54023a = x0h1.m89557A(lukVar, iq2Var, hq2Var);
                            if (objM54023a != obj) {
                                str12 = str6;
                                str13 = str9;
                                zl2Var = (zl2) objM54023a;
                                strM96355b = zl2Var.m96355b();
                                hq2Var.f93991a = null;
                                hq2Var.f93992b = null;
                                hq2Var.f93993c = null;
                                hq2Var.f93994d = str13;
                                hq2Var.f93995e = str12;
                                hq2Var.f93996f = null;
                                hq2Var.f93997g = zl2Var;
                                hq2Var.f93998h = z4;
                                hq2Var.f93999i = z3;
                                hq2Var.f93990Y = 6;
                                if (((bpk) qnkVar).m30127B(strM96355b, hq2Var) != obj) {
                                    str16 = str13;
                                    str17 = str12;
                                    zl2Var2 = zl2Var;
                                    strM96355b2 = zl2Var2.m96355b();
                                    hq2Var.f93991a = null;
                                    hq2Var.f93992b = null;
                                    hq2Var.f93993c = null;
                                    hq2Var.f93994d = str16;
                                    hq2Var.f93995e = str17;
                                    hq2Var.f93996f = null;
                                    hq2Var.f93997g = zl2Var2;
                                    hq2Var.f93998h = z4;
                                    hq2Var.f93999i = z3;
                                    hq2Var.f93990Y = 7;
                                    if (((bpk) qnkVar).m30133H(strM96355b2, hq2Var) != obj) {
                                        boolean z5 = z3;
                                        zl2Var3 = zl2Var2;
                                        String strM96355b3 = zl2Var3.m96355b();
                                        if (str17 == null) {
                                            str17 = str16;
                                        }
                                        hq2Var.f93991a = null;
                                        hq2Var.f93992b = null;
                                        hq2Var.f93993c = null;
                                        hq2Var.f93994d = null;
                                        hq2Var.f93995e = null;
                                        hq2Var.f93996f = null;
                                        hq2Var.f93997g = zl2Var3;
                                        hq2Var.f93998h = z4;
                                        hq2Var.f93999i = z5;
                                        hq2Var.f93990Y = 8;
                                    }
                                }
                            }
                        } else {
                            wj0 wj0Var = new wj0(3, (Object) this, (Object) bn2Var2, (Object) str11, (Object) str8, str7, (fbk) null);
                            hq2Var.f93991a = null;
                            hq2Var.f93992b = str7;
                            hq2Var.f93993c = null;
                            hq2Var.f93994d = null;
                            hq2Var.f93995e = null;
                            hq2Var.f93996f = null;
                            hq2Var.f93998h = z4;
                            hq2Var.f93999i = z3;
                            hq2Var.f93990Y = 3;
                            objM54023a = x0h1.m89557A(lukVar, wj0Var, hq2Var);
                            if (objM54023a != obj) {
                                str14 = str7;
                                om2Var = (om2) objM54023a;
                                hq2Var.f93991a = null;
                                hq2Var.f93992b = str14;
                                hq2Var.f93993c = null;
                                hq2Var.f93994d = null;
                                hq2Var.f93995e = null;
                                hq2Var.f93996f = null;
                                hq2Var.f93997g = om2Var;
                                hq2Var.f93998h = z4;
                                hq2Var.f93999i = z3;
                                hq2Var.f93990Y = 4;
                                if (((bpk) qnkVar).m30133H(str14, hq2Var) != obj) {
                                    om2Var2 = om2Var;
                                    str15 = str14;
                                    return new kq2(str15, om2Var2.m67314b(), om2Var2.m67313a());
                                }
                            }
                        }
                    }
                    break;
                }
                return obj;
            case 1:
                z3 = hq2Var.f93999i;
                z4 = hq2Var.f93998h;
                str10 = (String) hq2Var.f93996f;
                str6 = hq2Var.f93995e;
                str9 = hq2Var.f93994d;
                str8 = hq2Var.f93993c;
                str7 = hq2Var.f93992b;
                nk2Var2 = hq2Var.f93991a;
                bga.m29073P(objM54023a);
                bn2Var = new bn2(str10, b3h1.m28033p(str9, (wm2) objM54023a));
                String strM64653a2 = nk2Var2.m64653a();
                hq2Var.f93991a = null;
                hq2Var.f93992b = str7;
                hq2Var.f93993c = str8;
                hq2Var.f93994d = str9;
                hq2Var.f93995e = str6;
                hq2Var.f93996f = bn2Var;
                hq2Var.f93998h = z4;
                hq2Var.f93999i = z3;
                hq2Var.f93990Y = 2;
                objM54023a = m54023a(strM64653a2, hq2Var, z4);
                if (objM54023a != obj) {
                    bn2Var2 = bn2Var;
                    str11 = (String) objM54023a;
                    lukVar = this.f114773e;
                    if (str7 == null) {
                        bn2 bn2Var4 = bn2Var2;
                        iq2 iq2Var2 = new iq2(this, bn2Var4, str11, z3, str8, null, 0);
                        hq2Var.f93991a = null;
                        hq2Var.f93992b = null;
                        hq2Var.f93993c = null;
                        hq2Var.f93994d = str9;
                        hq2Var.f93995e = str6;
                        hq2Var.f93996f = null;
                        hq2Var.f93998h = z4;
                        hq2Var.f93999i = z3;
                        hq2Var.f93990Y = 5;
                        objM54023a = x0h1.m89557A(lukVar, iq2Var2, hq2Var);
                        if (objM54023a != obj) {
                            str12 = str6;
                            str13 = str9;
                            zl2Var = (zl2) objM54023a;
                            strM96355b = zl2Var.m96355b();
                            hq2Var.f93991a = null;
                            hq2Var.f93992b = null;
                            hq2Var.f93993c = null;
                            hq2Var.f93994d = str13;
                            hq2Var.f93995e = str12;
                            hq2Var.f93996f = null;
                            hq2Var.f93997g = zl2Var;
                            hq2Var.f93998h = z4;
                            hq2Var.f93999i = z3;
                            hq2Var.f93990Y = 6;
                            if (((bpk) qnkVar).m30127B(strM96355b, hq2Var) != obj) {
                                str16 = str13;
                                str17 = str12;
                                zl2Var2 = zl2Var;
                                strM96355b2 = zl2Var2.m96355b();
                                hq2Var.f93991a = null;
                                hq2Var.f93992b = null;
                                hq2Var.f93993c = null;
                                hq2Var.f93994d = str16;
                                hq2Var.f93995e = str17;
                                hq2Var.f93996f = null;
                                hq2Var.f93997g = zl2Var2;
                                hq2Var.f93998h = z4;
                                hq2Var.f93999i = z3;
                                hq2Var.f93990Y = 7;
                                if (((bpk) qnkVar).m30133H(strM96355b2, hq2Var) != obj) {
                                    boolean z6 = z3;
                                    zl2Var3 = zl2Var2;
                                    String strM96355b4 = zl2Var3.m96355b();
                                    if (str17 == null) {
                                        str17 = str16;
                                    }
                                    hq2Var.f93991a = null;
                                    hq2Var.f93992b = null;
                                    hq2Var.f93993c = null;
                                    hq2Var.f93994d = null;
                                    hq2Var.f93995e = null;
                                    hq2Var.f93996f = null;
                                    hq2Var.f93997g = zl2Var3;
                                    hq2Var.f93998h = z4;
                                    hq2Var.f93999i = z6;
                                    hq2Var.f93990Y = 8;
                                }
                            }
                        }
                    } else {
                        wj0 wj0Var2 = new wj0(3, (Object) this, (Object) bn2Var2, (Object) str11, (Object) str8, str7, (fbk) null);
                        hq2Var.f93991a = null;
                        hq2Var.f93992b = str7;
                        hq2Var.f93993c = null;
                        hq2Var.f93994d = null;
                        hq2Var.f93995e = null;
                        hq2Var.f93996f = null;
                        hq2Var.f93998h = z4;
                        hq2Var.f93999i = z3;
                        hq2Var.f93990Y = 3;
                        objM54023a = x0h1.m89557A(lukVar, wj0Var2, hq2Var);
                        if (objM54023a != obj) {
                            str14 = str7;
                            om2Var = (om2) objM54023a;
                            hq2Var.f93991a = null;
                            hq2Var.f93992b = str14;
                            hq2Var.f93993c = null;
                            hq2Var.f93994d = null;
                            hq2Var.f93995e = null;
                            hq2Var.f93996f = null;
                            hq2Var.f93997g = om2Var;
                            hq2Var.f93998h = z4;
                            hq2Var.f93999i = z3;
                            hq2Var.f93990Y = 4;
                            if (((bpk) qnkVar).m30133H(str14, hq2Var) != obj) {
                                om2Var2 = om2Var;
                                str15 = str14;
                                return new kq2(str15, om2Var2.m67314b(), om2Var2.m67313a());
                            }
                        }
                    }
                    break;
                }
                return obj;
            case 2:
                z3 = hq2Var.f93999i;
                z4 = hq2Var.f93998h;
                bn2Var2 = (bn2) hq2Var.f93996f;
                str6 = hq2Var.f93995e;
                str9 = hq2Var.f93994d;
                str8 = hq2Var.f93993c;
                str7 = hq2Var.f93992b;
                bga.m29073P(objM54023a);
                str11 = (String) objM54023a;
                lukVar = this.f114773e;
                if (str7 == null) {
                    bn2 bn2Var5 = bn2Var2;
                    iq2 iq2Var3 = new iq2(this, bn2Var5, str11, z3, str8, null, 0);
                    hq2Var.f93991a = null;
                    hq2Var.f93992b = null;
                    hq2Var.f93993c = null;
                    hq2Var.f93994d = str9;
                    hq2Var.f93995e = str6;
                    hq2Var.f93996f = null;
                    hq2Var.f93998h = z4;
                    hq2Var.f93999i = z3;
                    hq2Var.f93990Y = 5;
                    objM54023a = x0h1.m89557A(lukVar, iq2Var3, hq2Var);
                    if (objM54023a != obj) {
                        str12 = str6;
                        str13 = str9;
                        zl2Var = (zl2) objM54023a;
                        strM96355b = zl2Var.m96355b();
                        hq2Var.f93991a = null;
                        hq2Var.f93992b = null;
                        hq2Var.f93993c = null;
                        hq2Var.f93994d = str13;
                        hq2Var.f93995e = str12;
                        hq2Var.f93996f = null;
                        hq2Var.f93997g = zl2Var;
                        hq2Var.f93998h = z4;
                        hq2Var.f93999i = z3;
                        hq2Var.f93990Y = 6;
                        if (((bpk) qnkVar).m30127B(strM96355b, hq2Var) != obj) {
                            str16 = str13;
                            str17 = str12;
                            zl2Var2 = zl2Var;
                            strM96355b2 = zl2Var2.m96355b();
                            hq2Var.f93991a = null;
                            hq2Var.f93992b = null;
                            hq2Var.f93993c = null;
                            hq2Var.f93994d = str16;
                            hq2Var.f93995e = str17;
                            hq2Var.f93996f = null;
                            hq2Var.f93997g = zl2Var2;
                            hq2Var.f93998h = z4;
                            hq2Var.f93999i = z3;
                            hq2Var.f93990Y = 7;
                            if (((bpk) qnkVar).m30133H(strM96355b2, hq2Var) != obj) {
                                boolean z7 = z3;
                                zl2Var3 = zl2Var2;
                                String strM96355b5 = zl2Var3.m96355b();
                                if (str17 == null) {
                                    str17 = str16;
                                }
                                hq2Var.f93991a = null;
                                hq2Var.f93992b = null;
                                hq2Var.f93993c = null;
                                hq2Var.f93994d = null;
                                hq2Var.f93995e = null;
                                hq2Var.f93996f = null;
                                hq2Var.f93997g = zl2Var3;
                                hq2Var.f93998h = z4;
                                hq2Var.f93999i = z7;
                                hq2Var.f93990Y = 8;
                            }
                        }
                    }
                    break;
                } else {
                    wj0 wj0Var3 = new wj0(3, (Object) this, (Object) bn2Var2, (Object) str11, (Object) str8, str7, (fbk) null);
                    hq2Var.f93991a = null;
                    hq2Var.f93992b = str7;
                    hq2Var.f93993c = null;
                    hq2Var.f93994d = null;
                    hq2Var.f93995e = null;
                    hq2Var.f93996f = null;
                    hq2Var.f93998h = z4;
                    hq2Var.f93999i = z3;
                    hq2Var.f93990Y = 3;
                    objM54023a = x0h1.m89557A(lukVar, wj0Var3, hq2Var);
                    if (objM54023a != obj) {
                        str14 = str7;
                        om2Var = (om2) objM54023a;
                        hq2Var.f93991a = null;
                        hq2Var.f93992b = str14;
                        hq2Var.f93993c = null;
                        hq2Var.f93994d = null;
                        hq2Var.f93995e = null;
                        hq2Var.f93996f = null;
                        hq2Var.f93997g = om2Var;
                        hq2Var.f93998h = z4;
                        hq2Var.f93999i = z3;
                        hq2Var.f93990Y = 4;
                        if (((bpk) qnkVar).m30133H(str14, hq2Var) != obj) {
                            om2Var2 = om2Var;
                            str15 = str14;
                            return new kq2(str15, om2Var2.m67314b(), om2Var2.m67313a());
                        }
                    }
                }
                return obj;
            case 3:
                z3 = hq2Var.f93999i;
                z4 = hq2Var.f93998h;
                str14 = hq2Var.f93992b;
                bga.m29073P(objM54023a);
                om2Var = (om2) objM54023a;
                hq2Var.f93991a = null;
                hq2Var.f93992b = str14;
                hq2Var.f93993c = null;
                hq2Var.f93994d = null;
                hq2Var.f93995e = null;
                hq2Var.f93996f = null;
                hq2Var.f93997g = om2Var;
                hq2Var.f93998h = z4;
                hq2Var.f93999i = z3;
                hq2Var.f93990Y = 4;
                if (((bpk) qnkVar).m30133H(str14, hq2Var) != obj) {
                    om2Var2 = om2Var;
                    str15 = str14;
                    return new kq2(str15, om2Var2.m67314b(), om2Var2.m67313a());
                }
                return obj;
            case 4:
                om2Var2 = (om2) hq2Var.f93997g;
                str15 = hq2Var.f93992b;
                bga.m29073P(objM54023a);
                return new kq2(str15, om2Var2.m67314b(), om2Var2.m67313a());
            case 5:
                z3 = hq2Var.f93999i;
                z4 = hq2Var.f93998h;
                str12 = hq2Var.f93995e;
                str13 = hq2Var.f93994d;
                bga.m29073P(objM54023a);
                zl2Var = (zl2) objM54023a;
                strM96355b = zl2Var.m96355b();
                hq2Var.f93991a = null;
                hq2Var.f93992b = null;
                hq2Var.f93993c = null;
                hq2Var.f93994d = str13;
                hq2Var.f93995e = str12;
                hq2Var.f93996f = null;
                hq2Var.f93997g = zl2Var;
                hq2Var.f93998h = z4;
                hq2Var.f93999i = z3;
                hq2Var.f93990Y = 6;
                if (((bpk) qnkVar).m30127B(strM96355b, hq2Var) != obj) {
                    str16 = str13;
                    str17 = str12;
                    zl2Var2 = zl2Var;
                    strM96355b2 = zl2Var2.m96355b();
                    hq2Var.f93991a = null;
                    hq2Var.f93992b = null;
                    hq2Var.f93993c = null;
                    hq2Var.f93994d = str16;
                    hq2Var.f93995e = str17;
                    hq2Var.f93996f = null;
                    hq2Var.f93997g = zl2Var2;
                    hq2Var.f93998h = z4;
                    hq2Var.f93999i = z3;
                    hq2Var.f93990Y = 7;
                    if (((bpk) qnkVar).m30133H(strM96355b2, hq2Var) != obj) {
                        boolean z8 = z3;
                        zl2Var3 = zl2Var2;
                        String strM96355b6 = zl2Var3.m96355b();
                        if (str17 == null) {
                            str17 = str16;
                        }
                        hq2Var.f93991a = null;
                        hq2Var.f93992b = null;
                        hq2Var.f93993c = null;
                        hq2Var.f93994d = null;
                        hq2Var.f93995e = null;
                        hq2Var.f93996f = null;
                        hq2Var.f93997g = zl2Var3;
                        hq2Var.f93998h = z4;
                        hq2Var.f93999i = z8;
                        hq2Var.f93990Y = 8;
                    }
                    break;
                }
                return obj;
            case 6:
                z3 = hq2Var.f93999i;
                z4 = hq2Var.f93998h;
                zl2Var2 = (zl2) hq2Var.f93997g;
                str17 = hq2Var.f93995e;
                str16 = hq2Var.f93994d;
                bga.m29073P(objM54023a);
                strM96355b2 = zl2Var2.m96355b();
                hq2Var.f93991a = null;
                hq2Var.f93992b = null;
                hq2Var.f93993c = null;
                hq2Var.f93994d = str16;
                hq2Var.f93995e = str17;
                hq2Var.f93996f = null;
                hq2Var.f93997g = zl2Var2;
                hq2Var.f93998h = z4;
                hq2Var.f93999i = z3;
                hq2Var.f93990Y = 7;
                if (((bpk) qnkVar).m30133H(strM96355b2, hq2Var) != obj) {
                    boolean z9 = z3;
                    zl2Var3 = zl2Var2;
                    String strM96355b7 = zl2Var3.m96355b();
                    if (str17 == null) {
                        str17 = str16;
                    }
                    hq2Var.f93991a = null;
                    hq2Var.f93992b = null;
                    hq2Var.f93993c = null;
                    hq2Var.f93994d = null;
                    hq2Var.f93995e = null;
                    hq2Var.f93996f = null;
                    hq2Var.f93997g = zl2Var3;
                    hq2Var.f93998h = z4;
                    hq2Var.f93999i = z9;
                    hq2Var.f93990Y = 8;
                    break;
                }
                return obj;
            case 7:
                z3 = hq2Var.f93999i;
                z4 = hq2Var.f93998h;
                zl2Var2 = (zl2) hq2Var.f93997g;
                str17 = hq2Var.f93995e;
                str16 = hq2Var.f93994d;
                bga.m29073P(objM54023a);
                boolean z10 = z3;
                zl2Var3 = zl2Var2;
                String strM96355b8 = zl2Var3.m96355b();
                if (str17 == null) {
                    str17 = str16;
                }
                hq2Var.f93991a = null;
                hq2Var.f93992b = null;
                hq2Var.f93993c = null;
                hq2Var.f93994d = null;
                hq2Var.f93995e = null;
                hq2Var.f93996f = null;
                hq2Var.f93997g = zl2Var3;
                hq2Var.f93998h = z4;
                hq2Var.f93999i = z10;
                hq2Var.f93990Y = 8;
                break;
            case 8:
                zl2Var3 = (zl2) hq2Var.f93997g;
                bga.m29073P(objM54023a);
                return new kq2(zl2Var3.m96355b(), zl2Var3.m96357d(), zl2Var3.m96354a(), zl2Var3.m96356c());
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
