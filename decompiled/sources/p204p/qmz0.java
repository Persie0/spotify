package p204p;

import com.comscore.streaming.ContentType;
import p000.AbstractC0000a;
import p000.C1636o;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qmz0 {

    /* JADX INFO: renamed from: a */
    public static final long f190437a;

    /* JADX INFO: renamed from: b */
    public static final long f190438b;

    /* JADX INFO: renamed from: c */
    public static final float f190439c;

    /* JADX INFO: renamed from: d */
    public static final float f190440d;

    /* JADX INFO: renamed from: e */
    public static final float f190441e;

    /* JADX INFO: renamed from: f */
    public static final float f190442f;

    /* JADX INFO: renamed from: g */
    public static final float f190443g;

    static {
        int i = n6f.f150872l;
        f190437a = n6f.f150866f;
        f190438b = n6f.f150862b;
        f190439c = 1;
        f190440d = 16;
        f190441e = 8;
        f190442f = 12;
        f190443g = 6;
    }

    /* JADX INFO: renamed from: a */
    public static final void m73308a(int i, int i2, db71 db71Var, rsu0 rsu0Var, gh00 gh00Var, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, eh00 eh00Var4, xq00 xq00Var, int i3) {
        int i4;
        float fM35537h;
        z6i0 z6i0Var = db71Var.f47231b;
        xq00Var.m91775k0(-2274743);
        int i5 = i3 | (xq00Var.m91762e(i) ? 4 : 2) | (xq00Var.m91762e(i2) ? 32 : 16) | (xq00Var.m91770i(db71Var) ? 256 : 128) | (xq00Var.m91762e(rsu0Var == null ? -1 : rsu0Var.ordinal()) ? 2048 : 1024) | (xq00Var.m91770i(gh00Var) ? 16384 : 8192) | (xq00Var.m91770i(eh00Var) ? 131072 : 65536) | (xq00Var.m91770i(eh00Var3) ? 8388608 : 4194304);
        if (xq00Var.m91752Y(i5 & 1, (38347923 & i5) != 38347922)) {
            yqq yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            jxu jxuVarM58816b = leu.m58816b(xq00Var);
            int length = db71Var.f47230a.f36033a.f107641b.length() - 1;
            int iM63437n = n0e1.m63437n(i, 0, length);
            int iM63437n2 = n0e1.m63437n(i2 - 1, 0, length);
            tiv0 tiv0VarM35531b = db71Var.m35531b(iM63437n);
            float f = tiv0VarM35531b.f220751a;
            float f2 = db71Var.m35531b(iM63437n2).f220753c;
            int iM95497d = z6i0Var.m95497d(iM63437n);
            int iM95497d2 = z6i0Var.m95497d(iM63437n2);
            if (iM95497d == iM95497d2) {
                i4 = 2;
                fM35537h = (f + f2) / 2;
            } else {
                i4 = 2;
                fM35537h = (db71Var.m35537h(iM95497d) + f) / 2;
            }
            float f3 = fM35537h;
            float fM35536g = iM95497d == iM95497d2 ? f3 : (db71Var.m35536g(iM95497d2) + f2) / i4;
            float fM95495b = z6i0Var.m95495b(iM95497d2);
            int iMo35990l0 = yqqVar.mo35990l0(jxuVarM58816b.f117230b.f224761d);
            int iMo35990l1 = yqqVar.mo35990l0(f190440d);
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = a831.m25015g(0.0f, xq00Var);
            }
            uum0 uum0Var = (uum0) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = sam.m77645B(Boolean.TRUE);
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var = (kqi0) objM91750T2;
            boolean z = ((i5 & 14) == 4) | ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objM91750T3 = xq00Var.m91750T();
            if (z || objM91750T3 == ia7Var) {
                objM91750T3 = new rmz0(tiv0VarM35531b.f220752b, fM95495b, f3, fM35536g, iMo35990l0, iMo35990l1, new dia(uum0Var, 16), new y3o0(kqi0Var, 21));
                xq00Var.m91793t0(objM91750T3);
            }
            sm4.m78514a((rmz0) objM91750T3, null, new raq0(16, false, false, false), rkk.m75772x(1282894695, new C1636o(rsu0Var, gh00Var, eh00Var, eh00Var2, eh00Var3, eh00Var4, uum0Var, kqi0Var), xq00Var), xq00Var, 3072, 2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new z52(i, i2, db71Var, rsu0Var, gh00Var, eh00Var, eh00Var2, eh00Var3, eh00Var4, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m73309b(int i, String str, String str2, fyf fyfVar, eh00 eh00Var, xq00 xq00Var) {
        int i2;
        String str3;
        xq00 xq00Var2;
        xq00Var.m91775k0(-643232783);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= xq00Var.m91766g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91766g(str2) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            ub9 ub9Var = d7f0.f46145P0;
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = tfe.m80656n(xq00Var);
            }
            fxh0 fxh0VarM39673I = epv0.m39673I(str2, hdi.m47245v(cxh0.f43038a, (voi0) objM91750T, null, false, null, null, eh00Var, 28));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, ub9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            fyfVar.invoke(xq00Var, Integer.valueOf(i2 & 14));
            ahf1.m25932d(str3, null, leu.m58818d(xq00Var).f64974j, f190438b, null, null, 0, false, new ol80(1), 0, null, xq00Var, ((i2 >> 3) & 14) | 3072, 0, 1778);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new weo(i, str, str2, fyfVar, eh00Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0223  */
    /* JADX WARN: Code duplicated, block: B:79:0x022f  */
    /* JADX WARN: Code duplicated, block: B:81:0x023d  */
    /* JADX INFO: renamed from: c */
    public static final void m73310c(rsu0 rsu0Var, gh00 gh00Var, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, eh00 eh00Var4, float f, boolean z, xq00 xq00Var, int i) {
        Object obj;
        Object objM91750T;
        xq00Var.m91775k0(-781482386);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = i | (xq00Var.m91762e(rsu0Var == null ? -1 : rsu0Var.ordinal()) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | (xq00Var.m91770i(eh00Var3) ? 16384 : 8192) | (xq00Var.m91770i(eh00Var4) ? 131072 : 65536) | (xq00Var.m91760d(f) ? 1048576 : 524288) | (xq00Var.m91768h(z) ? 8388608 : 4194304);
        if (xq00Var.m91752Y(i2 & 1, (4792467 & i2) != 4792466)) {
            jxu jxuVarM58816b = leu.m58816b(xq00Var);
            uyu uyuVarM58817c = leu.m58817c(xq00Var);
            fmx0 fmx0VarM47993b = hmx0.m47993b(jxuVarM58816b.f117234f.f148189e);
            Object objM91750T2 = xq00Var.m91750T();
            Object obj2 = t6x0.f217647t;
            if (objM91750T2 == obj2) {
                objM91750T2 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var = (kqi0) objM91750T2;
            int iM33187f = (int) cks.m33187f(uyuVarM58817c.f235363b.f225040b);
            yqq yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            float f2 = f190442f;
            float fMo35989Z0 = yqqVar.mo35989Z0(f2);
            boolean zM91760d = ((i2 & 3670016) == 1048576) | xq00Var.m91760d(fMo35989Z0);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91760d || objM91750T3 == obj2) {
                objM91750T3 = new xoh(f, fMo35989Z0, 9);
                xq00Var.m91793t0(objM91750T3);
            }
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61835s = mi21.m61835s(bga.m29069L(cxh0Var, (gh00) objM91750T3), f2, f190443g);
            fxh0 fxh0VarM39673I = epv0.m39673I("ereader_selection_menu", cxh0Var);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
            soh.f211194A.getClass();
            eh00 eh00Var5 = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var5);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            if (z) {
                xq00Var.m91771i0(1224602110);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1224309005);
                Object objM91750T4 = xq00Var.m91750T();
                if (objM91750T4 == obj2) {
                    objM91750T4 = vgz0.f241357X0;
                    xq00Var.m91793t0(objM91750T4);
                }
                xud.m92135b(48, (gh00) objM91750T4, xq00Var, fxh0VarM61835s);
                xq00Var.m91788r(false);
            }
            fxh0 fxh0VarM64246i = nec.m64246i(lqg1.m59734B(cxh0Var, f190441e, fmx0VarM47993b, false, 0L, 0L, 28), f190437a, fmx0VarM47993b);
            txu txuVar = jxuVarM58816b.f117230b;
            fxh0 fxh0VarM75069q = r9g1.m75069q(zsf1.m96866z(fxh0VarM64246i, txuVar.f224763f, txuVar.f224762e));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM75069q);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var5);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            Boolean bool = (Boolean) kqi0Var.getValue();
            bool.getClass();
            boolean zM91762e = xq00Var.m91762e(iM33187f) | xq00Var.m91770i(uyuVarM58817c);
            Object objM91750T5 = xq00Var.m91750T();
            if (zM91762e) {
                obj = obj2;
            } else {
                obj = obj2;
                if (objM91750T5 == obj) {
                }
                bx4.m30752a(bool, null, (gh00) objM91750T5, null, null, null, rkk.m75772x(704786413, new omz0(rsu0Var, gh00Var, kqi0Var, eh00Var, jxuVarM58816b, eh00Var3, eh00Var4), xq00Var), xq00Var, 1572864, 58);
                xq00Var.m91788r(true);
                if (z) {
                    xq00Var.m91771i0(1228630870);
                    objM91750T = xq00Var.m91750T();
                    if (objM91750T == obj) {
                        objM91750T = vgz0.f241366c1;
                        xq00Var.m91793t0(objM91750T);
                    }
                    xud.m92135b(48, (gh00) objM91750T, xq00Var, fxh0VarM61835s);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(1228915326);
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(true);
            }
            objM91750T5 = new C2580xm(iM33187f, uyuVarM58817c, 22);
            xq00Var.m91793t0(objM91750T5);
            bx4.m30752a(bool, null, (gh00) objM91750T5, null, null, null, rkk.m75772x(704786413, new omz0(rsu0Var, gh00Var, kqi0Var, eh00Var, jxuVarM58816b, eh00Var3, eh00Var4), xq00Var), xq00Var, 1572864, 58);
            xq00Var.m91788r(true);
            if (z) {
                xq00Var.m91771i0(1228630870);
                objM91750T = xq00Var.m91750T();
                if (objM91750T == obj) {
                    objM91750T = vgz0.f241366c1;
                    xq00Var.m91793t0(objM91750T);
                }
                xud.m92135b(48, (gh00) objM91750T, xq00Var, fxh0VarM61835s);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1228915326);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new pmz0(rsu0Var, gh00Var, eh00Var, eh00Var2, eh00Var3, eh00Var4, f, z, i);
        }
    }
}
