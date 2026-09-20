package p204p;

import android.content.res.Resources;
import android.net.Uri;
import androidx.car.app.model.Alert;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.spotify.music.R;
import com.spotify.music.SpotifyMainActivity;
import com.spotify.player.model.ContextTrack;
import java.util.List;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uqe1 {

    /* JADX INFO: renamed from: a */
    public static final l06 f233000a = new l06("KotlinTypeRefiner", 7);

    /* JADX INFO: renamed from: b */
    public static sd40 f233001b;

    /* JADX INFO: renamed from: a */
    public static final void m83762a(eh00 eh00Var, gh00 gh00Var, gh00 gh00Var2, fxh0 fxh0Var, boolean z, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-378354682);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | (xq00Var.m91770i(gh00Var) ? 32 : 16) | (xq00Var.m91770i(gh00Var2) ? 256 : 128) | 3072 | (xq00Var.m91768h(z) ? 16384 : 8192);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            y0v.m92603a(2, rkk.m75772x(-1685099630, new xi0(eh00Var, z, gh00Var2, gh00Var), xq00Var), xq00Var, 390, 2);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new k80(eh00Var, gh00Var, gh00Var2, fxh0Var2, z, i, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m83763b(String str, long j, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1034247533);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91764f(j) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
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
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            ahf1.m25932d(k0e1.m54978M(R.string.lyrics_credential_note, new Object[]{str}, xq00Var), pha.f177517a.mo66945a(zsf1.m96832C(cxh0Var, 0.0f, 40, 0.0f, 16, 5), d7f0.f46153X), leu.m58818d(xq00Var).f64974j, j, null, null, 0, false, null, 0, null, xq00Var, (i2 << 6) & 7168, 0, 2032);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new iml(str, j, fxh0Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m83764c(w940 w940Var, boolean z, fxh0 fxh0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        String str = w940Var.f249070a;
        xq00Var.m91775k0(-979616091);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = i | (xq00Var.m91766g(w940Var) ? 4 : 2) | (xq00Var.m91768h(z) ? 32 : 16) | 384 | (xq00Var.m91770i(eh00Var) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            fmx0 fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148187c);
            long jM63765b = z ? n6f.f150866f : n6f.m63765b(n6f.f150866f, 0.4f, 0.0f, 0.0f, 0.0f, 14);
            float f = leu.m58816b(xq00Var).f117232d.f137887c;
            cxh0 cxh0Var = cxh0.f43038a;
            long j = jM63765b;
            fxh0 fxh0VarM47247x = hdi.m47247x(epv0.m39673I("image_option_cell_" + str, mi21.m61834r(f, cxh0Var)), false, null, null, null, eh00Var, 15);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM47247x);
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
            fxh0 fxh0VarM63030j = mwg1.m63030j((float) 1.5d, j, r9g1.m75068p(mi21.m61835s(cxh0Var, 36, 48), fmx0VarM47993b), fmx0VarM47993b);
            m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46166e, false);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM63030j);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            l0y0.m57821c(Uri.parse(str), qgj.f188480a, pha.f177517a.mo66946b(cxh0Var), null, null, null, r101.f194644L0, null, null, null, false, false, xq00Var, 224304, 0, 3968);
            xq00Var.m91788r(true);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xi0(w940Var, z, fxh0Var2, eh00Var, i, 20);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m83765d(int i, xq00 xq00Var) {
        xq00 xq00Var2;
        xq00Var.m91775k0(1104459767);
        if (xq00Var.m91752Y(i & 1, i != 0)) {
            qe10 qe10VarM85466g = vgg1.m85466g(y85.m93066k(oe10.f164317a), new c1x0(R.color.bg_widget));
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = z3a0.f278837Y;
                xq00Var.m91793t0(objM91750T);
            }
            xq00Var2 = xq00Var;
            jq60.m54055a(fig1.m41720A(qe10VarM85466g, (gh00) objM91750T), lb3.f131532g, dqg.f51989a, xq00Var2, 384, 0);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new pn40(i, 8);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m83766e(int i, gh00 gh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        gh00 gh00Var2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1839056227);
        int i2 = i | (xq00Var.m91770i(gh00Var) ? 4 : 2) | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96830A = zsf1.m96830A(cxh0Var, f, 0.0f, 2);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96830A);
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
            String strM54977L = k0e1.m54977L(R.string.legal_premium_title, xq00Var);
            if71 if71Var = leu.m58818d(xq00Var).f64968d;
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = s9q0.f207024i;
                xq00Var.m91793t0(objM91750T);
            }
            ahf1.m25932d(strM54977L, zoz0.m96644b(cxh0Var, false, (gh00) objM91750T), if71Var, 0L, new h171(5), null, 0, false, null, 0, null, xq00Var, 0, 0, 2024);
            String strM54978M = k0e1.m54978M(R.string.legal_premium_subtitle, new Object[]{k0e1.m54977L(R.string.legal_ad_supported_link, xq00Var), k0e1.m54977L(R.string.legal_learn_more_link, xq00Var)}, xq00Var);
            AbstractC2524w8 abstractC2524w8M67566p = opo.m67566p(new pb71(k0e1.m54977L(R.string.legal_ad_supported_link, xq00Var), "https://www.spotify.com/safetyandprivacy/parental-guide/plain/"), new pb71(k0e1.m54977L(R.string.legal_learn_more_link, xq00Var), "https://support.spotify.com/article/managed-accounts/plain/"));
            boolean z = (i2 & 14) == 4;
            Object objM91750T2 = xq00Var.m91750T();
            if (z || objM91750T2 == ia7Var) {
                gh00Var2 = gh00Var;
                objM91750T2 = new b8o0(17, gh00Var2);
                xq00Var.m91793t0(objM91750T2);
            } else {
                gh00Var2 = gh00Var;
            }
            rwg1.m76546g(strM54978M, abstractC2524w8M67566p, (gh00) objM91750T2, zsf1.m96830A(cxh0Var, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 1), leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138757a, 0L, xq00Var, 0, 64);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            gh00Var2 = gh00Var;
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new idt(gh00Var2, fxh0Var2, i, 7);
        }
    }

    /* JADX INFO: renamed from: f */
    public static ApiException m83767f(Status status) {
        return status.f1844c != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    /* JADX INFO: renamed from: g */
    public static n0v m83768g(xq00 xq00Var) {
        return new n0v(leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138758b, leu.m58815a(xq00Var).f112824b.f138758b, leu.m58815a(xq00Var).f112824b.f138760d, leu.m58815a(xq00Var).f112825c.f221219b, leu.m58815a(xq00Var).f112826d.f50025b, leu.m58815a(xq00Var).f112824b.f138759c, 0L, 896);
    }

    /* JADX INFO: renamed from: h */
    public static final it91 m83769h(ContextTrack contextTrack) {
        String str = (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_AD_ID);
        if (str == null) {
            str = "";
        }
        return new it91("spotify:ad:".concat(str), "");
    }

    /* JADX INFO: renamed from: i */
    public static final it91 m83770i(fh0 fh0Var) {
        return new it91(so0.m78600e(fh0Var.f69506a), fh0Var.f69514h);
    }

    /* JADX INFO: renamed from: j */
    public static void m83771j(SpotifyMainActivity spotifyMainActivity, zsr zsrVar) {
        spotifyMainActivity.f100735a1 = zsrVar;
    }

    /* JADX INFO: renamed from: k */
    public static void m83772k(SpotifyMainActivity spotifyMainActivity, jhz0 jhz0Var) {
        spotifyMainActivity.f100736b1 = jhz0Var;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m83773l(long j, long j2) {
        return j < j2 - 604800000 || j > j2 + 86400000;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX INFO: renamed from: m */
    public static final n6d0 m83774m(gox0 gox0Var, int i, int i2, int i3, int i4, int i5, o6d0 o6d0Var, List list, t5o0[] t5o0VarArr, int i6, int i7, int[] iArr, int i8) {
        gox0 gox0Var2;
        int i9;
        int i10;
        int i11;
        long j;
        gox0 gox0Var3;
        slz slzVar;
        int iMax;
        int iMax2;
        gox0 gox0Var4;
        int i12;
        slz slzVar2;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z = false;
        int i18 = 0;
        float f = 0.0f;
        while (true) {
            int i19 = Alert.DURATION_SHOW_INDEFINITELY;
            Integer numValueOf = null;
            if (i14 >= i7) {
                break;
            }
            h6d0 h6d0Var = (h6d0) list.get(i14);
            hox0 hox0VarM84552m = v3d1.m84552m(h6d0Var);
            float fM84555p = v3d1.m84555p(hox0VarM84552m);
            if (z) {
                z = true;
            } else {
                vhf1 vhf1Var = hox0VarM84552m != null ? hox0VarM84552m.f93647c : null;
                if (vhf1Var != null ? vhf1Var instanceof mul : false) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (fM84555p > 0.0f) {
                f += fM84555p;
                i17++;
                i14 = i14;
                i12 = i16;
                j2 = j2;
            } else {
                if (i4 != Integer.MAX_VALUE && hox0VarM84552m != null && (slzVar2 = hox0VarM84552m.f93648d) != null) {
                    numValueOf = Integer.valueOf(Math.round(slzVar2.f210524a * i4));
                }
                int i20 = i3 - i18;
                t5o0 t5o0VarMo39619B = t5o0VarArr[i14];
                if (t5o0VarMo39619B == null) {
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                    if (i3 != Integer.MAX_VALUE) {
                        i19 = i20 < 0 ? 0 : i20;
                    }
                    gox0Var4 = gox0Var;
                    t5o0VarMo39619B = h6d0Var.mo39619B(gox0Var.mo25221i(false, 0, iIntValue, i19, numValueOf != null ? numValueOf.intValue() : i4));
                } else {
                    gox0Var4 = gox0Var;
                }
                int iMo25222j = gox0Var4.mo25222j(t5o0VarMo39619B);
                int iMo25218f = gox0Var4.mo25218f(t5o0VarMo39619B);
                iArr2[i14 - i6] = iMo25222j;
                int i21 = i20 - iMo25222j;
                if (i21 < 0) {
                    i21 = 0;
                }
                int iMin = Math.min(i5, i21);
                int iMax3 = Math.max(i16, iMo25218f);
                t5o0VarArr[i14] = t5o0VarMo39619B;
                i18 = iMo25222j + iMin + i18;
                i12 = iMax3;
                i15 = iMin;
            }
            i14++;
            i16 = i12;
            j2 = j2;
        }
        long j3 = j2;
        int i22 = i16;
        gox0 gox0Var5 = gox0Var;
        if (i17 == 0) {
            i18 -= i15;
            gox0Var2 = gox0Var5;
            i11 = i22;
            i10 = 0;
            i9 = 0;
        } else {
            long j4 = j3 * ((long) (i17 - 1));
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i18)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f2 = jRound / f;
            for (int i23 = i6; i23 < i7; i23++) {
                jRound -= (long) Math.round(v3d1.m84555p(v3d1.m84552m((h6d0) list.get(i23))) * f2);
            }
            int i24 = i6;
            int iMax4 = i22;
            int i25 = 0;
            while (i24 < i7) {
                if (t5o0VarArr[i24] == null) {
                    h6d0 h6d0Var2 = (h6d0) list.get(i24);
                    hox0 hox0VarM84552m2 = v3d1.m84552m(h6d0Var2);
                    float fM84555p2 = v3d1.m84555p(hox0VarM84552m2);
                    long j5 = jRound;
                    Integer numValueOf2 = (i4 == Integer.MAX_VALUE || hox0VarM84552m2 == null || (slzVar = hox0VarM84552m2.f93648d) == null) ? null : Integer.valueOf(Math.round(slzVar.f210524a * i4));
                    if (!(fM84555p2 > 0.0f)) {
                        kt40.m57302b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(j5);
                    int i26 = iMax4;
                    j = j5 - ((long) iSignum);
                    int iMax5 = Math.max(0, Math.round(fM84555p2 * f2) + iSignum);
                    if (!(hox0VarM84552m2 != null ? hox0VarM84552m2.f93646b : true) || iMax5 == Integer.MAX_VALUE) {
                        iMax5 = 0;
                    }
                    int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                    int iIntValue3 = numValueOf2 != null ? numValueOf2.intValue() : i4;
                    gox0Var3 = gox0Var;
                    t5o0 t5o0VarMo39619B2 = h6d0Var2.mo39619B(gox0Var3.mo25221i(true, iMax5, iIntValue2, iMax5, iIntValue3));
                    int iMo25222j2 = gox0Var3.mo25222j(t5o0VarMo39619B2);
                    int iMo25218f2 = gox0Var3.mo25218f(t5o0VarMo39619B2);
                    iArr2[i24 - i6] = iMo25222j2;
                    i25 += iMo25222j2;
                    iMax4 = Math.max(i26, iMo25218f2);
                    t5o0VarArr[i24] = t5o0VarMo39619B2;
                } else {
                    j = jRound;
                    gox0Var3 = gox0Var5;
                    i24 = i24;
                }
                i24++;
                gox0Var5 = gox0Var3;
                jRound = j;
            }
            int i27 = iMax4;
            gox0Var2 = gox0Var5;
            i9 = 0;
            int i28 = (int) (((long) i25) + j4);
            int i29 = i3 - i18;
            if (i28 < 0) {
                i28 = 0;
            }
            if (i28 > i29) {
                i28 = i29;
            }
            i10 = i28;
            i11 = i27;
        }
        if (z) {
            iMax = i9;
            iMax2 = iMax;
            for (int i30 = i6; i30 < i7; i30++) {
                t5o0 t5o0Var = t5o0VarArr[i30];
                wj50.m88279p(t5o0Var);
                hox0 hox0VarM84553n = v3d1.m84553n(t5o0Var);
                vhf1 vhf1Var2 = hox0VarM84553n != null ? hox0VarM84553n.f93647c : null;
                Integer numMo62878m = vhf1Var2 != null ? vhf1Var2.mo62878m(t5o0Var) : null;
                if (numMo62878m != null) {
                    int iIntValue4 = numMo62878m.intValue();
                    int iMo25218f3 = gox0Var2.mo25218f(t5o0Var);
                    iMax = Math.max(iMax, iIntValue4 != Integer.MIN_VALUE ? numMo62878m.intValue() : i9);
                    if (iIntValue4 == Integer.MIN_VALUE) {
                        iIntValue4 = iMo25218f3;
                    }
                    iMax2 = Math.max(iMax2, iMo25218f3 - iIntValue4);
                }
            }
        } else {
            iMax = i9;
            iMax2 = iMax;
        }
        int i31 = i18 + i10;
        if (i31 < 0) {
            i31 = i9;
        }
        int iMax6 = Math.max(i31, i);
        int iMax7 = Math.max(i11, Math.max(i2, iMax2 + iMax));
        int[] iArr3 = new int[i13];
        gox0Var2.mo25219g(iMax6, iArr2, iArr3, o6d0Var);
        return gox0Var2.mo25220h(t5o0VarArr, o6d0Var, iMax, iArr3, iMax6, iMax7, iArr, i8, i6, i7);
    }

    /* JADX INFO: renamed from: o */
    public static xug0 m83776o() {
        return new xug0(11, (byte) 0);
    }

    /* JADX INFO: renamed from: p */
    public static final uyk0 m83777p(r1l0 r1l0Var, Resources resources) {
        if (r1l0Var.f194884a.isEmpty()) {
            return null;
        }
        return new uyk0(new i1l0(new rzd1(resources.getString(R.string.cn_offline_ready_section_header_title), 254, null, null, false, null)), nau.f152117a);
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo82900q(ung1 ung1Var, ung1 ung1Var2);

    /* JADX INFO: renamed from: r */
    public abstract void mo82901r(ung1 ung1Var, Thread thread);

    /* JADX INFO: renamed from: s */
    public abstract boolean mo82902s(prg1 prg1Var, c8g1 c8g1Var, c8g1 c8g1Var2);

    /* JADX INFO: renamed from: t */
    public abstract boolean mo82903t(prg1 prg1Var, Object obj, Object obj2);

    /* JADX INFO: renamed from: u */
    public abstract boolean mo82904u(prg1 prg1Var, ung1 ung1Var, ung1 ung1Var2);
}
