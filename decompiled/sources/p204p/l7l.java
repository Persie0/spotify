package p204p;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.text.PlatformSpanStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import com.comscore.streaming.ContentType;
import com.spotify.core.http.HttpConnection;
import com.spotify.music.R;
import java.util.Map;
import java.util.Set;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l7l {

    /* JADX INFO: renamed from: a */
    public static final fyf f130695a;

    /* JADX INFO: renamed from: b */
    public static final fyf f130696b;

    /* JADX INFO: renamed from: c */
    public static final fyf f130697c;

    /* JADX INFO: renamed from: d */
    public static sd40 f130698d;

    static {
        new fyf(new xaf(1), false, 866784315);
        new fyf(new xaf(2), false, 1714259275);
        new fyf(new C2089lg(7), false, -1836397928);
        new fyf(new xaf(3), false, -1406416085);
        f130695a = new fyf(new xaf(4), false, 566090785);
        f130696b = new fyf(new xaf(5), false, -1624772335);
        new fyf(new C2089lg(8), false, 939725476);
        f130697c = new fyf(new xaf(6), false, -1341284559);
    }

    /* JADX INFO: renamed from: a */
    public static final void m58421a(String str, String str2, zkp0 zkp0Var, ykp0 ykp0Var, xq00 xq00Var, int i) {
        fyf fyfVar;
        j15 j15VarM58427g;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-967113748);
        int i2 = i | (xq00Var2.m91766g(str) ? 4 : 2) | (xq00Var2.m91766g(str2) ? 32 : 16) | (xq00Var2.m91770i(zkp0Var) ? 256 : 128) | (xq00Var2.m91770i(ykp0Var) ? 2048 : 1024);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61822f(1.0f, cxh0.f43038a), leu.m58815a(xq00Var2).f112823a.f229874a.f123093a, hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.f148189e));
            if (str == null || zkp0Var == null || ykp0Var == null) {
                xq00Var2.m91771i0(-644632643);
                p711.m69222a(fxh0VarM64246i, null, null, false, null, null, null, null, null, v0h.f235997a, null, v0h.f235998b, null, null, null, v0h.f235999c, xq00Var, 805306368, 196656, 30206);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(-644344064);
                fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var2).f117230b.f224761d, fxh0VarM64246i);
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
                if (str2 == null) {
                    xq00Var2.m91771i0(1725160657);
                    xq00Var2.m91788r(false);
                    fyfVar = null;
                } else {
                    xq00Var2.m91771i0(1725160658);
                    fyf fyfVarM75772x = rkk.m75772x(-232023788, new jam0(12, zkp0Var, str2), xq00Var2);
                    xq00Var2.m91788r(false);
                    fyfVar = fyfVarM75772x;
                }
                xq00Var2.m91771i0(332774682);
                clp0 sender = ykp0Var.getSender();
                wkp0 wkp0Var = ykp0Var instanceof wkp0 ? (wkp0) ykp0Var : null;
                clp0 clp0Var = wkp0Var != null ? wkp0Var.f252276b : null;
                if (clp0Var != null && clp0Var.mo26353a() && (sender instanceof blp0) && (clp0Var instanceof alp0)) {
                    xq00Var2.m91771i0(1220287929);
                    j15VarM58427g = new j15(k0e1.m54977L(R.string.f5963x17c8d524, xq00Var2));
                    xq00Var2.m91788r(false);
                } else if (clp0Var != null && clp0Var.mo26353a()) {
                    xq00Var2.m91771i0(1220294834);
                    j15VarM58427g = new j15(k0e1.m54977L(R.string.f5961x195b3266, xq00Var2));
                    xq00Var2.m91788r(false);
                } else if ((sender instanceof blp0) && (clp0Var instanceof alp0)) {
                    xq00Var2.m91771i0(1220301608);
                    j15VarM58427g = new j15(k0e1.m54978M(R.string.playlist_collaboration_invitation_share_row_sender_subtitle, new Object[]{((alp0) clp0Var).f16913b}, xq00Var2));
                    xq00Var2.m91788r(false);
                } else {
                    xq00Var2.m91771i0(-825170806);
                    j15VarM58427g = m58427g(k0e1.m54978M(R.string.playlist_collaboration_invitation_share_row_recipient_subtitle, new Object[]{str}, xq00Var2), str, xq00Var2);
                    xq00Var2.m91788r(false);
                }
                fyf fyfVarM75772x2 = rkk.m75772x(376449598, new ce1(j15VarM58427g, 7), xq00Var2);
                xq00Var2.m91788r(false);
                p711.m69222a(null, null, null, false, null, null, null, null, null, fyfVar, null, fyfVarM75772x2, null, null, null, rkk.m75772x(-216259766, new jam0(13, str, ykp0Var), xq00Var2), xq00Var2, 0, 196608, 30207);
                xq00Var2.m91788r(true);
                xq00Var2.m91788r(false);
                xq00Var2 = xq00Var2;
            }
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jsl0(str, str2, zkp0Var, ykp0Var, i, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m58422b(int i, xq00 xq00Var, boolean z) {
        xq00Var.m91775k0(1415239943);
        int i2 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            z96.m95630j(z, null, kbv.m55958d(jg31.m53259E(150, 0, null, 6), 2), kbv.m55959e(jg31.m53259E(150, 0, null, 6), 2), null, jug.f116107a, xq00Var, (i2 & 14) | 200064, 18);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vk50(i, 8, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m58423c(dlp0 dlp0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(2129840885);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(dlp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            jc20 jc20Var = (jc20) xq00Var.m91774k(wsh.f254621l);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96831B = zsf1.m96831B(p271.m68908k(mi21.m61822f(1.0f, cxh0Var), dlp0Var.f50309g), leu.m58816b(xq00Var).f117230b.f224761d, leu.m58816b(xq00Var).f117230b.f224760c, leu.m58816b(xq00Var).f117230b.f224761d, leu.m58816b(xq00Var).f117230b.f224765h);
            zi5 zi5Var = bj5.f27610a;
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224759b), d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96831B);
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
            ykp0 ykp0Var = dlp0Var.f50308f;
            String str = !((ykp0Var != null ? ykp0Var.getSender() : null) instanceof blp0) ? dlp0Var.f50304b : dlp0Var.f50303a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, epv0.m39673I("playlist_invitation_share_row_card", cxh0Var));
            boolean zM91770i = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91770i(jc20Var) | xq00Var.m91766g(str);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new qmk(jc20Var, gh00Var, str, 7);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM69516a = pb61.m69516a(fxh0VarM61822f, str, (PointerInputEventHandler) objM91750T);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM69516a);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            m58421a(dlp0Var.f50305c, dlp0Var.f50306d, dlp0Var.f50307e, dlp0Var.f50308f, xq00Var, 0);
            xq00Var.m91788r(true);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vxi0(dlp0Var, gh00Var, i, 24);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m58424d(float f, float f2, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1117238941);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91760d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91760d(f2) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            float f3 = 4;
            dha.m36004a(xtm0.m92060G(nec.m64246i(mi21.m61824h(f2, mi21.m61838v(f, zsf1.m96832C(cxh0.f43038a, 0.0f, f3, 0.0f, f3, 5))), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15), xq00Var, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new s8a0(f, f2, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m58425e(C2374sf c2374sf, cpz0 cpz0Var) {
        voz0 voz0Var = cpz0Var.f40689d;
        cqi0 cqi0Var = voz0Var.f243555a;
        Object objM33623g = voz0Var.f243555a.m33623g(hpz0.f93969z);
        if (objM33623g == null) {
            objM33623g = null;
        }
        tix0 tix0Var = (tix0) objM33623g;
        if (bul.m30559k(cpz0Var)) {
            if (tix0Var != null && tix0Var.f220762a == 8) {
                return;
            }
            Object objM33623g2 = cqi0Var.m33623g(toz0.f222370y);
            if (objM33623g2 == null) {
                objM33623g2 = null;
            }
            C1811ee c1811ee = (C1811ee) objM33623g2;
            if (c1811ee != null) {
                c2374sf.m77968b(new C2212of(android.R.id.accessibilityActionPageUp, c1811ee.f58629a));
            }
            Object objM33623g3 = cqi0Var.m33623g(toz0.f222343A);
            if (objM33623g3 == null) {
                objM33623g3 = null;
            }
            C1811ee c1811ee2 = (C1811ee) objM33623g3;
            if (c1811ee2 != null) {
                c2374sf.m77968b(new C2212of(android.R.id.accessibilityActionPageDown, c1811ee2.f58629a));
            }
            Object objM33623g4 = cqi0Var.m33623g(toz0.f222371z);
            if (objM33623g4 == null) {
                objM33623g4 = null;
            }
            C1811ee c1811ee3 = (C1811ee) objM33623g4;
            if (c1811ee3 != null) {
                c2374sf.m77968b(new C2212of(android.R.id.accessibilityActionPageLeft, c1811ee3.f58629a));
            }
            Object objM33623g5 = cqi0Var.m33623g(toz0.f222344B);
            C1811ee c1811ee4 = (C1811ee) (objM33623g5 != null ? objM33623g5 : null);
            if (c1811ee4 != null) {
                c2374sf.m77968b(new C2212of(android.R.id.accessibilityActionPageRight, c1811ee4.f58629a));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final float m58426f(long j) {
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    /* JADX INFO: renamed from: g */
    public static final j15 m58427g(String str, String str2, xq00 xq00Var) {
        FontFamily fontFamily = leu.m58818d(xq00Var).f64978n.f101704a.f63415f;
        long j = 0;
        ew31 ew31Var = new ew31(leu.m58815a(xq00Var).f112824b.f138757a, j, FontWeight.f527e, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65498);
        g15 g15Var = new g15();
        int iM88463M0 = wl51.m88463M0(str, str2, 0, 6);
        if (iM88463M0 >= 0) {
            g15Var.m43331g(str.substring(0, iM88463M0));
            int iM43338n = g15Var.m43338n(ew31Var);
            try {
                g15Var.m43331g(str2);
                g15Var.m43335k(iM43338n);
                g15Var.m43331g(str.substring(str2.length() + iM88463M0));
            } catch (Throwable th) {
                g15Var.m43335k(iM43338n);
                throw th;
            }
        } else {
            g15Var.m43331g(str);
        }
        return g15Var.m43339o();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: h */
    public static final long m58428h(e6q0 e6q0Var, boolean z) {
        ?? r7 = e6q0Var.f56704a;
        int size = r7.size();
        long jM257g = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            k6q0 k6q0Var = (k6q0) r7.get(i2);
            if (k6q0Var.f119813d && k6q0Var.f119817h) {
                jM257g = Offset.m257g(jM257g, z ? k6q0Var.f119812c : k6q0Var.f119816g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return Offset.m252b(jM257g, i);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: i */
    public static final float m58429i(e6q0 e6q0Var, boolean z) {
        long jM58428h = m58428h(e6q0Var, z);
        float fM254d = 0.0f;
        if (Offset.m253c(jM58428h, 9205357640488583168L)) {
            return 0.0f;
        }
        ?? r8 = e6q0Var.f56704a;
        int size = r8.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            k6q0 k6q0Var = (k6q0) r8.get(i2);
            if (k6q0Var.f119813d && k6q0Var.f119817h) {
                i++;
                fM254d = Offset.m254d(Offset.m256f(z ? k6q0Var.f119812c : k6q0Var.f119816g, jM58428h)) + fM254d;
            }
        }
        return fM254d / i;
    }

    /* JADX INFO: renamed from: j */
    public static final long m58430j(e6q0 e6q0Var) {
        long jM58428h = m58428h(e6q0Var, true);
        if (Offset.m253c(jM58428h, 9205357640488583168L)) {
            return 0L;
        }
        return Offset.m256f(jM58428h, m58428h(e6q0Var, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: k */
    public static final float m58431k(e6q0 e6q0Var) {
        ?? r0 = e6q0Var.f56704a;
        int size = r0.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            k6q0 k6q0Var = (k6q0) r0.get(i);
            if (!k6q0Var.f119817h || !k6q0Var.f119813d) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long jM58428h = m58428h(e6q0Var, true);
            long jM58428h2 = m58428h(e6q0Var, false);
            int size2 = r0.size();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                k6q0 k6q0Var2 = (k6q0) r0.get(i4);
                if (k6q0Var2.f119813d && k6q0Var2.f119817h) {
                    long j = k6q0Var2.f119812c;
                    long jM256f = Offset.m256f(k6q0Var2.f119816g, jM58428h2);
                    long jM256f2 = Offset.m256f(j, jM58428h);
                    float fM58426f = m58426f(jM256f2) - m58426f(jM256f);
                    float fM254d = Offset.m254d(Offset.m257g(jM256f2, jM256f)) / 2.0f;
                    if (fM58426f > 180.0f) {
                        fM58426f -= 360.0f;
                    } else if (fM58426f < -180.0f) {
                        fM58426f += 360.0f;
                    }
                    f2 += fM58426f * fM254d;
                    f += fM254d;
                }
            }
            if (f != 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: l */
    public static final float m58432l(e6q0 e6q0Var) {
        float fM58429i = m58429i(e6q0Var, true);
        float fM58429i2 = m58429i(e6q0Var, false);
        if (fM58429i == 0.0f || fM58429i2 == 0.0f) {
            return 1.0f;
        }
        return fM58429i / fM58429i2;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m58433n(String str, String str2) {
        return wj50.m88271j(str, str2);
    }

    /* JADX INFO: renamed from: o */
    public static String m58434o(Map map) {
        String str = (String) map.get("Content-Type");
        if (str == null) {
            str = (String) map.get("content-type");
        }
        return str == null ? HttpConnection.kDefaultContentType : str;
    }

    /* JADX INFO: renamed from: p */
    public static int m58435p(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: q */
    public static final t9y0 m58436q(gh00 gh00Var, th00 th00Var) {
        nk4 nk4Var = new nk4(th00Var, 6);
        zn91.m96579u(1, gh00Var);
        return new t9y0(gh00Var, nk4Var);
    }

    /* JADX INFO: renamed from: r */
    public static final void m58437r(rmm0 rmm0Var) {
        rmm0Var.mo29871c().m66891n(b6x0.f24069a);
    }

    /* JADX INFO: renamed from: s */
    public static peu m58438s(eh00 eh00Var) {
        return new peu(u40.f226523c, eh00Var);
    }

    /* JADX INFO: renamed from: t */
    public static final dhv m58439t(bpe1 bpe1Var, int i, int i2, String str, Set set, boolean z, xi3 xi3Var, boolean z2, mi80 mi80Var) {
        int i3 = i2 + i;
        boolean z3 = xi3Var == xi3.f261754b && bpe1Var.f29428e == jev.f111671b && set.contains(bpe1Var.f29424a);
        String str2 = bpe1Var.f29424a;
        return new dhv(i3, bpe1Var, z, xi3Var, i3, str != null && (wj50.m88271j(str2, str) || (tg1.m80723m(str2) && tg1.m80723m(str))), z2, z3, 64);
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo58440m();
}
