package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zlg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f284009a;

    /* JADX INFO: renamed from: b */
    public static sd40 f284010b;

    /* JADX INFO: renamed from: a */
    public static final void m96365a(tqq tqqVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(746915395);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91766g(tqqVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
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
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            ahf1.m25932d(tqqVar.f222866a, mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var2).f64975k, leu.m58815a(xq00Var2).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2032);
            xq00Var2 = xq00Var;
            ahf1.m25932d(tqqVar.f222867b, mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2032);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qvj(tqqVar, fxh0Var2, i, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m96366b(qf40 qf40Var, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, xq00 xq00Var, int i) {
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-660342050);
        int i2 = i | (xq00Var2.m91766g(qf40Var) ? 4 : 2) | (xq00Var2.m91770i(eh00Var) ? 32 : 16) | (xq00Var2.m91770i(eh00Var2) ? 256 : 128) | (xq00Var2.m91770i(eh00Var3) ? 2048 : 1024);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strM54977L = k0e1.m54977L(R.string.chat_join_group_with_blocked_users_accept_action, xq00Var2);
            String strM54977L2 = k0e1.m54977L(R.string.chat_join_group_with_blocked_users_delete_action, xq00Var2);
            Object objM91750T = xq00Var2.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77645B(Boolean.TRUE);
                xq00Var2.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            boolean zM91770i = xq00Var2.m91770i(kqi0Var) | ((i2 & 7168) == 2048);
            Object objM91750T2 = xq00Var2.m91750T();
            if (zM91770i || objM91750T2 == ia7Var) {
                objM91750T2 = new C2369sa(eh00Var3, kqi0Var, 18);
                xq00Var2.m91793t0(objM91750T2);
            }
            eh00 eh00Var4 = (eh00) objM91750T2;
            if (((Boolean) kqi0Var.getValue()).booleanValue()) {
                xq00Var2.m91771i0(-1299251353);
                String strM54977L3 = k0e1.m54977L(R.string.chat_join_group_with_blocked_users_title, xq00Var2);
                String strM54971F = k0e1.m54971F(R.plurals.chat_join_group_with_blocked_users_subtitle, ((AbstractC2282q6) qf40Var).mo33075a(), new Object[]{g6f.m43753y0(qf40Var, ", ", null, null, null, 62)}, xq00Var2);
                if (wl51.m88460J0(strM54977L)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                gku gkuVar = new gku(strM54977L, new peu(new t40(strM54977L), eh00Var));
                if (wl51.m88460J0(strM54977L2)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                kku.m56741a(eh00Var4, null, null, strM54977L3, strM54971F, gkuVar, new gku(strM54977L2, new peu(new t40(strM54977L2), eh00Var2)), xq00Var2, 2359296, 6);
                xq00Var2 = xq00Var2;
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(-1298577692);
                xq00Var2.m91788r(false);
            }
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y5z(qf40Var, eh00Var, eh00Var2, eh00Var3, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m96367c(String str, ecu ecuVar, xq00 xq00Var, int i) {
        ecu ecuVar2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-1635323662);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            ecuVar2 = ecuVar;
            xq00Var2 = xq00Var;
            mif1.m61869b(ecuVar2, new ybu(k0e1.m54978M(R.string.add_blocked_content_no_results_title, new Object[]{str}, xq00Var), k0e1.m54977L(R.string.add_blocked_content_no_results_subtitle, xq00Var), 2), null, null, xq00Var2, 6, 12);
        } else {
            ecuVar2 = ecuVar;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new v3j0(str, ecuVar2, i, 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m96368d(ait0 ait0Var, fyf fyfVar, th00 th00Var, th00 th00Var2, th00 th00Var3, xq00 xq00Var, int i) {
        th00 th00Var4;
        th00 th00Var5;
        th00 th00Var6;
        th00 th00Var7;
        th00 th00Var8;
        xq00Var.m91775k0(526407310);
        int i2 = (xq00Var.m91770i(ait0Var) ? 4 : 2) | i | 9600;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                th00Var5 = o2h.f161050a;
                th00Var7 = th00Var5;
                th00Var8 = th00Var7;
            } else {
                xq00Var.m91757b0();
                th00Var7 = th00Var;
                th00Var5 = th00Var2;
                th00Var8 = th00Var3;
            }
            xq00Var.m91790s();
            qkg1.m73111h(ait0Var.f16092c, null, rkk.m75772x(-825885879, new j640(th00Var5, th00Var7, th00Var8, fyfVar, 19), xq00Var), xq00Var, 384);
            th00Var4 = th00Var7;
            th00Var6 = th00Var8;
        } else {
            xq00Var.m91757b0();
            th00Var4 = th00Var;
            th00Var5 = th00Var2;
            th00Var6 = th00Var3;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ics0(ait0Var, fyfVar, th00Var4, th00Var5, th00Var6, i, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m96369e(oha ohaVar, snb1 snb1Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-398615278);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(ohaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(snb1Var) : xq00Var.m91770i(snb1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = snb1Var instanceof qnb1;
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            boolean z2 = ((Boolean) kqi0Var.getValue()).booleanValue() || z;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zM91768h = xq00Var.m91768h(z) | xq00Var.m91770i(kqi0Var);
            Object objM91750T2 = xq00Var.m91750T();
            fbk fbkVar = null;
            if (zM91768h || objM91750T2 == obj) {
                objM91750T2 = new uvj(z, kqi0Var, fbkVar, 7);
                xq00Var.m91793t0(objM91750T2);
            }
            hz40.m49237i(boolValueOf, (th00) objM91750T2, xq00Var);
            Boolean bool = (Boolean) kqi0Var.getValue();
            bool.getClass();
            boolean zM91770i = xq00Var.m91770i(kqi0Var) | xq00Var.m91768h(z);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == obj) {
                objM91750T3 = new lpf(z, kqi0Var, fbkVar, 8);
                xq00Var.m91793t0(objM91750T3);
            }
            hz40.m49237i(bool, (th00) objM91750T3, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarMo66946b = ohaVar.mo66946b(cxh0Var);
            boolean zM91770i2 = xq00Var.m91770i(kqi0Var) | ((i2 & 896) == 256);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T4 == obj) {
                objM91750T4 = new o641(gh00Var, kqi0Var, 10);
                xq00Var.m91793t0(objM91750T4);
            }
            dha.m36004a(hdi.m47247x(fxh0VarMo66946b, false, null, null, null, (eh00) objM91750T4, 15), xq00Var, 0);
            z96.m95630j(z2, ohaVar.mo66946b(cxh0Var), kbv.m55958d(null, 3), kbv.m55959e(null, 3), null, rkk.m75772x(-765651142, new ukx(snb1Var, gh00Var, 2), xq00Var), xq00Var, 196608, 16);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new af91(ohaVar, snb1Var, gh00Var, i, 14);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m96370f(qf40 qf40Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-717469369);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(qf40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            if (qf40Var.contains(aaj.f13852d)) {
                i3 = 1;
            } else if (!qf40Var.contains(aaj.f13850b)) {
                i3 = 0;
            }
            if (i3 != 0) {
                xq00Var.m91771i0(1922439154);
                y0h1.m92565c(i3, 0, 0, xq00Var, zsf1.m96832C(cxh0.f43038a, 0.0f, 0.0f, leu.m58816b(xq00Var).f117230b.f224759b, 0.0f, 11));
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1922663067);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wr8(qf40Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m96371g(int i, xq00 xq00Var, boolean z) {
        int i2;
        xq00Var.m91775k0(1335882594);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            xq00Var.m91757b0();
        } else if (z) {
            xq00Var.m91771i0(111462777);
            mag1.m61299i(6, xq00Var, epv0.m39673I("standard_badges_video_badge", cxh0.f43038a), true);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(111561760);
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xr8(z, i, 0, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m96372h(ehf1 ehf1Var, xq00 xq00Var, int i) {
        int i2;
        boolean z;
        xq00Var.m91775k0(-2126502759);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(ehf1Var) : xq00Var.m91770i(ehf1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z2 = ehf1Var instanceof o2l0;
            if (z2) {
                z = true;
            } else {
                if (!(ehf1Var instanceof w2l0)) {
                    if (!(ehf1Var instanceof y2l0)) {
                        if (!(ehf1Var instanceof s2l0) && !(ehf1Var instanceof q2l0)) {
                            if (!(ehf1Var instanceof m2l0) && !(ehf1Var instanceof k2l0)) {
                                if (!(ehf1Var instanceof u2l0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                    }
                    z = true;
                }
                z = false;
            }
            if (z) {
                xq00Var.m91771i0(124038666);
                if (!z2) {
                    if ((ehf1Var instanceof w2l0) || (ehf1Var instanceof s2l0) || (ehf1Var instanceof y2l0) || (ehf1Var instanceof q2l0)) {
                        i3 = 1;
                    } else if (ehf1Var instanceof m2l0) {
                        i3 = 2;
                    } else if (ehf1Var instanceof k2l0) {
                        i3 = 3;
                    } else {
                        if (!(ehf1Var instanceof u2l0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = 1;
                    }
                }
                eug1.m40060a(i3, 0, xq00Var, zsf1.m96832C(cxh0.f43038a, 0.0f, 0.0f, leu.m58816b(xq00Var).f117230b.f224759b, 0.0f, 11));
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(124714249);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a60(ehf1Var, i, 15);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m96373i(int i, xq00 xq00Var, boolean z) {
        int i2;
        xq00Var.m91775k0(-447933177);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            xq00Var.m91757b0();
        } else if (z) {
            xq00Var.m91771i0(86170761);
            uuf1.m83987g(0, 0, xq00Var, zsf1.m96832C(cxh0.f43038a, 0.0f, 0.0f, leu.m58816b(xq00Var).f117230b.f224759b, 0.0f, 11));
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(86249563);
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xr8(z, i, 1, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [p.gsh] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p.we5] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v5, types: [p.wgv0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v6, types: [p.tf60] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [p.ib50] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX INFO: renamed from: j */
    public static final Object m96374j(hu71 hu71Var, Context context, we5 we5Var, du71 du71Var, ine1 ine1Var, ibk ibkVar) throws Throwable {
        e401 e401Var;
        ?? r3;
        du71 du71Var2;
        di41 di41Var;
        ib50 ib50Var;
        Context context2;
        wgv0 wgv0Var;
        we5 we5Var2;
        wgv0 wgv0Var2;
        ib50 ib50Var2;
        tf60 tf60Var;
        gsh gshVar;
        msh mshVar;
        msh mshVar2;
        wgv0 wgv0Var3;
        di41 di41Var2;
        wgv0 wgv0Var4;
        int i;
        hu71 hu71Var2 = hu71Var;
        ?? r4 = context;
        ?? r2 = we5Var;
        if (ibkVar instanceof e401) {
            e401Var = (e401) ibkVar;
            i = e401Var.f55924t;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i2 = i - Integer.MIN_VALUE;
                e401Var.f55924t = i2;
                r3 = i2;
            } else {
                e401Var = new e401(ibkVar);
                r3 = i;
            }
        } else {
            e401Var = new e401(ibkVar);
            r3 = i;
        }
        e401 e401Var2 = e401Var;
        Object obj = e401Var2.f55923i;
        ?? r1 = e401Var2.f55924t;
        int i3 = 2;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (r1 != 0) {
                try {
                    if (r1 == 1) {
                        msh mshVar3 = e401Var2.f55922h;
                        wgv0 wgv0Var5 = e401Var2.f55921g;
                        di41 di41Var3 = e401Var2.f55920f;
                        ib50 ib50Var3 = e401Var2.f55919e;
                        du71Var2 = (du71) e401Var2.f55918d;
                        we5 we5Var3 = (we5) e401Var2.f55917c;
                        Context context3 = (Context) e401Var2.f55916b;
                        hu71 hu71Var3 = (hu71) e401Var2.f55915a;
                        bga.m29073P(obj);
                        di41Var = di41Var3;
                        ib50Var = ib50Var3;
                        context2 = context3;
                        wgv0Var = wgv0Var5;
                        we5Var2 = we5Var3;
                        hu71Var2 = hu71Var3;
                        mshVar = mshVar3;
                    } else {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gsh gshVar2 = (gsh) e401Var2.f55918d;
                        wgv0Var2 = (wgv0) e401Var2.f55917c;
                        tf60 tf60Var2 = (tf60) e401Var2.f55916b;
                        ib50Var2 = (ib50) e401Var2.f55915a;
                        bga.m29073P(obj);
                        gshVar = gshVar2;
                        tf60Var = tf60Var2;
                    }
                    gshVar.dispose();
                    ib50Var2.m50122c();
                    tf60Var.mo26601e(null);
                    wgv0Var2.m88063B();
                    return w2a1.f247311a;
                } catch (Throwable th) {
                    th = th;
                    r1.dispose();
                    r4.m50122c();
                    r3.mo26601e(null);
                    r2.m88063B();
                    throw th;
                }
            }
            bga.m29073P(obj);
            ib50Var = new ib50(hu71Var2);
            di41 di41VarM89578u = x0h1.m89578u(hu71Var2, null, 0, new rqf(i3, 11, fbkVar), 3);
            xuk xukVar = hu71Var2.f95338a;
            r2.getClass();
            xew0 xew0Var = new xew0(50);
            zv41 zv41VarM52819d = jag1.m52819d(Boolean.FALSE);
            d401 d401Var = new d401(hu71Var2, r2, r4);
            ine1Var.getClass();
            uf60 uf60VarM73202g = qlg1.m73202g();
            tf60 tf60Var3 = (tf60) xukVar.mo31960M().mo26595B(gk40.f80712X0);
            if (tf60Var3 != null) {
                tf60Var3.mo26599N(new nnz0(uf60VarM73202g, 13));
            }
            wgv0 wgv0Var6 = new wgv0(xukVar.mo31960M().mo26608y(uf60VarM73202g).mo26608y(d401Var));
            msh mshVar4 = new msh(wgv0Var6, new tg5(xew0Var));
            try {
                di41 di41Var4 = di41VarM89578u;
                try {
                    mshVar2 = mshVar4;
                    wgv0Var4 = wgv0Var6;
                    try {
                        x0h1.m89578u(hu71Var2, ib50Var, 0, new vns0(8, mshVar4, we5Var, (Object) r4, wgv0Var6, hu71Var2, (fbk) null), 2);
                        context2 = context;
                        we5Var2 = we5Var;
                        x0h1.m89578u(hu71Var2, null, 0, new f401(wgv0Var4, we5Var2, zv41VarM52819d, context2, xew0Var, hu71Var2, du71Var, null), 3);
                        g401 g401Var = new g401(2, null);
                        e401Var2.f55915a = hu71Var2;
                        e401Var2.f55916b = context2;
                        e401Var2.f55917c = we5Var2;
                        e401Var2.f55918d = du71Var;
                        e401Var2.f55919e = ib50Var;
                        e401Var2.f55920f = di41Var4;
                        e401Var2.f55921g = wgv0Var4;
                        e401Var2.f55922h = mshVar2;
                        e401Var2.f55924t = 1;
                        if (vyf1.m86756u(zv41VarM52819d, g401Var, e401Var2) != yukVar) {
                            wgv0Var = wgv0Var4;
                            du71Var2 = du71Var;
                            mshVar = mshVar2;
                            di41Var = di41Var4;
                        }
                        return yukVar;
                    } catch (Throwable th2) {
                        th = th2;
                        wgv0Var3 = wgv0Var4;
                        di41Var2 = di41Var4;
                        r1 = mshVar2;
                        r2 = wgv0Var3;
                        r3 = di41Var2;
                        r4 = ib50Var;
                        r1.dispose();
                        r4.m50122c();
                        r3.mo26601e(null);
                        r2.m88063B();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    mshVar2 = mshVar4;
                    wgv0Var4 = wgv0Var6;
                }
            } catch (Throwable th4) {
                th = th4;
                mshVar2 = mshVar4;
                wgv0Var3 = wgv0Var6;
                di41Var2 = di41VarM89578u;
            }
            jkw0 jkw0Var = new jkw0(hu71Var2, du71Var2, ib50Var, 20);
            e401Var2.f55915a = ib50Var;
            e401Var2.f55916b = di41Var;
            e401Var2.f55917c = wgv0Var;
            e401Var2.f55918d = mshVar;
            e401Var2.f55919e = null;
            e401Var2.f55920f = null;
            e401Var2.f55921g = null;
            e401Var2.f55922h = null;
            e401Var2.f55924t = 2;
            if (we5Var2.m87861f(context2, jkw0Var, e401Var2) != yukVar) {
                wgv0Var2 = wgv0Var;
                tf60Var = di41Var;
                ib50Var2 = ib50Var;
                gshVar = mshVar;
                gshVar.dispose();
                ib50Var2.m50122c();
                tf60Var.mo26601e(null);
                wgv0Var2.m88063B();
                return w2a1.f247311a;
            }
            return yukVar;
        } catch (Throwable th5) {
            th = th5;
            r2 = wgv0Var;
            r3 = di41Var;
            r1 = mshVar;
            r4 = ib50Var;
            r1.dispose();
            r4.m50122c();
            r3.mo26601e(null);
            r2.m88063B();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final jo6 m96375k(gh00 gh00Var) {
        ywf ywfVar = new ywf();
        gh00Var.invoke(ywfVar);
        List list = ywfVar.f276955a;
        b4w b4wVar = ywfVar.f276960f;
        if (b4wVar == null) {
            b4wVar = null;
        }
        return new jo6(1, new e60(list, ywfVar.f276956b, ywfVar.f276957c, ywfVar.f276958d, ywfVar.f276959e), b4wVar);
    }

    /* JADX INFO: renamed from: l */
    public static final float m96376l(xom0 xom0Var) {
        i82 i82Var = xom0Var.f264315d;
        return ((uum0) i82Var.f99668d).m84031v() + ((vum0) i82Var.f99667c).m86437v();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m96377m(vw00 vw00Var) {
        return vw00Var.m86527a();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m96378n(w84 w84Var) {
        return w84Var.m87444f();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m96379o(w84 w84Var) {
        return w84Var.m87445g();
    }

    /* JADX INFO: renamed from: p */
    public static final lh61 m96380p(f0e1 f0e1Var, int i) {
        return new lh61(f0e1Var.f64629a, f0e1Var.f64630b, i);
    }
}
