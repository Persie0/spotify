package p204p;

import android.graphics.Color;
import androidx.compose.p002ui.geometry.Offset;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pwb {

    /* JADX INFO: renamed from: a */
    public static final be8 f181978a = new be8();

    /* JADX INFO: renamed from: b */
    public static sd40 f181979b;

    /* JADX INFO: renamed from: a */
    public static final void m71216a(gga ggaVar, xq00 xq00Var, int i) {
        gga ggaVar2;
        boolean z;
        xq00Var.m91775k0(-1345304488);
        int i2 = (xq00Var.m91766g(ggaVar) ? 4 : 2) | i;
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            ggaVar2 = ggaVar;
            xq00Var.m91757b0();
        } else if (ggaVar != null) {
            xq00Var.m91771i0(-1626078028);
            if (ggaVar instanceof jo81) {
                xq00Var.m91771i0(-1626031125);
                String str = ((jo81) ggaVar).f114373c;
                if (str == null) {
                    xq00Var.m91788r(false);
                    xq00Var.m91788r(false);
                    pgv0 pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        pgv0VarM91796v.f177419d = new up81(ggaVar, i, 0);
                        return;
                    }
                    return;
                }
                z = false;
                ahf1.m25932d(k0e1.m54978M(R.string.song_dna_track_row_footer_original_type, new Object[]{str}, xq00Var), null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
                xq00Var.m91788r(false);
                ggaVar2 = ggaVar;
            } else {
                ggaVar2 = ggaVar;
                z = false;
                if (!(ggaVar2 instanceof io81)) {
                    throw lq51.m59703i(-52454130, xq00Var, false);
                }
                xq00Var.m91771i0(-1625664984);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(z);
        } else {
            ggaVar2 = ggaVar;
            xq00Var.m91771i0(-1625653142);
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v2 = xq00Var.m91796v();
        if (pgv0VarM91796v2 != null) {
            pgv0VarM91796v2.f177419d = new up81(ggaVar2, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m71217b(Object obj, iw3 iw3Var, lwf lwfVar, xq00 xq00Var, int i) {
        int i2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-2082585027);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(iw3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? xq00Var.m91766g(lwfVar) : xq00Var.m91770i(lwfVar) ? 256 : 128;
        }
        boolean z = false;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zM91766g = xq00Var.m91766g(obj);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == ia7Var) {
                objM91750T = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            boolean zM91766g2 = xq00Var.m91766g(kqi0Var) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            if ((i2 & 896) == 256 || ((i2 & 512) != 0 && xq00Var.m91770i(lwfVar))) {
                z = true;
            }
            boolean z2 = zM91766g2 | z;
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new ziq(iw3Var, lwfVar, kqi0Var, 16);
                xq00Var.m91793t0(objM91750T2);
            }
            gbm.m44243e(obj, lwfVar, (gh00) objM91750T2, xq00Var, (i2 & 14) | 64 | ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND));
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new evs(obj, iw3Var, lwfVar, i, 6);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m71218c(int i, int i2, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        boolean z2;
        int i3;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1691699329);
        int i4 = i | 6;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i | 54;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (xq00Var.m91768h(z2) ? 32 : 16);
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i5 != 0 ? false : z2;
            kyu kyuVar = new kyu(null, 0, null, null, 30);
            cxh0 cxh0Var = cxh0.f43038a;
            p711.m69222a(mi21.m61822f(1.0f, cxh0Var), kyuVar, null, false, null, null, null, null, null, ydh.f271767d, null, ydh.f271768e, ydh.f271769f, null, rkk.m75772x(-1335856986, new xlm0(z3, 4), xq00Var), ydh.f271770g, xq00Var, 805306432, 221616, 9724);
            z2 = z3;
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wl8(fxh0Var2, z2, i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m71219d(ulw0 ulw0Var, Object obj, boolean z, fxh0 fxh0Var, boolean z2, fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1711839183);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(ulw0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91768h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 131072 : 65536;
        }
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77645B(new Offset(0L));
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = new y3o0(kqi0Var, 8);
                xq00Var.m91793t0(objM91750T2);
            }
            fxh0 fxh0VarM85877w = vkf1.m85877w(fxh0Var, (gh00) objM91750T2);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM85877w);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            fbk fbkVar = null;
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
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            int i3 = i2 & 14;
            boolean zM91766g = (i3 == 4) | xq00Var.m91766g(obj);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91766g || objM91750T3 == ia7Var) {
                objM91750T3 = new jlw0(ulw0Var, obj, new ftf0(kqi0Var, 25));
                xq00Var.m91793t0(objM91750T3);
            }
            fyfVar.mo24818M((jlw0) objM91750T3, Boolean.valueOf(z), xq00Var, Integer.valueOf(((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | ((i2 >> 9) & 896)));
            xq00Var.m91788r(true);
            HashSet hashSet = ulw0Var.f231673s;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zM91770i = ((i2 & 57344) == 16384) | (i3 == 4) | xq00Var.m91770i(obj);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i || objM91750T4 == ia7Var) {
                izk izkVar = new izk(z2, ulw0Var, obj, fbkVar, 11);
                xq00Var.m91793t0(izkVar);
                objM91750T4 = izkVar;
            }
            hz40.m49236h(hashSet, boolValueOf, (th00) objM91750T4, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ur8(ulw0Var, obj, z, fxh0Var, z2, fyfVar, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m71220e(float f, float f2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1270252185);
        int i2 = i | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            fxh0Var = cxh0.f43038a;
            float f3 = 8;
            dha.m36004a(xtm0.m92060G(nec.m64246i(mi21.m61835s(fxh0Var, f, f2), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(f3)), 0L, hmx0.m47993b(f3), 13), xq00Var, 0);
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new m210(f, f2, fxh0Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m71221f(float f, int i, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(-989921532);
        if (xq00Var.m91752Y(i & 1, (i & 19) != 18)) {
            dha.m36004a(xtm0.m92060G(nec.m64246i(mi21.m61834r(f, fxh0Var), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.f93097a), 0L, hmx0.m47993b(f), 13), xq00Var, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1910gu(f, fxh0Var, i, 10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m71222g(ep81 ep81Var, pgo pgoVar, dfo dfoVar, dfo dfoVar2, dfo dfoVar3, fxh0 fxh0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        fyf fyfVarM75772x;
        xq00Var.m91775k0(-700703037);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(ep81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(pgoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(dfoVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(dfoVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(dfoVar3) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= xq00Var.m91770i(eh00Var) ? 1048576 : 524288;
        }
        if (xq00Var.m91752Y(i3 & 1, (599187 & i3) != 599186)) {
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77674m(new hk81(ep81Var, 1));
                xq00Var.m91793t0(objM91750T);
            }
            rv41 rv41Var = (rv41) objM91750T;
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            float f2 = leu.m58816b(xq00Var).f117230b.f224761d;
            kyu kyuVar = new kyu(1, null, 3, new j4m0(f, f2, f, f2), null, null, null, 0, null, 498);
            gga ggaVar = ep81Var.f61585k;
            if ((ggaVar instanceof jo81) && ((jo81) ggaVar).f114373c != null) {
                xq00Var.m91771i0(-1099596407);
                fyfVarM75772x = rkk.m75772x(1833974284, new k361(ep81Var, 16), xq00Var);
                xq00Var.m91788r(false);
            } else if (ggaVar != null || ep81Var.f61583i == null) {
                xq00Var.m91771i0(-1099387654);
                xq00Var.m91788r(false);
                fyfVarM75772x = null;
            } else {
                xq00Var.m91771i0(-1099475755);
                fyfVarM75772x = rkk.m75772x(1888767555, new vp81(ep81Var, dfoVar3, pgoVar, 0), xq00Var);
                xq00Var.m91788r(false);
            }
            fyf fyfVar = fyfVarM75772x;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("row", mi21.m61822f(1.0f, cxh0Var));
            String strM54977L = k0e1.m54977L(R.string.song_dna_track_row_click_accessibility_label, xq00Var);
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
            }
            t40 t40Var = new t40(strM54977L);
            boolean z = (i3 & 3670016) == 1048576;
            Object objM91750T2 = xq00Var.m91750T();
            if (z || objM91750T2 == ia7Var) {
                objM91750T2 = new wp81(0, eh00Var);
                xq00Var.m91793t0(objM91750T2);
            }
            fxh0Var2 = cxh0Var;
            p711.m69222a(fxh0VarM39673I, kyuVar, null, false, null, null, new peu(t40Var, (eh00) objM91750T2), null, null, rkk.m75772x(-1557055942, new vp81(dfoVar, ep81Var, pgoVar), xq00Var), null, rkk.m75772x(-707431429, new xp81(ep81Var, rv41Var, 0), xq00Var), rkk.m75772x(-128665284, new vp81(ep81Var, dfoVar2, pgoVar, 2), xq00Var), null, fyfVar, rkk.m75772x(1607633151, new xp81(ep81Var, rv41Var, 1), xq00Var), xq00Var, 805306432, 197040, 9660);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cl81(ep81Var, pgoVar, dfoVar, dfoVar2, dfoVar3, fxh0Var2, eh00Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m71223h(ep81 ep81Var, dfo dfoVar, pgo pgoVar, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-13092581);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(ep81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(dfoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(pgoVar) ? 256 : 128;
        }
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var.m91757b0();
        } else if (ep81Var.f61583i != null) {
            xq00Var.m91771i0(801145704);
            ftf1.m42607h(dfoVar, new xix0(ep81Var.f61575a, ep81Var.f61583i, ep81Var.f61584j), pgoVar, null, null, rkk.m75772x(1574889171, new wz61(ep81Var, 24), xq00Var), ydh.f271766c, 0, null, xq00Var, ((i2 >> 3) & 14) | 1769472 | (i2 & 896), 204);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(801486983);
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lz11(ep81Var, dfoVar, pgoVar, i, 28);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m71224i(int i, xq00 xq00Var, boolean z) {
        int i2;
        xq00Var.m91775k0(-2013859767);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var);
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
            float f = 140;
            float f2 = 16;
            m71220e(f, f2, null, xq00Var, 54);
            if (z) {
                xq00Var.m91771i0(-1775919139);
                riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224759b, cxh0Var));
                m71220e(f, f2, null, xq00Var, 54);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1775790365);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xr8(z, i, 10, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Integer m71225j(PlayerState playerState, String str) {
        String str2 = (String) playerState.contextMetadata().get(str);
        if (str2 == null) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str2));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r6v2, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: k */
    public static final fiz m71226k(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return gau.f78095a;
        }
        fbk fbkVar = null;
        int i = 3;
        if (size == 1) {
            ofo ofoVar = (ofo) arrayList.get(0);
            zmn0 zmn0Var = ofoVar.f164876a;
            boolean z = zmn0Var.f284322b;
            fiz fizVar = (fiz) ((qe70) zmn0Var.f284323c).invoke(ofoVar.f164877b);
            int i2 = 2;
            return z ? new vjz(new rc10(new vjz(0, fizVar, new f3q(i2, 24, fbkVar)), 9), new ga2(i, 12, fbkVar), 2) : new vjz(new mp80(mvl0.m62953p(new vjz(fizVar, new f3q(i2, 25, fbkVar))), 3), new th80(i, 1, fbkVar), 2);
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ofo ofoVar2 = (ofo) it.next();
            vjz vjzVar = new vjz(new mp80((fiz) ((qe70) ofoVar2.f164876a.f284323c).invoke(ofoVar2.f164877b), 2), new ga2(i, 11, fbkVar), 2);
            e7a1 e7a1Var = new e7a1(new d320(lau.f131415a, null));
            arrayList2.add(ofoVar2.f164876a.f284322b ? new vjz(0, vjzVar, new zp80(e7a1Var, fbkVar, 0)) : mvl0.m62953p(new vjz(vjzVar, new zp80(e7a1Var, fbkVar, 1))));
        }
        int size2 = arrayList.size();
        boolean[] zArr = new boolean[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            zArr[i3] = ((ofo) arrayList.get(i3)).f164876a.f284322b;
        }
        return new e560(18, (fiz[]) g6f.m43728j1(arrayList2).toArray(new fiz[0]), zArr);
    }

    /* JADX INFO: renamed from: l */
    public static final dqn0 m71227l(Map map) {
        if (map.isEmpty()) {
            return dqn0.f52040c;
        }
        hqn0 hqn0Var = new hqn0(dqn0.f52040c);
        for (Map.Entry entry : map.entrySet()) {
            hqn0Var.put((String) entry.getKey(), opo.m67547D((Map) entry.getValue()));
        }
        return hqn0Var.build();
    }

    /* JADX INFO: renamed from: m */
    public static final List m71228m(up60 up60Var) {
        return btz0.m30496T(btz0.m30484H(a53.f12395Y, btz0.m30487K(up60Var, a53.f12393X)));
    }

    /* JADX INFO: renamed from: n */
    public static final rqb m71229n(List list, w4u0 w4u0Var) {
        if (list.isEmpty()) {
            lau lauVar = lau.f131415a;
            return new rqb(lauVar, lauVar);
        }
        List listM43729k0 = g6f.m43729k0(list, 1);
        return new rqb(g6f.m43700N0(g6f.m43714b1(h6f.m46720Q(g6f.m43729k0(listM43729k0, 1), w4u0Var), 4), Collections.singletonList(g6f.m43741q0(list))), listM43729k0);
    }

    /* JADX INFO: renamed from: o */
    public static final List m71230o(List list, String str, w4u0 w4u0Var) {
        ArrayList arrayList = new ArrayList(h6f.m46720Q(list, w4u0Var));
        if (arrayList.size() > 1 && wj50.m88271j(g6f.m43741q0(arrayList), str)) {
            Collections.swap(arrayList, 0, n0e1.m63402J(n0e1.m63417Y(1, arrayList.size()), w4u0Var));
        }
        return g6f.m43714b1(arrayList, 10);
    }

    /* JADX INFO: renamed from: p */
    public static zw21 m71231p() {
        return new zw21(0);
    }

    /* JADX INFO: renamed from: q */
    public static int m71232q(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return (lowerCase.equals("run") || lowerCase.equals("running")) ? 1 : 0;
    }

    /* JADX INFO: renamed from: r */
    public static final fxh0 m71233r(fxh0 fxh0Var, yw70 yw70Var, float f) {
        return z520.m95415B(l0y0.m57833o(fxh0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 1, null, 458751), new ga20(f, 1, yw70Var));
    }

    /* JADX INFO: renamed from: s */
    public static final Double m71234s(Double d, String str, String str2) {
        double dDoubleValue = d.doubleValue();
        if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
            return d;
        }
        StringBuilder sbM38573v = edb.m38573v("Invalid volume[featureName: ", str, ", interactionId: ", str2, ", volume: ");
        sbM38573v.append(d);
        sbM38573v.append("]");
        na6.m63957e(sbM38573v.toString());
        return null;
    }
}
