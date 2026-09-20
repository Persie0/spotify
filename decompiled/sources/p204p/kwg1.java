package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Messenger;
import android.text.format.Formatter;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.unit.TextUnit;
import com.comscore.streaming.ContentType;
import com.spotify.android.permissionsimpl.PermissionsRequestActivity;
import com.spotify.music.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kwg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f127093a;

    /* JADX INFO: renamed from: a */
    public static final void m57529a(kf1 kf1Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1801837495);
        int i2 = i | (xq00Var.m91766g(kf1Var) ? 4 : 2) | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(8), d7f0.f46144O0, xq00Var, 0);
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
            ahf1.m25932d(kf1Var.f122027c, epv0.m39673I("DescriptionText", cxh0.f43038a), leu.m58818d(xq00Var).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ke1(kf1Var, fxh0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m57530b(String str, j04 j04Var, r2j r2jVar, eh00 eh00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(385813343);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(j04Var) ? 32 : 16) | (xq00Var.m91766g(r2jVar) ? 256 : 128) | (xq00Var.m91770i(eh00Var) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = {str};
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = ssh.f213605P0;
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) dul.m37018u(objArr, (eh00) objM91750T, xq00Var, 48);
            Object[] objArr2 = {str};
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = ssh.f213604O0;
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var2 = (kqi0) dul.m37018u(objArr2, (eh00) objM91750T2, xq00Var, 48);
            kqi0 kqi0VarM77651H = sam.m77651H(eh00Var, xq00Var);
            boolean zM91770i = xq00Var.m91770i(kqi0Var2) | xq00Var.m91770i(kqi0VarM77651H);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == obj) {
                objM91750T3 = new gyc(kqi0Var2, kqi0VarM77651H, 1);
                xq00Var.m91793t0(objM91750T3);
            }
            eh00 eh00Var2 = (eh00) objM91750T3;
            o5m0 o5m0Var = new o5m0(false, 5);
            boolean zM91766g = xq00Var.m91766g(eh00Var2);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91766g || objM91750T4 == obj) {
                objM91750T4 = new ke0(19, eh00Var2);
                xq00Var.m91793t0(objM91750T4);
            }
            yac0 yac0VarM51538r = isg1.m51538r(o5m0Var, (gh00) objM91750T4, xq00Var);
            boolean zM91770i2 = ((i2 & 14) == 4) | xq00Var.m91770i(kqi0Var) | xq00Var.m91770i(kqi0Var2) | xq00Var.m91766g(eh00Var2) | ((i2 & 896) == 256) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91770i(yac0VarM51538r);
            Object objM91750T5 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T5 == obj) {
                Object nm0Var = new nm0(str, eh00Var2, r2jVar, j04Var, yac0VarM51538r, kqi0Var, kqi0Var2, (fbk) null);
                xq00Var.m91793t0(nm0Var);
                objM91750T5 = nm0Var;
            }
            hz40.m49237i(str, (th00) objM91750T5, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new pna(str, j04Var, r2jVar, eh00Var, i, 26);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m57531c(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-920529350);
        int i2 = i | 54 | (xq00Var.m91770i(eh00Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            vb9 vb9Var = d7f0.f46142M0;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var), leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224761d, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 8);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, vb9Var, xq00Var, 48);
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
            ahf1.m25932d(k0e1.m54977L(R.string.grouping_add_to_group_header, xq00Var), epv0.m39673I("groupable-devices-header-title", cxh0Var), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, new ol80(1), 0, null, xq00Var, 48, 0, 1776);
            xq00Var.m91771i0(1575698052);
            xq00Var.m91788r(false);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(fxh0Var2, eh00Var, i, 21);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m57532d(o1d1 o1d1Var, gh00 gh00Var, fyf fyfVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        gh00 gh00Var2;
        xq00 xq00Var3;
        yhh yhhVar;
        yhh yhhVar2;
        int i3;
        int i4;
        yhh yhhVar3;
        cxh0 cxh0Var;
        vlh vlhVar;
        C2087le c2087le;
        fxh0 fxh0VarM64246i;
        long j;
        fyf fyfVar2 = fyfVar;
        String str = o1d1Var.f160705g;
        xq00Var.m91775k0(-1699787092);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(o1d1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fyfVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            fxh0 fxh0VarM96832C = zsf1.m96832C(fxh0Var, leu.m58816b(xq00Var).f117233e.f137887c, 0.0f, leu.m58816b(xq00Var).f117233e.f137887c, leu.m58816b(xq00Var).f117230b.f224761d, 2);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96832C);
            soh.f211194A.getClass();
            C2087le c2087le2 = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le2);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar4 = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar4, xq00Var);
            yhh yhhVar5 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar5, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar6 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar6, xq00Var);
            vlh vlhVar2 = roh.f201266k;
            zsf1.m96833D(vlhVar2, xq00Var);
            yhh yhhVar7 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar7, xq00Var);
            cxh0 cxh0Var2 = cxh0.f43038a;
            if (str != null) {
                xq00Var.m91771i0(1263225954);
                cxh0Var = cxh0Var2;
                vlhVar = vlhVar2;
                c2087le = c2087le2;
                yhhVar = yhhVar7;
                yhhVar2 = yhhVar4;
                i4 = 0;
                i3 = i2;
                yhhVar3 = yhhVar5;
                xq00Var3 = xq00Var;
                fxh0VarM64246i = ftf1.m42618s(r9g1.m75068p(cxh0Var2, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148189e)), vm6.m85986a(Uri.parse(str), null, null, null, null, null, false, false, null, null, null, 0L, xq00Var, 0, 0, 131070), null, r101.f194644L0, 0.0f, null, 54);
                j = ((n6f) xq00Var3.m91774k(xju.f262232a)).f150873a;
                xq00Var3.m91788r(false);
            } else {
                xq00Var3 = xq00Var;
                yhhVar = yhhVar7;
                yhhVar2 = yhhVar4;
                i3 = i2;
                i4 = 0;
                yhhVar3 = yhhVar5;
                cxh0Var = cxh0Var2;
                vlhVar = vlhVar2;
                c2087le = c2087le2;
                xq00Var3.m91771i0(1263561157);
                fxh0VarM64246i = nec.m64246i(cxh0Var, leu.m58815a(xq00Var3).f112823a.f229874a.f123093a, hmx0.m47993b(leu.m58816b(xq00Var3).f117234f.f148189e));
                j = leu.m58815a(xq00Var3).f112824b.f138758b;
                xq00Var3.m91788r(false);
            }
            long j2 = j;
            zhi0 zhi0Var = bj5.f27612c;
            ub9 ub9Var = d7f0.f46144O0;
            aaf aafVarM87496a = w9f.m87496a(zhi0Var, ub9Var, xq00Var3, i4);
            int iHashCode2 = Long.hashCode(xq00Var3.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var3.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var3, fxh0VarM64246i);
            xq00Var3.m91779m0();
            if (xq00Var3.f264808S) {
                xq00Var3.m91776l(c2087le);
            } else {
                xq00Var3.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar2, xq00Var3);
            yhh yhhVar8 = yhhVar3;
            zsf1.m96835F(wpn0VarM91778m2, yhhVar8, xq00Var3);
            vlh vlhVar3 = vlhVar;
            AbstractC0000a.m20s(iHashCode2, xq00Var3, yhhVar6, xq00Var3, vlhVar3);
            yhh yhhVar9 = yhhVar;
            zsf1.m96835F(fxh0VarM48286s2, yhhVar9, xq00Var3);
            fxh0 fxh0VarM96831B = zsf1.m96831B(cxh0Var, leu.m58816b(xq00Var3).f117233e.f137887c, leu.m58816b(xq00Var3).f117233e.f137887c, leu.m58816b(xq00Var3).f117233e.f137887c, leu.m58816b(xq00Var3).f117230b.f224761d);
            aaf aafVarM87496a2 = w9f.m87496a(zhi0Var, ub9Var, xq00Var3, 0);
            int iHashCode3 = Long.hashCode(xq00Var3.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var3.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var3, fxh0VarM96831B);
            xq00Var3.m91779m0();
            if (xq00Var3.f264808S) {
                xq00Var3.m91776l(c2087le);
            } else {
                xq00Var3.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar2, xq00Var3);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar8, xq00Var3);
            AbstractC0000a.m20s(iHashCode3, xq00Var3, yhhVar6, xq00Var3, vlhVar3);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar9, xq00Var3);
            ahf1.m25932d(o1d1Var.f160699a, null, leu.m58818d(xq00Var).f64977m, j2, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
            riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224761d, cxh0Var));
            ahf1.m25932d(o1d1Var.f160700b, null, leu.m58818d(xq00Var).f64972h, 0L, new h171(5), null, 0, false, null, 0, null, xq00Var, 0, 0, 2026);
            riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224760c, cxh0Var));
            ahf1.m25932d(o1d1Var.f160701c, null, leu.m58818d(xq00Var).f64974j, j2, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
            xq00Var2 = xq00Var;
            riw0.m75615i(xq00Var2, mi21.m61824h(leu.m58816b(xq00Var2).f117230b.f224761d, cxh0Var));
            gh00Var2 = gh00Var;
            pwg1.m71272g(o1d1Var.f160702d, gh00Var2, null, xq00Var2, i3 & ContentType.LONG_FORM_ON_DEMAND);
            xq00Var2.m91788r(true);
            riw0.m75615i(xq00Var2, mi21.m61824h(leu.m58816b(xq00Var2).f117230b.f224761d, cxh0Var));
            fyfVar2 = fyfVar;
            p3n0.m69076g((i3 >> 6) & 14, fyfVar2, xq00Var2, true, true);
        } else {
            xq00Var2 = xq00Var;
            gh00Var2 = gh00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new br91(o1d1Var, gh00Var2, fyfVar2, fxh0Var, i, 19);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final String m57533e() {
        int iM38547C = edb.m38547C(2);
        if (iM38547C == 0) {
            return "legacy";
        }
        if (iM38547C == 1) {
            return "no_data";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    public static void m57534f(Intent intent, boolean z, Map map, boolean z2, int i) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        String str = (i & 8) != 0 ? "allow_music_attachments" : "com.facebook.platform.extra.ALLOW_MUSIC_ATTACHMENTS";
        if (z) {
            if (z2 || wj50.m88271j(map.get("feature"), "wrapped")) {
                intent.putExtra(str, true);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final String m57535g(als alsVar, long j, boolean z) {
        zks zksVar = z ? new zks(3, 2) : new zks(4, 2);
        hvi0 hvi0Var = cks.f39079b;
        return ((bls) alsVar).m29783a(cks.m33199r(j, ils.SECONDS), zksVar);
    }

    /* JADX INFO: renamed from: h */
    public static final sl71 m57536h(Context context, y6s0 y6s0Var, boolean z) {
        if (!(y6s0Var instanceof x6s0)) {
            if (!(y6s0Var instanceof w6s0)) {
                throw new NoWhenBranchMatchedException();
            }
            uz3 uz3Var = new uz3(1, context.getResources());
            hvi0 hvi0Var = cks.f39079b;
            w6s0 w6s0Var = (w6s0) y6s0Var;
            return (sl71) uz3Var.invoke(new cks(jwg1.m54450E(w6s0Var.f248465b - w6s0Var.f248466c, ils.MILLISECONDS)));
        }
        if (z && ((x6s0) y6s0Var).f258745a) {
            return null;
        }
        long j = ((x6s0) y6s0Var).f258746b;
        if (j == 0) {
            return null;
        }
        uz3 uz3Var2 = new uz3(2, context.getResources());
        hvi0 hvi0Var2 = cks.f39079b;
        return (sl71) uz3Var2.invoke(new cks(jwg1.m54450E(j, ils.MILLISECONDS)));
    }

    /* JADX INFO: renamed from: i */
    public static final String m57537i(Context context, als alsVar, y6s0 y6s0Var, long j, boolean z, boolean z2) {
        if (!(y6s0Var instanceof w6s0)) {
            if (!(y6s0Var instanceof x6s0)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z2 && ((x6s0) y6s0Var).f258745a && !z) {
                return null;
            }
            hvi0 hvi0Var = cks.f39079b;
            return m57535g(alsVar, j, cks.m33184c(j, jwg1.m54449D(1, ils.MINUTES)) < 0);
        }
        hvi0 hvi0Var2 = cks.f39079b;
        w6s0 w6s0Var = (w6s0) y6s0Var;
        long jM54450E = jwg1.m54450E(w6s0Var.f248465b - w6s0Var.f248466c, ils.MILLISECONDS);
        ils ilsVar = ils.MINUTES;
        if (cks.m33184c(jM54450E, jwg1.m54449D(1, ilsVar)) < 0 && z) {
            return context.getString(R.string.metadata_time_left, context.getString(R.string.metadata_time_left_less_than_minute));
        }
        if (cks.m33185d(jM54450E, jwg1.m54449D(0, ils.SECONDS))) {
            return null;
        }
        return context.getString(R.string.metadata_time_left, m57535g(alsVar, jM54450E, cks.m33184c(jM54450E, jwg1.m54449D(1, ilsVar)) < 0));
    }

    /* JADX INFO: renamed from: j */
    public static final String m57538j(Map map) {
        Object next;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (bm51.m29803n0((String) next, "group_id_", false)) {
                return (String) next;
            }
        }
        next = null;
        return (String) next;
    }

    /* JADX INFO: renamed from: k */
    public static long m57539k() {
        return TextUnit.f547c;
    }

    /* JADX INFO: renamed from: l */
    public static final t050 m57540l(z8k z8kVar, hjk0 hjk0Var, hjk0 hjk0Var2) {
        return ((b9k) z8kVar).m28489g("ClientLanguageReporterDaemon", new rik0(2, hjk0Var, hjk0Var2));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m57541m(Messenger messenger) {
        if (messenger != null) {
            try {
                if (messenger.getBinder() != null) {
                    return true;
                }
            } catch (NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static final eh00 m57542n(mfb mfbVar, egm0 egm0Var, xre xreVar, xuk xukVar, int i, xq00 xq00Var) {
        eh00 eh00Var;
        Object obj;
        boolean z;
        String str;
        Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
        Object objM91750T = xq00Var.m91750T();
        Object obj2 = t6x0.f217647t;
        if (objM91750T == obj2) {
            objM91750T = sam.m77645B(Boolean.FALSE);
            xq00Var.m91793t0(objM91750T);
        }
        kqi0 kqi0Var = (kqi0) objM91750T;
        Object objM91750T2 = xq00Var.m91750T();
        if (objM91750T2 == obj2) {
            objM91750T2 = sam.m77645B(Boolean.FALSE);
            xq00Var.m91793t0(objM91750T2);
        }
        kqi0 kqi0Var2 = (kqi0) objM91750T2;
        Object objM91750T3 = xq00Var.m91750T();
        if (objM91750T3 == obj2) {
            objM91750T3 = sam.m77645B(Boolean.FALSE);
            xq00Var.m91793t0(objM91750T3);
        }
        kqi0 kqi0Var3 = (kqi0) objM91750T3;
        long j = ((long) i) * 1000000;
        boolean zM91766g = xq00Var.m91766g(mfbVar);
        Object objM91750T4 = xq00Var.m91750T();
        if (zM91766g || objM91750T4 == obj2) {
            Object pn70Var = new pn70(mfbVar, xukVar, kqi0Var, kqi0Var2, context, j, kqi0Var3, egm0Var, xreVar);
            xq00Var.m91793t0(pn70Var);
            objM91750T4 = pn70Var;
        }
        eh00 eh00Var2 = (eh00) objM91750T4;
        if (((Boolean) kqi0Var.getValue()).booleanValue()) {
            xq00Var.m91771i0(978940264);
            String strM54977L = k0e1.m54977L(R.string.chat_camera_permission_rationale_title, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.chat_camera_permission_rationale_message, xq00Var);
            String strM54977L3 = k0e1.m54977L(R.string.chat_camera_permission_give_access, xq00Var);
            String strM54977L4 = k0e1.m54977L(R.string.chat_camera_permission_cancel, xq00Var);
            Object objM91750T5 = xq00Var.m91750T();
            if (objM91750T5 == obj2) {
                objM91750T5 = new in70(kqi0Var, 1);
                xq00Var.m91793t0(objM91750T5);
            }
            eh00 eh00Var3 = (eh00) objM91750T5;
            boolean zM91766g2 = xq00Var.m91766g(eh00Var2);
            Object objM91750T6 = xq00Var.m91750T();
            if (zM91766g2 || objM91750T6 == obj2) {
                objM91750T6 = new C2369sa(kqi0Var, eh00Var2, 20);
                xq00Var.m91793t0(objM91750T6);
            }
            eh00 eh00Var4 = (eh00) objM91750T6;
            if (wl51.m88460J0(strM54977L3)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            gku gkuVar = new gku(strM54977L3, new peu(new t40(strM54977L3), eh00Var4));
            Object objM91750T7 = xq00Var.m91750T();
            if (objM91750T7 == obj2) {
                objM91750T7 = new in70(kqi0Var, 2);
                xq00Var.m91793t0(objM91750T7);
            }
            eh00 eh00Var5 = (eh00) objM91750T7;
            if (wl51.m88460J0(strM54977L4)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            eh00Var = eh00Var2;
            str = "Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.";
            obj = obj2;
            z = false;
            kku.m56741a(eh00Var3, null, null, strM54977L, strM54977L2, gkuVar, new gku(strM54977L4, new peu(new t40(strM54977L4), eh00Var5)), xq00Var, 2359302, 6);
            xq00Var.m91788r(false);
        } else {
            eh00Var = eh00Var2;
            obj = obj2;
            z = false;
            str = "Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.";
            xq00Var.m91771i0(979794593);
            xq00Var.m91788r(false);
        }
        if (((Boolean) kqi0Var2.getValue()).booleanValue()) {
            xq00Var.m91771i0(979863568);
            String strM54977L5 = k0e1.m54977L(R.string.chat_camera_permission_rationale_title, xq00Var);
            String strM54977L6 = k0e1.m54977L(R.string.chat_camera_permission_rationale_message, xq00Var);
            String strM54977L7 = k0e1.m54977L(R.string.chat_camera_permission_go_to_android_settings, xq00Var);
            String strM54977L8 = k0e1.m54977L(R.string.chat_camera_permission_cancel, xq00Var);
            Object objM91750T8 = xq00Var.m91750T();
            if (objM91750T8 == obj) {
                objM91750T8 = new in70(kqi0Var2, 3);
                xq00Var.m91793t0(objM91750T8);
            }
            eh00 eh00Var6 = (eh00) objM91750T8;
            boolean zM91770i = xq00Var.m91770i(context);
            Object objM91750T9 = xq00Var.m91750T();
            if (zM91770i || objM91750T9 == obj) {
                objM91750T9 = new hn70(kqi0Var2, context, 1);
                xq00Var.m91793t0(objM91750T9);
            }
            eh00 eh00Var7 = (eh00) objM91750T9;
            if (wl51.m88460J0(strM54977L7)) {
                throw new IllegalArgumentException(str);
            }
            gku gkuVar2 = new gku(strM54977L7, new peu(new t40(strM54977L7), eh00Var7));
            Object objM91750T10 = xq00Var.m91750T();
            if (objM91750T10 == obj) {
                objM91750T10 = new in70(kqi0Var2, 4);
                xq00Var.m91793t0(objM91750T10);
            }
            eh00 eh00Var8 = (eh00) objM91750T10;
            if (wl51.m88460J0(strM54977L8)) {
                throw new IllegalArgumentException(str);
            }
            kku.m56741a(eh00Var6, null, null, strM54977L5, strM54977L6, gkuVar2, new gku(strM54977L8, new peu(new t40(strM54977L8), eh00Var8)), xq00Var, 2359302, 6);
            xq00Var.m91788r(z);
        } else {
            xq00Var.m91771i0(980925473);
            xq00Var.m91788r(z);
        }
        if (!((Boolean) kqi0Var3.getValue()).booleanValue()) {
            xq00Var.m91771i0(981158593);
            xq00Var.m91788r(z);
            return eh00Var;
        }
        xq00Var.m91771i0(980974081);
        String shortFileSize = Formatter.formatShortFileSize(context, j);
        Object objM91750T11 = xq00Var.m91750T();
        if (objM91750T11 == obj) {
            objM91750T11 = new in70(kqi0Var3, 5);
            xq00Var.m91793t0(objM91750T11);
        }
        gmg1.m45246h(48, shortFileSize, (eh00) objM91750T11, xq00Var);
        xq00Var.m91788r(z);
        return eh00Var;
    }

    /* JADX INFO: renamed from: o */
    public static Intent m57543o(Activity activity, String... strArr) {
        if (strArr.length == 0) {
            throw new IllegalArgumentException("Permissions list is empty");
        }
        Intent intent = new Intent(activity, (Class<?>) PermissionsRequestActivity.class);
        int i = PermissionsRequestActivity.f2945d;
        intent.putExtra("REQUESTED_PERMISSIONS", strArr);
        return intent;
    }

    /* JADX INFO: renamed from: p */
    public static final void m57544p(Intent intent, String str, String str2) {
        if (str == null || wl51.m88460J0(str)) {
            return;
        }
        Set set = dd41.f47702f;
        if (r46.m74708A(str, gn80.TRACK)) {
            intent.putExtra(str2, str);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m57545q(Intent intent, Uri uri, ipg1 ipg1Var) {
        wj50.m88279p(ipg1Var instanceof e3r ? intent.setDataAndType(uri, "video/*") : intent.setDataAndType(uri, "image/*"));
    }

    /* JADX INFO: renamed from: r */
    public static final void m57546r(Intent intent, boolean z, String str, String str2, xr01 xr01Var) {
        if (!z || wj50.m88271j(xr01Var, vsg1.m86352l(gn80.SHARE_FORMAT_MUSIC_VIDEO, new String[0])) || wj50.m88271j(xr01Var, vsg1.m86352l(gn80.SHARE_FORMAT_LYRICS, new String[0]))) {
            return;
        }
        Set set = dd41.f47702f;
        if (r46.m74708A(str2, gn80.TRACK)) {
            intent.putExtra(str, str2);
        }
    }
}
