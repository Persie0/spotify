package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eng1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f61158a;

    /* JADX INFO: renamed from: b */
    public static sd40 f61159b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m39495a(qf40 qf40Var, int i, boolean z, boolean z2, boolean z3, e210 e210Var, String str, hln hlnVar, pgo pgoVar, fxh0 fxh0Var, boolean z4, th00 th00Var, vh00 vh00Var, xq00 xq00Var, int i2, int i3) {
        boolean z5;
        boolean z6;
        hln hlnVar2 = hlnVar;
        wb9 wb9Var = d7f0.f46166e;
        xq00Var.m91775k0(1143531574);
        ug5 ug5Var = xq00Var.f264811a;
        int i4 = (i2 & 6) == 0 ? i2 | (xq00Var.m91766g(qf40Var) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i4 |= xq00Var.m91762e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= xq00Var.m91768h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= xq00Var.m91768h(z3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= xq00Var.m91770i(e210Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= xq00Var.m91766g(str) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= (i2 & 16777216) == 0 ? xq00Var.m91766g(hlnVar2) : xq00Var.m91770i(hlnVar2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= xq00Var.m91770i(pgoVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= xq00Var.m91770i(fxh0Var) ? 536870912 : 268435456;
        }
        int i5 = i4;
        int i6 = (i3 & 6) == 0 ? i3 | (xq00Var.m91768h(z4) ? 4 : 2) : i3;
        if ((i3 & 48) == 0) {
            i6 |= xq00Var.m91770i(th00Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= xq00Var.m91770i(vh00Var) ? 256 : 128;
        }
        int i7 = i6;
        if (xq00Var.m91752Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
            soh.f211194A.getClass();
            eh00 eh00Var = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            xq00Var.m91771i0(-2012088421);
            AbstractC2282q6 abstractC2282q6 = (AbstractC2282q6) qf40Var;
            boolean zIsEmpty = abstractC2282q6.isEmpty();
            cxh0 cxh0Var = cxh0.f43038a;
            if (zIsEmpty && z3) {
                xq00Var.m91771i0(-2012098311);
                fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var);
                m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46174i, false);
                int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM61820d);
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00Var);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d2, yhhVar, xq00Var);
                zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
                AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
                zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
                mif1.m61869b(e210Var, new d210(str), null, null, xq00Var, (i5 >> 15) & 14, 12);
                z6 = true;
                a831.m25018j(xq00Var, true, false, false);
                vh00Var = vh00Var;
            } else {
                xq00Var.m91771i0(-2011828270);
                xq00Var.m91788r(false);
                fxh0 fxh0VarM61820d2 = mi21.m61820d(1.0f, cxh0Var);
                zi5 zi5Var = bj5.f27610a;
                aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224760c), d7f0.f46144O0, xq00Var, 0);
                int iHashCode3 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, fxh0VarM61820d2);
                xq00Var.m91779m0();
                wb9 wb9Var2 = wb9Var;
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00Var);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
                zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var);
                AbstractC0000a.m20s(iHashCode3, xq00Var, yhhVar3, xq00Var, vlhVar);
                zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var);
                if (abstractC2282q6.isEmpty()) {
                    xq00Var.m91771i0(-776077563);
                    for (int i8 = 0; i8 < 4; i8++) {
                        m39496b(null, xq00Var, 0);
                    }
                    z5 = false;
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-775971915);
                    Iterator it = g6f.m43714b1(qf40Var, i).iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        String str2 = (String) next;
                        boolean zM91766g = xq00Var.m91766g(str2) | xq00Var.m91766g(pgoVar) | ((i5 & 29360128) == 8388608 || ((i5 & 16777216) != 0 && xq00Var.m91766g(hlnVar2))) | ((i7 & ContentType.LONG_FORM_ON_DEMAND) == 32);
                        Object objM91750T = xq00Var.m91750T();
                        if (zM91766g || objM91750T == t6x0.f217647t) {
                            b210 b210Var = new b210(th00Var, str2, 0);
                            switch (hlnVar2.f92710a) {
                                case 0:
                                    objM91750T = new gop0((Flowable) ((vfn) hlnVar2.f92711b).f241004b.f211306D4.get(), pgoVar, b210Var);
                                    break;
                                default:
                                    objM91750T = new gop0((Flowable) ((pwn) hlnVar2.f92711b).f182075b.f211306D4.get(), pgoVar, b210Var);
                                    break;
                            }
                            xq00Var.m91793t0(objM91750T);
                        }
                        gop0 gop0Var = (gop0) objM91750T;
                        fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
                        irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
                        int iHashCode4 = Long.hashCode(xq00Var.f264809T);
                        wpn0 wpn0VarM91778m4 = xq00Var.m91778m();
                        fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var, fxh0VarM61822f);
                        soh.f211194A.getClass();
                        eh00 eh00Var2 = roh.f201257b;
                        xq00Var.m91779m0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00Var2);
                        } else {
                            xq00Var.m91799w0();
                        }
                        yhh yhhVar5 = roh.f201262g;
                        zsf1.m96835F(irx0VarM36744a, yhhVar5, xq00Var);
                        yhh yhhVar6 = roh.f201261f;
                        zsf1.m96835F(wpn0VarM91778m4, yhhVar6, xq00Var);
                        Integer numValueOf2 = Integer.valueOf(iHashCode4);
                        yhh yhhVar7 = roh.f201265j;
                        zsf1.m96835F(numValueOf2, yhhVar7, xq00Var);
                        vlh vlhVar2 = roh.f201266k;
                        zsf1.m96833D(vlhVar2, xq00Var);
                        yhh yhhVar8 = roh.f201259d;
                        zsf1.m96835F(fxh0VarM48286s4, yhhVar8, xq00Var);
                        if (!(((double) 1.0f) > 0.0d)) {
                            kt40.m57301a("invalid weight; must be greater than zero");
                        }
                        fxh0 fxh0VarM39673I = epv0.m39673I("playlist_preview_track_row:" + str2 + ":click_target", new cr70(1.0f, true));
                        Iterator it2 = it;
                        m6d0 m6d0VarM36007d3 = dha.m36007d(wb9Var2, false);
                        int iHashCode5 = Long.hashCode(xq00Var.f264809T);
                        wpn0 wpn0VarM91778m5 = xq00Var.m91778m();
                        fxh0 fxh0VarM48286s5 = hqg1.m48286s(xq00Var, fxh0VarM39673I);
                        xq00Var.m91779m0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00Var2);
                        } else {
                            xq00Var.m91799w0();
                        }
                        zsf1.m96835F(m6d0VarM36007d3, yhhVar5, xq00Var);
                        zsf1.m96835F(wpn0VarM91778m5, yhhVar6, xq00Var);
                        AbstractC0000a.m20s(iHashCode5, xq00Var, yhhVar7, xq00Var, vlhVar2);
                        zsf1.m96835F(fxh0VarM48286s5, yhhVar8, xq00Var);
                        wb9 wb9Var3 = wb9Var2;
                        mif1.m61869b(gop0Var, new bop0(z4 ? Integer.valueOf(i10) : null, str2), null, null, xq00Var, 0, 12);
                        xq00Var.m91788r(true);
                        if (vh00Var == null) {
                            xq00Var.m91771i0(-1148187478);
                            xq00Var.m91788r(false);
                        } else {
                            xq00Var.m91771i0(794245687);
                            vh00Var.mo24510D0(str2, xq00Var, Integer.valueOf((i7 >> 3) & ContentType.LONG_FORM_ON_DEMAND));
                            xq00Var.m91788r(false);
                        }
                        xq00Var.m91788r(true);
                        hlnVar2 = hlnVar;
                        wb9Var2 = wb9Var3;
                        it = it2;
                        i9 = i10;
                    }
                    z5 = false;
                    xq00Var.m91788r(false);
                }
                if (z && z2) {
                    xq00Var.m91771i0(-774831053);
                    AbstractC0000a.m22u(cxh0Var, 56, xq00Var, z5);
                } else {
                    xq00Var.m91771i0(-774749368);
                    xq00Var.m91788r(z5);
                }
                z6 = true;
                xq00Var.m91788r(true);
                xq00Var.m91788r(z5);
            }
            xq00Var.m91788r(z6);
        } else {
            vh00Var = vh00Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zvj(qf40Var, i, z, z2, z3, e210Var, str, hlnVar, pgoVar, fxh0Var, z4, th00Var, vh00Var, i2, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m39496b(fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1125442901);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = i | 6;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61818b = mi21.m61818b(mi21.m61822f(1.0f, cxh0Var), 0.0f, ltf1.m59890l(R.dimen.generated_playlist_track_row_min_height, xq00Var), 1);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61818b);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            dha.m36004a(xtm0.m92060G(nec.m64246i(mi21.m61834r(ltf1.m59890l(R.dimen.generated_playlist_track_artwork_size, xq00Var), cxh0Var), leu.m58815a(xq00Var).f112823a.f229875b.f123094b, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), leu.m58815a(xq00Var).f112823a.f229875b.f123094b, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b), 12), xq00Var, 0);
            fxh0 fxh0VarM96832C = zsf1.m96832C(cxh0Var, leu.m58816b(xq00Var).f117230b.f224761d, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            fxh0 fxh0VarM40940h = f710.m40940h(1.0f, fxh0VarM96832C, true);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM40940h);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            fpg1.m42357m(0.7f, 14, xq00Var, 6);
            fpg1.m42357m(0.45f, AbstractC0000a.m17p(cxh0Var, leu.m58816b(xq00Var).f117230b.f224758a, xq00Var, xq00Var).f117230b.f224762e, xq00Var, 6);
            xq00Var.m91788r(true);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i6q(fxh0Var2, i, 19);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m39497c(eju ejuVar, i9i0 i9i0Var, fxh0 fxh0Var, boolean z, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-2121304008);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(ejuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(i9i0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= xq00Var.m91768h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("multi_user_member", cxh0Var);
            boolean zM91770i = ((i3 & 7168) == 2048) | xq00Var.m91770i(ejuVar) | ((i3 & 57344) == 16384);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new erm0(ejuVar, z, gh00Var, 0);
                xq00Var.m91793t0(objM91750T);
            }
            gh00 gh00Var2 = (gh00) objM91750T;
            boolean zM91770i2 = xq00Var.m91770i(i9i0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                objM91750T2 = new gem0(i9i0Var, 7);
                xq00Var.m91793t0(objM91750T2);
            }
            g0b1.m43261b(gh00Var2, fxh0VarM39673I, (gh00) objM91750T2, xq00Var, 0, 0);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ugb0(ejuVar, i9i0Var, fxh0Var2, z, gh00Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m39498d(inw0 inw0Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i, int i2) {
        fxh0 fxh0Var2;
        int i3;
        fxh0 fxh0Var3;
        fxh0 fxh0Var4;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(431036454);
        int i4 = i | (xq00Var.m91770i(inw0Var) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            fxh0Var2 = fxh0Var;
        } else {
            fxh0Var2 = fxh0Var;
            i3 = i4 | (xq00Var.m91770i(fxh0Var2) ? 256 : 128);
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0Var5 = i5 != 0 ? cxh0Var : fxh0Var2;
            qf40 qf40Var = inw0Var.f104068b;
            if (qf40Var.isEmpty()) {
                fxh0Var4 = fxh0Var5;
                xq00Var.m91771i0(-943276548);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-945003465);
                int i6 = inw0Var.f104067a;
                String strM54971F = k0e1.m54971F(R.plurals.reply_preview_count_action_label, i6, new Object[]{Integer.valueOf(i6)}, xq00Var);
                vb9 vb9Var = d7f0.f46142M0;
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var5);
                irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, vb9Var, xq00Var, 0);
                int iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m = xq00Var.m91778m();
                fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61822f);
                soh.f211194A.getClass();
                eh00 eh00Var = roh.f201257b;
                if (xq00Var.f264811a == null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00Var);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                zsf1.m96833D(roh.f201266k, xq00Var);
                zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                rgu rguVarM86517r = vvx.m86517r(xq00Var);
                fxh0 fxh0Var6 = fxh0Var5;
                wgu wguVar = wgu.f251150c;
                boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                Object objM91750T = xq00Var.m91750T();
                if (z || objM91750T == obj) {
                    objM91750T = new agh(25, gh00Var);
                    xq00Var.m91793t0(objM91750T);
                }
                eh00 eh00Var2 = (eh00) objM91750T;
                if (wl51.m88460J0(strM54971F)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                peu peuVar = new peu(new t40(strM54971F), eh00Var2);
                boolean zM91766g = xq00Var.m91766g(strM54971F);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91766g || objM91750T2 == obj) {
                    objM91750T2 = new ivg(strM54971F, 2);
                    xq00Var.m91793t0(objM91750T2);
                }
                fxh0Var4 = fxh0Var6;
                dyu.m37371c(peuVar, wguVar, zoz0.m96643a(cxh0Var, (gh00) objM91750T2), null, rguVarM86517r, null, null, null, null, null, rkk.m75772x(203867940, new hyf(24, qf40Var, inw0Var), xq00Var), xq00Var, 0, 48, 2008);
                xq00Var.m91788r(true);
                xq00Var.m91788r(false);
            }
            fxh0Var3 = fxh0Var4;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hsd((Object) inw0Var, gh00Var, fxh0Var3, i, i2, 11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m39499e(snb1 snb1Var, xq00 xq00Var, int i) {
        pgv0 pgv0VarM91796v;
        ksb1 ksb1Var;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-1646976246);
        int i2 = (xq00Var.m91766g(snb1Var) ? 4 : 2) | i | (xq00Var.m91762e(0) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            pgq pgqVar = (pgq) xq00Var.m91774k(plb1.f178691a);
            gt0 gt0Var = (gt0) xq00Var.m91774k(xlb1.f263093c);
            ilb1 ilb1VarMo70434a = snb1Var.mo70434a();
            boolean zMo70436c = snb1Var.mo70436c();
            pa9 pa9VarM69901a = pgqVar.m69901a();
            if (pa9VarM69901a == null) {
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v == null) {
                    return;
                } else {
                    ksb1Var = new ksb1(snb1Var, i, 2);
                }
            } else {
                ro0 ro0Var = ilb1VarMo70434a.f103342a;
                List list = ilb1VarMo70434a.f103346e;
                boolean zM91766g = xq00Var.m91766g(ro0Var.mo29283j());
                Object objM91750T = xq00Var.m91750T();
                if (zM91766g || objM91750T == obj) {
                    objM91750T = ms2.m62689n(pa9VarM69901a.m69440e() != null, xq00Var);
                }
                kqi0 kqi0Var = (kqi0) objM91750T;
                if (!((Boolean) kqi0Var.getValue()).booleanValue()) {
                    kqi0Var.setValue(Boolean.valueOf(snb1Var instanceof tnb1));
                }
                boolean zM91766g2 = xq00Var.m91766g(ilb1VarMo70434a.f103342a.mo29283j());
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91766g2 || objM91750T2 == obj) {
                    objM91750T2 = gt0Var.m45673b(ilb1VarMo70434a, list);
                    if (objM91750T2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    xq00Var.m91793t0(objM91750T2);
                }
                l1p0 l1p0Var = (l1p0) objM91750T2;
                if (pa9VarM69901a.m69440e() == null && snb1Var.isVisible() && (snb1Var instanceof pnb1)) {
                    pa9VarM69901a.m69442g(l1p0Var);
                }
                if (snb1Var instanceof unb1) {
                    l1p0 l1p0VarM45673b = gt0Var.m45673b(ilb1VarMo70434a, list);
                    if (l1p0VarM45673b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    pa9VarM69901a.m69442g(l1p0VarM45673b);
                }
                boolean zM91770i = xq00Var.m91770i(pa9VarM69901a) | ((i2 & 14) == 4);
                Object objM91750T3 = xq00Var.m91750T();
                if (zM91770i || objM91750T3 == obj) {
                    objM91750T3 = new zm81(pa9VarM69901a, snb1Var, null, 20);
                    xq00Var.m91793t0(objM91750T3);
                }
                hz40.m49237i(w2a1.f247311a, (th00) objM91750T3, xq00Var);
                if (!zMo70436c) {
                    pa9VarM69901a.m69450p(snb1Var.mo70439l() ? 3 : 1);
                }
                qiu.m72876b(1, rkk.m75772x(418875327, new tx90(snb1Var, kqi0Var, pa9VarM69901a, zMo70436c, pgqVar, ilb1VarMo70434a), xq00Var), xq00Var, 54);
            }
            pgv0VarM91796v.f177419d = ksb1Var;
        }
        xq00Var.m91757b0();
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            ksb1Var = new ksb1(snb1Var, i, 1);
            pgv0VarM91796v.f177419d = ksb1Var;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m39500f(pa9 pa9Var, mac1 mac1Var, boolean z, pgq pgqVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        mac1 mac1Var2;
        Object obj;
        int i3;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-2111462230);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(pa9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91762e(mac1Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(pgqVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zM91770i = xq00Var.m91770i(pa9Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                i3 = i2;
                tf41 tf41Var = new tf41(1, pa9Var, pa9.class, "removeSurface", "removeSurface(Lcom/spotify/betamax/player/VideoSurfaceView;)V", 0, 0, 26);
                obj = pa9Var;
                xq00Var.m91793t0(tf41Var);
                objM91750T = tf41Var;
            } else {
                i3 = i2;
                obj = pa9Var;
            }
            oq60 oq60Var = (oq60) objM91750T;
            boolean zM91770i2 = ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91770i(pgqVar);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                mac1Var2 = mac1Var;
                objM91750T2 = new jq81(27, mac1Var2, pgqVar);
                xq00Var.m91793t0(objM91750T2);
            } else {
                mac1Var2 = mac1Var;
            }
            gh00 gh00Var = (gh00) objM91750T2;
            gh00 gh00Var2 = (gh00) oq60Var;
            boolean zM91770i3 = ((i3 & 896) == 256) | xq00Var.m91770i(obj);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T3 == ia7Var) {
                objM91750T3 = new qc7(z, obj, 16);
                xq00Var.m91793t0(objM91750T3);
            }
            g0b1.m43260a(gh00Var, fxh0Var, null, gh00Var2, (gh00) objM91750T3, xq00Var, (i3 >> 9) & ContentType.LONG_FORM_ON_DEMAND, 4);
        } else {
            mac1Var2 = mac1Var;
            obj = pa9Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ugb0(obj, mac1Var2, z, pgqVar, fxh0Var, i, 29);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final cl60 m39501g(eh00 eh00Var) {
        return new cl60(eh00Var);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m39502h(sh7 sh7Var) {
        return sh7Var == sh7.f209135t || sh7Var == sh7.f209123X || sh7Var == sh7.f209124Y;
    }

    /* JADX INFO: renamed from: i */
    public static final void m39503i(deu deuVar) {
        if ((deuVar instanceof dl60 ? (dl60) deuVar : null) != null) {
            return;
        }
        throw new IllegalStateException(stz0.m79354h(qpv0.f191387a, deuVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    /* JADX INFO: renamed from: k */
    public static final vk60 m39504k(fro froVar) {
        vk60 vk60Var = froVar instanceof vk60 ? (vk60) froVar : null;
        if (vk60Var != null) {
            return vk60Var;
        }
        throw new IllegalStateException(stz0.m79354h(qpv0.f191387a, froVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m39505o(List list) {
        return list.contains(tj01.VIDEO_STORY) || list.contains(tj01.IMAGE_STORY) || list.contains(tj01.GRADIENT_STORY);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX INFO: renamed from: p */
    public static final z7c0 m39506p(a6c0 a6c0Var, z5c0 z5c0Var) {
        Date date;
        Date date2;
        t3c0 t3c0Var;
        Boolean bool;
        Boolean bool2;
        msb1 msb1Var;
        boolean z;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        u3c0 u3c0Var;
        C1940hk c1940hk = a6c0Var.f12765h;
        String str = a6c0Var.f12759b;
        emr0 emr0Var = a6c0Var.f12760c;
        String str2 = emr0Var.f60974a;
        String str3 = emr0Var.f60975b;
        Integer num = emr0Var.f60976c;
        int i = a6c0Var.f12758a;
        boolean z2 = a6c0Var.f12762e;
        boolean z3 = a6c0Var.f12764g;
        fmo fmoVar = a6c0Var.f12761d;
        if (fmoVar != null) {
            try {
                date = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(fmoVar.f71088a);
            } catch (ParseException e) {
                na6.m63959g("Failed to parse dateOfBirth", e);
                date = null;
            }
            date2 = date;
        } else {
            date2 = null;
        }
        boolean z4 = fmoVar != null ? fmoVar.f71089b : false;
        r9o0 r9o0Var = a6c0Var.f12766i;
        cs10 cs10Var = a6c0Var.f12769l;
        xmq xmqVar = a6c0Var.f12767j;
        boolean z5 = a6c0Var.f12768k;
        l3c0 l3c0Var = a6c0Var.f12763f;
        if (l3c0Var != null) {
            if (c1940hk != null) {
                bool = c1940hk.f92296a;
            } else {
                bool = null;
            }
            if (c1940hk != null) {
                bool2 = c1940hk.f92297b;
            } else {
                bool2 = null;
            }
            if (c1940hk != null) {
                msb1Var = c1940hk.f92298c;
            } else {
                msb1Var = null;
            }
            if (msb1Var != null) {
                z = true;
            } else {
                z = false;
            }
            t3c0Var = new t3c0(l3c0Var, bool, bool2, z);
        } else {
            if ((c1940hk != null ? c1940hk.f92296a : null) != null) {
                if (c1940hk != null) {
                    bool = c1940hk.f92296a;
                } else {
                    bool = null;
                }
                if (c1940hk != null) {
                    bool2 = c1940hk.f92297b;
                } else {
                    bool2 = null;
                }
                if (c1940hk != null) {
                    msb1Var = c1940hk.f92298c;
                } else {
                    msb1Var = null;
                }
                if (msb1Var != null) {
                    z = true;
                } else {
                    z = false;
                }
                t3c0Var = new t3c0(l3c0Var, bool, bool2, z);
            } else {
                if ((c1940hk != null ? c1940hk.f92297b : null) != null) {
                    if (c1940hk != null) {
                        bool = c1940hk.f92296a;
                    } else {
                        bool = null;
                    }
                    if (c1940hk != null) {
                        bool2 = c1940hk.f92297b;
                    } else {
                        bool2 = null;
                    }
                    if (c1940hk != null) {
                        msb1Var = c1940hk.f92298c;
                    } else {
                        msb1Var = null;
                    }
                    if (msb1Var != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    t3c0Var = new t3c0(l3c0Var, bool, bool2, z);
                } else {
                    if ((c1940hk != null ? c1940hk.f92298c : null) != null) {
                        if (c1940hk != null) {
                            bool = c1940hk.f92296a;
                        } else {
                            bool = null;
                        }
                        if (c1940hk != null) {
                            bool2 = c1940hk.f92297b;
                        } else {
                            bool2 = null;
                        }
                        if (c1940hk != null) {
                            msb1Var = c1940hk.f92298c;
                        } else {
                            msb1Var = null;
                        }
                        if (msb1Var != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        t3c0Var = new t3c0(l3c0Var, bool, bool2, z);
                    } else {
                        t3c0Var = null;
                    }
                }
            }
        }
        if ((c1940hk != null ? c1940hk.f92299d : null) != null) {
            if (c1940hk != null) {
                bool3 = c1940hk.f92299d;
            } else {
                bool3 = null;
            }
            if (c1940hk != null) {
                bool4 = c1940hk.f92300e;
            } else {
                bool4 = null;
            }
            if (c1940hk != null) {
                bool5 = c1940hk.f92301f;
            } else {
                bool5 = null;
            }
            if (c1940hk != null) {
                bool6 = c1940hk.f92302g;
            } else {
                bool6 = null;
            }
            u3c0Var = new u3c0(bool3, bool4, bool5, bool6);
        } else {
            if ((c1940hk != null ? c1940hk.f92300e : null) != null) {
                if (c1940hk != null) {
                    bool3 = c1940hk.f92299d;
                } else {
                    bool3 = null;
                }
                if (c1940hk != null) {
                    bool4 = c1940hk.f92300e;
                } else {
                    bool4 = null;
                }
                if (c1940hk != null) {
                    bool5 = c1940hk.f92301f;
                } else {
                    bool5 = null;
                }
                if (c1940hk != null) {
                    bool6 = c1940hk.f92302g;
                } else {
                    bool6 = null;
                }
                u3c0Var = new u3c0(bool3, bool4, bool5, bool6);
            } else {
                if ((c1940hk != null ? c1940hk.f92301f : null) != null) {
                    if (c1940hk != null) {
                        bool3 = c1940hk.f92299d;
                    } else {
                        bool3 = null;
                    }
                    if (c1940hk != null) {
                        bool4 = c1940hk.f92300e;
                    } else {
                        bool4 = null;
                    }
                    if (c1940hk != null) {
                        bool5 = c1940hk.f92301f;
                    } else {
                        bool5 = null;
                    }
                    if (c1940hk != null) {
                        bool6 = c1940hk.f92302g;
                    } else {
                        bool6 = null;
                    }
                    u3c0Var = new u3c0(bool3, bool4, bool5, bool6);
                } else {
                    if ((c1940hk != null ? c1940hk.f92302g : null) != null) {
                        if (c1940hk != null) {
                            bool3 = c1940hk.f92299d;
                        } else {
                            bool3 = null;
                        }
                        if (c1940hk != null) {
                            bool4 = c1940hk.f92300e;
                        } else {
                            bool4 = null;
                        }
                        if (c1940hk != null) {
                            bool5 = c1940hk.f92301f;
                        } else {
                            bool5 = null;
                        }
                        if (c1940hk != null) {
                            bool6 = c1940hk.f92302g;
                        } else {
                            bool6 = null;
                        }
                        u3c0Var = new u3c0(bool3, bool4, bool5, bool6);
                    } else {
                        u3c0Var = null;
                    }
                }
            }
        }
        return new z7c0(str, z5c0Var, str2, str3, num, i, z2, z3, date2, z4, r9o0Var, cs10Var, xmqVar, z5, t3c0Var, u3c0Var, a6c0Var.f12770m, a6c0Var.f12771n);
    }

    /* JADX INFO: renamed from: q */
    public static final hb01 m39507q(hb01 hb01Var, String str) {
        ua01 ua01Var = hb01Var.f89348d;
        List<ak11> list = ua01Var.f228322d;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (ak11 ak11Var : list) {
            if (wj50.m88271j(ak11Var.f16396a, str)) {
                ak11Var = new ak11(ak11Var.f16396a, ak11Var.f16397b, ak11Var.f16398c, ak11Var.f16399d, !ak11Var.f16400e, ak11Var.f16401f, ak11Var.f16402g);
            }
            arrayList.add(ak11Var);
        }
        return hb01.m46957a(hb01Var, null, false, null, new ua01(ua01Var.f228319a, ua01Var.f228320b, ua01Var.f228321c, arrayList), 7);
    }

    /* JADX INFO: renamed from: r */
    public static void m39508r(View view) {
        u19 u19Var;
        if (view.isInEditMode()) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m39508r(viewGroup.getChildAt(i));
            }
            return;
        }
        if ((view instanceof TextView) && (u19Var = (u19) view.getTag(R.id.baselines_margin_view)) != null) {
            TextView textView = (TextView) view;
            int i2 = u19Var.f225718a ? -((int) Math.ceil(Math.abs(textView.getPaint().getFontMetrics().ascent))) : 0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            Integer num = (Integer) textView.getTag(R.id.baselines_original_top_margin);
            int iIntValue = ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin;
            if (num == null) {
                textView.setTag(R.id.baselines_original_top_margin, Integer.valueOf(iIntValue));
            } else {
                iIntValue = num.intValue();
            }
            marginLayoutParams.topMargin = iIntValue + i2;
            i = u19Var.f225719b ? -((int) Math.ceil(Math.abs(textView.getPaint().getFontMetrics().descent))) : 0;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            Integer num2 = (Integer) textView.getTag(R.id.baselines_original_bottom_margin);
            int iIntValue2 = ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin;
            if (num2 == null) {
                textView.setTag(R.id.baselines_original_bottom_margin, Integer.valueOf(iIntValue2));
            } else {
                iIntValue2 = num2.intValue();
            }
            marginLayoutParams2.bottomMargin = iIntValue2 + i;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m39509s(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (!textView.isInEditMode()) {
                u19 u19Var = (u19) textView.getTag(R.id.baselines_margin_view);
                if (u19Var == null) {
                    u19Var = new u19();
                    textView.setTag(R.id.baselines_margin_view, u19Var);
                }
                u19Var.f225719b = true;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m39510t(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (!textView.isInEditMode()) {
                u19 u19Var = (u19) textView.getTag(R.id.baselines_margin_view);
                if (u19Var == null) {
                    u19Var = new u19();
                    textView.setTag(R.id.baselines_margin_view, u19Var);
                }
                u19Var.f225718a = true;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo34391j(eab eabVar);

    /* JADX INFO: renamed from: l */
    public abstract void mo34392l(eab eabVar, eab eabVar2);

    /* JADX INFO: renamed from: m */
    public void m39511m(eab eabVar, eab eabVar2) {
        mo34392l(eabVar, eabVar2);
    }

    /* JADX INFO: renamed from: n */
    public void mo39512n(eab eabVar, Collection collection) {
        eabVar.mo38279t0(collection);
    }
}
