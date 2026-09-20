package p204p;

import android.os.Build;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C1636o;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wbb0 {

    /* JADX INFO: renamed from: a */
    public static final float f249729a = 72;

    /* JADX INFO: renamed from: b */
    public static final float f249730b = 80;

    /* JADX INFO: renamed from: a */
    public static final void m87628a(ktw0 ktw0Var, eh00 eh00Var, gh00 gh00Var, xq00 xq00Var, int i) {
        k971 k971Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1710773612);
        int i2 = i | (xq00Var.m91766g(ktw0Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91770i(gh00Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            fgu fguVarM41474w = fem.m41474w(xq00Var);
            jtw0 jtw0Var = ktw0Var instanceof jtw0 ? (jtw0) ktw0Var : null;
            Iterable iterable = jtw0Var != null ? jtw0Var.f115978a : null;
            if (iterable == null) {
                iterable = lau.f131415a;
            }
            xq00Var.m91771i0(-327100176);
            ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
            Iterator it = iterable.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                k971Var = k971.f120529b;
                if (!zHasNext) {
                    break;
                }
                Object[] objArr = new Object[0];
                Object objM91750T = xq00Var.m91750T();
                if (objM91750T == ia7Var) {
                    objM91750T = l4b0.f129646t;
                    xq00Var.m91793t0(objM91750T);
                }
                arrayList.add((l971) dul.m37020w(objArr, k971Var, (eh00) objM91750T, xq00Var, 384));
            }
            xq00Var.m91788r(false);
            Object[] objArr2 = new Object[0];
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = l4b0.f129644h;
                xq00Var.m91793t0(objM91750T2);
            }
            l971 l971Var = (l971) dul.m37020w(objArr2, k971Var, (eh00) objM91750T2, xq00Var, 384);
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == ia7Var) {
                objM91750T3 = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0 kqi0Var = (kqi0) objM91750T3;
            Object[] objArr3 = new Object[0];
            Object objM91750T4 = xq00Var.m91750T();
            if (objM91750T4 == ia7Var) {
                objM91750T4 = l4b0.f129645i;
                xq00Var.m91793t0(objM91750T4);
            }
            y0v.m92603a(2, rkk.m75772x(-271696248, new C1636o(gh00Var, eh00Var, fguVarM41474w, (kqi0) dul.m37018u(objArr3, (eh00) objM91750T4, xq00Var, 48), kqi0Var, ktw0Var, arrayList, l971Var), xq00Var), xq00Var, 390, 2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fma0(ktw0Var, eh00Var, gh00Var, i, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m87629b(String str, String str2, eh00 eh00Var, xq00 xq00Var, int i, int i2) {
        String str3;
        int i3;
        eh00 eh00Var2;
        int i4;
        String str4;
        eh00 eh00Var3;
        int i5;
        eh00 eh00Var4;
        cxh0 cxh0Var;
        pha phaVar;
        boolean z;
        bgb1 bgb1Var;
        float f;
        float f2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-2030082745);
        int i6 = i | (xq00Var2.m91766g(str) ? 4 : 2);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i6 | (xq00Var2.m91766g(str3) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i3 | 384;
            eh00Var2 = eh00Var;
        } else {
            eh00Var2 = eh00Var;
            i4 = i3 | (xq00Var2.m91770i(eh00Var2) ? 256 : 128);
        }
        if (xq00Var2.m91752Y(i4 & 1, (i4 & 147) != 146)) {
            String str5 = i7 != 0 ? null : str3;
            eh00 eh00Var5 = i8 != 0 ? null : eh00Var2;
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM61824h = mi21.m61824h(f249729a, mi21.m61822f(1.0f, cxh0Var2));
            long j = leu.m58815a(xq00Var2).f112823a.f229874a.f123093a;
            bgb1 bgb1Var2 = kxf1.f127485a;
            fxh0 fxh0VarM64246i = nec.m64246i(fxh0VarM61824h, j, bgb1Var2);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM64246i);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            pha phaVar2 = pha.f177517a;
            if (eh00Var5 == null || str5 == null) {
                i5 = i4;
                eh00Var4 = eh00Var5;
                cxh0Var = cxh0Var2;
                phaVar = phaVar2;
                z = false;
                bgb1Var = bgb1Var2;
                f = 1.0f;
                xq00Var2.m91771i0(856500853);
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(855977108);
                i5 = i4;
                eh00Var4 = eh00Var5;
                cxh0Var = cxh0Var2;
                bgb1Var = bgb1Var2;
                phaVar = phaVar2;
                f = 1.0f;
                z = false;
                riw0.m75607a(new peu(u40.f226523c, eh00Var5), wgu.f251150c, bga.m29071N(zsf1.m96832C(phaVar2.mo66945a(cxh0Var2, d7f0.f46172h), leu.m58816b(xq00Var2).f117230b.f224761d, 0.0f, 0.0f, 0.0f, 14), 0.0f, leu.m58816b(xq00Var2).f117230b.f224761d, 1), null, vvx.m86517r(xq00Var2), null, false, null, null, rkk.m75772x(-1496138817, new gx20(str5, 23), xq00Var2), xq00Var2, 48, 6, 984);
                xq00Var2.m91788r(false);
            }
            cxh0 cxh0Var3 = cxh0Var;
            fxh0 fxh0VarM61822f = mi21.m61822f(f, cxh0Var3);
            if (eh00Var4 == null) {
                xq00Var2.m91771i0(856666548);
                f2 = leu.m58816b(xq00Var2).f117230b.f224763f;
                xq00Var2.m91788r(z);
            } else {
                xq00Var2.m91771i0(856737073);
                f2 = leu.m58816b(xq00Var2).f117230b.f224769l;
                xq00Var2.m91788r(z);
            }
            ahf1.m25932d(str, bga.m29071N(zsf1.m96830A(fxh0VarM61822f, f2, 0.0f, 2), 0.0f, leu.m58816b(xq00Var2).f117230b.f224761d, 1), leu.m58818d(xq00Var2).f64971g, leu.m58815a(xq00Var2).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var, i5 & 14, 0, 2016);
            xq00Var2 = xq00Var;
            dha.m36004a(nec.m64246i(phaVar.mo66945a(mi21.m61824h(leu.m58816b(xq00Var2).f117231c.f127592a, mi21.m61822f(1.0f, cxh0Var3)), d7f0.f46155Y), leu.m58815a(xq00Var2).f112826d.f50025b, bgb1Var), xq00Var2, 0);
            xq00Var2.m91788r(true);
            eh00Var3 = eh00Var4;
            str4 = str5;
        } else {
            xq00Var2.m91757b0();
            str4 = str3;
            eh00Var3 = eh00Var2;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new bx5(i, i2, str, str4, eh00Var3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m87630c(l971 l971Var, float f, boolean z, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1330550107);
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91766g(l971Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91760d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var2.m91766g(fxh0Var) ? 16384 : 8192;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objM91750T = xq00Var2.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = ydj.m93452k(xq00Var2);
            }
            aqz aqzVar = (aqz) objM91750T;
            ppz ppzVar = (ppz) xq00Var2.m91774k(wsh.f254618i);
            mk31 mk31Var = (mk31) xq00Var2.m91774k(wsh.f254626q);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = (i2 & 896) == 256;
            Object objM91750T2 = xq00Var2.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new z3c(z, aqzVar, null, 2);
                xq00Var2.m91793t0(objM91750T2);
            }
            hz40.m49237i(boolValueOf, (th00) objM91750T2, xq00Var2);
            fxh0 fxh0VarM96831B = zsf1.m96831B(mi21.m61822f(1.0f, fxh0Var), leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224765h, leu.m58816b(xq00Var2).f117230b.f224763f, f);
            zi5 zi5Var = bj5.f27610a;
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224764g), d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96831B);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            boolean zM91770i = xq00Var2.m91770i(ppzVar) | xq00Var2.m91766g(mk31Var) | ((i2 & 7168) == 2048);
            Object objM91750T3 = xq00Var2.m91750T();
            if (zM91770i || objM91750T3 == ia7Var) {
                objM91750T3 = new k380(ppzVar, mk31Var, eh00Var, 7);
                xq00Var2.m91793t0(objM91750T3);
            }
            int i3 = i2;
            dyu.m37371c(new peu(u40.f226523c, (eh00) objM91750T3), wgu.f251150c, new o630(d7f0.f46146Q0), null, vvx.m86517r(xq00Var2), null, null, null, null, null, erg.f62127a, xq00Var2, 48, 48, 2008);
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0.f43038a);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            fxh0 fxh0VarM39673I = epv0.m39673I("lyrics-all-correction-field", pft0.m69835p(fxh0VarM61822f.mo34315F(new cr70(1.0f, true)), aqzVar));
            String strM54977L = k0e1.m54977L(R.string.lyrics_reporting_all_lyrics_correction_placeholder, xq00Var2);
            if71 if71Var = leu.m58818d(xq00Var2).f64971g;
            p771 p771Var = new p771(0, 0, 3);
            xzy xzyVarM92018F = xtf1.m92018F(kf5.f122059e, 20000);
            float f2 = leu.m58816b(xq00Var2).f117230b.f224763f;
            wze1.m89428d(l971Var, fxh0VarM39673I, null, strM54977L, null, null, false, false, xzyVarM92018F, if71Var, null, null, p771Var, null, null, null, new j4m0(f2, f2, f2, f2), 0.0f, m87633f(xq00Var2), xq00Var2, (i3 & 14) | 100663296, 384, 388340);
            xq00Var2 = xq00Var2;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new tbb0(l971Var, f, z, eh00Var, fxh0Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m87631d(eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(1989434261);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91770i(eh00Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var2) ? 32 : 16;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fxh0 fxh0VarM96830A = zsf1.m96830A(nec.m64246i(mi21.m61824h(f249730b, zfg1.m96028q(mi21.m61822f(1.0f, cxh0.f43038a), zfg1.f282319g)), leu.m58815a(xq00Var2).f112823a.f229874a.f123093a, kxf1.f127485a), leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2);
            zi5 zi5Var = bj5.f27610a;
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29371h(leu.m58816b(xq00Var2).f117230b.f224763f, d7f0.f46145P0), d7f0.f46142M0, xq00Var2, 48);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96830A);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            u40 u40Var = u40.f226523c;
            dyu.m37371c(new peu(u40Var, eh00Var), wgu.f251150c, null, null, vvx.m86516q(xq00Var2), null, null, null, null, null, erg.f62128b, xq00Var2, 48, 48, 2012);
            xq00Var2 = xq00Var;
            dyu.m37371c(new peu(u40Var, eh00Var2), new tgu(4), null, null, vvx.m86516q(xq00Var), null, null, null, null, null, erg.f62129c, xq00Var2, 0, 48, 2012);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hh5(eh00Var, eh00Var2, i, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m87632e(List list, List list2, boolean z, ArrayList arrayList, float f, fxh0 fxh0Var, xq00 xq00Var, int i) {
        ArrayList arrayList2;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(1510602164);
        int i2 = (i & 6) == 0 ? (xq00Var.m91766g(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            arrayList2 = arrayList;
            i2 |= xq00Var.m91766g(arrayList2) ? 2048 : 1024;
        } else {
            arrayList2 = arrayList;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91760d(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 131072 : 65536;
        }
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == obj) {
                int size = list.size();
                ArrayList arrayList3 = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList3.add(new aqz());
                }
                xq00Var.m91793t0(arrayList3);
                objM91750T = arrayList3;
            }
            List list3 = (List) objM91750T;
            mk31 mk31Var = (mk31) xq00Var.m91774k(wsh.f254626q);
            yw70 yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = hz40.m49254z(dau.f47107a, xq00Var);
                xq00Var.m91793t0(objM91750T2);
            }
            xuk xukVar = (xuk) objM91750T2;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var);
            float f2 = uwd1.f234634a;
            if (Build.VERSION.SDK_INT >= 30) {
                fxh0VarM61822f = hqg1.m48273f(fxh0VarM61822f, new C2089lg(12));
            }
            fxh0 fxh0Var2 = fxh0VarM61822f;
            j4m0 j4m0Var = new j4m0(leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224765h, leu.m58816b(xq00Var).f117230b.f224763f, f);
            zi5 zi5Var = bj5.f27610a;
            xi5 xi5VarM29370g = bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224764g);
            boolean zM91766g = (i3 == 4) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | xq00Var.m91766g(list3) | xq00Var.m91766g(mk31Var) | xq00Var.m91770i(xukVar) | xq00Var.m91766g(yw70VarM30763a);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91766g || objM91750T3 == obj) {
                Object bo8Var = new bo8(list, list2, arrayList2, list3, mk31Var, xukVar, yw70VarM30763a, z);
                xq00Var.m91793t0(bo8Var);
                objM91750T3 = bo8Var;
            }
            fyg1.m43085i(fxh0Var2, yw70VarM30763a, j4m0Var, false, xi5VarM29370g, null, null, false, null, (gh00) objM91750T3, xq00Var, 0, 488);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new e27(list, list2, z, arrayList, f, fxh0Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final n0v m87633f(xq00 xq00Var) {
        return new n0v(leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138758b, leu.m58815a(xq00Var).f112824b.f138760d, leu.m58815a(xq00Var).f112823a.f229874a.f123094b, leu.m58815a(xq00Var).f112823a.f229874a.f123094b, leu.m58815a(xq00Var).f112824b.f138757a, 0L, 896);
    }
}
