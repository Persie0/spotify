package p204p;

import com.spotify.kidsview.p092v2.proto.AccountControls;
import com.spotify.kidsview.p092v2.proto.VideoControls;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.MissingFieldException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hpg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f93782a;

    /* JADX INFO: renamed from: b */
    public static sd40 f93783b;

    /* JADX INFO: renamed from: a */
    public static final void m48157a(boolean z, eh00 eh00Var, fxh0 fxh0Var, th00 th00Var, xq00 xq00Var, int i) {
        int i2;
        pha phaVar;
        C2087le c2087le;
        boolean z2;
        th00 th00Var2 = th00Var;
        wb9 wb9Var = d7f0.f46155Y;
        xq00Var.m91775k0(-317208375);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(th00Var2) ? 2048 : 1024;
        }
        int i3 = i2;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            long j = leu.m58815a(xq00Var).f112823a.f229876c;
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
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
            cxh0 cxh0Var = cxh0.f43038a;
            pha phaVar2 = pha.f177517a;
            if (z) {
                phaVar = phaVar2;
                c2087le = c2087le2;
                xq00Var.m91771i0(-1250202977);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1250776694);
                c2087le = c2087le2;
                phaVar = phaVar2;
                dha.m36004a(nec.m64245h(phaVar2.mo66945a(mi21.m61824h(ltf1.m59890l(R.dimen.generated_playlist_show_all_scrim_height, xq00Var), mi21.m61822f(1.0f, cxh0Var)), wb9Var), tm4.m81087E(new pqm0[]{new pqm0(Float.valueOf(0.0f), new n6f(n6f.m63765b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(Float.valueOf(0.4f), new n6f(n6f.m63765b(j, 0.75f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(Float.valueOf(1.0f), new n6f(n6f.m63765b(j, 1.0f, 0.0f, 0.0f, 0.0f, 14)))}, 0.0f, 0.0f, 14), null, 0.0f, 6), xq00Var, 0);
                xq00Var.m91788r(false);
            }
            if (th00Var != null) {
                xq00Var.m91771i0(-1250144418);
                fxh0 fxh0VarM96832C = zsf1.m96832C(epv0.m39673I("collection_preview_show_all", phaVar.mo66945a(cxh0Var, wb9Var)), 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 7);
                zi5 zi5Var = bj5.f27610a;
                irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224761d), d7f0.f46142M0, xq00Var, 0);
                int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96832C);
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
                m48158b(z, eh00Var, null, 0, xq00Var, i3 & 126, 4);
                th00Var2 = th00Var;
                z2 = true;
                a831.m25016h((i3 >> 9) & 14, th00Var2, xq00Var, true, false);
            } else {
                th00Var2 = th00Var;
                xq00Var.m91771i0(-1249575723);
                m48158b(z, eh00Var, epv0.m39673I("collection_preview_show_all", phaVar.mo66945a(cxh0Var, wb9Var)), 0.0f, xq00Var, i3 & 126, 8);
                xq00Var.m91788r(false);
                z2 = true;
            }
            xq00Var.m91788r(z2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new v20(i, 21, eh00Var, fxh0Var, th00Var2, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:71:0x010a  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m48158b(boolean z, eh00 eh00Var, fxh0 fxh0Var, float f, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        float f2;
        boolean z2;
        fxh0 fxh0Var3;
        float f3;
        pgv0 pgv0VarM91796v;
        fxh0 fxh0Var4;
        float f4;
        int i4;
        String strM54977L;
        rgu rguVarM86517r;
        ugu uguVar;
        xq00Var.m91775k0(-2056652150);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                fxh0Var2 = fxh0Var;
                i3 |= xq00Var.m91770i(fxh0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    f2 = f;
                    int i6 = xq00Var.m91760d(f2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    f2 = f;
                }
                i3 |= i6;
            } else {
                f2 = f;
            }
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z2)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0 || xq00Var.m91735E()) {
                    if (i5 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        fxh0Var2 = fxh0Var4;
                        f4 = leu.m58816b(xq00Var).f117230b.f224763f;
                    } else {
                        fxh0Var2 = fxh0Var4;
                    }
                    xq00Var.m91790s();
                    if (z) {
                        i4 = R.string.martini_generated_playlist_show_less_action_label;
                    } else {
                        i4 = R.string.martini_generated_playlist_show_all_action_label;
                    }
                    strM54977L = k0e1.m54977L(i4, xq00Var);
                    rguVarM86517r = vvx.m86517r(xq00Var);
                    uguVar = ugu.f230259c;
                    if (wl51.m88460J0(strM54977L)) {
                        throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    }
                    dyu.m37371c(new peu(new t40(strM54977L), eh00Var), uguVar, zsf1.m96832C(fxh0Var2, 0.0f, 0.0f, 0.0f, f4, 7), null, rguVarM86517r, null, null, null, null, null, rkk.m75772x(1843046635, new jhw(strM54977L, 21, (char) 0), xq00Var), xq00Var, 0, 48, 2008);
                    fxh0Var3 = fxh0Var2;
                    f3 = f4;
                } else {
                    xq00Var.m91757b0();
                }
                f4 = f2;
                xq00Var.m91790s();
                if (z) {
                    i4 = R.string.martini_generated_playlist_show_less_action_label;
                } else {
                    i4 = R.string.martini_generated_playlist_show_all_action_label;
                }
                strM54977L = k0e1.m54977L(i4, xq00Var);
                rguVarM86517r = vvx.m86517r(xq00Var);
                uguVar = ugu.f230259c;
                if (wl51.m88460J0(strM54977L)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                dyu.m37371c(new peu(new t40(strM54977L), eh00Var), uguVar, zsf1.m96832C(fxh0Var2, 0.0f, 0.0f, 0.0f, f4, 7), null, rguVarM86517r, null, null, null, null, null, rkk.m75772x(1843046635, new jhw(strM54977L, 21, (char) 0), xq00Var), xq00Var, 0, 48, 2008);
                fxh0Var3 = fxh0Var2;
                f3 = f4;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                f3 = f2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new f210(z, eh00Var, fxh0Var3, f3, i, i2);
            }
        }
        i3 |= 384;
        fxh0Var2 = fxh0Var;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f2 = f;
                if (xq00Var.m91760d(f2)) {
                }
                i3 |= i6;
            } else {
                f2 = f;
            }
            i3 |= i6;
        } else {
            f2 = f;
        }
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z2)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    fxh0Var4 = cxh0.f43038a;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                if ((i2 & 8) != 0) {
                    fxh0Var2 = fxh0Var4;
                    f4 = leu.m58816b(xq00Var).f117230b.f224763f;
                } else {
                    fxh0Var2 = fxh0Var4;
                    f4 = f2;
                }
            } else {
                if (i5 != 0) {
                    fxh0Var4 = cxh0.f43038a;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                if ((i2 & 8) != 0) {
                    fxh0Var2 = fxh0Var4;
                    f4 = leu.m58816b(xq00Var).f117230b.f224763f;
                } else {
                    fxh0Var2 = fxh0Var4;
                    f4 = f2;
                }
            }
            xq00Var.m91790s();
            if (z) {
                i4 = R.string.martini_generated_playlist_show_less_action_label;
            } else {
                i4 = R.string.martini_generated_playlist_show_all_action_label;
            }
            strM54977L = k0e1.m54977L(i4, xq00Var);
            rguVarM86517r = vvx.m86517r(xq00Var);
            uguVar = ugu.f230259c;
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            dyu.m37371c(new peu(new t40(strM54977L), eh00Var), uguVar, zsf1.m96832C(fxh0Var2, 0.0f, 0.0f, 0.0f, f4, 7), null, rguVarM86517r, null, null, null, null, null, rkk.m75772x(1843046635, new jhw(strM54977L, 21, (char) 0), xq00Var), xq00Var, 0, 48, 2008);
            fxh0Var3 = fxh0Var2;
            f3 = f4;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
            f3 = f2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new f210(z, eh00Var, fxh0Var3, f3, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m48159c(gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1389904828);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            String strM54977L = k0e1.m54977L(R.string.feature_unavailable_error_support_link, xq00Var);
            String strM54978M = k0e1.m54978M(R.string.feature_unavailable_error_subtitle, new Object[]{strM54977L}, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.feature_unavailable_error_title, xq00Var);
            pb71 pb71Var = new pb71(strM54977L, "https://support.spotify.com/article/managed-accounts/plain/");
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = new asi0(3, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            cv51 cv51Var = new cv51(strM54978M, pb71Var, (gh00) objM91750T);
            String strM54977L3 = k0e1.m54977L(R.string.denial_error_close_button, xq00Var);
            boolean z2 = i3 == 4;
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new rni0(16, gh00Var);
                xq00Var.m91793t0(objM91750T2);
            }
            glg1.m45152c(strM54977L2, strM54977L3, cv51Var, true, (eh00) objM91750T2, xq00Var, 3072, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new z3d0(gh00Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m48160d(eju ejuVar, x9i0 x9i0Var, fxh0 fxh0Var, boolean z, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-144270964);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(ejuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(x9i0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= xq00Var.m91768h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("pam-multi-user-recurring-manager", cxh0Var);
            boolean zM91770i = ((i3 & 7168) == 2048) | xq00Var.m91770i(ejuVar) | ((i3 & 57344) == 16384);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new erm0(ejuVar, z, gh00Var, 2);
                xq00Var.m91793t0(objM91750T);
            }
            gh00 gh00Var2 = (gh00) objM91750T;
            boolean zM91770i2 = xq00Var.m91770i(x9i0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                objM91750T2 = new gem0(x9i0Var, 9);
                xq00Var.m91793t0(objM91750T2);
            }
            g0b1.m43261b(gh00Var2, fxh0VarM39673I, (gh00) objM91750T2, xq00Var, 0, 0);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ugb0(ejuVar, x9i0Var, fxh0Var2, z, gh00Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m48161e(fxh0 fxh0Var, v3t0 v3t0Var, fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-714464401);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(fxh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(v3t0Var) ? 32 : 16;
        }
        int i3 = i & 384;
        fyf fyfVar2 = m3l.f139674a;
        if (i3 == 0) {
            i2 |= xq00Var.m91770i(fyfVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                Object yum0Var = new yum0(null, zhi0.f282936c);
                xq00Var.m91793t0(yum0Var);
                objM91750T = yum0Var;
            }
            m29 m29VarM48163g = m48163g(fyfVar2, xq00Var, (i2 >> 6) & 14);
            qqg1.m73532b(v3t0Var.mo30068a(m29VarM48163g), rkk.m75772x(274270255, new n29(fxh0Var, (kqi0) objM91750T, fyfVar, m29VarM48163g, 0), xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new oo4(fxh0Var, v3t0Var, fyfVar, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX INFO: renamed from: f */
    public static final void m48162f(s15 s15Var, fxh0 fxh0Var, tdu tduVar, wwu wwuVar, xq00 xq00Var, int i, int i2) {
        int i3;
        tdu tduVar2;
        wwu wwuVar2;
        fxh0 fxh0Var2;
        pgv0 pgv0VarM91796v;
        jb01 jb01Var;
        tdu tduVar3;
        wwu wwuVar3;
        fxh0 fxh0Var3;
        int i4;
        int i5;
        tdu tduVar4 = tduVar;
        wwu wwuVar4 = wwuVar;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-2006940515);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? xq00Var.m91766g(s15Var) : xq00Var.m91770i(s15Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        if ((i & 384) == 0) {
            if ((i2 & 4) != 0) {
                i5 = 128;
            } else {
                if ((i & 512) == 0 ? xq00Var.m91766g(tduVar4) : xq00Var.m91770i(tduVar4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
            }
            i6 |= i5;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) != 0) {
                i4 = 1024;
            } else {
                if ((i & 4096) == 0 ? xq00Var.m91766g(wwuVar4) : xq00Var.m91770i(wwuVar4)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
            }
            i6 |= i4;
        }
        if (xq00Var.m91752Y(i6 & 1, (i6 & 1171) != 1170)) {
            xq00Var.m91761d0();
            int i7 = i & 1;
            cxh0 cxh0Var = cxh0.f43038a;
            if (i7 == 0 || xq00Var.m91735E()) {
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                    tduVar4 = rdu.f198207a;
                }
                if ((i2 & 8) != 0) {
                    wwuVar4 = dru.f52389c;
                    i6 &= -7169;
                }
                tduVar3 = tduVar4;
                wwuVar3 = wwuVar4;
                fxh0Var3 = cxh0Var;
            } else {
                xq00Var.m91757b0();
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                }
                fxh0Var3 = fxh0Var;
                tduVar3 = tduVar4;
                wwuVar3 = wwuVar4;
            }
            xq00Var.m91790s();
            if71 if71Var = leu.m58818d(xq00Var).f64974j;
            int i8 = (i6 & 14) | 8;
            String strM54977L = k0e1.m54977L(R.string.settings_note_contentdescription, xq00Var);
            String strM76914c = s15Var.m76914c(xq00Var);
            if (strM76914c == null) {
                strM76914c = "";
            }
            boolean zM91766g = xq00Var.m91766g(strM54977L) | xq00Var.m91766g(strM76914c);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == obj) {
                objM91750T = new C2026js(strM54977L, strM76914c, 25);
                xq00Var.m91793t0(objM91750T);
            }
            fyf fyfVarM76913b = s15Var.m76913b(zoz0.m96644b(cxh0Var, false, (gh00) objM91750T), if71Var, null, xq00Var, 4096 | ((i8 << 9) & 7168), 4);
            if (fyfVarM76913b == null) {
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v == null) {
                    return;
                } else {
                    jb01Var = new jb01(s15Var, fxh0Var3, tduVar3, wwuVar3, i, i2, 1);
                }
            } else {
                fxh0 fxh0Var4 = fxh0Var3;
                tdu tduVar5 = tduVar3;
                wwu wwuVar5 = wwuVar3;
                kyu kyuVar = (kyu) xq00Var.m91774k(lyu.f138115a);
                kyu kyuVarM57723a = kyu.m57723a(kyuVar, null, 1, ufg1.m83011m(frz0.m42520e(kyuVar.f127913a, 1, xq00Var), null, new ybs(0), null, null, 13), null, null, 499);
                udu uduVarM39455x = emk.m39455x(tduVar5, xq00Var);
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var4);
                Object objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == obj) {
                    objM91750T2 = d901.f46631h;
                    xq00Var.m91793t0(objM91750T2);
                }
                p711.m69222a(zoz0.m96644b(fxh0VarM61822f, true, (gh00) objM91750T2), kyuVarM57723a, uduVarM39455x, false, null, null, null, null, null, null, null, null, null, null, null, rkk.m75772x(-148183335, new ucw0(if71Var, wwuVar5, fyfVarM76913b, 8), xq00Var), xq00Var, 64, 196608, 32760);
                tduVar2 = tduVar5;
                fxh0Var2 = fxh0Var4;
                wwuVar2 = wwuVar5;
            }
            pgv0VarM91796v.f177419d = jb01Var;
        }
        xq00Var.m91757b0();
        tduVar2 = tduVar4;
        wwuVar2 = wwuVar4;
        fxh0Var2 = fxh0Var;
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            jb01Var = new jb01(s15Var, fxh0Var2, tduVar2, wwuVar2, i, i2, 0);
            pgv0VarM91796v.f177419d = jb01Var;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final m29 m48163g(fyf fyfVar, xq00 xq00Var, int i) {
        Object obj = t6x0.f217647t;
        boolean z = (((i & 14) ^ 6) > 4 && xq00Var.m91766g(fyfVar)) || (i & 6) == 4;
        Object objM91750T = xq00Var.m91750T();
        if (z || objM91750T == obj) {
            objM91750T = new m29(fyfVar);
            xq00Var.m91793t0(objM91750T);
        }
        m29 m29Var = (m29) objM91750T;
        boolean zM91766g = xq00Var.m91766g(m29Var);
        Object objM91750T2 = xq00Var.m91750T();
        if (zM91766g || objM91750T2 == obj) {
            objM91750T2 = new C2245p6(m29Var, 5);
            xq00Var.m91793t0(objM91750T2);
        }
        hz40.m49233e(m29Var, (gh00) objM91750T2, xq00Var);
        return m29Var;
    }

    /* JADX INFO: renamed from: h */
    public static final List m48164h(nu21 nu21Var) {
        boolean z = nu21Var.f158494f;
        int[] iArr = nu21Var.f158490b;
        if (z || nu21Var.f158491c == 0) {
            return lau.f131415a;
        }
        huu0 huu0Var = new huu0(nu21Var, 0);
        int iM65663q = nu21Var.f158497i;
        Object objValueOf = Integer.valueOf(nu21Var.f158500l - qu21.m73868b(iArr, iM65663q));
        while (iM65663q >= 0) {
            huu0Var.m56996i(nu21Var.m65655i(iM65663q), nu21Var.m65657k(iM65663q) ? nu21Var.m65662p(iArr, iM65663q) : t6x0.f217647t, nu21Var.f158489a.m68082l(iM65663q), objValueOf);
            objValueOf = nu21Var.m65647a(iM65663q);
            iM65663q = nu21Var.m65663q(iM65663q);
        }
        return huu0Var.f124798a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.huu0, p.koh] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.rq00] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    /* JADX INFO: renamed from: i */
    public static final List m48165i(wu21 wu21Var, Integer num, int i, Integer num2) {
        int iM88969G;
        int iM89004s;
        jpi0 jpi0Var;
        if (wu21Var.f255092w || wu21Var.m89001p() == 0) {
            return lau.f131415a;
        }
        ?? huu0Var = new huu0(wu21Var, 1);
        if (num2 != null) {
            iM88969G = num2.intValue();
        } else {
            iM88969G = wu21Var.f255091v;
            if (iM88969G < 0) {
                iM88969G = wu21Var.m88969G(wu21Var.f255071b, i);
            }
        }
        if (num == 0) {
            int iM88978P = wu21Var.f255078i - wu21Var.m88978P(wu21Var.f255071b, wu21Var.m89003r(i));
            toi0 toi0Var = wu21Var.f255088s;
            num = Integer.valueOf(iM88978P + ((toi0Var == null || (jpi0Var = (jpi0) toi0Var.m87103b(i)) == null) ? 0 : jpi0Var.f114676b));
        }
        int iM89003r = wu21Var.m89003r(i) * 5;
        int[] iArr = wu21Var.f255071b;
        if (iM89003r < iArr.length) {
            iM89004s = wu21Var.m89004s(i);
        } else {
            int iM88969G2 = iM88969G >= 0 ? wu21Var.m88969G(iArr, iM88969G) : iM88969G;
            iM89004s = wu21Var.m89004s(iM88969G);
            int i2 = iM88969G;
            iM88969G = iM88969G2;
            i = i2;
        }
        while (i >= 0) {
            huu0Var.m56996i(iM89004s, (wu21Var.f255071b[(wu21Var.m89003r(i) * 5) + 1] & 536870912) != 0 ? wu21Var.m89005t(i) : t6x0.f217647t, wu21Var.m88979Q(i), num);
            num = wu21Var.m88988b(i);
            if (iM88969G >= 0) {
                int iM88969G3 = wu21Var.m88969G(wu21Var.f255071b, iM88969G);
                iM89004s = wu21Var.m89004s(iM88969G);
                int i3 = iM88969G;
                iM88969G = iM88969G3;
                i = i3;
            } else {
                i = iM88969G;
            }
        }
        return huu0Var.f124798a;
    }

    /* JADX INFO: renamed from: j */
    public static List m48166j(wu21 wu21Var) {
        return m48165i(wu21Var, null, wu21Var.f255089t, null);
    }

    /* JADX INFO: renamed from: k */
    public static final aa81 m48167k(kb81 kb81Var) {
        zp81 zp81Var = kb81Var.f121141i;
        return new aa81((zp81Var == zp81.f285021c || zp81Var == zp81.f285022d) ? 3 : 0, (kb81Var.f121142j ? 16 : 0) | (kb81Var.f121143k ? 32 : 0), kb81Var.f121139g);
    }

    /* JADX INFO: renamed from: l */
    public static final Integer m48168l(ou21 ou21Var, hsh hshVar) {
        nu21 nu21VarM68079f = ou21Var.m68079f();
        try {
            return m48169m(nu21VarM68079f, hshVar, 0, nu21VarM68079f.f158491c);
        } finally {
            nu21VarM68079f.m65649c();
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Integer m48169m(nu21 nu21Var, hsh hshVar, int i, int i2) {
        Integer numM48169m;
        int[] iArr = nu21Var.f158490b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (nu21Var.m65656j(i) && nu21Var.m65655i(i) == 206 && wj50.m88271j(nu21Var.m65662p(iArr, i), vph.f243695e)) {
                Object objM65654h = nu21Var.m65654h(i, 0);
                f9w0 f9w0Var = objM65654h instanceof f9w0 ? (f9w0) objM65654h : null;
                e9w0 e9w0VarMo30283a = f9w0Var != null ? f9w0Var.mo30283a() : null;
                uq00 uq00Var = e9w0VarMo30283a instanceof uq00 ? (uq00) e9w0VarMo30283a : null;
                if (uq00Var != null && uq00Var.f232880a.equals(hshVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (nu21Var.m65650d(i) && (numM48169m = m48169m(nu21Var, hshVar, i + 1, i3)) != null) {
                return Integer.valueOf(numM48169m.intValue());
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final MissingFieldException m48170n(MissingFieldException missingFieldException, String str) {
        return new MissingFieldException(str, missingFieldException, missingFieldException.f10919a, missingFieldException.f10920b);
    }

    /* JADX INFO: renamed from: o */
    public static final C1940hk m48171o(AccountControls accountControls) {
        msb1 msb1Var;
        Boolean boolValueOf = accountControls.hasAllowExplicitContent() ? Boolean.valueOf(accountControls.getAllowExplicitContent()) : null;
        Boolean boolValueOf2 = accountControls.m12480F() ? Boolean.valueOf(accountControls.m12486y()) : null;
        if (accountControls.m12481G()) {
            VideoControls videoControlsM12475A = accountControls.m12475A();
            msb1Var = new msb1(videoControlsM12475A.m12527v() ? Boolean.valueOf(videoControlsM12475A.m12524r()) : null, videoControlsM12475A.m12526u() ? Boolean.valueOf(videoControlsM12475A.m12523q()) : null, videoControlsM12475A.m12528w() ? Boolean.valueOf(videoControlsM12475A.m12525s()) : null);
        } else {
            msb1Var = null;
        }
        return new C1940hk(boolValueOf, boolValueOf2, msb1Var, accountControls.m12479E() ? Boolean.valueOf(accountControls.m12485x()) : null, accountControls.m12476B() ? Boolean.valueOf(accountControls.m12482u()) : null, accountControls.m12478D() ? Boolean.valueOf(accountControls.m12484w()) : null, accountControls.m12477C() ? Boolean.valueOf(accountControls.m12483v()) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p.huu0, p.koh] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: p */
    public static final ArrayList m48172p(nu21 nu21Var, int i, Integer num) {
        ?? huu0Var = new huu0(nu21Var, 0);
        i = nu21Var.m65663q(i);
        rq00 rq00VarM65647a = nu21Var.m65647a(i);
        while (i >= 0) {
            huu0Var.m56996i(nu21Var.m65655i(i), nu21Var.m65657k(i) ? nu21Var.m65662p(nu21Var.f158490b, i) : t6x0.f217647t, nu21Var.f158489a.m68082l(i), num);
            if (i >= 0) {
                rq00 rq00Var = rq00VarM65647a;
                rq00VarM65647a = nu21Var.m65647a(i);
                i = nu21Var.m65663q(i);
                num = rq00Var;
            } else {
                num = rq00VarM65647a;
            }
        }
        return huu0Var.f124798a;
    }
}
