package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hhg1 {

    /* JADX INFO: renamed from: a */
    public static final fd11 f91384a = new fd11(28);

    /* JADX INFO: renamed from: b */
    public static sd40 f91385b;

    /* JADX INFO: renamed from: c */
    public static sd40 f91386c;

    /* JADX INFO: renamed from: a */
    public static final void m47522a(kv50 kv50Var, e940 e940Var, xq00 xq00Var, int i) {
        kv50 kv50Var2;
        int i2;
        xq00Var.m91775k0(-393390020);
        int i3 = (i & 6) == 0 ? i | (xq00Var.m91770i(kv50Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(e940Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            float f = 16;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, zsf1.m96830A(cxh0Var, 0.0f, f, 1));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61822f);
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
            yum0 yum0Var = kv50Var.f126779c;
            zj60 zj60Var = (zj60) yum0Var.getValue();
            dx30 dx30Var = zj60Var.f283376c;
            List<c3n0> listSingletonList = Collections.singletonList(zj60Var.f283375b);
            List list = svx.f214527a;
            List listSingletonList2 = Collections.singletonList(new j6y(dx30Var.f53839c, dx30Var.f53837a, dx30Var.f53838b, null));
            ArrayList arrayList = new ArrayList(i6f.m49804T(listSingletonList, 10));
            for (c3n0 c3n0Var : listSingletonList) {
                arrayList.add(new j6y(c3n0Var.f33709c, c3n0Var.f33707a, c3n0Var.f33708b, null));
            }
            p1m0.m68823d(e940Var, new m7y(6, g6f.m43700N0(arrayList, listSingletonList2), svx.f214527a), 56, null, xq00Var, (i3 >> 3) & 14);
            riw0.m75615i(xq00Var, mi21.m61824h(f, cxh0Var));
            ahf1.m25932d(((zj60) yum0Var.getValue()).f283374a, zsf1.m96830A(cxh0Var, 24, 0.0f, 2), if71.m50418a(leu.m58818d(xq00Var).f64969e, 0L, epv0.m39702v(18), null, null, null, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, null, 0, 16777213), 0L, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2024);
            riw0.m75615i(xq00Var, mi21.m61824h(12, cxh0Var));
            ahf1.m25932d(k0e1.m54977L(R.string.free_user_session_joined_sheet_subtitle, xq00Var), zsf1.m96830A(cxh0Var, f, 0.0f, 2), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
            riw0.m75615i(xq00Var, mi21.m61824h(f, cxh0Var));
            kv50Var2 = kv50Var;
            qiu.m72881g(13, rkk.m75772x(1592915039, new fc00(kv50Var2, 0), xq00Var), xq00Var, 54);
            i2 = 1;
            xq00Var.m91788r(true);
        } else {
            kv50Var2 = kv50Var;
            i2 = 1;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new e100(kv50Var2, e940Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m47523b(x93 x93Var, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        int i3;
        Object obj = eh00Var;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-319834578);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91762e(x93Var.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(obj) ? 32 : 16;
        }
        int i4 = i2;
        if (xq00Var2.m91752Y(i4 & 1, (i4 & 19) != 18)) {
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, zsf1.m96832C(cxh0.f43038a, leu.m58816b(xq00Var2).f117230b.f224759b + leu.m58816b(xq00Var2).f117230b.f224762e, 0.0f, leu.m58816b(xq00Var2).f117230b.f224759b, 0.0f, 10));
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27616g, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM61822f);
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
            int iOrdinal = x93Var.ordinal();
            if (iOrdinal == 0) {
                i3 = R.string.settings_default_save_location_category_songs;
            } else if (iOrdinal == 1) {
                i3 = R.string.settings_default_save_location_category_episodes;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.string.settings_default_save_location_category_audiobooks;
            }
            ahf1.m25932d(k0e1.m54977L(i3, xq00Var2), null, leu.m58818d(xq00Var2).f64972h, leu.m58815a(xq00Var2).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
            xq00Var2 = xq00Var;
            String strM54977L = k0e1.m54977L(R.string.settings_default_save_location_update_action_description, xq00Var2);
            boolean z = (i4 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new jqk(20, eh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            eh00 eh00Var2 = (eh00) objM91750T;
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            obj = eh00Var;
            dyu.m37371c(new peu(new t40(strM54977L), eh00Var2), wgu.f251150c, null, null, vvx.m86517r(xq00Var2), null, null, null, null, null, mcg.f142148a, xq00Var2, 0, 48, 2012);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qvj(x93Var, obj, i, 11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m47524c(int i, String str, eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(-171522754);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            fmx0 fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.f148189e);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM75068p = r9g1.m75068p(cxh0Var, fmx0VarM47993b);
            x4b x4bVar = iiu.f102631a;
            fxh0 fxh0VarM64246i = nec.m64246i(fxh0VarM75068p, ((giu) x4bVar.f258039d).f80259c, kxf1.f127485a);
            String strM54977L = k0e1.m54977L(R.string.suggestion_detail_use_action_label, xq00Var2);
            boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = new sp11(16, eh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var2).f117230b.f224763f, hdi.m47247x(fxh0VarM64246i, true, strM54977L, null, null, (eh00) objM91750T, 12));
            vb9 vb9Var = d7f0.f46142M0;
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, vb9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96865y);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            cr70 cr70Var = new cr70(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            irx0 irx0VarM36744a2 = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224761d), vb9Var, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, cr70Var);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a2, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            if71 if71Var = leu.m58818d(xq00Var2).f64971g;
            long j = ((hiu) x4bVar.f258040e).f91882m;
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            ahf1.m25932d(str, zsf1.m96832C(new cr70(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 11), if71Var, j, null, null, 0, false, null, 0, null, xq00Var, i3 & 14, 0, 2032);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            fxh0 fxh0VarM61834r = mi21.m61834r(48, cxh0Var);
            String strM54977L2 = k0e1.m54977L(R.string.suggestion_detail_action_label, xq00Var2);
            boolean z2 = (i3 & 896) == 256;
            Object objM91750T2 = xq00Var2.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new sp11(17, eh00Var2);
                xq00Var2.m91793t0(objM91750T2);
            }
            fxh0 fxh0VarM47247x = hdi.m47247x(fxh0VarM61834r, false, strM54977L2, null, null, (eh00) objM91750T2, 13);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode3 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var2, fxh0VarM47247x);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode3, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var2);
            y85.m93057b(zou.f284873c, new rgj(k0e1.m54977L(R.string.suggestion_detail_action_label, xq00Var2)), mi21.m61834r(20, cxh0Var), leu.m58815a(xq00Var2).f112824b.f138757a, 0L, false, xq00Var2, zou.f284874d, 48);
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fon0(str, eh00Var, eh00Var2, fxh0Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m47525d(eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1776140190);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(eh00Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0.f43038a);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27614e, d7f0.f46141L0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61822f);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            String strM54977L = k0e1.m54977L(R.string.settings_default_save_location_see_all_action_description, xq00Var);
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new jqk(21, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var2 = (eh00) objM91750T;
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            dyu.m37371c(new peu(new t40(strM54977L), eh00Var2), ugu.f230259c, null, null, vvx.m86517r(xq00Var), null, null, null, null, null, mcg.f142149b, xq00Var, 0, 48, 2012);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cy9(i, false, eh00Var, 10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m47526e(o8b1 o8b1Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-142103886);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(o8b1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            wwu wwuVar = o8b1Var.f162770c == 1 ? cpu.f40644c : dru.f52389c;
            cxh0 cxh0Var = cxh0.f43038a;
            p711.m69222a(mi21.m61822f(1.0f, cxh0Var), new kyu(0, tju.f221017e, 0, zsf1.m96848h(0, 0.0f, 2), null, null, null, 0, null, 501), null, false, null, null, null, null, null, rkk.m75772x(484211611, new c60(wwuVar, 10), xq00Var), null, rkk.m75772x(764971130, new p8b1(o8b1Var, 0), xq00Var), null, null, null, rkk.m75772x(1586191862, new p8b1(o8b1Var, 1), xq00Var), xq00Var, 805306432, 196656, 30204);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yz11(o8b1Var, fxh0Var2, i, 28);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Integer m47527f(erc1 erc1Var) {
        jiu jiuVar;
        ufu ufuVar;
        w240 w240Var = erc1Var.f62082d;
        if (w240Var == null || (jiuVar = w240Var.f247224c) == null) {
            w240 w240Var2 = erc1Var.f62079a.f139525b;
            jiuVar = w240Var2 != null ? w240Var2.f247224c : null;
        }
        if (jiuVar == null || (ufuVar = jiuVar.f112823a) == null) {
            return null;
        }
        return Integer.valueOf(rfg1.m75429D(ufuVar.f229876c));
    }

    /* JADX INFO: renamed from: g */
    public static he90 m47528g(String str) {
        return new he90(str);
    }

    /* JADX INFO: renamed from: h */
    public static b250 m47529h(b250 b250Var, b250 b250Var2) {
        if (b250Var == null) {
            b250Var = fau.f67640b;
        }
        if (b250Var2 == null) {
            b250Var2 = fau.f67640b;
        }
        fau fauVar = fau.f67640b;
        if (b250Var.equals(fauVar) && b250Var2.equals(fauVar)) {
            return fauVar;
        }
        if (b250Var.equals(fauVar)) {
            return b250Var2;
        }
        return b250Var2.equals(fauVar) ? b250Var : new lbf(b250Var, b250Var2);
    }

    /* JADX INFO: renamed from: i */
    public static final fmd0 m47530i(db71 db71Var, int i, int i2, int i3, long j, boolean z, boolean z2) {
        blz0 blz0Var;
        if (z) {
            blz0Var = null;
        } else {
            int i4 = ic71.f100751c;
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            blz0Var = new blz0(new zkz0(ehg1.m38971k(db71Var, i5), 1L, i5), new zkz0(ehg1.m38971k(db71Var, i6), 1L, i6), ic71.m50240h(j));
        }
        return new fmd0(z2, blz0Var, new gx8(i, i2, i3, db71Var), 14);
    }

    /* JADX INFO: renamed from: j */
    public static final ct50 m47531j(gh00 gh00Var, xh00 xh00Var, xh00 xh00Var2) {
        return new ct50(new coj0("ItemListItemLeafInstrumentation", new dt50(gh00Var, xh00Var2), xh00Var), xh00Var2);
    }

    /* JADX INFO: renamed from: k */
    public static ncm0 m47532k() {
        return new ncm0();
    }

    /* JADX INFO: renamed from: l */
    public static bk21 m47533l(xj21... xj21VarArr) {
        return new bk21(Arrays.asList(xj21VarArr));
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:65:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0166  */
    /* JADX WARN: Code duplicated, block: B:68:0x0169  */
    /* JADX WARN: Code duplicated, block: B:71:0x0178  */
    /* JADX WARN: Code duplicated, block: B:78:0x019f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX INFO: renamed from: m */
    public static ArrayList m47534m(String str, String str2, String str3, ArrayList arrayList) {
        Object next;
        ArrayList arrayList2;
        ?? arrayList3;
        tf70 tf70Var;
        Object obj = null;
        if (str2 == null) {
            str2 = str;
        } else {
            if (arrayList.isEmpty()) {
                str2 = null;
                break;
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
            } while (!bm51.m29797h0((String) it.next(), str2, true));
            if (str2 == null) {
                str2 = str;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Locale localeForLanguageTag = Locale.forLanguageTag(ihf1.m50638v());
        Collator collator = Collator.getInstance(localeForLanguageTag);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            if (linkedHashSet.add(str4.toLowerCase(Locale.ROOT))) {
                wj50.m88279p(localeForLanguageTag);
                String displayName = Locale.forLanguageTag(str4).getDisplayName(localeForLanguageTag);
                if (displayName.length() > 0) {
                    displayName = ((Object) zn91.m96576s0(displayName.charAt(0), localeForLanguageTag)) + displayName.substring(1);
                }
                tf70Var = new tf70(str4, str2.equalsIgnoreCase(str4), displayName, str4.equalsIgnoreCase(str));
            } else {
                tf70Var = null;
            }
            if (tf70Var != null) {
                arrayList4.add(tf70Var);
            }
        }
        Iterator it3 = arrayList4.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!((tf70) next).f219877d);
        tf70 tf70Var2 = (tf70) next;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (!((tf70) obj2).f219877d) {
                arrayList5.add(obj2);
            }
        }
        List listM43711Y0 = g6f.m43711Y0(arrayList5, new z320(collator, 1));
        for (Object obj3 : listM43711Y0) {
            if (bm51.m29797h0(((tf70) obj3).f219874a, str3, true)) {
                obj = obj3;
                break;
            }
        }
        tf70 tf70Var3 = (tf70) obj;
        if (tf70Var3 != null) {
            arrayList3 = Collections.singletonList(tf70Var3);
        } else {
            Locale localeForLanguageTag2 = Locale.forLanguageTag(str3);
            if (localeForLanguageTag2.getLanguage().length() <= 0 || localeForLanguageTag2.getScript().length() <= 0) {
                if (localeForLanguageTag2.getLanguage().length() == 0) {
                    arrayList3 = lau.f131415a;
                } else {
                    arrayList2 = new ArrayList();
                    for (Object obj4 : listM43711Y0) {
                        if (bm51.m29797h0(Locale.forLanguageTag(((tf70) obj4).f219874a).getLanguage(), localeForLanguageTag2.getLanguage(), true)) {
                            arrayList2.add(obj4);
                        }
                    }
                    arrayList3 = arrayList2;
                }
                if (arrayList3.isEmpty()) {
                    arrayList3 = new ArrayList();
                    for (Object obj5 : listM43711Y0) {
                        if (bm51.m29797h0(Locale.forLanguageTag(((tf70) obj5).f219874a).getLanguage(), "en", true)) {
                            arrayList3.add(obj5);
                        }
                    }
                }
            } else {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : listM43711Y0) {
                    Locale localeForLanguageTag3 = Locale.forLanguageTag(((tf70) obj6).f219874a);
                    if (bm51.m29797h0(localeForLanguageTag3.getLanguage(), localeForLanguageTag2.getLanguage(), true) && bm51.m29797h0(localeForLanguageTag3.getScript(), localeForLanguageTag2.getScript(), true)) {
                        arrayList6.add(obj6);
                    }
                }
                if (arrayList6.isEmpty()) {
                    if (localeForLanguageTag2.getLanguage().length() == 0) {
                        arrayList3 = lau.f131415a;
                    } else {
                        arrayList2 = new ArrayList();
                        while (r1.hasNext()) {
                            if (bm51.m29797h0(Locale.forLanguageTag(((tf70) obj4).f219874a).getLanguage(), localeForLanguageTag2.getLanguage(), true)) {
                                arrayList2.add(obj4);
                            }
                        }
                        arrayList3 = arrayList2;
                    }
                    if (arrayList3.isEmpty()) {
                        arrayList3 = new ArrayList();
                        while (r14.hasNext()) {
                            if (bm51.m29797h0(Locale.forLanguageTag(((tf70) obj5).f219874a).getLanguage(), "en", true)) {
                                arrayList3.add(obj5);
                            }
                        }
                    }
                } else {
                    arrayList3 = arrayList6;
                }
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : listM43711Y0) {
            tf70 tf70Var4 = (tf70) obj7;
            if (!arrayList3.isEmpty()) {
                Iterator it4 = arrayList3.iterator();
                do {
                    if (it4.hasNext()) {
                    }
                } while (!bm51.m29797h0(((tf70) it4.next()).f219874a, tf70Var4.f219874a, true));
            }
            arrayList7.add(obj7);
        }
        return g6f.m43700N0(arrayList7, g6f.m43700N0(arrayList3, h6f.m46716M(tf70Var2)));
    }

    /* JADX INFO: renamed from: n */
    public static final jxs0 m47535n(jxs0 jxs0Var, mxs0 mxs0Var, Integer num) {
        jxs0 jxs0Var2 = mxs0Var instanceof jxs0 ? (jxs0) mxs0Var : null;
        if (jxs0Var2 != null) {
            jxs0 jxs0Var3 = (wj50.m88271j(jxs0Var2.f117211a, jxs0Var.f117211a) && wj50.m88271j(jxs0Var2.f117213c, jxs0Var.f117213c)) ? jxs0Var2 : null;
            if (jxs0Var3 != null) {
                return jxs0.m54725g(jxs0Var3, null, num, false, false, 639);
            }
        }
        return null;
    }
}
