package p204p;

import android.os.Parcel;
import android.util.Base64;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.model.Row;
import com.comscore.streaming.ContentType;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ehg1 {

    /* JADX INFO: renamed from: a */
    public static final String[] f59586a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* JADX INFO: renamed from: b */
    public static final String[] f59587b = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* JADX INFO: renamed from: c */
    public static sd40 f59588c;

    /* JADX INFO: renamed from: d */
    public static sd40 f59589d;

    /* JADX INFO: renamed from: a */
    public static final void m38961a(String str, np0 np0Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        np0 np0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1572581455);
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            np0Var2 = np0Var;
            i2 |= xq00Var2.m91770i(np0Var2) ? 32 : 16;
        } else {
            np0Var2 = np0Var;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var2.m91770i(fxh0Var) ? 2048 : 1024;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            float f = leu.m58816b(xq00Var2).f117230b.f224763f;
            vi5 vi5Var = bj5.f27616g;
            fxh0 fxh0VarM39673I = epv0.m39673I("venue_header_action_row", fxh0Var);
            irx0 irx0VarM36744a = drx0.m36744a(vi5Var, d7f0.f46141L0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM39673I);
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
            mif1.m61869b(np0Var2, new auz(str), null, null, xq00Var2, (i2 >> 3) & 14, 12);
            fxh0 fxh0VarM39673I2 = epv0.m39673I("venue_header_action_row_share_button", cxh0.f43038a);
            j4m0 j4m0Var = new j4m0(f, f, f, f);
            String strM54977L = k0e1.m54977L(R.string.venue_header_share_action_accessibility_label, xq00Var2);
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new myc(gh00Var, str, 13);
                xq00Var2.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            dyu.m37371c(new peu(new t40(strM54977L), eh00Var), wgu.f251150c, fxh0VarM39673I2, null, vvx.m86517r(xq00Var), j4m0Var, null, null, null, null, nfh.f153381a, xq00Var, 0, 48, 1944);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new br91(str, np0Var, gh00Var, fxh0Var, i, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m38962b(t38 t38Var, eh00 eh00Var, eh00 eh00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        float f;
        xq00Var.m91775k0(1990058843);
        int i2 = i | (xq00Var.m91766g(t38Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var2) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            int i3 = t38Var.f216725f ? 1 : 2;
            float f2 = leu.m58816b(xq00Var).f117230b.f224763f;
            float f3 = leu.m58816b(xq00Var).f117230b.f224761d;
            if (t38Var.f216722c) {
                xq00Var.m91771i0(1186123135);
                f = leu.m58816b(xq00Var).f117230b.f224763f;
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1186124771);
                f = leu.m58816b(xq00Var).f117230b.f224761d;
                xq00Var.m91788r(false);
            }
            p711.m69222a(fxh0VarM61822f, new kyu(1, null, i3, zsf1.m96850j(f2, f3, 0.0f, f, 4), null, null, null, 0, null, 498), null, false, null, null, new peu(u40.f226523c, eh00Var), null, rkk.m75772x(-1361622939, new zk3(t38Var, 17), xq00Var), null, null, null, null, null, null, rkk.m75772x(-1381843553, new C1776df(24, t38Var, eh00Var2), xq00Var), xq00Var, 100663360, 196608, 32444);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1690b3(t38Var, eh00Var, eh00Var2, fxh0Var2, i, 24);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m38963c(eh00 eh00Var, xq00 xq00Var, int i) {
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(1537195408);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            String strM54977L = k0e1.m54977L(R.string.free_managed_account_login_upgrade_dialog_title, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.free_managed_account_login_upgrade_dialog_body, xq00Var);
            String strM54977L3 = k0e1.m54977L(R.string.free_managed_account_login_upgrade_dialog_button, xq00Var);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = new hfy(18, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            gku gkuVar = new gku(strM54977L3, new peu(u40.f226523c, (eh00) objM91750T));
            boolean z2 = i3 == 4;
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new hfy(19, eh00Var);
                xq00Var.m91793t0(objM91750T2);
            }
            kku.m56741a((eh00) objM91750T2, null, null, strM54977L, strM54977L2, gkuVar, null, xq00Var, 262144, 70);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vnq(eh00Var, i, 29);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m38964d(m8b1 m8b1Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1778391915);
        int i2 = i | (xq00Var.m91770i(m8b1Var) ? 4 : 2) | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            zi5 zi5Var = bj5.f27610a;
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224758a), d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
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
            String str = m8b1Var.f141007d;
            String str2 = m8b1Var.f141012i;
            if71 if71Var = leu.m58818d(xq00Var).f64974j;
            long j = leu.m58815a(xq00Var).f112824b.f138758b;
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25932d(str, epv0.m39673I("venue_city_location_info", cxh0Var), if71Var, j, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            if (str2 == null || str2.length() == 0) {
                xq00Var.m91771i0(-947121235);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-947381852);
                ahf1.m25932d(k0e1.m54978M(R.string.venue_followers_label, new Object[]{str2}, xq00Var), epv0.m39673I("venue_follower_count_info", cxh0Var), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new n8b1(m8b1Var, fxh0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m38965e(xv41 xv41Var, xv41 xv41Var2, np0 np0Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        cxh0 cxh0Var;
        cxh0 cxh0Var2;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(1777596447);
        int i2 = i | (xq00Var2.m91770i(xv41Var) ? 4 : 2) | (xq00Var2.m91770i(xv41Var2) ? 32 : 16) | (xq00Var2.m91770i(np0Var) ? 256 : 128) | 3072;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            kqi0 kqi0VarM77671j = sam.m77671j(xv41Var, xq00Var2, i2 & 14);
            int i3 = i2 >> 3;
            kqi0 kqi0VarM77671j2 = sam.m77671j(xv41Var2, xq00Var2, i3 & 14);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var3 = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var3);
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
            riw0.m75615i(xq00Var2, zsf1.m96832C(cxh0Var3, 0.0f, 0.0f, 0.0f, 16, 7));
            riw0.m75615i(xq00Var2, zsf1.m96832C(cxh0Var3, 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 7));
            m38966f((m8b1) kqi0VarM77671j.getValue(), zsf1.m96830A(cxh0Var3, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2), xq00Var2, 0);
            l8b1 l8b1Var = ((m8b1) kqi0VarM77671j.getValue()).f141014k;
            if (l8b1Var == null) {
                xq00Var2.m91771i0(-1973283173);
                xq00Var2.m91788r(false);
                cxh0Var = cxh0Var3;
            } else {
                xq00Var2.m91771i0(-1973283172);
                cxh0Var = cxh0Var3;
                riw0.m75615i(xq00Var2, zsf1.m96832C(cxh0Var3, 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224759b, 7));
                String str = l8b1Var.f130837b;
                String str2 = l8b1Var.f130838c;
                boolean zM91770i = xq00Var2.m91770i(kqi0VarM77671j2) | xq00Var2.m91766g(l8b1Var);
                Object objM91750T = xq00Var2.m91750T();
                if (zM91770i || objM91750T == ia7Var) {
                    objM91750T = new e371(28, l8b1Var, kqi0VarM77671j2);
                    xq00Var2.m91793t0(objM91750T);
                }
                c6b1.m31551c(0, str, str2, (eh00) objM91750T, xq00Var2, zsf1.m96830A(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2));
                xq00Var2.m91788r(false);
            }
            cxh0 cxh0Var4 = cxh0Var;
            riw0.m75615i(xq00Var2, zsf1.m96832C(cxh0Var4, 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 7));
            m38964d((m8b1) kqi0VarM77671j.getValue(), zsf1.m96830A(cxh0Var4, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2), xq00Var2, 0);
            if (((m8b1) kqi0VarM77671j.getValue()).f141013j.isEmpty()) {
                xq00Var2.m91771i0(-1972341175);
                cxh0Var2 = cxh0Var4;
                riw0.m75615i(xq00Var2, zsf1.m96832C(cxh0Var4, 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 7));
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(-1972699411);
                yth ythVar = new yth(((m8b1) kqi0VarM77671j.getValue()).f141013j);
                boolean zM91770i2 = xq00Var2.m91770i(kqi0VarM77671j2);
                Object objM91750T2 = xq00Var2.m91750T();
                if (zM91770i2 || objM91750T2 == ia7Var) {
                    objM91750T2 = new li71(kqi0VarM77671j2, 1);
                    xq00Var2.m91793t0(objM91750T2);
                }
                tqg1.m81314b(ythVar, (gh00) objM91750T2, null, null, 0.0f, 0.0f, xq00Var, 8, 60);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(false);
                cxh0Var2 = cxh0Var4;
            }
            m38961a(((m8b1) kqi0VarM77671j.getValue()).f141005b, np0Var, (gh00) kqi0VarM77671j2.getValue(), zsf1.m96830A(cxh0Var2, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2), xq00Var2, i3 & ContentType.LONG_FORM_ON_DEMAND);
            ((m8b1) kqi0VarM77671j.getValue()).getClass();
            xq00Var2.m91771i0(-1971909159);
            xq00Var2.m91788r(false);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var2;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rd71(xv41Var, xv41Var2, np0Var, fxh0Var2, i, 14);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m38966f(m8b1 m8b1Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1499095732);
        int i3 = i | (xq00Var.m91770i(m8b1Var) ? 4 : 2) | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            fxh0 fxh0VarM39673I = epv0.m39673I("venue-top-name", mi21.m61822f(1.0f, fxh0Var));
            zi5 zi5Var = bj5.f27610a;
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224763f), d7f0.f46144O0, xq00Var, 0);
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
            ahf1.m25932d(m8b1Var.f141004a, null, leu.m58818d(xq00Var).f64967c, 0L, null, null, 0, true, new ol80(2), 0, null, xq00Var, 12582912, 0, 1658);
            String str = m8b1Var.f141006c;
            if (str == null || str.length() == 0) {
                xq00Var.m91771i0(1204652204);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1204568597);
                ahf1.m25932d(m8b1Var.f141006c, null, leu.m58818d(xq00Var).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2042);
                xq00Var.m91788r(false);
            }
            i2 = 1;
            xq00Var.m91788r(true);
        } else {
            i2 = 1;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new n8b1(m8b1Var, fxh0Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m38967g(w261 w261Var, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-245220552);
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91770i(w261Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91770i(fxh0Var) ? 256 : 128;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            fmx0 fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.f148188d);
            fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var2).f117230b.f224763f, hdi.m47247x(mwg1.m63030j(1, leu.m58815a(xq00Var2).f112823a.f229875b.f123093a, nec.m64246i(r9g1.m75068p(fxh0Var, fmx0VarM47993b), leu.m58815a(xq00Var2).f112823a.f229875b.f123093a, kxf1.f127485a), fmx0VarM47993b), false, null, null, null, eh00Var, 15));
            zi5 zi5Var = bj5.f27610a;
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224761d), d7f0.f46144O0, xq00Var2, 0);
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
            ahf1.m25932d(w261Var.f247245b, null, leu.m58818d(xq00Var2).f64975k, leu.m58815a(xq00Var2).f112824b.f138757a, null, null, 2, false, new ol80(1), 0, null, xq00Var2, 0, 0, 1714);
            ahf1.m25932d(w261Var.f247246c, mi21.m61822f(1.0f, cxh0.f43038a), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 2, false, new ol80(2), 2, null, xq00Var, 805306368, 0, 1200);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lz11(w261Var, eh00Var, fxh0Var, i, 14);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Integer m38968h(pvg1 pvg1Var) {
        if (pvg1Var instanceof okn0) {
            return Integer.valueOf(R.string.people_row_profile_add_button_text);
        }
        if (pvg1Var instanceof nkn0) {
            return Integer.valueOf(R.string.people_row_profile_accept_friend_button_text);
        }
        if (pvg1Var instanceof skn0) {
            return Integer.valueOf(R.string.people_row_profile_requested_button_text);
        }
        if (pvg1Var instanceof rkn0) {
            return Integer.valueOf(R.string.people_row_profile_message_button_text);
        }
        if (pvg1Var instanceof tkn0) {
            return Integer.valueOf(R.string.people_row_profile_unblock_button_text);
        }
        if (pvg1Var instanceof pkn0) {
            return Integer.valueOf(R.string.people_row_profile_decline_button_text);
        }
        if (pvg1Var instanceof qkn0) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    public static final bbf m38969i(ArrayList arrayList) {
        return new bbf(arrayList);
    }

    /* JADX INFO: renamed from: j */
    public static h6j0 m38970j(Parcel parcel) {
        int i;
        String string = parcel.readString();
        if (string == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("NAVIGATION_INTERRUPTED_BY_NEW_ACTION")) {
            i = 1;
        } else if (string.equals("LOCATION_CHANGING_WITHOUT_REQUEST")) {
            i = 2;
        } else if (string.equals("LOCATION_CHANGE_IS_MISSING_ACTION")) {
            i = 3;
        } else if (string.equals("MISSING_LOCATION_CHANGING")) {
            i = 4;
        } else if (string.equals("LOCATION_CHANGING_MORE_THAN_ONCE")) {
            i = 5;
        } else if (string.equals("PRESENTATION_PATH_NOT_RECEIVED_BEFORE_NAVIGATION")) {
            i = 6;
        } else if (string.equals("INITIAL_PRESENTATION_INTERRUPTED_BY_PRESENTATION_CHANGE")) {
            i = 7;
        } else if (string.equals("PRESENTATION_CHANGE_INTERRUPTED_BY_NEW_ACTION")) {
            i = 8;
        } else {
            if (!string.equals("PRESENTATION_CHANGE_INTERRUPTED_BY_NAVIGATION")) {
                throw new IllegalArgumentException("No enum constant com.spotify.ubi.navigationloggerimpl.mobius.NavigationInstrumentationErrorParceler.ErrorEnum.".concat(string));
            }
            i = 9;
        }
        switch (edb.m38547C(i)) {
            case 0:
                String string2 = parcel.readString();
                if (string2 != null) {
                    return new e6j0(rkh0.m75742p(string2), igg1.m50537p(parcel));
                }
                throw new IllegalStateException("Required value was null.");
            case 1:
                return b6j0.f23975b;
            case 2:
                return b6j0.f23974a;
            case 3:
                return d6j0.f45712a;
            case 4:
                return new c6j0(igg1.m50537p(parcel));
            case 5:
                return b6j0.f23976c;
            case 6:
                return new a6j0(igg1.m50537p(parcel));
            case 7:
                return new g6j0(igg1.m50537p(parcel));
            case 8:
                return new f6j0(igg1.m50537p(parcel));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: k */
    public static final int m38971k(db71 db71Var, int i) {
        cb71 cb71Var = db71Var.f47230a;
        z6i0 z6i0Var = db71Var.f47231b;
        if (cb71Var.f36033a.f107641b.length() != 0) {
            int iM95497d = z6i0Var.m95497d(i);
            if ((i != 0 && iM95497d == z6i0Var.m95497d(i - 1)) || (i != cb71Var.f36033a.f107641b.length() && iM95497d == z6i0Var.m95497d(i + 1))) {
                return db71Var.m35530a(i);
            }
        }
        return db71Var.m35539j(i);
    }

    /* JADX INFO: renamed from: l */
    public static GridItem m38972l(h8b h8bVar, h8b h8bVar2, c7b c7bVar, q7l0 q7l0Var) {
        sz10 sz10Var = new sz10();
        CharSequence charSequence = null;
        CharSequence charSequenceM69036v = h8bVar != null ? p3h1.m69036v(h8bVar) : null;
        if (charSequenceM69036v != null && charSequenceM69036v.length() != 0) {
            charSequence = charSequenceM69036v;
        }
        if (charSequence == null) {
            charSequence = " ";
        }
        CarText carTextCreate = CarText.create(charSequence);
        uzb.f235458f.m84293b(carTextCreate);
        sz10Var.f215362a = carTextCreate;
        if (h8bVar2 != null) {
            CharSequence charSequenceM69036v2 = p3h1.m69036v(h8bVar2);
            Objects.requireNonNull(charSequenceM69036v2);
            CarText carTextCreate2 = CarText.create(charSequenceM69036v2);
            Objects.requireNonNull(carTextCreate2);
            sz10Var.f215363b = carTextCreate2;
            uzb.f235459g.m84293b(carTextCreate2);
        }
        CarIcon carIconM60682v = m3h1.m60682v(c7bVar);
        ckx0.f39109e.m33212k(carIconM60682v);
        sz10Var.f215364c = carIconM60682v;
        sz10Var.f215365d = OnClickDelegateImpl.create(q7l0Var);
        if (sz10Var.f215364c != null) {
            return new GridItem(sz10Var);
        }
        throw new IllegalStateException("When a grid item is loading, the image must not be set and vice versa");
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m38973m(wab0 wab0Var, String str) {
        if (str == null) {
            return false;
        }
        List list = wab0Var.f249433c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (bm51.m29797h0(((uab0) it.next()).f228440a, str, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static final Object m38974n(Map map, String str, gh00 gh00Var) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            wj50.m88279p(bArrDecode);
            return gh00Var.invoke(bArrDecode);
        } catch (InvalidProtocolBufferException e) {
            na6.m63972t("PromptedWorldSectionDataSource: Error parsing proto field for key '" + str + "'", e);
            return null;
        } catch (IllegalArgumentException e2) {
            na6.m63972t("PromptedWorldSectionDataSource: Error parsing proto field for key '" + str + "'", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static final bbf m38975o(mko mkoVar, mko mkoVar2) {
        List listSingletonList = lau.f131415a;
        List listSingletonList2 = mkoVar != null ? Collections.singletonList(mkoVar) : listSingletonList;
        if (mkoVar2 != null) {
            listSingletonList = Collections.singletonList(mkoVar2);
        }
        return new bbf(g6f.m43700N0(listSingletonList, listSingletonList2));
    }

    /* JADX INFO: renamed from: p */
    public static Row m38976p(h8b h8bVar, h8b h8bVar2, c7b c7bVar, h8b h8bVar3, Boolean bool, Action action, boolean z, boolean z2, eh00 eh00Var, int i) {
        CharSequence charSequence = null;
        if ((i & 2) != 0) {
            h8bVar2 = null;
        }
        if ((i & 4) != 0) {
            c7bVar = null;
        }
        Integer num = (i & 8) != 0 ? null : 2;
        if ((i & 16) != 0) {
            h8bVar3 = null;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        if ((i & 128) != 0) {
            action = null;
        }
        if ((i & 256) != 0) {
            z = true;
        }
        if ((i & 512) != 0) {
            z2 = true;
        }
        if ((i & 1024) != 0) {
            eh00Var = null;
        }
        znx0 znx0Var = new znx0();
        CharSequence charSequenceM69036v = h8bVar != null ? p3h1.m69036v(h8bVar) : null;
        if (charSequenceM69036v != null && charSequenceM69036v.length() != 0) {
            charSequence = charSequenceM69036v;
        }
        if (charSequence == null) {
            charSequence = " ";
        }
        CarText carTextCreate = CarText.create(charSequence);
        if (carTextCreate.isEmpty()) {
            throw new IllegalArgumentException("The title cannot be null or empty");
        }
        uzb.f235458f.m84293b(carTextCreate);
        znx0Var.f284586b = carTextCreate;
        znx0Var.f284585a = z;
        znx0Var.f284596l = z2;
        ArrayList arrayList = znx0Var.f284587c;
        if (h8bVar2 != null) {
            CharSequence charSequenceM69036v2 = p3h1.m69036v(h8bVar2);
            Objects.requireNonNull(charSequenceM69036v2);
            uzb.f235459g.m84293b(CarText.create(charSequenceM69036v2));
            arrayList.add(CarText.create(charSequenceM69036v2));
        }
        if (h8bVar3 != null) {
            CharSequence charSequenceM69036v3 = p3h1.m69036v(h8bVar3);
            Objects.requireNonNull(charSequenceM69036v3);
            uzb.f235459g.m84293b(CarText.create(charSequenceM69036v3));
            arrayList.add(CarText.create(charSequenceM69036v3));
        }
        if (c7bVar != null) {
            CarIcon carIconM60682v = m3h1.m60682v(c7bVar);
            int iIntValue = num != null ? num.intValue() : 2;
            ckx0.f39109e.m33212k(carIconM60682v);
            znx0Var.f284588d = carIconM60682v;
            znx0Var.f284594j = iIntValue;
        }
        if (eh00Var != null) {
            znx0Var.f284591g = OnClickDelegateImpl.create(new xs50(0, eh00Var));
        }
        if (bool != null && action == null) {
            znx0Var.f284593i = bool.booleanValue();
        }
        ArrayList arrayList2 = znx0Var.f284589e;
        if (action != null) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(action);
            n80.f151280n.m63817a(arrayList3);
            arrayList2.add(action);
        }
        if (znx0Var.f284586b == null) {
            throw new IllegalStateException("A title must be set on the row");
        }
        if (znx0Var.f284593i) {
            if (znx0Var.f284591g == null) {
                throw new IllegalStateException("A browsable row must have its onClickListener set");
            }
            if (!arrayList2.isEmpty()) {
                throw new IllegalStateException("A browsable row must not have a secondary action set");
            }
        }
        return new Row(znx0Var);
    }

    /* JADX INFO: renamed from: q */
    public static final wab0 m38977q(wab0 wab0Var, String str) {
        for (Object obj : wab0Var.f249433c) {
            if (bm51.m29797h0(((uab0) obj).f228440a, str, true)) {
                return new wab0(wab0Var.f249431a, wab0Var.f249432b, h6f.m46716M(obj), wab0Var.f249434d, wab0Var.f249435e, wab0Var.f249436f, wab0Var.f249437g, wab0Var.f249438h, wab0Var.f249439i);
            }
        }
        obj = null;
        return new wab0(wab0Var.f249431a, wab0Var.f249432b, h6f.m46716M(obj), wab0Var.f249434d, wab0Var.f249435e, wab0Var.f249436f, wab0Var.f249437g, wab0Var.f249438h, wab0Var.f249439i);
    }

    /* JADX INFO: renamed from: r */
    public static void m38978r(h6j0 h6j0Var, Parcel parcel) {
        if (h6j0Var instanceof e6j0) {
            parcel.writeString("NAVIGATION_INTERRUPTED_BY_NEW_ACTION");
            e6j0 e6j0Var = (e6j0) h6j0Var;
            parcel.writeString(rkh0.m75738l(e6j0Var.f56648a));
            igg1.m50521A(e6j0Var.f56649b, parcel);
            return;
        }
        if (h6j0Var.equals(b6j0.f23975b)) {
            parcel.writeString("LOCATION_CHANGING_WITHOUT_REQUEST");
            return;
        }
        if (h6j0Var.equals(b6j0.f23974a)) {
            parcel.writeString("LOCATION_CHANGE_IS_MISSING_ACTION");
            return;
        }
        if (h6j0Var.equals(d6j0.f45712a)) {
            parcel.writeString("MISSING_LOCATION_CHANGING");
            return;
        }
        if (h6j0Var instanceof c6j0) {
            parcel.writeString("LOCATION_CHANGING_MORE_THAN_ONCE");
            igg1.m50521A(((c6j0) h6j0Var).f34555a, parcel);
            return;
        }
        if (h6j0Var.equals(b6j0.f23976c)) {
            parcel.writeString("PRESENTATION_PATH_NOT_RECEIVED_BEFORE_NAVIGATION");
            return;
        }
        if (h6j0Var instanceof a6j0) {
            parcel.writeString("INITIAL_PRESENTATION_INTERRUPTED_BY_PRESENTATION_CHANGE");
            igg1.m50521A(((a6j0) h6j0Var).f12812a, parcel);
        } else if (h6j0Var instanceof g6j0) {
            parcel.writeString("PRESENTATION_CHANGE_INTERRUPTED_BY_NEW_ACTION");
            igg1.m50521A(((g6j0) h6j0Var).f77061a, parcel);
        } else {
            if (!(h6j0Var instanceof f6j0)) {
                throw new NoWhenBranchMatchedException();
            }
            parcel.writeString("PRESENTATION_CHANGE_INTERRUPTED_BY_NAVIGATION");
            igg1.m50521A(((f6j0) h6j0Var).f66425a, parcel);
        }
    }
}
