package p204p;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.spotify.contentagnostic.p051v2.ColorSet;
import com.spotify.contentagnostic.p051v2.RgbaColor;
import com.spotify.identity.proto.p081v3.Identity$SocialHandleRequest;
import com.spotify.identity.proto.p081v3.Identity$SocialHandleResponse;
import com.spotify.music.R;
import com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity;
import io.reactivex.rxjava3.core.Single;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jfg1 {

    /* JADX INFO: renamed from: a */
    public static WeakReference f111899a;

    /* JADX INFO: renamed from: b */
    public static sd40 f111900b;

    /* JADX INFO: renamed from: c */
    public static sd40 f111901c;

    /* JADX INFO: renamed from: a */
    public static final void m53178a(vs11 vs11Var, eh00 eh00Var, xq00 xq00Var, int i) {
        float f;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(680337755);
        int i2 = (i & 6) == 0 ? i | (xq00Var2.m91766g(vs11Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var) ? 32 : 16;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0.f43038a);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
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
            if (vs11Var.f244315f.isEmpty()) {
                f = 1.0f;
                xq00Var2.m91771i0(-274652181);
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(-274925105);
                ArrayList<ms11> arrayList = vs11Var.f244315f;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                for (ms11 ms11Var : arrayList) {
                    arrayList2.add(new uku(10, 0L, ms11Var.f146676b, null, ms11Var.f146675a));
                }
                f = 1.0f;
                upf.m83686c(opo.m67574x(arrayList2), null, tfu.f220050c, null, true, 6, null, null, null, xq00Var, 221576, 458);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(false);
            }
            if (f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            riw0.m75615i(xq00Var2, new cr70(f, true));
            if (wl51.m88460J0("Manage")) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            dyu.m37371c(new peu(new t40("Manage"), eh00Var), ugu.f230259c, null, null, vvx.m86517r(xq00Var2), null, null, null, null, null, wbh.f249756a, xq00Var2, 0, 48, 2012);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wt51(vs11Var, eh00Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m53179b(String str, long j, xq00 xq00Var, int i) {
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(81578734);
        int i2 = i | (xq00Var2.m91766g(str) ? 4 : 2) | (xq00Var2.m91764f(j) ? 32 : 16);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            long jM63765b = n6f.m63765b(j, 0.0f, n6f.m63770g(j) * 0.9f, n6f.m63769f(j) * 0.9f, n6f.m63767d(j) * 0.9f, 1);
            vb9 vb9Var = d7f0.f46142M0;
            zi5 zi5Var = bj5.f27610a;
            xi5 xi5VarM29370g = bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224760c);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var2).f117230b.f224764g, nec.m64246i(mi21.m61822f(1.0f, cxh0Var), jM63765b, hmx0.m47995d(0.0f, 0.0f, leu.m58816b(xq00Var2).f117234f.f148188d, leu.m58816b(xq00Var2).f117234f.f148188d, 3)));
            irx0 irx0VarM36744a = drx0.m36744a(xi5VarM29370g, vb9Var, xq00Var2, 0);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            awu awuVar = awu.f20703c;
            fxh0 fxh0VarM61834r = mi21.m61834r(leu.m58816b(xq00Var2).f117235g.f159603a, cxh0Var);
            long j2 = n6f.f150866f;
            y85.m93057b(awuVar, qgj.f188480a, fxh0VarM61834r, n6f.m63765b(j2, 0.7f, 0.0f, 0.0f, 0.0f, 14), 0L, false, xq00Var2, awu.f20704d | 48, 48);
            xq00Var2 = xq00Var;
            ahf1.m25932d(str, null, leu.m58818d(xq00Var).f64974j, n6f.m63765b(j2, 0.7f, 0.0f, 0.0f, 0.0f, 14), null, null, 0, false, null, 0, null, xq00Var2, i2 & 14, 0, 2034);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new era(i, j, str, 5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m53180c(eh00 eh00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-1197708198);
        int i2 = i | (xq00Var.m91770i(eh00Var) ? 4 : 2);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fgu fguVarM41474w = fem.m41474w(xq00Var);
            dgu.m35938b(eh00Var, fguVarM41474w, null, false, false, 0.0f, true, Boolean.TRUE, false, false, null, rkk.m75772x(1565608473, new ph90(6, fguVarM41474w, h6f.m46715L(new g400(k0e1.m54977L(R.string.lyrics_reporting_formatting_tips_line_title, xq00Var), k0e1.m54977L(R.string.lyrics_reporting_formatting_tips_line_body, xq00Var)), new g400(k0e1.m54977L(R.string.lyrics_reporting_formatting_tips_sections_title, xq00Var), k0e1.m54977L(R.string.lyrics_reporting_formatting_tips_sections_body, xq00Var)), new g400(k0e1.m54977L(R.string.lyrics_reporting_formatting_tips_repeated_title, xq00Var), k0e1.m54977L(R.string.lyrics_reporting_formatting_tips_repeated_body, xq00Var)), new g400(k0e1.m54977L(R.string.lyrics_reporting_formatting_tips_capitalization_title, xq00Var), k0e1.m54977L(R.string.lyrics_reporting_formatting_tips_capitalization_body, xq00Var)), new g400(k0e1.m54977L(R.string.lyrics_reporting_formatting_tips_background_vocals_title, xq00Var), k0e1.m54977L(R.string.lyrics_reporting_formatting_tips_background_vocals_body, xq00Var)), new g400(k0e1.m54977L(R.string.lyrics_reporting_formatting_tips_punctuation_title, xq00Var), k0e1.m54977L(R.string.lyrics_reporting_formatting_tips_punctuation_body, xq00Var)))), xq00Var), xq00Var, (i2 & 14) | 14180352, 48, 1836);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zt10(eh00Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m53181d(long j, xq00 xq00Var, int i) {
        long j2 = j;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1737405956);
        int i2 = i | (xq00Var2.m91764f(j2) ? 4 : 2);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            vb9 vb9Var = d7f0.f46142M0;
            zi5 zi5Var = bj5.f27610a;
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224759b), vb9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var);
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
            int i3 = (i2 << 9) & 7168;
            y85.m93057b(kvu.f126953c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var2).f117235g.f159604b, cxh0Var), j2, 0L, false, xq00Var2, kvu.f126954d | 48 | i3, 48);
            j2 = j;
            xq00Var2 = xq00Var;
            ahf1.m25932d("Premium", null, leu.m58818d(xq00Var).f64975k, j2, null, null, 0, false, null, 0, null, xq00Var2, i3 | 6, 0, 2034);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zkl0(i, j2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m53182e(eh00 eh00Var, uam0 uam0Var, gh00 gh00Var, gh00 gh00Var2, fxh0 fxh0Var, fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(505374187);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(uam0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 131072 : 65536;
        }
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            fxh0 fxh0VarMo34315F = fxh0Var.mo34315F(new jqc1(eh00Var, uam0Var, gh00Var, gh00Var2));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarMo34315F);
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
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            rbz.m75196n((i2 >> 15) & 14, fyfVar, xq00Var, true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new eh11(eh00Var, uam0Var, gh00Var, gh00Var2, fxh0Var, fyfVar, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m53183f(String str, JSONObject jSONObject) {
        String strConcat;
        String strConcat2;
        String strConcat3;
        String strConcat4;
        String strConcat5;
        String str2 = "";
        try {
            okq okqVar = okq.RandomizedBundleToken;
            str2 = jSONObject.getString("~referring_link").split("\\?")[0];
        } catch (Exception unused) {
            syg1.m79703v("Failed to get referring link");
        }
        String strM77250i = s571.m77250i(str2, "?validate=true");
        if (!TextUtils.isEmpty(str)) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(strM77250i);
                if (jSONObject.getString("ct").equals("t1")) {
                    strConcat = "&t1=".concat(str);
                } else {
                    strConcat = "&t1=" + jSONObject.getString("t1");
                }
                sb.append(strConcat);
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                if (jSONObject.getString("ct").equals("t2")) {
                    strConcat2 = "&t2=".concat(str);
                } else {
                    strConcat2 = "&t2=" + jSONObject.getString("t2");
                }
                sb2.append(strConcat2);
                String string2 = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                if (jSONObject.getString("ct").equals("t3")) {
                    strConcat3 = "&t3=".concat(str);
                } else {
                    strConcat3 = "&t3=" + jSONObject.getString("t3");
                }
                sb3.append(strConcat3);
                String string3 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                if (jSONObject.getString("ct").equals("t4")) {
                    strConcat4 = "&t4=".concat(str);
                } else {
                    strConcat4 = "&t4=" + jSONObject.getString("t4");
                }
                sb4.append(strConcat4);
                String string4 = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                if (jSONObject.getString("ct").equals("t5")) {
                    strConcat5 = "&t5=".concat(str);
                } else {
                    strConcat5 = "&t5=" + jSONObject.getString("t5");
                }
                sb5.append(strConcat5);
                strM77250i = sb5.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return s571.m77250i(strM77250i, "&os=android");
    }

    /* JADX INFO: renamed from: g */
    public static void m53184g(String str) {
        if (f111899a.get() != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).buildUpon().appendQueryParameter("$uri_redirect_mode", "2").build());
            intent.addFlags(268435456);
            intent.setPackage("com.android.chrome");
            ((Activity) f111899a.get()).getPackageManager().queryIntentActivities(intent, 0);
            try {
                ((Activity) f111899a.get()).startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                intent.setPackage(null);
                ((Activity) f111899a.get()).startActivity(intent);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m53185h(vs11 vs11Var, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        vs11 vs11Var2;
        boolean z;
        xq00Var.m91775k0(-678952834);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(vs11Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        int i3 = i2;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            String str = vs11Var.f244314e;
            String str2 = vs11Var.f244316g;
            long jM53195r = m53195r(str);
            long jM53195r2 = m53195r(vs11Var.f244313d);
            String str3 = vs11Var.f244312c;
            if (str3.length() == 0) {
                str3 = vs11Var.f244311b;
            }
            long j = n6f.f150866f;
            fmx0 fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148188d);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61822f(1.0f, cxh0Var), jM53195r, fmx0VarM47993b);
            zhi0 zhi0Var = bj5.f27612c;
            ub9 ub9Var = d7f0.f46144O0;
            String str4 = str3;
            aaf aafVarM87496a = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM64246i);
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
            fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224764g, cxh0Var);
            aaf aafVarM87496a2 = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96865y);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            if (vs11Var.f244317h) {
                xq00Var.m91771i0(-2029853419);
                z = false;
                m53181d(jM53195r2, xq00Var, 0);
                xq00Var.m91788r(false);
            } else {
                z = false;
                xq00Var.m91771i0(-2029796720);
                xq00Var.m91788r(false);
            }
            ahf1.m25932d(str4, zsf1.m96832C(cxh0Var, 0.0f, leu.m58816b(xq00Var).f117230b.f224760c, 0.0f, 0.0f, 13), leu.m58818d(xq00Var).f64968d, j, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224766i, cxh0Var));
            vs11Var2 = vs11Var;
            m53178a(vs11Var2, eh00Var, xq00Var, i3 & 126);
            xq00Var.m91788r(true);
            if (str2 == null || str2.length() == 0) {
                xq00Var.m91771i0(1210316410);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1210240491);
                m53179b(str2, jM53195r, xq00Var, 0);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
        } else {
            vs11Var2 = vs11Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wt51(vs11Var2, eh00Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final Set m53186i(nj7 nj7Var) {
        return bk5.m29624m1(new Object[]{nj7Var.mo61934e(), nj7Var.mo61933d()});
    }

    /* JADX INFO: renamed from: j */
    public static final dj01 m53187j(el50 el50Var) {
        return el50Var.f60594g == null ? bj01.f27583a : cj01.f38472a;
    }

    /* JADX INFO: renamed from: k */
    public static final String m53188k(Intent intent) {
        return m53189l("watchFeed", intent);
    }

    /* JADX INFO: renamed from: l */
    public static final String m53189l(String str, Intent intent) {
        Set set = dd41.f47702f;
        return r46.m74726U(intent.getDataString()).m35716n(str);
    }

    /* JADX INFO: renamed from: m */
    public static final void m53190m(z9j0 z9j0Var, Context context, String str, d850 d850Var) {
        if (bm51.m29803n0(str, "spotify:", false)) {
            z9j0Var.mo63651f(new p6j0(str, "", false, false, 0, 0, false, null, null, d850Var != null ? new n6j0(d850Var) : null));
        } else if (wl51.m88496t0(str, "play.google.com", false)) {
            m53193p(context, str);
        } else {
            m53194q(context, str);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Class m53191n(ktz0 ktz0Var) {
        String strM29801l0 = bm51.m29801l0(ktz0Var.mo33226i(), "?", "");
        try {
            return Class.forName(strM29801l0);
        } catch (ClassNotFoundException unused) {
            if (wl51.m88496t0(strM29801l0, ".", false)) {
                return Class.forName(dq60.m36614n("(\\.+)(?!.*\\.)", strM29801l0, "\\$"));
            }
            throw new IllegalArgumentException("Cannot find class with name \"" + ktz0Var.mo33226i() + "\". Ensure that the serialName for this argument is the default fully qualified name");
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0088 A[Catch: Exception -> 0x00b5, CancellationException -> 0x00c4, TryCatch #0 {Exception -> 0x00b5, blocks: (B:13:0x0029, B:25:0x0075, B:27:0x007f, B:29:0x0085, B:44:0x00ae, B:30:0x0088, B:32:0x008c, B:36:0x009c, B:43:0x00aa, B:35:0x0094), top: B:52:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: Exception -> 0x00b5, CancellationException -> 0x00c4, TryCatch #0 {Exception -> 0x00b5, blocks: (B:13:0x0029, B:25:0x0075, B:27:0x007f, B:29:0x0085, B:44:0x00ae, B:30:0x0088, B:32:0x008c, B:36:0x009c, B:43:0x00aa, B:35:0x0094), top: B:52:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094 A[Catch: Exception -> 0x00b5, CancellationException -> 0x00c4, TryCatch #0 {Exception -> 0x00b5, blocks: (B:13:0x0029, B:25:0x0075, B:27:0x007f, B:29:0x0085, B:44:0x00ae, B:30:0x0088, B:32:0x008c, B:36:0x009c, B:43:0x00aa, B:35:0x0094), top: B:52:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public static final Object m53192o(q140 q140Var, x7t x7tVar, ibk ibkVar) {
        l2b1 l2b1Var;
        x7t x7tVar2;
        Identity$SocialHandleResponse identity$SocialHandleResponse;
        i140 i140VarM11940n;
        int i;
        a3b1 w2b1Var;
        if (ibkVar instanceof l2b1) {
            l2b1Var = (l2b1) ibkVar;
            int i2 = l2b1Var.f128965d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l2b1Var.f128965d = i2 - Integer.MIN_VALUE;
            } else {
                l2b1Var = new l2b1(ibkVar);
            }
        } else {
            l2b1Var = new l2b1(ibkVar);
        }
        Object objM96567o = l2b1Var.f128964c;
        int i3 = l2b1Var.f128965d;
        int i4 = 2;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i3 == 0) {
                    bga.m29073P(objM96567o);
                    l2b1Var.f128962a = q140Var;
                    l2b1Var.f128963b = x7tVar;
                    l2b1Var.f128965d = 1;
                    if (njg1.m64619l(300L, l2b1Var) != yukVar) {
                    }
                    return yukVar;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x7tVar2 = l2b1Var.f128963b;
                    try {
                        bga.m29073P(objM96567o);
                        identity$SocialHandleResponse = (Identity$SocialHandleResponse) ((o2x0) objM96567o).f161172b;
                        if (identity$SocialHandleResponse == null && identity$SocialHandleResponse.m11941o()) {
                            w2b1Var = z2b1.f278540a;
                        } else {
                            i140VarM11940n = identity$SocialHandleResponse != null ? identity$SocialHandleResponse.m11940n() : null;
                            if (i140VarM11940n == null) {
                                i = -1;
                            } else {
                                i = k2b1.f118588a[i140VarM11940n.ordinal()];
                            }
                            switch (i) {
                                case 1:
                                    break;
                                case 2:
                                    i4 = 3;
                                    break;
                                case 3:
                                    i4 = 4;
                                    break;
                                case 4:
                                    i4 = 5;
                                    break;
                                case 5:
                                    i4 = 6;
                                    break;
                                case 6:
                                    i4 = 7;
                                    break;
                                default:
                                    i4 = 1;
                                    break;
                            }
                            w2b1Var = new w2b1(i4);
                        }
                        return new o8t(w2b1Var, x7tVar2.f258988b);
                    } catch (Exception unused) {
                        return new o8t(new w2b1(8), x7tVar2.f258988b);
                    }
                }
                x7tVar = l2b1Var.f128963b;
                q140Var = l2b1Var.f128962a;
                bga.m29073P(objM96567o);
                j140 j140VarM11939p = Identity$SocialHandleRequest.m11939p();
                j140VarM11939p.m52111m(x7tVar.f258988b);
                Identity$SocialHandleRequest identity$SocialHandleRequest = (Identity$SocialHandleRequest) j140VarM11939p.build();
                String str = x7tVar.f258987a;
                wj50.m88279p(identity$SocialHandleRequest);
                Single<o2x0<Identity$SocialHandleResponse>> singleMo68771g = q140Var.mo68771g(str, identity$SocialHandleRequest);
                l2b1Var.f128962a = null;
                l2b1Var.f128963b = x7tVar;
                l2b1Var.f128965d = 2;
                objM96567o = zn91.m96567o(singleMo68771g, l2b1Var);
                if (objM96567o != yukVar) {
                    x7tVar2 = x7tVar;
                    identity$SocialHandleResponse = (Identity$SocialHandleResponse) ((o2x0) objM96567o).f161172b;
                    if (identity$SocialHandleResponse == null) {
                        if (identity$SocialHandleResponse != null) {
                        }
                        if (i140VarM11940n == null) {
                            i = -1;
                        } else {
                            i = k2b1.f118588a[i140VarM11940n.ordinal()];
                        }
                        switch (i) {
                            case 1:
                                break;
                            case 2:
                                i4 = 3;
                                break;
                            case 3:
                                i4 = 4;
                                break;
                            case 4:
                                i4 = 5;
                                break;
                            case 5:
                                i4 = 6;
                                break;
                            case 6:
                                i4 = 7;
                                break;
                            default:
                                i4 = 1;
                                break;
                        }
                        w2b1Var = new w2b1(i4);
                    } else {
                        if (identity$SocialHandleResponse != null) {
                        }
                        if (i140VarM11940n == null) {
                            i = -1;
                        } else {
                            i = k2b1.f118588a[i140VarM11940n.ordinal()];
                        }
                        switch (i) {
                            case 1:
                                break;
                            case 2:
                                i4 = 3;
                                break;
                            case 3:
                                i4 = 4;
                                break;
                            case 4:
                                i4 = 5;
                                break;
                            case 5:
                                i4 = 6;
                                break;
                            case 6:
                                i4 = 7;
                                break;
                            default:
                                i4 = 1;
                                break;
                        }
                        w2b1Var = new w2b1(i4);
                    }
                    return new o8t(w2b1Var, x7tVar2.f258988b);
                }
                return yukVar;
            } catch (Exception unused2) {
                x7tVar2 = x7tVar;
                return new o8t(new w2b1(8), x7tVar2.f258988b);
            }
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m53193p(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: q */
    public static void m53194q(Context context, String str) {
        u0e u0eVar = u0e.f225466b;
        try {
            int i = PremiumAccountManagementWebviewActivity.f6503d1;
            Intent intent = new Intent(context, (Class<?>) PremiumAccountManagementWebviewActivity.class);
            intent.putExtra("inapp_internalwebview_uri", str);
            intent.putExtra("inapp_internalwebview_checkout_source", u0eVar);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public static long m53195r(String str) {
        Long lM29808s0;
        long j = n6f.f150866f;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (('0' <= cCharAt && cCharAt < ':') || (('A' <= cCharAt && cCharAt < 'G') || ('a' <= cCharAt && cCharAt < 'g'))) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (string.length() != 6 || (lM29808s0 = bm51.m29808s0(16, string)) == null) {
            return j;
        }
        long jLongValue = lM29808s0.longValue();
        return rfg1.m75433c((int) ((jLongValue >> 16) & 255), (int) ((jLongValue >> 8) & 255), (int) (jLongValue & 255), 255);
    }

    /* JADX INFO: renamed from: s */
    public static final long m53196s(RgbaColor rgbaColor) {
        return rfg1.m75433c(rgbaColor.m7937s(), rgbaColor.m7936r(), rgbaColor.m7935p(), rgbaColor.m7934o());
    }

    /* JADX INFO: renamed from: t */
    public static final jiu m53197t(ColorSet colorSet) {
        int i = oku.f166673f;
        return oku.m67264d(colorSet.m7798u() ? m53196s(colorSet.m7793o()) : n6f.f150864d, colorSet.m7799v() ? m53196s(colorSet.m7794p()) : n6f.f150864d, colorSet.m7800w() ? m53196s(colorSet.m7795r()) : n6f.f150864d, colorSet.m7802y() ? m53196s(colorSet.m7797t()) : n6f.f150864d, colorSet.m7801x() ? m53196s(colorSet.m7796s()) : n6f.f150864d);
    }

    /* JADX INFO: renamed from: u */
    public static final int m53198u(ktz0 ktz0Var) {
        String strM29801l0 = bm51.m29801l0(ktz0Var.mo33226i(), "?", "");
        if (wj50.m88271j(ktz0Var.getKind(), otz0.f170119z0)) {
            return ktz0Var.mo57365b() ? 21 : 20;
        }
        if (strM29801l0.equals("kotlin.Int")) {
            return ktz0Var.mo57365b() ? 2 : 1;
        }
        if (strM29801l0.equals("kotlin.Boolean")) {
            return ktz0Var.mo57365b() ? 4 : 3;
        }
        if (strM29801l0.equals("kotlin.Double")) {
            return ktz0Var.mo57365b() ? 6 : 5;
        }
        if (strM29801l0.equals("kotlin.Double")) {
            return 5;
        }
        if (strM29801l0.equals("kotlin.Float")) {
            return ktz0Var.mo57365b() ? 8 : 7;
        }
        if (strM29801l0.equals("kotlin.Long")) {
            return ktz0Var.mo57365b() ? 10 : 9;
        }
        if (strM29801l0.equals("kotlin.String")) {
            return ktz0Var.mo57365b() ? 12 : 11;
        }
        if (strM29801l0.equals("kotlin.IntArray")) {
            return 13;
        }
        if (strM29801l0.equals("kotlin.DoubleArray")) {
            return 15;
        }
        if (strM29801l0.equals("kotlin.BooleanArray")) {
            return 14;
        }
        if (strM29801l0.equals("kotlin.FloatArray")) {
            return 16;
        }
        if (strM29801l0.equals("kotlin.LongArray")) {
            return 17;
        }
        if (strM29801l0.equals("kotlin.Array")) {
            return 18;
        }
        return bm51.m29803n0(strM29801l0, "kotlin.collections.ArrayList", false) ? 19 : 22;
    }

    /* JADX INFO: renamed from: v */
    public static y400 m53199v(qti0 qti0Var) {
        return new y400(new z400(qti0Var.m73844b(), y400.f269047c.f269048a, qti0Var));
    }

    /* JADX INFO: renamed from: w */
    public static void m53200w(WeakReference weakReference) {
        String strOptString;
        f111899a = weakReference;
        if (wia.m88198i() != null) {
            wia.m88198i().m88207j();
            JSONObject jSONObjectM88207j = wia.m88198i().m88207j();
            okq okqVar = okq.RandomizedBundleToken;
            strOptString = jSONObjectM88207j.optString("~referring_link");
        } else {
            strOptString = "";
        }
        if (TextUtils.isEmpty(strOptString) || weakReference == null) {
            return;
        }
        JSONObject jSONObjectM88207j2 = wia.m88198i().m88207j();
        if (jSONObjectM88207j2.optInt("_branch_validate") != 60514) {
            if (jSONObjectM88207j2.optBoolean("bnc_validate")) {
                new Handler().postDelayed(new eph(jSONObjectM88207j2, 7), 500L);
                return;
            }
            return;
        }
        okq okqVar2 = okq.RandomizedBundleToken;
        if (jSONObjectM88207j2.optBoolean("+clicked_branch_link")) {
            if (f111899a.get() != null) {
                new AlertDialog.Builder((Context) f111899a.get(), android.R.style.Theme.Material.Dialog.Alert).setTitle("Branch Deeplinking Routing").setMessage("Good news - we got link data. Now a question for you, astute developer: did the app deep link to the specific piece of content you expected to see?").setPositiveButton("Yes", new tso(jSONObjectM88207j2, 1)).setNegativeButton("No", new tso(jSONObjectM88207j2, 0)).setNeutralButton(android.R.string.cancel, new nq9(17)).setCancelable(false).setIcon(android.R.drawable.sym_def_app_icon).show();
            }
        } else if (f111899a.get() != null) {
            new AlertDialog.Builder((Context) f111899a.get(), android.R.style.Theme.Material.Dialog.Alert).setTitle("Branch Deeplink Routing Support").setMessage("Bummer. It seems like +clicked_branch_link is false - we didn't deep link.  Double check that the link you're clicking has the same branch_key that is being used in your Manifest file. Return to Chrome when you're ready to test again.").setNeutralButton("Got it", new nq9(18)).setCancelable(false).setIcon(android.R.drawable.sym_def_app_icon).show();
        }
    }
}
