package p204p;

import android.content.Context;
import android.net.Uri;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mvf1 {

    /* JADX INFO: renamed from: a */
    public static final km4 f147576a = new km4(1000);

    /* JADX INFO: renamed from: b */
    public static final km4 f147577b;

    /* JADX INFO: renamed from: c */
    public static final km4 f147578c;

    /* JADX INFO: renamed from: d */
    public static sd40 f147579d;

    /* JADX INFO: renamed from: e */
    public static sd40 f147580e;

    static {
        new km4(1007);
        f147577b = new km4(1008);
        f147578c = new km4(1002);
    }

    /* JADX INFO: renamed from: b */
    public static final void m62921b(sh7 sh7Var, vub0 vub0Var, boolean z, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(2031940096);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91762e(sh7Var == null ? -1 : sh7Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(vub0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zM91770i = ((i3 & 896) == 256) | ((i3 & 14) == 4) | xq00Var.m91770i(vub0Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new izk(sh7Var, vub0Var, z, (fbk) null);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49237i(sh7Var, (th00) objM91750T, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61820d(1.0f, cxh0Var), n6f.f150862b, kxf1.f127485a);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM64246i);
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
            if (sh7Var == sh7.f209135t) {
                xq00Var.m91771i0(114355487);
                p271.m68899b(null, 4, 0L, 0L, xq00Var, 48, 13);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(114425640);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new v20(sh7Var, vub0Var, z, fxh0Var2, i, 29);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m62922c(azh0 azh0Var, qro0 qro0Var, int i, th00 th00Var, th00 th00Var2, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        int i3;
        xq00 xq00Var2;
        xq00Var.m91775k0(-1680318471);
        if ((i2 & 6) == 0) {
            i3 = (xq00Var.m91766g(azh0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var.m91770i(qro0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= xq00Var.m91762e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= xq00Var.m91770i(th00Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= xq00Var.m91770i(th00Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= xq00Var.m91770i(fxh0Var) ? 131072 : 65536;
        }
        if (!xq00Var.m91752Y(i3 & 1, (74899 & i3) != 74898)) {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        } else {
            if (!(azh0Var instanceof zyh0)) {
                if (!(azh0Var instanceof yyh0)) {
                    throw lq51.m59703i(121665267, xq00Var, false);
                }
                xq00Var.m91771i0(-520168036);
                xq00Var.m91788r(false);
                throw new IllegalStateException("Unable to render MoreLikePlaylistEntity in a List yet.");
            }
            xq00Var.m91771i0(-523268036);
            kyu kyuVar = new kyu(null, 5, null, new ybs(88), 10);
            String strM54977L = k0e1.m54977L(R.string.user_stats_track_click_action_hint_accessibility_label, xq00Var);
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new tyh0(th00Var, azh0Var, i, 2);
                xq00Var.m91793t0(objM91750T);
            }
            p711.m69222a(fxh0Var, kyuVar, null, false, null, null, new peu(new t40(strM54977L), (eh00) objM91750T), null, null, rkk.m75772x(1874192410, new fzh0(azh0Var, 0), xq00Var), null, rkk.m75772x(478782265, new fzh0(azh0Var, 1), xq00Var), rkk.m75772x(1773201112, new it6(th00Var2, azh0Var, i, 5), xq00Var), null, null, rkk.m75772x(1361490357, new f6c0(17, qro0Var, azh0Var), xq00Var), xq00Var, ((i3 >> 15) & 14) | 805306432, 197040, 26044);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ni1(azh0Var, qro0Var, i, th00Var, th00Var2, fxh0Var, i2, 18);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m62923d(czh0 czh0Var, th00 th00Var, th00 th00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        czh0 czh0Var2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-147726124);
        int i2 = i | (xq00Var.m91770i(czh0Var) ? 4 : 2) | (xq00Var.m91770i(th00Var) ? 32 : 16) | (xq00Var.m91770i(th00Var2) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            bzh0 bzh0Var = czh0Var.f43566b;
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("more-like-list", mi21.m61822f(1.0f, zsf1.m96830A(cxh0Var, 0.0f, f, 1)));
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
            ahf1.m25932d(bzh0Var.f32498a, zsf1.m96830A(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 2), leu.m58818d(xq00Var).f64969e, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224759b, cxh0Var));
            xq00Var.m91771i0(-886644480);
            int i3 = 0;
            for (Object obj : bzh0Var.f32499b) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                azh0 azh0Var = (azh0) obj;
                qro0 qro0Var = czh0Var.f43565a;
                boolean zM91762e = xq00Var.m91762e(i3);
                Object objM91750T = xq00Var.m91750T();
                if (zM91762e || objM91750T == t6x0.f217647t) {
                    objM91750T = new r430(i3, 16);
                    xq00Var.m91793t0(objM91750T);
                }
                m62922c(azh0Var, qro0Var, i3, th00Var, th00Var2, zoz0.m96644b(cxh0Var, false, (gh00) objM91750T), xq00Var, (i2 << 6) & 64512);
                i3 = i4;
            }
            czh0Var2 = czh0Var;
            xq00Var.m91788r(false);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            czh0Var2 = czh0Var;
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new iha0(czh0Var2, th00Var, th00Var2, fxh0Var2, i, 19);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m62924f(String str, dfo dfoVar, as5 as5Var, boolean z, eh00 eh00Var, boolean z2, xq00 xq00Var, int i) {
        boolean z3;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(1725898206);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i | (xq00Var.m91770i(dfoVar) ? 32 : 16) | (xq00Var.m91766g(as5Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91768h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 16384 : 8192;
        }
        int i3 = 196608 & i;
        cxh0 cxh0Var = cxh0.f43038a;
        if (i3 == 0) {
            i2 |= xq00Var.m91770i(cxh0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var.m91768h(z2) ? 1048576 : 524288;
        }
        int i4 = i2;
        if (xq00Var.m91752Y(i4 & 1, (599187 & i4) != 599186)) {
            boolean z4 = (i4 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z4 || objM91750T == obj) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            if (((Boolean) kqi0Var.getValue()).booleanValue()) {
                xq00Var.m91771i0(1180322719);
                k3u0.m55304h(null, xq00Var, 0);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1180386114);
                irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
                int iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m = xq00Var.m91778m();
                fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var);
                soh.f211194A.getClass();
                eh00 eh00Var2 = roh.f201257b;
                if (xq00Var.f264811a == null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00Var2);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                zsf1.m96833D(roh.f201266k, xq00Var);
                zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                if (z) {
                    xq00Var.m91771i0(-475587206);
                    m62925g(as5Var, str, xq00Var, ((i4 >> 6) & 14) | ((i4 << 3) & ContentType.LONG_FORM_ON_DEMAND));
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-475523780);
                    xq00Var.m91788r(false);
                }
                boolean zM91770i = xq00Var.m91770i(kqi0Var) | ((57344 & i4) == 16384);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91770i || objM91750T2 == obj) {
                    objM91750T2 = new puj0(eh00Var, kqi0Var, 14);
                    xq00Var.m91793t0(objM91750T2);
                }
                mif1.m61869b(dfoVar, new t251(str, z2, (eh00) objM91750T2, true), mi21.m61838v(220, cxh0Var), null, xq00Var, (i4 >> 3) & 14, 8);
                if (z) {
                    z3 = false;
                    xq00Var.m91771i0(-475008932);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-475072358);
                    m62925g(as5Var, str, xq00Var, ((i4 >> 6) & 14) | ((i4 << 3) & ContentType.LONG_FORM_ON_DEMAND));
                    z3 = false;
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(true);
                xq00Var.m91788r(z3);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ur8(str, dfoVar, as5Var, z, eh00Var, z2, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m62925g(as5 as5Var, String str, xq00 xq00Var, int i) {
        int i2;
        as5 as5Var2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-792871769);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(as5Var) : xq00Var.m91770i(as5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            as5Var2 = as5Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        } else if (as5Var == null) {
            xq00Var.m91771i0(1877372422);
            xq00Var.m91788r(false);
            as5Var2 = as5Var;
            xq00Var2 = xq00Var;
        } else {
            xq00Var.m91771i0(1877372423);
            as5Var2 = as5Var;
            xq00Var2 = xq00Var;
            mif1.m61869b(as5Var2, new i351(str), null, null, xq00Var2, 0, 12);
            xq00Var2.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yz11(as5Var2, str, i, 11);
        }
    }

    /* JADX INFO: renamed from: h */
    public static hol0 m62926h(nfw nfwVar, pfw pfwVar, dcm0 dcm0Var, w2a1 w2a1Var) {
        nfwVar.getClass();
        dcm0Var.getClass();
        w2a1Var.getClass();
        return new hol0(nfwVar, pfwVar);
    }

    /* JADX INFO: renamed from: l */
    public static final String m62927l(nbl0 nbl0Var, Context context) {
        if (nbl0Var instanceof lbl0) {
            return ((lbl0) nbl0Var).f131682a.f271522c;
        }
        if (nbl0Var instanceof jbl0) {
            return ((jbl0) nbl0Var).f110828b;
        }
        if (nbl0Var instanceof kbl0) {
            return context.getString(((kbl0) nbl0Var).f121227b);
        }
        if (nbl0Var instanceof ibl0) {
            return context.getString(((ibl0) nbl0Var).f100605b);
        }
        if (nbl0Var instanceof mbl0) {
            return context.getString(((mbl0) nbl0Var).f141944b);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: m */
    public static final qho m62928m(List list, Map map, boolean z) {
        pjo ojoVar;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        ArrayList arrayList2 = null;
        while (it.hasNext()) {
            kho khoVar = (kho) it.next();
            k35 k35Var = khoVar.f122694a;
            gh00 gh00Var = khoVar.f122698e;
            int i = khoVar.f122695b;
            qu60 qu60Var = khoVar.f122696c;
            iag1 hhoVar = khoVar.f122699f;
            if (hhoVar == null) {
                if (qu60Var == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List list2 = qu60Var.f192575a;
                tn61 tn61Var = khoVar.f122697d;
                if (tn61Var == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (k35Var.m55230a()) {
                    hhoVar = new jho(new k35(tn61Var, r101.f194657X0));
                } else {
                    Object objInvoke = k35Var.f118763b;
                    if (!list2.isEmpty()) {
                        int size = list2.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                ojoVar = new ojo(objInvoke);
                                break;
                            }
                            pjo pjoVar = (pjo) map.get(new k35(((pu60) list2.get(i2)).f181374b, objInvoke));
                            if (!(pjoVar instanceof ojo)) {
                                if (!(pjoVar instanceof mjo)) {
                                    ojoVar = null;
                                    break;
                                }
                                ojoVar = pjoVar;
                                break;
                            }
                            objInvoke = ((pu60) list2.get(i2)).m71066a().invoke(((ojo) pjoVar).f166104a);
                            if (objInvoke == null) {
                                ojoVar = new mjo(ijo.f102856a);
                                break;
                            }
                            i2++;
                        }
                    } else {
                        ojoVar = new ojo(objInvoke);
                    }
                    if (ojoVar instanceof ojo) {
                        hhoVar = new jho(new k35(tn61Var, ((ojo) ojoVar).f166104a));
                    } else {
                        hhoVar = ojoVar instanceof mjo ? new hho(k35Var, ((mjo) ojoVar).f144297a) : iho.f102329d;
                    }
                }
            }
            boolean z2 = hhoVar instanceof jho;
            qho nhoVar = pho.f177693a;
            if (z2) {
                k35 k35Var2 = ((jho) hhoVar).f112537d;
                pjo pjoVar2 = (pjo) map.get(k35Var2);
                int iM38547C = edb.m38547C(i);
                if (iM38547C == 0) {
                    if (!(pjoVar2 instanceof njo)) {
                        if (pjoVar2 instanceof ojo) {
                            Object obj = ((ojo) pjoVar2).f166104a;
                            if (((Boolean) gh00Var.invoke(obj)).booleanValue()) {
                                arrayList.add(obj);
                            } else {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(new hfo(k35Var2, obj));
                            }
                        } else if (pjoVar2 instanceof mjo) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(new gfo(k35Var2, ((mjo) pjoVar2).f144297a));
                        } else if (qu60Var == null) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(new ffo(k35Var2));
                        }
                    }
                    return nhoVar;
                }
                if (iM38547C != 1) {
                    if (iM38547C != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(pjoVar2 instanceof njo)) {
                        if (pjoVar2 instanceof ojo) {
                            Object obj2 = ((ojo) pjoVar2).f166104a;
                            nhoVar = ((Boolean) gh00Var.invoke(obj2)).booleanValue() ? new oho(obj2, null) : new nho(new hfo(k35Var2, obj2));
                        } else if (pjoVar2 instanceof mjo) {
                            nhoVar = new nho(new gfo(k35Var2, ((mjo) pjoVar2).f144297a));
                        } else if (k35Var2.m55230a() || qu60Var == null) {
                            nhoVar = new nho(new ffo(k35Var2));
                        }
                    }
                    arrayList.add(nhoVar);
                } else if (pjoVar2 instanceof ojo) {
                    Object obj3 = ((ojo) pjoVar2).f166104a;
                    if (((Boolean) gh00Var.invoke(obj3)).booleanValue()) {
                        arrayList.add(obj3);
                    } else if (z) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(new hfo(k35Var2, obj3));
                    } else {
                        arrayList.add(null);
                    }
                } else if (!(pjoVar2 instanceof mjo)) {
                    arrayList.add(null);
                } else if (z) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new gfo(k35Var2, ((mjo) pjoVar2).f144297a));
                } else {
                    arrayList.add(null);
                }
            } else if (hhoVar instanceof iho) {
                int iM38547C2 = edb.m38547C(i);
                if (iM38547C2 == 0) {
                    return nhoVar;
                }
                if (iM38547C2 == 1) {
                    arrayList.add(null);
                } else {
                    if (iM38547C2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(nhoVar);
                }
            } else {
                if (!(hhoVar instanceof hho)) {
                    throw new NoWhenBranchMatchedException();
                }
                int iM38547C3 = edb.m38547C(i);
                if (iM38547C3 == 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    hho hhoVar2 = (hho) hhoVar;
                    arrayList2.add(new gfo(hhoVar2.f91548d, hhoVar2.f91549e));
                } else if (iM38547C3 != 1) {
                    if (iM38547C3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hho hhoVar3 = (hho) hhoVar;
                    arrayList.add(new nho(new gfo(hhoVar3.f91548d, hhoVar3.f91549e)));
                } else if (z) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    hho hhoVar4 = (hho) hhoVar;
                    arrayList2.add(new gfo(hhoVar4.f91548d, hhoVar4.f91549e));
                } else {
                    arrayList.add(null);
                }
            }
        }
        if (arrayList2 != null) {
            return arrayList2.size() == 1 ? new nho((ifo) g6f.m43741q0(arrayList2)) : new nho(new efo(arrayList2));
        }
        return new oho(arrayList, null);
    }

    /* JADX INFO: renamed from: o */
    public static final Uri m62929o(Uri uri, Uri uri2) {
        int i = bm51.m29803n0(uri2.toString(), "spotify:artist:", false) ? 1 : 2;
        if (!wj50.m88271j(uri.getScheme(), "content")) {
            return uri;
        }
        String upperCase = ikc0.m50947s(i).toUpperCase(Locale.ROOT);
        Uri.Builder builderFragment = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).fragment(uri.getFragment());
        for (String str : uri.getQueryParameterNames()) {
            if (!wj50.m88271j(str, "transformation")) {
                Iterator<T> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderFragment.appendQueryParameter(str, (String) it.next());
                }
            }
        }
        builderFragment.appendQueryParameter("transformation", upperCase);
        return builderFragment.build();
    }

    /* JADX INFO: renamed from: p */
    public static final tdy0 m62930p(dqi0 dqi0Var) {
        return new tdy0(dqi0Var);
    }

    /* JADX INFO: renamed from: q */
    public static String m62931q(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM36615o;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strM36615o = "null";
            } else {
                try {
                    strM36615o = obj.toString();
                } catch (Exception e) {
                    String strM56834f = klh.m56834f(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM56834f), (Throwable) e);
                    strM36615o = dq60.m36615o("<", strM56834f, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strM36615o;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public abstract float mo43543j(h4r h4rVar);

    /* JADX INFO: renamed from: n */
    public abstract void mo43544n(h4r h4rVar, float f);
}
