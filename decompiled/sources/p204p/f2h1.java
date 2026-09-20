package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import com.comscore.streaming.ContentType;
import com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f2h1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f65196a;

    /* JADX INFO: renamed from: a */
    public static final void m40586a(gxv0 gxv0Var, fyf fyfVar, peu peuVar, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-1984967837);
        int i2 = i | (xq00Var.m91766g(gxv0Var) ? 4 : 2) | (xq00Var.m91770i(peuVar) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            fxh0 fxh0VarM39673I = epv0.m39673I("related_content_discovery_row", cxh0.f43038a);
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            float f2 = leu.m58816b(xq00Var).f117230b.f224761d;
            kyu kyuVar = new kyu(0, null, 4, new j4m0(f, f2, f, f2), null, null, null, 0, null, 499);
            String str = gxv0Var.f85347d;
            fyf fyfVarM75772x = null;
            Uri uri = str != null ? Uri.parse(str) : null;
            if (uri == null) {
                xq00Var.m91771i0(-1066540320);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1066540319);
                fyfVarM75772x = rkk.m75772x(1293727725, new i380(2, uri), xq00Var);
                xq00Var.m91788r(false);
            }
            p711.m69222a(fxh0VarM39673I, kyuVar, null, false, null, null, peuVar, null, null, fyfVarM75772x, null, rkk.m75772x(-852297429, new ixv0(gxv0Var, 0), xq00Var), fyfVar, null, null, rkk.m75772x(-705796441, new ixv0(gxv0Var, 1), xq00Var), xq00Var, 64 | ((i2 << 12) & 3670016), 197040, 26044);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mlu0(gxv0Var, fyfVar, peuVar, i, 10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m40587b(e180 e180Var, dut dutVar, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        gh00 gh00Var2;
        fxh0 fxh0Var2;
        cxh0 cxh0Var;
        xq00 xq00Var2 = xq00Var;
        boolean z = e180Var.f55141e;
        boolean z2 = e180Var.f55140d;
        x080 x080Var = e180Var.f55137a;
        xq00Var2.m91775k0(-942397586);
        int i2 = i | (xq00Var2.m91770i(e180Var) ? 4 : 2) | (xq00Var2.m91770i(dutVar) ? 32 : 16) | (xq00Var2.m91770i(gh00Var) ? 256 : 128) | 3072;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            float f = leu.m58816b(xq00Var2).f117230b.f224763f;
            String str = l071.f128308a;
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM96865y = zsf1.m96865y(f, nec.m64246i(mi21.m61842z(mi21.m61822f(1.0f, epv0.m39673I(str, cxh0Var2)), null, 3), rfg1.m75432b(e180Var.f55139c), hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.f148189e)));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96865y);
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
            ahf1.m25932d(k0e1.m54977L((z2 || z) ? R.string.leave_behind_ads_header_title_sponsored : R.string.leave_behind_ads_header_title, xq00Var2), null, leu.m58818d(xq00Var2).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2042);
            xq00Var2 = xq00Var;
            xq00Var2.m91771i0(-1726616514);
            int i3 = 0;
            for (Object obj : g6f.m43714b1(x080Var.f256828b, e180Var.f55138b)) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                mif1.m61869b(dutVar, new e080((fh0) obj, i3, z2 || z, x080Var.f256827a), zsf1.m96830A(cxh0Var2, 0.0f, f, 1), null, xq00Var2, (i2 >> 3) & 14, 8);
                i3 = i4;
            }
            xq00Var2.m91788r(false);
            if (e180Var.f55142f) {
                xq00Var2.m91771i0(-1985128381);
                int size = x080Var.f256828b.size();
                boolean z3 = (i2 & 896) == 256;
                Object objM91750T = xq00Var2.m91750T();
                if (z3 || objM91750T == t6x0.f217647t) {
                    gh00Var2 = gh00Var;
                    objM91750T = new jj60(17, gh00Var2);
                    xq00Var2.m91793t0(objM91750T);
                } else {
                    gh00Var2 = gh00Var;
                }
                cxh0Var = cxh0Var2;
                m40589d(size, 0, xq00Var2, hdi.m47247x(cxh0Var, false, null, null, null, (eh00) objM91750T, 15));
                xq00Var2.m91788r(false);
            } else {
                gh00Var2 = gh00Var;
                cxh0Var = cxh0Var2;
                xq00Var2.m91771i0(-1984998646);
                xq00Var2.m91788r(false);
            }
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            gh00Var2 = gh00Var;
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new m080(e180Var, dutVar, gh00Var2, fxh0Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m40588c(gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(874238102);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(gh00Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new etn0(14, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            peu peuVar = new peu(u40.f226523c, (eh00) objM91750T);
            tgu tguVar = new tgu(8);
            rgu rguVarM86516q = vvx.m86516q(xq00Var);
            float f = leu.m58816b(xq00Var).f117230b.f224766i;
            float f2 = leu.m58816b(xq00Var).f117230b.f224761d;
            dyu.m37371c(peuVar, tguVar, null, null, rgu.m75487b(rguVarM86516q, new j4m0(f, f2, f, f2), 0.0f, 0.0f, 0.0f, 62), null, null, null, null, null, i0h.f97242a, xq00Var, 0, 48, 2012);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new z3d0(gh00Var, i, 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m40589d(int i, int i2, xq00 xq00Var, fxh0 fxh0Var) {
        cxh0 cxh0Var;
        xq00Var.m91775k0(-315990097);
        int i3 = i2 | (xq00Var.m91762e(i) ? 4 : 2) | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            fxh0 fxh0VarM96832C = zsf1.m96832C(mi21.m61822f(1.0f, fxh0Var), 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 9);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46141L0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96832C);
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
            String strM54977L = k0e1.m54977L(R.string.leave_behind_ads_footer_title, xq00Var);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            ahf1.m25932d(strM54977L, new cr70(1.0f, true), leu.m58818d(xq00Var).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            cxh0 cxh0Var2 = cxh0.f43038a;
            if (i > 1) {
                xq00Var.m91771i0(365819593);
                cxh0Var = cxh0Var2;
                ahf1.m25932d(String.valueOf(i), zsf1.m96830A(cxh0Var2, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 2), leu.m58818d(xq00Var).f64971g, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
                xq00Var.m91788r(false);
            } else {
                cxh0Var = cxh0Var2;
                xq00Var.m91771i0(365985071);
                xq00Var.m91788r(false);
            }
            y85.m93057b(pou.f179785c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159604b, cxh0Var).mo34315F(new ofb1(d7f0.f46142M0)), 0L, 0L, false, xq00Var, pou.f179786d | 48, 56);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2351ru(i, fxh0Var, i2, 24);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m40590e(if0 if0Var, ow01 ow01Var, v0y v0yVar, m021 m021Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-47652211);
        int i2 = i | (xq00Var.m91770i(if0Var) ? 4 : 2) | (xq00Var.m91770i(ow01Var) ? 32 : 16) | (xq00Var.m91770i(v0yVar) ? 256 : 128) | (xq00Var.m91766g(m021Var) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            lay0.m58586a(null, rkk.m75772x(105584465, new l021(if0Var, 0, (byte) 0), xq00Var), null, null, null, 0, n6f.f150870j, 0L, null, rkk.m75772x(1807359516, new ucw0(ow01Var, v0yVar, m021Var, 15), xq00Var), xq00Var, 805306416, 445);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new s1z0(if0Var, ow01Var, v0yVar, m021Var, i, 15);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m40591f(wwu wwuVar, String str, xq00 xq00Var, int i) {
        int i2;
        wwu wwuVar2;
        String str2;
        xq00 xq00Var2;
        xq00Var.m91775k0(881423963);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(wwuVar) : xq00Var.m91770i(wwuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            wwuVar2 = wwuVar;
            str2 = str;
            xq00Var2 = xq00Var;
            oqg1.m67632a(wwuVar2, str2, zsf1.m96830A(cxh0.f43038a, 0.0f, leu.m58816b(xq00Var).f117230b.f224761d, 1), xq00Var2, (i2 & 14) | 8 | (i2 & ContentType.LONG_FORM_ON_DEMAND), 0);
        } else {
            wwuVar2 = wwuVar;
            str2 = str;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new p7t(i, 4, str2, wwuVar2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m40592g(EncoreButton encoreButton, zsa zsaVar) {
        encoreButton.setText(zsaVar.f285895a);
        Integer num = zsaVar.f285896b;
        if (num != null) {
            encoreButton.setTextColor(num.intValue());
        }
        Integer num2 = zsaVar.f285897c;
        if (num2 != null) {
            encoreButton.setBackgroundTintList(ColorStateList.valueOf(num2.intValue()));
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m40593h(ata ataVar, EncoreButton encoreButton, bc21 bc21Var, c9k c9kVar, zv41 zv41Var, gh00 gh00Var) {
        m40592g(encoreButton, ataVar.f19623a);
        encoreButton.setOnClickListener(new f85(c9kVar, bc21Var, ataVar, gh00Var));
        x0h1.m89578u(c9kVar, null, 0, new xha(zv41Var, ataVar, encoreButton, null, 5), 3);
    }

    /* JADX INFO: renamed from: i */
    public static final z9t m40594i(z9t z9tVar, qqo qqoVar, ce60 ce60Var, int i, fr70 fr70Var) {
        return new z9t((qwm) z9tVar.f280873b, ce60Var != null ? new hr81(z9tVar, qqoVar, ce60Var, i) : (eo91) z9tVar.f280874c, fr70Var);
    }

    /* JADX INFO: renamed from: j */
    public static z9t m40595j(z9t z9tVar, age ageVar, mov0 mov0Var, int i) {
        if ((i & 2) != 0) {
            mov0Var = null;
        }
        return m40594i(z9tVar, ageVar, mov0Var, 0, q3d0.m72078I(3, new C2445u9(4, z9tVar, ageVar)));
    }

    /* JADX INFO: renamed from: k */
    public static final z9t m40596k(z9t z9tVar, l25 l25Var) {
        return l25Var.isEmpty() ? z9tVar : new z9t((qwm) z9tVar.f280873b, (eo91) z9tVar.f280874c, q3d0.m72078I(3, new C2445u9(5, z9tVar, l25Var)));
    }

    /* JADX INFO: renamed from: l */
    public static Intent m40597l(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) AgeVerificationDialogActivity.class);
        int i = AgeVerificationDialogActivity.f2739l1;
        intent.putExtra("EXTRA_ENTITY_URI", str);
        intent.putExtra("EXTRA_COVER_ART_URI", str2);
        return intent;
    }

    /* JADX INFO: renamed from: m */
    public static int m40598m(String str) {
        if (wl51.m88496t0(str, "wrapped", false)) {
            return 0;
        }
        return (wl51.m88496t0(str, "shortcuts", false) || wl51.m88496t0(str, "anchors", false)) ? 2 : 0;
    }

    /* JADX INFO: renamed from: n */
    public static final ov71 m40599n(uu71 uu71Var, Boolean bool) {
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            fhf fhfVar = uu71Var.f234120a;
            if (fhfVar.m41663a() && (!zBooleanValue || fhfVar.m41664b())) {
                return bool.booleanValue() ? new mv71(grn0.f83797d) : nv71.f158826a;
            }
        }
        return lv71.f137257a;
    }
}
