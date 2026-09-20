package p204p;

import android.net.Uri;
import android.opengl.Matrix;
import android.view.View;
import androidx.car.app.model.Alert;
import com.spotify.music.R;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eug1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f62979a;

    /* JADX INFO: renamed from: a */
    public static final void m40060a(int i, int i2, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(-1668103538);
        int i3 = (xq00Var.m91762e(edb.m38547C(i)) ? 4 : 2) | i2 | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            qiu.m72881g(1, rkk.m75772x(965195579, new C2351ru(i, fxh0Var), xq00Var), xq00Var, 54);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2351ru(i, fxh0Var, i2, 15);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m40061b(w3c1 w3c1Var, bmj0 bmj0Var, gh00 gh00Var, eh00 eh00Var, gh00 gh00Var2, fxh0 fxh0Var, eh00 eh00Var2, sgj sgjVar, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        List list;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(458992254);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(w3c1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(bmj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(gh00Var2) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= xq00Var.m91770i(eh00Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= xq00Var.m91766g(sgjVar) ? 8388608 : 4194304;
        }
        if (xq00Var.m91752Y(i3 & 1, (4793491 & i3) != 4793490)) {
            wj50.m88271j(w3c1Var.f247555a, q3c1.f184840a);
            jix0 jix0Var = w3c1Var.f247556b;
            if (jix0Var == null || (list = jix0Var.f112832b) == null) {
                list = lau.f131415a;
            }
            rgj rgjVar = sgjVar instanceof rgj ? (rgj) sgjVar : null;
            String str = rgjVar != null ? rgjVar.f198967a : null;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var);
            boolean zM91770i = ((i3 & 3670016) == 1048576) | xq00Var.m91770i(w3c1Var) | ((i3 & 896) == 256);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == obj) {
                objM91750T = new gyt0((Object) w3c1Var, gh00Var, (Object) eh00Var2, 3);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM47247x = hdi.m47247x(fxh0VarM61820d, false, null, null, null, (eh00) objM91750T, 15);
            boolean zM91766g = xq00Var.m91766g(str);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g || objM91750T2 == obj) {
                objM91750T2 = new j1r0(str, 28);
                xq00Var.m91793t0(objM91750T2);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM47247x, false, (gh00) objM91750T2);
            wb9 wb9Var = d7f0.f46174i;
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96644b);
            soh.f211194A.getClass();
            eh00 eh00Var3 = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var3);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            xq00Var.m91771i0(996251470);
            mi21.m61820d(1.0f, cxh0Var);
            bmj0Var.m29863a(new dj10(5, list), xq00Var, 8);
            xq00Var.m91788r(false);
            bx4.m30752a(w3c1Var.f247555a, null, null, wb9Var, "play_pause_overlay", null, s3h.f205287b, xq00Var, 1597440, 38);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2512vx(i, 11, w3c1Var, bmj0Var, gh00Var, gh00Var2, eh00Var2, sgjVar, eh00Var, fxh0Var2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m40062c(cu01 cu01Var, fxh0 fxh0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        String str = cu01Var.f42012b;
        xq00Var.m91775k0(1964229482);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(cu01Var) : xq00Var.m91770i(cu01Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(Boolean.TRUE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            fxh0 fxh0VarM39673I = epv0.m39673I("share.media.container.image", fxh0Var);
            boolean zBooleanValue = ((Boolean) kqi0Var.getValue()).booleanValue();
            fxh0 fxh0VarM92060G = cxh0.f43038a;
            if (zBooleanValue) {
                fxh0VarM92060G = xtm0.m92060G(fxh0VarM92060G, 0L, null, 15);
            }
            fxh0 fxh0VarMo34315F = fxh0VarM39673I.mo34315F(fxh0VarM92060G);
            Uri uri = cu01Var.f42011a;
            boolean zM91770i = xq00Var.m91770i(kqi0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new y3o0(kqi0Var, 25);
                xq00Var.m91793t0(objM91750T2);
            }
            gh00 gh00Var = (gh00) objM91750T2;
            boolean zM91770i2 = xq00Var.m91770i(kqi0Var) | ((i2 & 896) == 256);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T3 == obj) {
                objM91750T3 = new irp(eh00Var, kqi0Var, 1);
                xq00Var.m91793t0(objM91750T3);
            }
            gh00 gh00Var2 = (gh00) objM91750T3;
            boolean zM91770i3 = xq00Var.m91770i(kqi0Var);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T4 == obj) {
                objM91750T4 = new y3o0(kqi0Var, 26);
                xq00Var.m91793t0(objM91750T4);
            }
            String str2 = null;
            um6 um6VarM85986a = vm6.m85986a(uri, null, null, null, null, null, true, false, gh00Var, gh00Var2, (gh00) objM91750T4, 0L, xq00Var, 100663296, 0, 102142);
            if (!wl51.m88460J0(str)) {
                str2 = str;
            }
            l0y0.m57824f(um6VarM85986a, str2 != null ? new rgj(str) : qgj.f188480a, fxh0VarMo34315F, null, null, null, r101.f194647O0, null, null, xq00Var, 224256, 384);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ylw0(cu01Var, fxh0Var, eh00Var, i, 17);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m40063d(String str, qe10 qe10Var, gf71 gf71Var, int i, xq00 xq00Var, int i2, int i3) {
        int i4;
        xq00Var.m91775k0(-192911377);
        int i5 = (xq00Var.m91766g(str) ? 4 : 2) | i2;
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (xq00Var.m91766g(qe10Var) ? 32 : 16);
        }
        int i7 = i4 | (xq00Var.m91766g(gf71Var) ? 256 : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i7 |= xq00Var.m91762e(i) ? 2048 : 1024;
        }
        if ((i7 & 1171) == 1170 && xq00Var.m91738H()) {
            xq00Var.m91757b0();
        } else {
            xq00Var.m91761d0();
            if ((i2 & 1) == 0 || xq00Var.m91735E()) {
                if (i6 != 0) {
                    qe10Var = oe10.f164317a;
                }
                if (i8 != 0) {
                    i = Alert.DURATION_SHOW_INDEFINITELY;
                }
            } else {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            ta71 ta71Var = ta71.f218490h;
            xq00Var.m91773j0(-1115894518);
            xq00Var.m91773j0(1886828752);
            if (!(xq00Var.f264811a instanceof tg5)) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91767g0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(new re10(0, ta71Var));
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(str, aq61.f18112b1, xq00Var);
            zsf1.m96835F(qe10Var, aq61.f18114c1, xq00Var);
            zsf1.m96835F(gf71Var, ua71.f228415b, xq00Var);
            ua71 ua71Var = ua71.f228417c;
            if (xq00Var.f264808S || !wj50.m88271j(xq00Var.m91750T(), Integer.valueOf(i))) {
                xq00Var.m91793t0(Integer.valueOf(i));
                xq00Var.m91756b(Integer.valueOf(i), ua71Var);
            }
            a831.m25018j(xq00Var, true, false, false);
        }
        qe10 qe10Var2 = qe10Var;
        int i9 = i;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new aj0(str, qe10Var2, gf71Var, i9, i2, i3, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Set m40064e(lji ljiVar) {
        return bk5.m29624m1(new Object[]{ljiVar.mo56605i(), ljiVar.mo56607k(), ljiVar.mo56606j(), ljiVar.mo56602e(), ljiVar.mo56599b()});
    }

    /* JADX INFO: renamed from: f */
    public static final ap70 m40065f(tlv tlvVar) {
        if (tlvVar.equals(rlv.f200372a)) {
            return yo70.f274588a;
        }
        if (!(tlvVar instanceof slv)) {
            throw new NoWhenBranchMatchedException();
        }
        int iM38547C = edb.m38547C(((slv) tlvVar).f210496a);
        int i = 1;
        if (iM38547C != 0) {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        return new zo70(i);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m40066g(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: h */
    public static final hc80 m40067h(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            hc80 hc80Var = tag instanceof hc80 ? (hc80) tag : null;
            if (hc80Var != null) {
                return hc80Var;
            }
            Object objM83709z = upf.m83709z(view);
            view = objM83709z instanceof View ? (View) objM83709z : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static int m40068j(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: k */
    public static final t050 m40069k(z8k z8kVar, ejk0 ejk0Var, ejk0 ejk0Var2, ejk0 ejk0Var3) {
        return ((b9k) z8kVar).m28489g("AdsDeviceTargetingUpdaterDaemon", new k380(ejk0Var, ejk0Var2, ejk0Var3, 26));
    }

    /* JADX INFO: renamed from: l */
    public static final eh00 m40070l(eh00 eh00Var, gh00 gh00Var, hjv0 hjv0Var) {
        if (((Boolean) gh00Var.invoke(Integer.valueOf(hjv0Var.mo1617e()))).booleanValue()) {
            eh00Var.invoke();
            return C2087le.f132405d;
        }
        by0 by0Var = new by0(eh00Var, gh00Var, hjv0Var);
        hjv0Var.mo47719v(by0Var);
        return new ay0(0, by0Var, by0.class, "cancel", "cancel()V", 0, 0, 0);
    }

    /* JADX INFO: renamed from: m */
    public static void m40071m(float f, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    /* JADX INFO: renamed from: n */
    public static void m40072n(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    /* JADX INFO: renamed from: o */
    public static final void m40073o(View view, hc80 hc80Var) {
        view.setTag(R.id.view_tree_lifecycle_owner, hc80Var);
    }

    /* JADX INFO: renamed from: i */
    public abstract oq10 mo40074i(xq00 xq00Var);
}
