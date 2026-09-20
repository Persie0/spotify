package p204p;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.appcompat.widget.Toolbar;
import com.comscore.streaming.ContentType;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public abstract class p1m0 {

    /* JADX INFO: renamed from: a */
    public static sd40 f173134a;

    /* JADX INFO: renamed from: a */
    public static final void m68820a(fxh0 fxh0Var, qly0 qly0Var, fyf fyfVar, xq00 xq00Var, int i, int i2) {
        fxh0 fxh0Var2;
        int i3;
        qly0 qly0VarM68467i0;
        xq00Var.m91775k0(-1988560804);
        ug5 ug5Var = xq00Var.f264811a;
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            fxh0Var2 = fxh0Var;
        } else if ((i & 6) == 0) {
            fxh0Var2 = fxh0Var;
            i3 = (xq00Var.m91770i(fxh0Var2) ? 4 : 2) | i;
        } else {
            fxh0Var2 = fxh0Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                qly0VarM68467i0 = qly0Var;
                int i5 = xq00Var.m91770i(qly0VarM68467i0) ? 32 : 16;
                i3 |= i5;
            } else {
                qly0VarM68467i0 = qly0Var;
            }
            i3 |= i5;
        } else {
            qly0VarM68467i0 = qly0Var;
        }
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91770i(fyfVar) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            xq00Var.m91761d0();
            int i6 = i & 1;
            cxh0 cxh0Var = cxh0.f43038a;
            if (i6 == 0 || xq00Var.m91735E()) {
                if (i4 != 0) {
                    fxh0Var2 = cxh0Var;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    qly0VarM68467i0 = oyf1.m68467i0(0, 0, 1, xq00Var);
                }
            } else {
                xq00Var.m91757b0();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            xq00Var.m91790s();
            fxh0 fxh0VarM68493v0 = oyf1.m68493v0(mi21.m61820d(1.0f, fxh0Var2), qly0VarM68467i0, false, 14);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46168f, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM68493v0);
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
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, mi21.m61840x(cxh0Var, 0.0f, ltf1.m59890l(R.dimen.readable_content_width, xq00Var), 1));
            m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46166e, false);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM61822f);
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
            p3n0.m69076g((i3 >> 6) & 14, fyfVar, xq00Var, true, true);
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var3 = fxh0Var2;
        qly0 qly0Var2 = qly0VarM68467i0;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y70(fxh0Var3, (Object) qly0Var2, fyfVar, i, i2, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m68821b(qf40 qf40Var, eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-141273885);
        int i2 = i | (xq00Var.m91766g(qf40Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var2) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            String strM54977L = k0e1.m54977L(R.string.chat_create_error_retry, xq00Var);
            String strM54977L2 = k0e1.m54977L(android.R.string.cancel, xq00Var);
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77645B(Boolean.TRUE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            boolean z = (i2 & 896) == 256;
            Object objM91750T2 = xq00Var.m91750T();
            if (z || objM91750T2 == ia7Var) {
                objM91750T2 = new C2369sa(eh00Var2, kqi0Var, 9);
                xq00Var.m91793t0(objM91750T2);
            }
            eh00 eh00Var3 = (eh00) objM91750T2;
            if (((Boolean) kqi0Var.getValue()).booleanValue()) {
                xq00Var.m91771i0(378071180);
                String strM54977L3 = k0e1.m54977L(R.string.chat_create_error_title, xq00Var);
                String strM54978M = k0e1.m54978M(R.string.chat_create_error_message, new Object[]{g6f.m43753y0(qf40Var, ", ", null, null, null, 62)}, xq00Var);
                if (wl51.m88460J0(strM54977L)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                gku gkuVar = new gku(strM54977L, new peu(new t40(strM54977L), eh00Var));
                if (wl51.m88460J0(strM54977L2)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                kku.m56741a(eh00Var3, null, null, strM54977L3, strM54978M, gkuVar, new gku(strM54977L2, new peu(new t40(strM54977L2), eh00Var3)), xq00Var, 2359296, 6);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(378612223);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y4l(qf40Var, eh00Var, eh00Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m68822c(fxh0 fxh0Var, peu peuVar, String str, voi0 voi0Var, fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        boolean z;
        fxh0 fxh0VarMo34315F;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(1682983602);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(peuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(voi0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            if (peuVar != null) {
                z = false;
                fxh0VarMo34315F = fxh0Var.mo34315F(hdi.m47245v(cxh0.f43038a, voi0Var, fo3.f71408a, false, peuVar.f176850c, null, peuVar.f176849b, 20));
            } else {
                z = false;
                fxh0VarMo34315F = fxh0Var;
            }
            boolean zM91770i = xq00Var.m91770i(peuVar) | ((i2 & 896) == 256 ? true : z);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new zku(str, peuVar, 0);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96643a = zoz0.m96643a(fxh0VarMo34315F, (gh00) objM91750T);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, z);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96643a);
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
            rbz.m75196n((i2 >> 12) & 14, fyfVar, xq00Var, true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yul(fxh0Var, peuVar, str, voi0Var, fyfVar, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m68823d(e940 e940Var, m7y m7yVar, float f, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1871556096);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(e940Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(m7yVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91760d(f) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = k3y.f118995N0;
                xq00Var.m91793t0(objM91750T);
            }
            gh00 gh00Var = (gh00) objM91750T;
            boolean zM91770i = xq00Var.m91770i(e940Var) | ((i3 & 896) == 256) | xq00Var.m91770i(m7yVar);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == ia7Var) {
                objM91750T2 = new lec(f, e940Var, m7yVar, 1);
                xq00Var.m91793t0(objM91750T2);
            }
            gh00 gh00Var2 = (gh00) objM91750T2;
            int i4 = ((i3 >> 6) & ContentType.LONG_FORM_ON_DEMAND) | 6;
            cxh0 cxh0Var = cxh0.f43038a;
            g0b1.m43261b(gh00Var, cxh0Var, gh00Var2, xq00Var, i4, 0);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qe2(e940Var, m7yVar, f, fxh0Var2, i, 4);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m68824e(qly0 qly0Var, fxh0 fxh0Var, fyf fyfVar, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        xq00Var.m91775k0(934653046);
        int i2 = (xq00Var.m91770i(qly0Var) ? 4 : 2) | i | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var2 = xq00Var;
            iyg1.m51914a(mi21.m61820d(1.0f, fxh0Var), null, rkk.m75772x(2038053452, new eib(3, qly0Var, fyfVar), xq00Var), xq00Var2, 3072, 6);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qic(qly0Var, fxh0Var, fyfVar, i, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m68825f(String str, wf11 wf11Var, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1200899020);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91770i(wf11Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            cxh0 cxh0Var = cxh0.f43038a;
            rsh0.m76341a(eh00Var, cxh0Var, wf11Var, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, rkk.m75772x(476439342, new ylm0(str, 18), xq00Var), xq00Var, ((i2 >> 6) & 126) | ((i2 << 3) & 896), 3072, 8184);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jsl0((Object) str, (Object) wf11Var, eh00Var, (Object) fxh0Var2, i, 28);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m68826g(int i, String str, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(1045655782);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91770i(fxh0Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            fxh0 fxh0VarM96866z = zsf1.m96866z(hdi.m47247x(nec.m64246i(fxh0Var, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(3)), false, null, null, null, eh00Var, 15), leu.m58816b(xq00Var).f117230b.f224759b, 1);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96866z);
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
            ahf1.m25932d(str, null, leu.m58818d(xq00Var).f64977m, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, i2 & 14, 0, 2034);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1864fl(str, eh00Var, fxh0Var, i, 14);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m68827h(qf40 qf40Var, th00 th00Var, fxh0 fxh0Var, String str, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(2130853969);
        int i2 = i | (xq00Var.m91770i(qf40Var) ? 4 : 2) | (xq00Var.m91770i(th00Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            cxh0 cxh0Var = cxh0.f43038a;
            j0g1.m52087o(str != null ? epv0.m39673I(str, cxh0Var) : cxh0Var, bj5.m29370g(10), bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224763f), null, 0, 0, rkk.m75772x(-1223782602, new ucw0(qf40Var, th00Var, str, 21), xq00Var), xq00Var, 1572864, 56);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new s1z0((Object) qf40Var, (Object) th00Var, fxh0Var2, (Object) str, i, 18);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m68828i(qf40 qf40Var, mub0 mub0Var, z711 z711Var, String str, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-571822345);
        int i2 = i | (xq00Var.m91766g(qf40Var) ? 4 : 2) | (xq00Var.m91770i(mub0Var) ? 32 : 16) | (xq00Var.m91770i(z711Var) ? 256 : 128) | (xq00Var.m91766g(str) ? 2048 : 1024) | 24576;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            Object obj2 = objM91750T;
            if (z || objM91750T == obj) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : qf40Var) {
                    if (obj3 instanceof obl0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (((obl0) obj4).mo72494h() != 1) {
                        arrayList2.add(obj4);
                    }
                }
                xq00Var.m91793t0(arrayList2);
                obj2 = arrayList2;
            }
            Object obj5 = (List) obj2;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61819c = mi21.m61819c(0.7f, cxh0Var);
            WeakHashMap weakHashMap = cxd1.f42984x;
            lx40 lx40VarM75451u = rfg1.m75451u(new ni80(bxd1.m30815d(xq00Var).f42991g, 32), xq00Var);
            boolean zM91770i = xq00Var.m91770i(mub0Var) | ((i2 & 7168) == 2048) | xq00Var.m91770i(obj5) | xq00Var.m91770i(z711Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                Object eeu0Var = new eeu0(obj5, (Object) mub0Var, (Object) z711Var, str, 24);
                xq00Var.m91793t0(eeu0Var);
                objM91750T2 = eeu0Var;
            }
            fyg1.m43085i(fxh0VarM61819c, null, lx40VarM75451u, false, null, null, null, false, null, (gh00) objM91750T2, xq00Var, 0, 506);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ics0(qf40Var, mub0Var, z711Var, str, fxh0Var2, i, 27);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m68829j() {
        try {
            Class.forName("androidx.test.espresso.Espresso");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m68830k() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m68831l(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: m */
    public static int m68832m(Object... objArr) {
        return Objects.hash(objArr);
    }

    /* JADX INFO: renamed from: n */
    public static bbg0 m68833n(UUID uuid) {
        return new bbg0(uuid, 8);
    }

    /* JADX INFO: renamed from: o */
    public static final fxh0 m68834o(fxh0 fxh0Var, gh00 gh00Var) {
        return fxh0Var.mo34315F(new ooz(gh00Var));
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0285  */
    /* JADX WARN: Code duplicated, block: B:122:0x0288  */
    /* JADX WARN: Code duplicated, block: B:124:0x028f  */
    /* JADX WARN: Code duplicated, block: B:127:0x029c  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:148:0x0303  */
    /* JADX WARN: Code duplicated, block: B:150:0x030c  */
    /* JADX WARN: Code duplicated, block: B:151:0x030e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0313  */
    /* JADX WARN: Code duplicated, block: B:168:0x0363  */
    /* JADX WARN: Code duplicated, block: B:170:0x0367 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x036c  */
    /* JADX WARN: Code duplicated, block: B:175:0x036f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x0374  */
    /* JADX WARN: Code duplicated, block: B:182:0x0383  */
    /* JADX WARN: Code duplicated, block: B:185:0x0389  */
    /* JADX WARN: Code duplicated, block: B:187:0x0391 A[LOOP:5: B:186:0x038f->B:187:0x0391, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x03ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:198:0x03d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x03df  */
    /* JADX WARN: Code duplicated, block: B:204:0x0175 A[EDGE_INSN: B:204:0x0175->B:70:0x0175 BREAK  A[LOOP:0: B:9:0x003e->B:68:0x0153], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0151 A[DONT_INVERT, PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
      0x0151: PHI (r6v14 p.n04) = (r6v13 p.n04), (r6v15 p.n04) binds: [B:10:0x004d, B:66:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004d, B:66:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r21v8 p.fy71) = (r21v7 p.fy71), (r21v9 p.fy71) binds: [B:10:0x004d, B:66:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r22v5 p.j15) = (r22v4 p.j15), (r22v6 p.j15) binds: [B:10:0x004d, B:66:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r23v5 p.a84) = (r23v4 p.a84), (r23v6 p.a84) binds: [B:10:0x004d, B:66:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r24v7 p.hyj) = (r24v6 p.hyj), (r24v8 p.hyj) binds: [B:10:0x004d, B:66:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004d, B:66:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r26v8 p.tix0) = (r26v7 p.tix0), (r26v9 p.tix0) binds: [B:10:0x004d, B:66:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004d, B:66:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r28v6 boolean) = (r28v5 boolean), (r28v7 boolean) binds: [B:10:0x004d, B:66:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004d, B:66:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0153 A[LOOP:0: B:9:0x003e->B:68:0x0153, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final void m68835p(ViewStructure viewStructure, lp70 lp70Var, AutofillId autofillId, String str, wiv0 wiv0Var) {
        long j;
        long j2;
        char c;
        long j3;
        boolean zBooleanValue;
        fy71 fy71Var;
        j15 j15Var;
        a84 a84Var;
        tix0 tix0Var;
        n04 n04Var;
        boolean z;
        hyj hyjVar;
        Boolean bool;
        boolean z2;
        Integer num;
        int i;
        List list;
        Integer numValueOf;
        int iIntValue;
        Integer numValueOf2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        String strM78201F;
        int size;
        String strM36617q;
        String[] strArr;
        boolean z6;
        String[] strArr2;
        cqi0 cqi0Var;
        long[] jArr;
        Object[] objArr;
        int i3;
        long[] jArr2;
        Object[] objArr2;
        cqi0 cqi0Var2;
        fy71 fy71Var2;
        j15 j15Var2;
        a84 a84Var2;
        tix0 tix0Var2;
        lpz0 lpz0Var = hpz0.f93944a;
        lpz0 lpz0Var2 = toz0.f222346a;
        voz0 voz0VarM59647x = lp70Var.m59647x();
        int i4 = 8;
        if (voz0VarM59647x == null || (cqi0Var2 = voz0VarM59647x.f243555a) == null) {
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            fy71Var = null;
            j15Var = null;
            a84Var = null;
            tix0Var = null;
            n04Var = null;
            z = false;
            hyjVar = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            Object[] objArr3 = cqi0Var2.f40897b;
            j = 128;
            Object[] objArr4 = cqi0Var2.f40898c;
            long[] jArr3 = cqi0Var2.f40896a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i5 = 0;
                n04Var = null;
                j2 = 255;
                z = false;
                fy71Var2 = null;
                j15Var2 = null;
                a84Var2 = null;
                hyjVar = null;
                bool = null;
                tix0Var2 = null;
                z2 = false;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i5 != length) {
                            break;
                            break;
                        }
                        i5++;
                    } else {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr3[i8];
                                Object obj2 = objArr4[i8];
                                lpz0 lpz0Var3 = (lpz0) obj;
                                if (wj50.m88271j(lpz0Var3, hpz0.f93962s)) {
                                    n04Var = (n04) obj2;
                                } else if (wj50.m88271j(lpz0Var3, hpz0.f93944a)) {
                                    CharSequence charSequence = (String) g6f.m43745s0((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (wj50.m88271j(lpz0Var3, hpz0.f93961r)) {
                                    hyjVar = (hyj) obj2;
                                } else if (wj50.m88271j(lpz0Var3, hpz0.f93963t)) {
                                    a84Var2 = (a84) obj2;
                                } else if (wj50.m88271j(lpz0Var3, hpz0.f93931G)) {
                                    j15Var2 = (j15) obj2;
                                } else if (wj50.m88271j(lpz0Var3, hpz0.f93955l)) {
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (wj50.m88271j(lpz0Var3, hpz0.f93942R)) {
                                    num = (Integer) obj2;
                                } else if (wj50.m88271j(lpz0Var3, hpz0.f93938N)) {
                                    z2 = true;
                                } else if (wj50.m88271j(lpz0Var3, hpz0.f93958o)) {
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (wj50.m88271j(lpz0Var3, hpz0.f93969z)) {
                                    tix0Var2 = (tix0) obj2;
                                } else if (wj50.m88271j(lpz0Var3, hpz0.f93935K)) {
                                    bool = (Boolean) obj2;
                                } else if (wj50.m88271j(lpz0Var3, hpz0.f93936L)) {
                                    fy71Var2 = (fy71) obj2;
                                } else if (wj50.m88271j(lpz0Var3, toz0.f222347b)) {
                                    viewStructure.setClickable(true);
                                } else if (wj50.m88271j(lpz0Var3, toz0.f222348c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (wj50.m88271j(lpz0Var3, toz0.f222368w)) {
                                    viewStructure.setFocusable(true);
                                } else if (wj50.m88271j(lpz0Var3, toz0.f222356k)) {
                                    z = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 != length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                n04Var = null;
                z = false;
                fy71Var2 = null;
                j15Var2 = null;
                a84Var2 = null;
                hyjVar = null;
                bool = null;
                tix0Var2 = null;
                z2 = false;
                num = null;
            }
            fy71Var = fy71Var2;
            j15Var = j15Var2;
            a84Var = a84Var2;
            tix0Var = tix0Var2;
        }
        voz0 voz0VarM59647x2 = lp70Var.m59647x();
        if (voz0VarM59647x2 != null && voz0VarM59647x2.f243557c && !voz0VarM59647x2.f243558d) {
            voz0VarM59647x2 = voz0VarM59647x2.m86109b();
            jpi0 jpi0Var = new jpi0(((pqi0) lp70Var.m59638o()).f180330a.f191610c);
            jpi0Var.m53955b(lp70Var.m59638o());
            while (jpi0Var.m53962i()) {
                lp70 lp70Var2 = (lp70) jpi0Var.m53964k(jpi0Var.f114676b - 1);
                voz0 voz0VarM59647x3 = lp70Var2.m59647x();
                if (voz0VarM59647x3 != null && !voz0VarM59647x3.f243557c) {
                    voz0VarM59647x2.m86111e(voz0VarM59647x3);
                    if (!voz0VarM59647x3.f243558d) {
                        jpi0Var.m53955b(lp70Var2.m59638o());
                    }
                }
            }
        }
        if (voz0VarM59647x2 != null && (cqi0Var = voz0VarM59647x2.f243555a) != null) {
            Object[] objArr5 = cqi0Var.f40897b;
            Object[] objArr6 = cqi0Var.f40898c;
            long[] jArr4 = cqi0Var.f40896a;
            int length2 = jArr4.length - 2;
            i = 1;
            if (length2 >= 0) {
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i9];
                    int i10 = i4;
                    int i11 = i9;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                Object obj3 = objArr5[i14];
                                Object obj4 = objArr6[i14];
                                jArr2 = jArr4;
                                lpz0 lpz0Var4 = (lpz0) obj3;
                                objArr2 = objArr5;
                                if (wj50.m88271j(lpz0Var4, hpz0.f93953j)) {
                                    viewStructure.setEnabled(false);
                                } else if (wj50.m88271j(lpz0Var4, hpz0.f93927C)) {
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i10;
                            i13++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i9 = i11 + 1;
                    i4 = i3;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
            }
            numValueOf = Integer.valueOf(lp70Var.f135671b);
            if (lp70Var.m59645v() == null) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = -1;
            }
            x58.m89973f(viewStructure, autofillId, iIntValue);
            viewStructure.setId(iIntValue, str, null, null);
            if (n04Var != null) {
                numValueOf2 = Integer.valueOf(n04Var.f148888a);
            } else if (z) {
                numValueOf2 = Integer.valueOf(i);
            } else if (fy71Var != null) {
                numValueOf2 = 2;
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                x58.m89974g(viewStructure, numValueOf2.intValue());
            }
            if (j15Var != null) {
                x58.m89975h(viewStructure, x58.m89969b(j15Var.f107641b));
            }
            if (a84Var != null) {
                x58.m89975h(viewStructure, a84Var.f13183a);
            }
            if (hyjVar != null && (strArr2 = (String[]) ((o04) hyjVar).m65975a().toArray(new String[0])) != null) {
                x58.m89972e(viewStructure, strArr2);
            }
            wiv0Var.f251756b.m86285i(lp70Var.f135671b, new h3n0(viewStructure, 18));
            if (bool != null) {
                viewStructure.setSelected(bool.booleanValue());
            }
            if (fy71Var != null) {
                viewStructure.setCheckable(i);
                if (fy71Var == fy71.f74544a) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                viewStructure.setChecked(z6);
            } else if (bool != null && (tix0Var == null || tix0Var.f220762a != 4)) {
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
            hyj.f96597a.getClass();
            String str2 = (String) bk5.m29583F0((String[]) vxj.f245766b.m65975a().toArray(new String[0]));
            if (hyjVar == null && (strArr = (String[]) ((o04) hyjVar).m65975a().toArray(new String[0])) != null) {
                boolean zM29621l0 = bk5.m29621l0(strArr, str2);
                z3 = true;
                boolean z7 = zM29621l0;
                if (!z2 || z7) {
                    z4 = z3;
                } else {
                    z4 = false;
                }
                if (!z4 || zBooleanValue) {
                    z5 = z3;
                } else {
                    z5 = false;
                }
                x58.m89976i(viewStructure, z5);
                viewStructure.setVisibility(lp70Var.f135674c1.f263386d.m30035p1() ? 4 : 0);
                if (list != null) {
                    size = list.size();
                    strM36617q = "";
                    for (i2 = 0; i2 < size; i2++) {
                        strM36617q = dq60.m36617q(dq60.m36620t(strM36617q), ((j15) list.get(i2)).f107641b, '\n');
                    }
                    viewStructure.setText(strM36617q);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (((pqi0) lp70Var.m59638o()).isEmpty() && tix0Var != null && (strM78201F = sig1.m78201F(tix0Var.f220762a)) != null) {
                    viewStructure.setClassName(strM78201F);
                }
                if (z) {
                    viewStructure.setClassName("android.widget.EditText");
                    if (Build.VERSION.SDK_INT >= 28 && num != null) {
                        r35.m74588R(viewStructure, num.intValue());
                    }
                    if (z4) {
                        x58.m89977j(viewStructure);
                    }
                }
            }
            z3 = true;
            if (z2) {
                z4 = z3;
            } else {
                z4 = z3;
            }
            if (z4) {
                z5 = z3;
            } else {
                z5 = z3;
            }
            x58.m89976i(viewStructure, z5);
            viewStructure.setVisibility(lp70Var.f135674c1.f263386d.m30035p1() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strM36617q = "";
                while (i2 < size) {
                    strM36617q = dq60.m36617q(dq60.m36620t(strM36617q), ((j15) list.get(i2)).f107641b, '\n');
                }
                viewStructure.setText(strM36617q);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((pqi0) lp70Var.m59638o()).isEmpty()) {
                viewStructure.setClassName(strM78201F);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28) {
                    r35.m74588R(viewStructure, num.intValue());
                }
                if (z4) {
                    x58.m89977j(viewStructure);
                }
            }
        }
        i = 1;
        list = null;
        numValueOf = Integer.valueOf(lp70Var.f135671b);
        if (lp70Var.m59645v() == null) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        x58.m89973f(viewStructure, autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (n04Var != null) {
            numValueOf2 = Integer.valueOf(n04Var.f148888a);
        } else if (z) {
            numValueOf2 = Integer.valueOf(i);
        } else if (fy71Var != null) {
            numValueOf2 = 2;
        } else {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            x58.m89974g(viewStructure, numValueOf2.intValue());
        }
        if (j15Var != null) {
            x58.m89975h(viewStructure, x58.m89969b(j15Var.f107641b));
        }
        if (a84Var != null) {
            x58.m89975h(viewStructure, a84Var.f13183a);
        }
        if (hyjVar != null) {
            x58.m89972e(viewStructure, strArr2);
        }
        wiv0Var.f251756b.m86285i(lp70Var.f135671b, new h3n0(viewStructure, 18));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (fy71Var != null) {
            viewStructure.setCheckable(i);
            if (fy71Var == fy71.f74544a) {
                z6 = true;
            } else {
                z6 = false;
            }
            viewStructure.setChecked(z6);
        } else if (bool != null) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        hyj.f96597a.getClass();
        String str3 = (String) bk5.m29583F0((String[]) vxj.f245766b.m65975a().toArray(new String[0]));
        if (hyjVar == null) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (z2) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        if (z4) {
            z5 = z3;
        } else {
            z5 = z3;
        }
        x58.m89976i(viewStructure, z5);
        viewStructure.setVisibility(lp70Var.f135674c1.f263386d.m30035p1() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strM36617q = "";
            while (i2 < size) {
                strM36617q = dq60.m36617q(dq60.m36620t(strM36617q), ((j15) list.get(i2)).f107641b, '\n');
            }
            viewStructure.setText(strM36617q);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((pqi0) lp70Var.m59638o()).isEmpty()) {
            viewStructure.setClassName(strM78201F);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                r35.m74588R(viewStructure, num.intValue());
            }
            if (z4) {
                x58.m89977j(viewStructure);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m68836q(Object obj) {
        obj.getClass();
    }

    /* JADX INFO: renamed from: r */
    public static void m68837r(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m68838s(s2o s2oVar, int i) {
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) s2oVar.f205039f;
        behaviorRetainingAppBarLayout.setBackgroundColor(i);
        if (!behaviorRetainingAppBarLayout.isLaidOut() || behaviorRetainingAppBarLayout.isLayoutRequested()) {
            behaviorRetainingAppBarLayout.addOnLayoutChangeListener(new dn20(s2oVar, i, 1));
            return;
        }
        Drawable background = ((Toolbar) s2oVar.f205038e).getBackground();
        if (background != null) {
            background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.DST_OVER));
        }
    }

    /* JADX INFO: renamed from: t */
    public static final h600 m68839t(o1m0 o1m0Var) {
        if (o1m0Var instanceof n1m0) {
            return ((n1m0) o1m0Var).f149473c;
        }
        if (o1m0Var instanceof m1m0) {
            return ((m1m0) o1m0Var).f139035c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: u */
    public static byte[] m68840u(String str) {
        byte[] bArr = new byte[19];
        for (int i = 0; i < 19; i++) {
            int i2 = i + i;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }
}
