package p204p;

import android.net.Uri;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ipg1 {

    /* JADX INFO: renamed from: a */
    public static epg1 f104501a;

    /* JADX INFO: renamed from: b */
    public static sd40 f104502b;

    /* JADX INFO: renamed from: c */
    public static sd40 f104503c;

    /* JADX INFO: renamed from: a */
    public static final void m51263a(qaq0 qaq0Var, fyf fyfVar, r481 r481Var, fxh0 fxh0Var, fyf fyfVar2, xq00 xq00Var, int i) {
        qaq0 qaq0Var2;
        int i2;
        kqi0 kqi0Var;
        boolean z;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1221877520);
        if ((i & 6) == 0) {
            qaq0Var2 = qaq0Var;
            i2 = (xq00Var2.m91766g(qaq0Var2) ? 4 : 2) | i;
        } else {
            qaq0Var2 = qaq0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(fyfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? xq00Var2.m91766g(r481Var) : xq00Var2.m91770i(r481Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var2.m91766g(fxh0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var2.m91770i(null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= xq00Var2.m91768h(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var2.m91768h(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= xq00Var2.m91768h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= xq00Var2.m91770i(fyfVar2) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (xq00Var2.m91752Y(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objM91750T = xq00Var2.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = hz40.m49254z(dau.f47107a, xq00Var2);
                xq00Var2.m91793t0(objM91750T);
            }
            xuk xukVar = (xuk) objM91750T;
            Object objM91750T2 = xq00Var2.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = sam.m77645B(Boolean.FALSE);
                xq00Var2.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var2 = (kqi0) objM91750T2;
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0.f43038a);
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
            yhh yhhVar = roh.f201265j;
            if (xq00Var2.f264808S || !wj50.m88271j(xq00Var2.m91750T(), Integer.valueOf(iHashCode))) {
                pi9.m70087l(iHashCode, xq00Var2, iHashCode, yhhVar);
            }
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            if (r481Var.isVisible()) {
                xq00Var2.m91771i0(-1891243071);
                m51268f(qaq0Var2, r481Var, xukVar, false, kqi0Var2, fyfVar, xq00Var2, (i3 & 14) | 196608 | ((i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                kqi0Var = kqi0Var2;
                xq00Var2 = xq00Var2;
                z = false;
                xq00Var2.m91788r(false);
            } else {
                kqi0Var = kqi0Var2;
                z = false;
                xq00Var2.m91771i0(-1890863476);
                xq00Var2.m91788r(false);
            }
            m51269g(r481Var, kqi0Var, fxh0Var, fyfVar2, xq00Var2, ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752));
            xq00Var2.m91788r(true);
            boolean z2 = ((i3 & 896) == 256 || ((i3 & 512) != 0 && xq00Var2.m91770i(r481Var))) ? true : z;
            Object objM91750T3 = xq00Var2.m91750T();
            if (z2 || objM91750T3 == ia7Var) {
                objM91750T3 = new C2245p6(r481Var, 6);
                xq00Var2.m91793t0(objM91750T3);
            }
            hz40.m49233e(r481Var, (gh00) objM91750T3, xq00Var2);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new n39(qaq0Var, fyfVar, r481Var, fxh0Var, fyfVar2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m51264b(int i, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        xq00Var.m91775k0(1854913122);
        int i2 = (xq00Var.m91768h(z) ? 4 : 2) | i | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            xq00Var.m91757b0();
        } else if (z) {
            xq00Var.m91771i0(667688073);
            p271.m68899b(mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159603a, fxh0Var), 1, leu.m58815a(xq00Var).f112824b.f138758b, 0L, xq00Var, 48, 8);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(667867904);
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fl3(z, fxh0Var, i, 9);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m51265c(r8c0 r8c0Var, gh00 gh00Var, d670 d670Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-963174309);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(r8c0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? xq00Var.m91766g(d670Var) : xq00Var.m91770i(d670Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            WeakHashMap weakHashMap = cxd1.f42984x;
            ni80 ni80Var = new ni80(bxd1.m30815d(xq00Var).f42991g, 32);
            fyf fyfVar = bsg.f30315b;
            fyf fyfVarM75772x = rkk.m75772x(-1655085182, new p220(r8c0Var, d670Var, gh00Var, 24), xq00Var);
            int i4 = ((i3 >> 9) & 14) | 24624;
            cxh0 cxh0Var = cxh0.f43038a;
            vig1.m85649d(cxh0Var, fyfVar, null, ni80Var, fyfVarM75772x, xq00Var, i4, 4);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mg60((Object) r8c0Var, gh00Var, (Object) d670Var, (Object) fxh0Var2, i, 28);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m51266d(int i, String str, String str2, String str3, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1127899639);
        int i2 = i | (xq00Var2.m91766g(str) ? 4 : 2) | (xq00Var2.m91766g(str2) ? 32 : 16) | (xq00Var2.m91766g(str3) ? 256 : 128) | (xq00Var2.m91770i(eh00Var) ? 2048 : 1024) | 24576;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96866z = zsf1.m96866z(hdi.m47247x(mi21.m61822f(1.0f, cxh0Var), false, null, null, null, eh00Var, 15), leu.m58816b(xq00Var2).f117230b.f224766i, leu.m58816b(xq00Var2).f117230b.f224763f);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96866z);
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
            boolean z = (i2 & 896) == 256;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                if (str3 == null || (objM91750T = Uri.parse(str3)) == null) {
                    objM91750T = Uri.EMPTY;
                }
                xq00Var2.m91793t0(objM91750T);
            }
            Uri uri = (Uri) objM91750T;
            wj50.m88279p(uri);
            kgg1.m56339b(uri, null, tfu.f220050c, null, str, 0L, 0L, false, xq00Var2, ((i2 << 12) & 57344) | 384, AdvertisementType.BRANDED_AS_CONTENT);
            ahf1.m25932d(str2, null, fr0.m42472p(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224763f, xq00Var2, xq00Var2).f64971g, leu.m58815a(xq00Var2).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, (i2 >> 3) & 14, 0, 2034);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new en50(str, str2, str3, eh00Var, fxh0Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m51267e(eju ejuVar, bai0 bai0Var, fxh0 fxh0Var, boolean z, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(202789502);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(ejuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(bai0Var) ? 32 : 16;
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
            fxh0 fxh0VarM39673I = epv0.m39673I("pam-multi-user-trial-manager", cxh0Var);
            boolean zM91770i = ((i3 & 7168) == 2048) | xq00Var.m91770i(ejuVar) | ((i3 & 57344) == 16384);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new erm0(ejuVar, z, gh00Var, 3);
                xq00Var.m91793t0(objM91750T);
            }
            gh00 gh00Var2 = (gh00) objM91750T;
            boolean zM91770i2 = xq00Var.m91770i(bai0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                objM91750T2 = new gem0(bai0Var, 10);
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
            pgv0VarM91796v.f177419d = new ugb0(ejuVar, bai0Var, fxh0Var2, z, gh00Var, i, 9);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m51268f(qaq0 qaq0Var, r481 r481Var, xuk xukVar, boolean z, kqi0 kqi0Var, fyf fyfVar, xq00 xq00Var, int i) {
        qaq0 qaq0Var2;
        int i2;
        xq00Var.m91775k0(-1413720282);
        if ((i & 6) == 0) {
            qaq0Var2 = qaq0Var;
            i2 = (xq00Var.m91766g(qaq0Var2) ? 4 : 2) | i;
        } else {
            qaq0Var2 = qaq0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(r481Var) : xq00Var.m91770i(r481Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(xukVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91768h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91766g(kqi0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 1048576 : 524288;
        }
        if (xq00Var.m91752Y(i2 & 1, (599187 & i2) != 599186)) {
            String strM54977L = k0e1.m54977L(R.string.tooltip_description, xq00Var);
            boolean zM91770i = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32 || ((i2 & 64) != 0 && xq00Var.m91770i(r481Var))) | ((i2 & 896) == 256) | xq00Var.m91770i(xukVar) | ((458752 & i2) == 131072);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new ib8(r481Var, xukVar, kqi0Var, 1);
                xq00Var.m91793t0(objM91750T);
            }
            int i3 = (i2 & 14) | 3072;
            sm4.m78514a(qaq0Var2, (eh00) objM91750T, new raq0(1, z, true), rkk.m75772x(-1287705660, new ei1(2, strM54977L, fyfVar), xq00Var), xq00Var, i3, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new o39(qaq0Var, r481Var, xukVar, z, kqi0Var, fyfVar, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m51269g(r481 r481Var, kqi0 kqi0Var, fxh0 fxh0Var, fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1873232064);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91768h(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(r481Var) : xq00Var.m91770i(r481Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(kqi0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91768h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 131072 : 65536;
        }
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = hz40.m49254z(dau.f47107a, xq00Var);
                xq00Var.m91793t0(objM91750T);
            }
            xuk xukVar = (xuk) objM91750T;
            fxh0 fxh0VarM43463v = g391.m43463v(p1m0.m68834o(pb61.m69516a(pb61.m69516a(fxh0Var, r481Var, new t39(r481Var, 0)), r481Var, new t39(r481Var, 1)).mo34315F(new kwm0(new C2611yf(k0e1.m54977L(R.string.tooltip_label, xq00Var), xukVar, r481Var, 3))), new C1926h6(5, xukVar, r481Var)), new C2405t9(6, r481Var, kqi0Var));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM43463v);
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
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            yhh yhhVar = roh.f201265j;
            if (xq00Var.f264808S || !wj50.m88271j(xq00Var.m91750T(), Integer.valueOf(iHashCode))) {
                pi9.m70087l(iHashCode, xq00Var, iHashCode, yhhVar);
            }
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            rbz.m75196n((i2 >> 15) & 14, fyfVar, xq00Var, true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y73(r481Var, kqi0Var, fxh0Var, fyfVar, i);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m51270h(String str, String str2, boolean z, boolean z2, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        udu qduVar;
        xq00Var.m91775k0(-1081490749);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91768h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z3 = (i2 & 896) == 256;
            Object objM91750T = xq00Var.m91750T();
            if (z3 || objM91750T == t6x0.f217647t) {
                objM91750T = new C1758cy(z, 25);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(cxh0.f43038a, true, (gh00) objM91750T);
            if (z2) {
                xq00Var.m91771i0(69486519);
                xq00Var.m91788r(false);
                qduVar = sdu.f208086a;
            } else {
                xq00Var.m91771i0(69488309);
                qduVar = new qdu(k0e1.m54977L(R.string.managed_account_profile_visibility_settings_option_disabled, xq00Var));
                xq00Var.m91788r(false);
            }
            p711.m69222a(fxh0VarM96644b, null, qduVar, false, null, null, new peu(u40.f226523c, eh00Var), null, null, null, null, rkk.m75772x(-1900974597, new tv20(str2, 16), xq00Var), rkk.m75772x(634632828, new ls1(z, 25), xq00Var), null, null, rkk.m75772x(-348479489, new tv20(str, 17), xq00Var), xq00Var, 0, 197040, 26554);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1794dy(i, 5, str, str2, eh00Var, z, z2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m51271i(Throwable th, eh00 eh00Var) {
        m51277o(th, eh00Var);
    }

    /* JADX INFO: renamed from: j */
    public static x401 m51272j(boolean z, boolean z2) {
        x401 x401Var = new x401();
        if (z2) {
            x401Var.add(ort0.f168653c);
        }
        if (z) {
            x401Var.add(ort0.f168654d);
        }
        return n0e1.m63425d(x401Var);
    }

    /* JADX INFO: renamed from: k */
    public static Set m51273k() {
        return ort0.f168651a;
    }

    /* JADX INFO: renamed from: l */
    public static gbu m51274l() {
        return ort0.f168652b;
    }

    /* JADX INFO: renamed from: m */
    public static String m51275m(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public static final List m51276n(sb01 sb01Var, i4t0 i4t0Var) {
        List list = sb01Var.f207314d;
        List<ga01> list2 = sb01Var.f207315e;
        if (list2.isEmpty()) {
            return list;
        }
        wwu wwuVar = sb01Var.f207311a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list2, 10));
        for (ga01 ga01Var : list2) {
            String str = ga01Var.f77938a;
            Integer num = ga01Var.f77939b;
            rwt0 rwt0Var = null;
            ga01 ga01Var2 = num != null ? ga01Var : null;
            if (ga01Var2 != null) {
                rwt0Var = new rwt0(ga01Var2, 24);
            }
            arrayList.add(new yam(str, new xam(num, null, null, rwt0Var, 14), ga01Var.f77940c, ga01Var.f77941d, i4t0Var, new vam(new nnz0(ga01Var, 18))));
        }
        return g6f.m43701O0(new sd01(wwuVar, null, null, null, opo.m67546C(arrayList), 253), list);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m51277o(Throwable th, eh00 eh00Var) {
        List listAsList;
        Object objInvoke;
        Integer num = tw50.f224315a;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            listAsList = Arrays.asList(th.getSuppressed());
        } else {
            Method method = bdo0.f26191b;
            listAsList = (method == null || (objInvoke = method.invoke(th, null)) == null) ? lau.f131415a : Arrays.asList((Throwable[]) objInvoke);
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            joh johVar = (joh) eh00Var.invoke();
            if (johVar != null) {
                List list = johVar.f114431a;
                if (johVar.f114432b) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (((loh) list.get(i2)).f135430b != null) {
                            z = true;
                            break;
                        }
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                    break;
                }
            }
            if (z) {
                wj50.m88279p(johVar);
                diagnosticComposeException = new DiagnosticComposeException(johVar);
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            y85.m93061f(th, diagnosticComposeException);
        }
        return z;
    }
}
