package p204p;

import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gue {

    /* JADX INFO: renamed from: a */
    public static final ybu0 f84457a = new ybu0(new mqj0(false, false));

    /* JADX INFO: renamed from: b */
    public static Method f84458b;

    /* JADX INFO: renamed from: c */
    public static Method f84459c;

    /* JADX INFO: renamed from: d */
    public static boolean f84460d;

    /* JADX INFO: renamed from: e */
    public static sd40 f84461e;

    /* JADX INFO: renamed from: a */
    public static final void m45739a(zlk zlkVar, dfo dfoVar, pgo pgoVar, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1784160373);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(zlkVar) : xq00Var.m91770i(zlkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(dfoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(pgoVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            xq00Var.m91757b0();
        } else if (zlkVar.equals(xlk.f263158a)) {
            xq00Var.m91771i0(-886160639);
            m45741c(0, xq00Var);
            xq00Var.m91788r(false);
        } else if (zlkVar.equals(ylk.f274036a)) {
            xq00Var.m91771i0(-886159121);
            xq00Var.m91788r(false);
        } else {
            if (!(zlkVar instanceof wlk)) {
                throw lq51.m59703i(-886161629, xq00Var, false);
            }
            xq00Var.m91771i0(-886158161);
            m45740b((wlk) zlkVar, dfoVar, pgoVar, gh00Var, xq00Var, i2 & 8190);
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cmh(zlkVar, dfoVar, pgoVar, gh00Var, i, 14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m45740b(wlk wlkVar, dfo dfoVar, pgo pgoVar, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(559864646);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(wlkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(dfoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(pgoVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        int i3 = 1;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            fxh0 fxh0VarM39673I = epv0.m39673I("contributor-sheet-popular-songs-section", mi21.m61822f(1.0f, cxh0.f43038a));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
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
            String strM54977L = k0e1.m54977L(R.string.contributor_sheet_popular_songs_title, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.contributor_sheet_popular_songs_see_all, xq00Var);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new glk(i3, gh00Var, wlkVar);
                xq00Var.m91793t0(objM91750T);
            }
            mye.m63173d(strM54977L, strM54977L2, (eh00) objM91750T, null, k0e1.m54977L(R.string.contributor_sheet_popular_songs_see_all_accessibility, xq00Var), xq00Var, 0, 8);
            bns bnsVar = ko31.f124521a;
            gfp gfpVar = leu.f132721a;
            qqg1.m73532b(lq51.m59706l(((giu) iiu.f102631a.f258039d).f80261e, bnsVar), rkk.m75772x(760405456, new z1i(wlkVar, dfoVar, pgoVar, 15), xq00Var), xq00Var, 56);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cmh(wlkVar, dfoVar, pgoVar, gh00Var, i, 15);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m45741c(int i, xq00 xq00Var) {
        xq00Var.m91775k0(580185116);
        if (xq00Var.m91752Y(i & 1, i != 0)) {
            fxh0 fxh0VarM39673I = epv0.m39673I("contributor-sheet-popular-songs-skeleton", mi21.m61822f(1.0f, cxh0.f43038a));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
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
            mye.m63173d(k0e1.m54977L(R.string.contributor_sheet_popular_songs_title, xq00Var), k0e1.m54977L(R.string.contributor_sheet_popular_songs_see_all, xq00Var), null, null, null, xq00Var, 384, 24);
            xq00Var.m91771i0(229287130);
            for (int i2 = 0; i2 < 10; i2++) {
                pwb.m71218c(0, 3, xq00Var, null, false);
            }
            xq00Var.m91788r(false);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new oye(i, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0194  */
    /* JADX WARN: Code duplicated, block: B:50:0x0198  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ef  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v1, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v4, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r24v1, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX INFO: renamed from: d */
    public static final void m45742d(boolean z, boolean z2, gh00 gh00Var, eh00 eh00Var, xq00 xq00Var, int i) {
        ?? r11;
        ia7 ia7Var;
        int i2;
        ?? r9;
        cxh0 cxh0Var;
        boolean z3;
        ?? r12;
        ia7 ia7Var2;
        Object objM91750T;
        ia7 ia7Var3 = t6x0.f217647t;
        xq00Var.m91775k0(-558395960);
        ug5 ug5Var = xq00Var.f264811a;
        int i3 = i | (xq00Var.m91768h(z) ? 4 : 2) | (xq00Var.m91768h(z2) ? 32 : 16) | (xq00Var.m91770i(gh00Var) ? 256 : 128) | (xq00Var.m91770i(eh00Var) ? 2048 : 1024);
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var2), leu.m58816b(xq00Var).f117233e.f137887c, 0.0f, 2);
            WeakHashMap weakHashMap = cxd1.f42984x;
            fxh0 fxh0VarM19r = AbstractC0000a.m19r(bxd1.m30815d(xq00Var).f42991g, 32, fxh0VarM96830A);
            ub9 ub9Var = d7f0.f46145P0;
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, ub9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM19r);
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
            if (z) {
                xq00Var.m91771i0(-1821064162);
                ahf1.m25932d(k0e1.m54977L(R.string.chapter_playback_confirmation_replay_title, xq00Var), zsf1.m96830A(cxh0Var2, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 1), leu.m58818d(xq00Var).f64969e, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2024);
                tix0 tix0Var = new tix0(1);
                boolean z4 = ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i3 & 896) == 256);
                Object objM91750T2 = xq00Var.m91750T();
                if (z4) {
                    ia7Var2 = ia7Var3;
                } else {
                    ia7Var2 = ia7Var3;
                    if (objM91750T2 == ia7Var2) {
                    }
                    fxh0 fxh0VarM96830A2 = zsf1.m96830A(bzf1.m31026r(cxh0Var2, z2, false, tix0Var, (eh00) objM91750T2, 10), 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 1);
                    irx0 irx0VarM36744a = drx0.m36744a(bj5.m29371h(leu.m58816b(xq00Var).f117230b.f224763f, ub9Var), d7f0.f46142M0, xq00Var, 0);
                    int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                    wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                    fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96830A2);
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(c2087le);
                    } else {
                        xq00Var.m91799w0();
                    }
                    zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var);
                    zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
                    AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
                    zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
                    if (1.0f <= 0.0d) {
                        kt40.m57301a("invalid weight; must be greater than zero");
                    }
                    ahf1.m25932d(k0e1.m54977L(R.string.chapter_playback_confirmation_mark_later_unplayed, xq00Var), new cr70(1.0f, false), leu.m58818d(xq00Var).f64971g, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
                    objM91750T = xq00Var.m91750T();
                    if (objM91750T == ia7Var2) {
                        objM91750T = gkw0.f80931X;
                        xq00Var.m91793t0(objM91750T);
                    }
                    ia7Var = ia7Var2;
                    phu.m70050b(z2, gh00Var, zoz0.m96643a(cxh0Var2, (gh00) objM91750T), null, 0, null, null, xq00Var, (i3 >> 3) & 126, 120);
                    xq00 xq00Var2 = xq00Var;
                    xq00Var2.m91788r(true);
                    xq00Var2.m91788r(false);
                    z3 = false;
                    r9 = 1;
                    cxh0Var = cxh0Var2;
                    i2 = i3;
                    r12 = xq00Var2;
                }
                objM91750T2 = new r20(gh00Var, z2, 27);
                xq00Var.m91793t0(objM91750T2);
                fxh0 fxh0VarM96830A3 = zsf1.m96830A(bzf1.m31026r(cxh0Var2, z2, false, tix0Var, (eh00) objM91750T2, 10), 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 1);
                irx0 irx0VarM36744a2 = drx0.m36744a(bj5.m29371h(leu.m58816b(xq00Var).f117230b.f224763f, ub9Var), d7f0.f46142M0, xq00Var, 0);
                int iHashCode3 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, fxh0VarM96830A3);
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(irx0VarM36744a2, yhhVar, xq00Var);
                zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var);
                AbstractC0000a.m20s(iHashCode3, xq00Var, yhhVar3, xq00Var, vlhVar);
                zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var);
                if (1.0f <= 0.0d) {
                    kt40.m57301a("invalid weight; must be greater than zero");
                }
                ahf1.m25932d(k0e1.m54977L(R.string.chapter_playback_confirmation_mark_later_unplayed, xq00Var), new cr70(1.0f, false), leu.m58818d(xq00Var).f64971g, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
                objM91750T = xq00Var.m91750T();
                if (objM91750T == ia7Var2) {
                    objM91750T = gkw0.f80931X;
                    xq00Var.m91793t0(objM91750T);
                }
                ia7Var = ia7Var2;
                phu.m70050b(z2, gh00Var, zoz0.m96643a(cxh0Var2, (gh00) objM91750T), null, 0, null, null, xq00Var, (i3 >> 3) & 126, 120);
                xq00 xq00Var3 = xq00Var;
                xq00Var3.m91788r(true);
                xq00Var3.m91788r(false);
                z3 = false;
                r9 = 1;
                cxh0Var = cxh0Var2;
                i2 = i3;
                r12 = xq00Var3;
            } else {
                ia7Var = ia7Var3;
                i2 = i3;
                xq00 xq00Var4 = xq00Var;
                r9 = 1;
                xq00Var4.m91771i0(-1819884953);
                fxh0 fxh0VarM96830A4 = zsf1.m96830A(cxh0Var2, 0.0f, leu.m58816b(xq00Var4).f117230b.f224763f, 1);
                aaf aafVarM87496a2 = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var4).f117230b.f224761d), ub9Var, xq00Var4, 0);
                cxh0Var = cxh0Var2;
                int iHashCode4 = Long.hashCode(xq00Var4.f264809T);
                wpn0 wpn0VarM91778m4 = xq00Var4.m91778m();
                fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var4, fxh0VarM96830A4);
                xq00Var4.m91779m0();
                if (xq00Var4.f264808S) {
                    xq00Var4.m91776l(c2087le);
                } else {
                    xq00Var4.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var4);
                zsf1.m96835F(wpn0VarM91778m4, yhhVar2, xq00Var4);
                AbstractC0000a.m20s(iHashCode4, xq00Var4, yhhVar3, xq00Var4, vlhVar);
                zsf1.m96835F(fxh0VarM48286s4, yhhVar4, xq00Var4);
                ahf1.m25932d(k0e1.m54977L(R.string.chapter_playback_confirmation_replay_title, xq00Var4), null, leu.m58818d(xq00Var4).f64969e, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var4, 0, 0, 2026);
                ahf1.m25932d(k0e1.m54977L(R.string.chapter_playback_confirmation_replay_message, xq00Var4), null, leu.m58818d(xq00Var4).f64971g, leu.m58815a(xq00Var4).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var4, 0, 0, 2018);
                xq00Var4.m91788r(true);
                z3 = false;
                xq00Var4.m91788r(false);
                r12 = xq00Var4;
            }
            fxh0 fxh0VarM96830A5 = zsf1.m96830A(cxh0Var, 0.0f, leu.m58816b(r12).f117230b.f224761d, r9);
            tgu tguVar = new tgu(4);
            ?? r10 = z3;
            if ((i2 & 7168) == 2048) {
                r10 = r9;
            }
            Object objM91750T3 = r12.m91750T();
            if (r10 != 0 || objM91750T3 == ia7Var) {
                objM91750T3 = new rzt0(10, eh00Var);
                r12.m91793t0(objM91750T3);
            }
            dyu.m37371c(new peu(u40.f226523c, (eh00) objM91750T3), tguVar, fxh0VarM96830A5, null, null, null, null, null, a5h.f12518a, null, a5h.f12519b, r12, 805306368, 48, 1528);
            r12.m91788r(r9);
            r11 = r12;
        } else {
            xq00 xq00Var5 = xq00Var;
            xq00Var5.m91757b0();
            r11 = xq00Var5;
        }
        pgv0 pgv0VarM91796v = r11.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new k90(z, z2, gh00Var, eh00Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m45743e(qbu qbuVar, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-84514155);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91766g(qbuVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var) ? 32 : 16;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0.f43038a);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27616g, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM61822f);
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
            cr70 cr70Var = new cr70(1.0f, true);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, cr70Var);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            ahf1.m25932d(qbuVar.f187168a, null, leu.m58818d(xq00Var2).f64969e, 0L, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2042);
            ahf1.m25932d(qbuVar.f187169b, null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
            xq00Var.m91788r(true);
            String str = qbuVar.f187170c;
            if (wl51.m88460J0(str)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            dyu.m37371c(new peu(new t40(str), eh00Var), ugu.f230259c, null, null, vvx.m86517r(xq00Var), null, null, null, null, null, rkk.m75772x(-2029224584, new yyq(qbuVar, 29), xq00Var), xq00Var, 0, 48, 2012);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new sbu(qbuVar, eh00Var, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:105:0x011d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0122  */
    /* JADX WARN: Code duplicated, block: B:108:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0135  */
    /* JADX WARN: Code duplicated, block: B:113:0x0145  */
    /* JADX WARN: Code duplicated, block: B:116:0x0153  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007c A[PHI: r13
      0x007c: PHI (r13v9 int) = (r13v0 int), (r13v5 int), (r13v6 int) binds: [B:45:0x007a, B:55:0x0092, B:54:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:99:0x0101  */
    /* JADX INFO: renamed from: f */
    public static final void m45744f(phx0 phx0Var, boolean z, iw3 iw3Var, fxh0 fxh0Var, int i, int i2, hhx0 hhx0Var, xq00 xq00Var, int i3, int i4) {
        int i5;
        fxh0 fxh0Var2;
        int i6;
        int i7;
        int iM38547C;
        int i8;
        int i9;
        int i10;
        hhx0 hhx0Var2;
        int i11;
        boolean z2;
        int i12;
        int i13;
        fxh0 fxh0Var3;
        hhx0 hhx0Var3;
        pgv0 pgv0VarM91796v;
        int i14;
        int i15;
        Object obj;
        boolean zM91766g;
        xq00Var.m91775k0(-844987937);
        if ((i3 & 6) == 0) {
            i5 = (xq00Var.m91770i(phx0Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= xq00Var.m91768h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= xq00Var.m91766g(iw3Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= xq00Var.m91770i(ihx0.f102378a) ? 2048 : 1024;
        }
        int i16 = i4 & 16;
        if (i16 == 0) {
            if ((i3 & 24576) == 0) {
                fxh0Var2 = fxh0Var;
                i5 |= xq00Var.m91766g(fxh0Var2) ? 16384 : 8192;
            }
            i6 = i4 & 32;
            i7 = 196608;
            if (i6 == 0) {
                i5 |= i7;
            } else if ((196608 & i3) == 0) {
                if (i == 0) {
                    iM38547C = -1;
                } else {
                    iM38547C = edb.m38547C(i);
                }
                if (xq00Var.m91762e(iM38547C)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i5 |= i7;
            }
            i8 = i4 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
            } else if ((1572864 & i3) == 0) {
                if (xq00Var.m91762e(i2 != 0 ? edb.m38547C(i2) : -1)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
            i10 = i4 & 128;
            if (i10 != 0) {
                if ((12582912 & i3) == 0) {
                    hhx0Var2 = hhx0Var;
                    if (xq00Var.m91766g(hhx0Var2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
                if ((4793491 & i5) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (xq00Var.m91752Y(i5 & 1, z2)) {
                    if (i16 != 0) {
                        fxh0Var2 = cxh0.f43038a;
                    }
                    if (i6 != 0) {
                        i14 = 4;
                    } else {
                        i14 = i;
                    }
                    if (i8 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i2;
                    }
                    obj = null;
                    if (i10 != 0) {
                        hhx0Var2 = null;
                    }
                    if (phx0Var instanceof ohx0) {
                        xq00Var.m91771i0(-231891522);
                        zM91766g = xq00Var.m91766g(((ohx0) phx0Var).f165561a);
                        Object objM91750T = xq00Var.m91750T();
                        if (!zM91766g || objM91750T == t6x0.f217647t) {
                            xq00Var.m91793t0(null);
                        } else {
                            obj = objM91750T;
                        }
                        if (obj == null) {
                            throw new ClassCastException();
                        }
                        xq00Var.m91771i0(-231785038);
                        xq00Var.m91788r(false);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(-231288479);
                        xq00Var.m91788r(false);
                    }
                    i12 = i14;
                    i13 = i15;
                } else {
                    xq00Var.m91757b0();
                    i12 = i;
                    i13 = i2;
                }
                fxh0Var3 = fxh0Var2;
                hhx0Var3 = hhx0Var2;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new jbe1(phx0Var, z, iw3Var, fxh0Var3, i12, i13, hhx0Var3, i3, i4);
                }
            }
            i5 |= 12582912;
            hhx0Var2 = hhx0Var;
            if ((4793491 & i5) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (xq00Var.m91752Y(i5 & 1, z2)) {
                if (i16 != 0) {
                    fxh0Var2 = cxh0.f43038a;
                }
                if (i6 != 0) {
                    i14 = 4;
                } else {
                    i14 = i;
                }
                if (i8 != 0) {
                    i15 = 2;
                } else {
                    i15 = i2;
                }
                obj = null;
                if (i10 != 0) {
                    hhx0Var2 = null;
                }
                if (phx0Var instanceof ohx0) {
                    xq00Var.m91771i0(-231891522);
                    zM91766g = xq00Var.m91766g(((ohx0) phx0Var).f165561a);
                    Object objM91750T2 = xq00Var.m91750T();
                    if (zM91766g) {
                        xq00Var.m91793t0(null);
                    } else {
                        xq00Var.m91793t0(null);
                    }
                    if (obj == null) {
                        throw new ClassCastException();
                    }
                    xq00Var.m91771i0(-231785038);
                    xq00Var.m91788r(false);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-231288479);
                    xq00Var.m91788r(false);
                }
                i12 = i14;
                i13 = i15;
            } else {
                xq00Var.m91757b0();
                i12 = i;
                i13 = i2;
            }
            fxh0Var3 = fxh0Var2;
            hhx0Var3 = hhx0Var2;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new jbe1(phx0Var, z, iw3Var, fxh0Var3, i12, i13, hhx0Var3, i3, i4);
            }
        }
        i5 |= 24576;
        fxh0Var2 = fxh0Var;
        i6 = i4 & 32;
        i7 = 196608;
        if (i6 == 0) {
            i5 |= i7;
        } else if ((196608 & i3) == 0) {
            if (i == 0) {
                iM38547C = -1;
            } else {
                iM38547C = edb.m38547C(i);
            }
            if (xq00Var.m91762e(iM38547C)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i5 |= i7;
        }
        i8 = i4 & 64;
        if (i8 != 0) {
            i5 |= 1572864;
        } else if ((1572864 & i3) == 0) {
            if (xq00Var.m91762e(i2 != 0 ? edb.m38547C(i2) : -1)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i5 |= i9;
        }
        i10 = i4 & 128;
        if (i10 != 0) {
            if ((12582912 & i3) == 0) {
                hhx0Var2 = hhx0Var;
                if (xq00Var.m91766g(hhx0Var2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i5 |= i11;
            }
            if ((4793491 & i5) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (xq00Var.m91752Y(i5 & 1, z2)) {
                if (i16 != 0) {
                    fxh0Var2 = cxh0.f43038a;
                }
                if (i6 != 0) {
                    i14 = 4;
                } else {
                    i14 = i;
                }
                if (i8 != 0) {
                    i15 = 2;
                } else {
                    i15 = i2;
                }
                obj = null;
                if (i10 != 0) {
                    hhx0Var2 = null;
                }
                if (phx0Var instanceof ohx0) {
                    xq00Var.m91771i0(-231891522);
                    zM91766g = xq00Var.m91766g(((ohx0) phx0Var).f165561a);
                    Object objM91750T3 = xq00Var.m91750T();
                    if (zM91766g) {
                        xq00Var.m91793t0(null);
                    } else {
                        xq00Var.m91793t0(null);
                    }
                    if (obj == null) {
                        throw new ClassCastException();
                    }
                    xq00Var.m91771i0(-231785038);
                    xq00Var.m91788r(false);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-231288479);
                    xq00Var.m91788r(false);
                }
                i12 = i14;
                i13 = i15;
            } else {
                xq00Var.m91757b0();
                i12 = i;
                i13 = i2;
            }
            fxh0Var3 = fxh0Var2;
            hhx0Var3 = hhx0Var2;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new jbe1(phx0Var, z, iw3Var, fxh0Var3, i12, i13, hhx0Var3, i3, i4);
            }
        }
        i5 |= 12582912;
        hhx0Var2 = hhx0Var;
        if ((4793491 & i5) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq00Var.m91752Y(i5 & 1, z2)) {
            if (i16 != 0) {
                fxh0Var2 = cxh0.f43038a;
            }
            if (i6 != 0) {
                i14 = 4;
            } else {
                i14 = i;
            }
            if (i8 != 0) {
                i15 = 2;
            } else {
                i15 = i2;
            }
            obj = null;
            if (i10 != 0) {
                hhx0Var2 = null;
            }
            if (phx0Var instanceof ohx0) {
                xq00Var.m91771i0(-231891522);
                zM91766g = xq00Var.m91766g(((ohx0) phx0Var).f165561a);
                Object objM91750T4 = xq00Var.m91750T();
                if (zM91766g) {
                    xq00Var.m91793t0(null);
                } else {
                    xq00Var.m91793t0(null);
                }
                if (obj == null) {
                    throw new ClassCastException();
                }
                xq00Var.m91771i0(-231785038);
                xq00Var.m91788r(false);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-231288479);
                xq00Var.m91788r(false);
            }
            i12 = i14;
            i13 = i15;
        } else {
            xq00Var.m91757b0();
            i12 = i;
            i13 = i2;
        }
        fxh0Var3 = fxh0Var2;
        hhx0Var3 = hhx0Var2;
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jbe1(phx0Var, z, iw3Var, fxh0Var3, i12, i13, hhx0Var3, i3, i4);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final lho m45745g(lho lhoVar) {
        return lhoVar instanceof wo3 ? lhoVar : new wo3(lhoVar);
    }

    /* JADX INFO: renamed from: h */
    public static void m45746h(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            lzj.m60382r(canvas, z);
            return;
        }
        if (!f84460d) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f84458b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f84459c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f84458b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f84459c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f84458b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f84459c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f84460d = true;
        }
        if (z) {
            try {
                Method method4 = f84458b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = f84459c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b A[EDGE_INSN: B:45:0x008b->B:41:0x008b BREAK  A[LOOP:0: B:11:0x0013->B:49:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x006c A[SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final List m45747i(pyq0 pyq0Var, int i, int i2) {
        TreeMap treeMap;
        pqm0 pqm0Var;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        LinkedHashMap linkedHashMap = pyq0Var.f183457a;
        if (i == i2) {
            return lau.f131415a;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (!z2) {
                if (i <= i2) {
                    return arrayList;
                }
                if (z2) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        pqm0Var = null;
                    } else {
                        pqm0Var = new pqm0(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        pqm0Var = null;
                    } else {
                        pqm0Var = new pqm0(treeMap, treeMap.keySet());
                    }
                }
                if (pqm0Var == null) {
                    Map map = (Map) pqm0Var.f180350a;
                    it = ((Iterable) pqm0Var.f180351b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i + 1 <= iIntValue) {
                                continue;
                            }
                        } else if (i2 <= iIntValue) {
                            continue;
                        }
                    }
                } else {
                    break;
                    break;
                }
            } else {
                if (i >= i2) {
                    return arrayList;
                }
                if (z2) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        pqm0Var = null;
                    } else {
                        pqm0Var = new pqm0(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        pqm0Var = null;
                    } else {
                        pqm0Var = new pqm0(treeMap, treeMap.keySet());
                    }
                }
                if (pqm0Var == null) {
                    Map map2 = (Map) pqm0Var.f180350a;
                    it = ((Iterable) pqm0Var.f180351b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i2 <= iIntValue && iIntValue < i) {
                                Object obj = map2.get(Integer.valueOf(iIntValue));
                                wj50.m88279p(obj);
                                arrayList.add(obj);
                                z = true;
                                i = iIntValue;
                                break;
                                break;
                            }
                        } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                            Object obj2 = map2.get(Integer.valueOf(iIntValue));
                            wj50.m88279p(obj2);
                            arrayList.add(obj2);
                            z = true;
                            i = iIntValue;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        } while (z);
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final kbp0 m45748j(z3p0 z3p0Var, Long l) {
        long j = z3p0Var.f278992b;
        yzo0 yzo0Var = z3p0Var.f278991a;
        String str = (String) yzo0Var.f277859a.f128768d.get("playback_id");
        Long l2 = z3p0Var.f278993c;
        Long l3 = z3p0Var.f278994d;
        boolean z = z3p0Var.f278995e;
        return new kbp0(j, str, l2, l3, z, (z || z3p0Var.f278997g) ? 0.0f : z3p0Var.f278996f, z3p0Var.f278997g, z3p0Var.f278998h, z3p0Var.f278999i, null, z3p0Var.f279000j, z3p0Var.f279001k.f242150a, "betamax", yzo0Var.f277862d, z3p0Var.f279002l == 3 && !z3p0Var.f279003m, z3p0Var.f279004n, l);
    }

    /* JADX INFO: renamed from: k */
    public static final bx50 m45749k(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bx50 bx50Var = (bx50) it.next();
            if (bx50Var.f31789d) {
                return bx50Var;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: l */
    public static final tx50 m45750l(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tx50 tx50Var = (tx50) it.next();
            if (tx50Var.f224569e) {
                return tx50Var;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: m */
    public static qf40 m45751m(qf40 qf40Var) {
        syg1 syg1Var;
        ArrayList arrayList = new ArrayList(i6f.m49804T(qf40Var, 10));
        Iterator<E> it = qf40Var.iterator();
        while (it.hasNext()) {
            ce81 ce81Var = (ce81) it.next();
            String str = ce81Var.f37041g;
            int i = ce81Var.f37034H;
            boolean z = ce81Var.f37056v;
            boolean z2 = ce81Var.f37055u;
            boolean z3 = i != 3 && z;
            boolean zM29067J = bga.m29067J(i, z2, z2);
            if (z3) {
                syg1Var = oej.f164450e;
            } else {
                syg1Var = zM29067J ? pej.f176763e : qej.f187949e;
            }
            Uri uri = null;
            if (!(syg1Var instanceof qej)) {
                str = null;
            }
            if (str != null) {
                uri = Uri.parse(str);
            }
            arrayList.add(uri);
        }
        return opo.m67574x(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public static final t050 m45752n(z8k z8kVar, gjk0 gjk0Var, ajk0 ajk0Var) {
        return ((b9k) z8kVar).m28489g("RemoteConfigAuthFetchTriggerDaemon", new ckk0(1, gjk0Var, ajk0Var));
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m45753o(dlo dloVar, int i, int i2) {
        if (i > i2 && dloVar.f50279l) {
            return false;
        }
        Set set = dloVar.f50280m;
        return dloVar.f50278k && (set == null || !set.contains(Integer.valueOf(i)));
    }
}
