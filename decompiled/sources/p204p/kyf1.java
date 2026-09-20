package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kyf1 {

    /* JADX INFO: renamed from: a */
    public static final t9y0 f127843a = new t9y0(new q5s0(9), new xaf(20));

    /* JADX INFO: renamed from: b */
    public static final t9y0 f127844b = new t9y0(new q5s0(10), new xaf(21));

    /* JADX INFO: renamed from: c */
    public static final t9y0 f127845c = new t9y0(new q5s0(11), new xaf(22));

    /* JADX INFO: renamed from: d */
    public static final t9y0 f127846d = new t9y0(new q5s0(12), new xaf(23));

    /* JADX INFO: renamed from: e */
    public static final t9y0 f127847e = new t9y0(new q5s0(13), new xaf(24));

    /* JADX INFO: renamed from: f */
    public static sd40 f127848f;

    /* JADX INFO: renamed from: g */
    public static sd40 f127849g;

    /* JADX INFO: renamed from: a */
    public static final void m57696a(ogl0 ogl0Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1118448086);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(ogl0Var) : xq00Var.m91770i(ogl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            float f = 0;
            nhu nhuVar = new nhu(leu.m58816b(xq00Var).f117230b.f224758a, f, leu.m58816b(xq00Var).f117230b.f224762e, new j4m0(f, f, f, f), lhu.f133647a);
            fxh0 fxh0VarM39673I = epv0.m39673I("OnboardingCardElementTestTag", yqg1.m94367e(fxh0Var, ogl0Var.f165185c));
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new dsk0(11, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            s800.m77433g(fxh0VarM39673I, null, nhuVar, null, null, null, null, new peu(u40.f226523c, (eh00) objM91750T), null, rkk.m75772x(515179729, new jgl0(0, ogl0Var), xq00Var), null, null, null, null, null, null, rkk.m75772x(606310027, new jgl0(1, ogl0Var), xq00Var), xq00Var, 805306880, 1572864, 64890);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new nde0(ogl0Var, gh00Var, fxh0Var, i, 25);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m57697b(yw70 yw70Var, gh00 gh00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(2114967611);
        int i2 = (xq00Var.m91770i(yw70Var) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zM91770i = xq00Var.m91770i(yw70Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new kvs(yw70Var, gh00Var, (fbk) null, 3);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49236h(yw70Var, gh00Var, (th00) objM91750T, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gex0(yw70Var, gh00Var, i, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m57698c(zpa1 zpa1Var, qpa1 qpa1Var, z9j0 z9j0Var, xf50 xf50Var, eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        pgv0 pgv0VarM91796v;
        epa1 epa1Var;
        uyi0 uyi0Var;
        xq00Var.m91775k0(-937847322);
        int i2 = i | (xq00Var.m91770i(zpa1Var) ? 4 : 2) | (xq00Var.m91770i(qpa1Var) ? 32 : 16) | (xq00Var.m91770i(z9j0Var) ? 256 : 128) | (xq00Var.m91762e(xf50Var.ordinal()) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var) ? 16384 : 8192) | (xq00Var.m91770i(eh00Var2) ? 131072 : 65536);
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            if (zpa1Var.f285074q) {
                xq00Var.m91771i0(-646961865);
                int i3 = i2 & 14;
                int i4 = i2 >> 6;
                ncg1.m64141f(zpa1Var, xf50Var, eh00Var, eh00Var2, xq00Var, (i4 & 7168) | i3 | (i4 & ContentType.LONG_FORM_ON_DEMAND) | (i4 & 896));
                xq00Var.m91788r(false);
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v == null) {
                    return;
                } else {
                    epa1Var = new epa1(zpa1Var, qpa1Var, z9j0Var, xf50Var, eh00Var, eh00Var2, i, 0);
                }
            } else {
                xq00Var.m91771i0(-646741796);
                xq00Var.m91788r(false);
                uyi0 uyi0VarM44490C = geg1.m44490C(new aaj0[0], xq00Var);
                String str = zpa1Var.f285073p ? "send_screen" : "topic_screen";
                boolean zM91770i = xq00Var.m91770i(qpa1Var) | xq00Var.m91770i(zpa1Var) | xq00Var.m91770i(z9j0Var) | xq00Var.m91770i(uyi0VarM44490C);
                Object objM91750T = xq00Var.m91750T();
                if (zM91770i || objM91750T == t6x0.f217647t) {
                    uyi0Var = uyi0VarM44490C;
                    eeu0 eeu0Var = new eeu0(qpa1Var, zpa1Var, z9j0Var, uyi0Var, 28);
                    xq00Var.m91793t0(eeu0Var);
                    objM91750T = eeu0Var;
                } else {
                    uyi0Var = uyi0VarM44490C;
                }
                kgg1.m56342e(uyi0Var, str, null, null, null, null, null, null, (gh00) objM91750T, xq00Var, 0);
            }
            pgv0VarM91796v.f177419d = epa1Var;
        }
        xq00Var.m91757b0();
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            epa1Var = new epa1(zpa1Var, qpa1Var, z9j0Var, xf50Var, eh00Var, eh00Var2, i, 1);
            pgv0VarM91796v.f177419d = epa1Var;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m57699d(int i, boolean z, int i2, fxh0 fxh0Var, xq00 xq00Var, int i3) {
        int i4;
        xq00Var.m91775k0(-1227059060);
        if ((i3 & 6) == 0) {
            i4 = (xq00Var.m91762e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= xq00Var.m91768h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= xq00Var.m91762e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= xq00Var.m91766g(fxh0Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i4 & 1, (i4 & 1171) != 1170)) {
            Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
            boolean z2 = ((i4 & 14) == 4) | ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = g2h1.m43391a(context, i2, i);
                xq00Var.m91793t0(objM91750T);
            }
            k0y0.m55024h(xfs.m90512a((Drawable) objM91750T, xq00Var), qgj.f188480a, fxh0Var, r101.f194644L0, null, xq00Var, 3128 | ((i4 >> 3) & 896), 48);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xyz(i, i2, i3, fxh0Var, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m57700e(mh71 mh71Var, vh00 vh00Var, Throwable th, ibk ibkVar) {
        rjz rjzVar;
        if (ibkVar instanceof rjz) {
            rjzVar = (rjz) ibkVar;
            int i = rjzVar.f199925c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rjzVar.f199925c = i - Integer.MIN_VALUE;
            } else {
                rjzVar = new rjz(ibkVar);
            }
        } else {
            rjzVar = new rjz(ibkVar);
        }
        Object obj = rjzVar.f199924b;
        int i2 = rjzVar.f199925c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                rjzVar.f199923a = th;
                rjzVar.f199925c = 1;
                Object objMo24510D0 = vh00Var.mo24510D0(mh71Var, th, rjzVar);
                Object obj2 = yuk.f276404a;
                if (objMo24510D0 == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = rjzVar.f199923a;
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                y85.m93061f(th2, th);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static ykn m57701f(k8v0 k8v0Var, qkh qkhVar, l8v0 l8v0Var, dcm0 dcm0Var, w2a1 w2a1Var) {
        k8v0Var.getClass();
        qkhVar.getClass();
        dcm0Var.getClass();
        w2a1Var.getClass();
        return new ykn(k8v0Var, qkhVar, l8v0Var, dcm0Var);
    }

    /* JADX INFO: renamed from: g */
    public static kqp m57702g(boolean z, unq0 unq0Var, int i) {
        C1890ga c1890ga = C1890ga.f77933e;
        if ((i & 4) != 0) {
            unq0Var = unq0.f232220N0;
        }
        return new kqp(z, true, true, unq0Var, c1890ga, ld70.f132087c);
    }

    /* JADX INFO: renamed from: h */
    public static final Next m57703h(hwr0 hwr0Var, eh00 eh00Var) {
        return hwr0Var.f96025Y == lic1.f133768c ? Next.m15608j() : Next.m15605a((Set) eh00Var.invoke());
    }

    /* JADX INFO: renamed from: i */
    public static final void m57704i(niz nizVar) {
        if (nizVar instanceof mh71) {
            throw ((mh71) nizVar).f143721a;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final sd40 m57705j() {
        sd40 sd40Var = f127849g;
        if (sd40Var != null) {
            return sd40Var;
        }
        float f = 24;
        rd40 rd40Var = new rd40("Encore.Vector.SearchActive24", f, f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = c5b1.f34134a;
        long j = n6f.f150862b;
        pk31 pk31Var = new pk31(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new gcn0(15.356f, 10.558f));
        arrayList.add(new lcn0(0.0f, 2.623f, -2.16f, 4.75f, -4.823f, 4.75f));
        arrayList.add(new qcn0(-4.824f, -2.127f, -4.824f, -4.75f));
        arrayList.add(new qcn0(2.16f, -4.75f, 4.824f, -4.75f));
        arrayList.add(new qcn0(4.823f, 2.127f, 4.823f, 4.75f));
        rd40.m75320a(rd40Var, arrayList, pk31Var, 1.0f, 2, 1.0f);
        pk31 pk31Var2 = new pk31(j);
        sep sepVarM62656j = mrx0.m62656j(1.126f, 10.558f);
        sepVarM62656j.m77939m(0.0f, -5.14f, 4.226f, -9.28f, 9.407f, -9.28f);
        sepVarM62656j.m77939m(5.18f, 0.0f, 9.407f, 4.14f, 9.407f, 9.28f);
        sepVarM62656j.m77933g(9.16f, 9.16f, false, true, -2.077f, 5.816f);
        sepVarM62656j.m77944r(4.344f, 4.344f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, -1.414f, 1.414f);
        sepVarM62656j.m77944r(-4.353f, -4.353f);
        sepVarM62656j.m77933g(9.45f, 9.45f, false, true, -5.907f, 2.058f);
        sepVarM62656j.m77939m(-5.18f, 0.0f, -9.407f, -4.14f, -9.407f, -9.28f);
        sepVarM62656j.m77937k();
        sepVarM62656j.m77945s(10.533f, 3.278f);
        sepVarM62656j.m77939m(-4.105f, 0.0f, -7.407f, 3.274f, -7.407f, 7.28f);
        sepVarM62656j.m77950x(3.302f, 7.279f, 7.407f, 7.279f);
        sepVarM62656j.m77950x(7.407f, -3.273f, 7.407f, -7.28f);
        sepVarM62656j.m77939m(0.0f, -4.005f, -3.302f, -7.278f, -7.407f, -7.278f);
        sepVarM62656j.m77937k();
        rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var2, 1.0f, 2, 1.0f);
        sd40 sd40VarM75321b = rd40Var.m75321b();
        f127849g = sd40VarM75321b;
        return sd40VarM75321b;
    }

    /* JADX INFO: renamed from: k */
    public static final yxt m57706k(b250 b250Var) {
        r250 r250Var = (r250) b250Var.mo27941a(y4y.f269271g);
        if (r250Var != null) {
            return r250Var.f195052b;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static final String m57707l() {
        List list;
        ef41 ef41VarM64319a = nf41.m64319a(gn80.MULTIEVENT_BOTTOMSHEET);
        String str = (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null) ? null : (String) g6f.m43745s0(list);
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("No URI found for MULTIEVENT_BOTTOMSHEET");
    }

    /* JADX INFO: renamed from: m */
    public static final tjz m57708m(fiz fizVar, vh00 vh00Var) {
        return new tjz(fizVar, vh00Var);
    }

    /* JADX INFO: renamed from: n */
    public static final vjz m57709n(fiz fizVar, th00 th00Var) {
        return new vjz(fizVar, th00Var);
    }

    /* JADX INFO: renamed from: o */
    public static final void m57710o(a0l a0lVar, C2148n1 c2148n1, C2401t5 c2401t5) throws Throwable {
        String str;
        String str2 = a0lVar.f11098a;
        int i = a0lVar.f11099b;
        if (i == 1) {
            str = "STARTED";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "COMPLETED";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String str3 = a0lVar.f11101d;
        b2l b2lVar = new b2l(g6f.m43753y0(bk5.m29582E0(new String[]{str2, lowerCase, str3}), ":", null, null, null, 62));
        c2148n1.invoke(jq60.m54072r(b2lVar), jq60.m54073s(b2lVar));
        StringBuilder sb = new StringBuilder();
        sb.append(i == 1 ? "App startup reached " : "App startup finished with ");
        sb.append(str2);
        if (str3 != null) {
            sb.append(" (");
            sb.append(str3);
            sb.append(')');
        }
        sb.append(" after ");
        sb.append(a0lVar.f11100c);
        sb.append("ms");
        c2401t5.invoke(sb.toString());
    }

    /* JADX INFO: renamed from: p */
    public static final cts0 m57711p(cts0 cts0Var, boolean z) {
        if (cts0Var instanceof yss0) {
            yss0 yss0Var = (yss0) cts0Var;
            return new yss0(yss0Var.f275871a, yss0Var.f275872b, z);
        }
        if (cts0Var instanceof zss0) {
            zss0 zss0Var = (zss0) cts0Var;
            return new zss0(zss0Var.f285994a, zss0Var.f285995b, z);
        }
        if (cts0Var instanceof bts0) {
            bts0 bts0Var = (bts0) cts0Var;
            return new bts0(bts0Var.f30928a, bts0Var.f30929b, z);
        }
        if (!(cts0Var instanceof ats0)) {
            throw new NoWhenBranchMatchedException();
        }
        ats0 ats0Var = (ats0) cts0Var;
        return new ats0(ats0Var.f19741a, ats0Var.f19742b, z);
    }
}
