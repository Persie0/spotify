package p204p;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import com.spotify.playbacknative.AudioDriver;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ljf1 {

    /* JADX INFO: renamed from: a */
    public static final y5c f134081a = new y5c(6);

    /* JADX INFO: renamed from: b */
    public static sd40 f134082b;

    /* JADX INFO: renamed from: c */
    public static sd40 f134083c;

    /* JADX INFO: renamed from: a */
    public static final void m59149a(eh00 eh00Var, m0z m0zVar, th00 th00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1659197180);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(m0zVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(th00Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            yw70 yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61826j = mi21.m61826j(mi21.m61822f(1.0f, cxh0Var), leu.m58816b(xq00Var).f117232d.f137887c, 0.0f, 2);
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            float f2 = leu.m58816b(xq00Var).f117230b.f224761d;
            j4m0 j4m0Var = new j4m0(f, f2, f, f2);
            boolean z = ((i3 & 14) == 4) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i3 & 896) == 256);
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new k0w(m0zVar, eh00Var, th00Var, 12);
                xq00Var.m91793t0(objM91750T);
            }
            kk40.m56662d(fxh0VarM61826j, yw70VarM30763a, j4m0Var, (gh00) objM91750T, xq00Var, 0, 0);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new chr(eh00Var, m0zVar, th00Var, fxh0Var2, i, 27);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m59150b(myq0 myq0Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        long j;
        long j2;
        cxh0 cxh0Var;
        xq00 xq00Var2 = xq00Var;
        int i3 = myq0Var.f148503b;
        xq00Var2.m91775k0(1959423920);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91766g(myq0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(gh00Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (xq00Var2.m91752Y(i4 & 1, (i4 & 147) != 146)) {
            Context context = (Context) xq00Var2.m91774k(AndroidCompositionLocals_androidKt.f502b);
            boolean z = (i4 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new xzp0(11, gh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM47247x = hdi.m47247x(cxh0Var2, false, null, null, null, (eh00) objM91750T, 15);
            int iM38547C = edb.m38547C(i3);
            if (iM38547C == 0) {
                xq00Var2.m91771i0(622357945);
                xq00Var2.m91788r(false);
                gfp gfpVar = leu.f132721a;
                j = ((diu) iiu.f102631a.f258037b).f49484i;
            } else if (iM38547C == 1) {
                xq00Var2.m91771i0(622359918);
                j = leu.m58815a(xq00Var2).f112823a.f229876c;
                xq00Var2.m91788r(false);
            } else {
                if (iM38547C != 2) {
                    throw lq51.m59703i(622356141, xq00Var2, false);
                }
                xq00Var2.m91771i0(622361593);
                xq00Var2.m91788r(false);
                gfp gfpVar2 = leu.f132721a;
                j = ((diu) iiu.f102631a.f258037b).f49484i;
            }
            float f = 48;
            fxh0 fxh0VarM39673I = epv0.m39673I("presave-button-tag", zsf1.m96866z(mwg1.m63030j(i3 == 2 ? 1 : 0, leu.m58815a(xq00Var2).f112825c.f221219b, nec.m64246i(fxh0VarM47247x, j, hmx0.m47993b(f)), hmx0.m47993b(f)), leu.m58816b(xq00Var2).f117230b.f224762e, leu.m58816b(xq00Var2).f117230b.f224759b));
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27614e, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM39673I);
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
            ol80 ol80Var = new ol80(1);
            String str = myq0Var.f148502a;
            int iM38547C2 = edb.m38547C(i3);
            if (iM38547C2 == 0) {
                j2 = ((diu) iiu.f102631a.f258037b).f49476a;
            } else if (iM38547C2 == 1) {
                j2 = ((diu) iiu.f102631a.f258037b).f49477b;
            } else {
                if (iM38547C2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j2 = ((diu) iiu.f102631a.f258037b).f49476a;
            }
            ahf1.m25932d(str, epv0.m39673I("presave-button-label-tag", zsf1.m96865y(leu.m58816b(xq00Var2).f117230b.f224759b, cxh0Var2)), leu.m58818d(xq00Var2).f64975k, j2, new h171(5), null, 2, false, ol80Var, 0, null, xq00Var, 0, 0, 1696);
            xq00Var2 = xq00Var;
            int iM38547C3 = edb.m38547C(i3);
            if (iM38547C3 == 0) {
                cxh0Var = cxh0Var2;
                xq00Var2.m91771i0(1482713432);
                String str2 = myq0Var.f148502a;
                long j3 = ((diu) iiu.f102631a.f258037b).f49476a;
                float f2 = 15;
                fxh0 fxh0VarM39673I2 = epv0.m39673I("presave-button-icon-tag", mi21.m61835s(cxh0Var, f2, f2));
                r9b0 r9b0VarM69997p = phf1.m69997p(context, R.raw.save_button_black);
                gz30.m46185a(new q94(xtm0.m92066M(r9b0VarM69997p, r9b0VarM69997p.getIntrinsicWidth(), r9b0VarM69997p.getIntrinsicHeight(), Bitmap.Config.ARGB_8888)), str2, fxh0VarM39673I2, j3, xq00Var2, 0, 0);
                xq00Var2.m91788r(false);
            } else if (iM38547C3 == 1) {
                xq00Var2.m91771i0(1483017325);
                String str3 = myq0Var.f148502a;
                float f3 = 15;
                cxh0Var = cxh0Var2;
                fxh0 fxh0VarM39673I3 = epv0.m39673I("presave-button-icon-tag", mi21.m61835s(cxh0Var, f3, f3));
                r9b0 r9b0VarM69997p2 = phf1.m69997p(context, R.raw.save_now_undo_white);
                gz30.m46185a(new q94(xtm0.m92066M(r9b0VarM69997p2, r9b0VarM69997p2.getIntrinsicWidth(), r9b0VarM69997p2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888)), str3, fxh0VarM39673I3, 0L, xq00Var2, 0, 8);
                xq00Var2.m91788r(false);
            } else {
                if (iM38547C3 != 2) {
                    throw lq51.m59703i(602017439, xq00Var2, false);
                }
                xq00Var2.m91771i0(1483258412);
                xq00Var2.m91788r(false);
                cxh0Var = cxh0Var2;
            }
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dzm0(i, 22, myq0Var, fxh0Var2, gh00Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m59151c(boolean z, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-560039121);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new vd90(11, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            xq00Var2 = xq00Var;
            kku.m56742b((eh00) objM91750T, null, null, jqg.f114909a, jqg.f114910b, rkk.m75772x(1791806897, new vca0(gh00Var, z, 0), xq00Var), rkk.m75772x(1801577458, new i1z(12, gh00Var), xq00Var), xq00Var2, 1797120, 6);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new s20(i, gh00Var, z, 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m59152d(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1273067752);
        int i2 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fxh0 fxh0VarM39673I = epv0.m39673I("unboxing_hub_entry_point", zsf1.m96865y(16, nec.m64246i(r9g1.m75068p(fxh0Var, hmx0.m47993b(8)), leu.m58815a(xq00Var).f112823a.f229874a.f123093a, kxf1.f127485a)));
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = new wp81(6, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var2 = (eh00) objM91750T;
            if (wl51.m88460J0("Your Benefits")) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            zn91.m96545d(fxh0VarM39673I, null, null, null, null, null, false, null, null, new peu(new t40("Your Benefits"), eh00Var2), null, reh.f198368a, xq00Var, 0, 48, 1534);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zoc0(fxh0Var, eh00Var, i, 20);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m59153e(peu peuVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-289335136);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(peuVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            float f = leu.m58816b(xq00Var).f117230b.f224759b;
            float f2 = leu.m58816b(xq00Var).f117230b.f224759b;
            xhu xhuVar = new xhu(new j4m0(f, f2, f, f2), leu.m58816b(xq00Var).f117232d.f137886b, leu.m58816b(xq00Var).f117235g.f159604b, leu.m58816b(xq00Var).f117230b.f224760c, leu.m58818d(xq00Var).f64974j);
            int i3 = i2;
            z520.m95426f(peuVar, aiu.f16093c, xhuVar, fxh0Var, 0, null, null, zhg.f282917a, null, null, null, false, null, null, xq00Var, (i3 & 14) | 12582912 | ((i3 << 6) & 7168), 0, 16240);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new o0z(peuVar, fxh0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m59154f(h0z h0zVar, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        AbstractC1806e9 yhuVar;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(219982381);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(h0zVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            if (!h0zVar.f86387c) {
                xq00Var.m91771i0(949675011);
                xq00Var.m91788r(false);
                yhuVar = aiu.f16093c;
            } else if (h0zVar.f86388d) {
                xq00Var.m91771i0(-624770151);
                Object objM91750T = xq00Var.m91750T();
                if (objM91750T == ia7Var) {
                    objM91750T = xyy.f267463f;
                    xq00Var.m91793t0(objM91750T);
                }
                zhu zhuVar = new zhu(4, null, (th00) objM91750T, null, 10);
                xq00Var.m91788r(false);
                yhuVar = zhuVar;
            } else {
                xq00Var.m91771i0(949682298);
                xq00Var.m91788r(false);
                yhuVar = new yhu(4);
            }
            float f = leu.m58816b(xq00Var).f117230b.f224759b;
            float f2 = leu.m58816b(xq00Var).f117230b.f224759b;
            xhu xhuVar = new xhu(new j4m0(f, f2, f, f2), leu.m58816b(xq00Var).f117232d.f137886b, leu.m58816b(xq00Var).f117235g.f159604b, leu.m58816b(xq00Var).f117230b.f224760c, leu.m58818d(xq00Var).f64974j);
            boolean z = h0zVar.f86389e;
            boolean z2 = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new hfy(14, eh00Var);
                xq00Var.m91793t0(objM91750T2);
            }
            peu peuVar = new peu(u40.f226523c, (eh00) objM91750T2);
            String str = "filter_chip_" + h0zVar.f86386b.name();
            cxh0 cxh0Var = cxh0.f43038a;
            z520.m95426f(peuVar, yhuVar, xhuVar, epv0.m39673I(str, cxh0Var), 0, null, null, null, null, null, null, z, null, rkk.m75772x(-1735507790, new myy(h0zVar, 1), xq00Var), xq00Var, 0, 3072, 6128);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new evs(h0zVar, eh00Var, fxh0Var2, i, 23);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final String m59155g(Method method) {
        return method.getName() + bk5.m29592O0(method.getParameterTypes(), "", "(", ")", hrl0.f94458R0, 24) + bov0.m30094b(method.getReturnType());
    }

    /* JADX INFO: renamed from: h */
    public static final LayerDrawable m59156h(Context context, Drawable drawable) {
        Drawable drawable2 = context.getDrawable(R.drawable.encore_selected_icon_indicator_dot);
        wj50.m88279p(drawable2);
        drawable2.setTintList(lzj.m60387w(context, R.color.encore_accent_color));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        int intrinsicWidth = (drawable.getIntrinsicWidth() - drawable2.getIntrinsicWidth()) / 2;
        int iM88767v = wqg1.m88767v(6.0f, context.getResources()) + drawable.getIntrinsicHeight();
        layerDrawable.setLayerGravity(0, 16);
        layerDrawable.setLayerInset(1, intrinsicWidth, iM88767v, intrinsicWidth, 0);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: i */
    public static final String m59157i(int i) {
        return s571.m77246e(i, "appWidget-");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX INFO: renamed from: j */
    public static final long m59158j(float f, float f2, float f3, float f4) {
        double dLog;
        if (f2 == 0.0f) {
            return 9223372036854L;
        }
        double d = f;
        double d2 = f2;
        double d3 = f3;
        double d4 = f4;
        double d5 = 1.0f;
        double dSqrt = d2 * 2.0d * Math.sqrt(d);
        double d6 = (dSqrt * dSqrt) - (d * 4.0d);
        double dSqrt2 = d6 < 0.0d ? 0.0d : Math.sqrt(d6);
        double d7 = -dSqrt;
        double d8 = (d7 + dSqrt2) * 0.5d;
        double dSqrt3 = (d6 < 0.0d ? Math.sqrt(Math.abs(d6)) : 0.0d) * 0.5d;
        double d9 = (d7 - dSqrt2) * 0.5d;
        if (d4 == 0.0d && d3 == 0.0d) {
            return 0L;
        }
        if (d4 < 0.0d) {
            d3 = -d3;
        }
        double dAbs = Math.abs(d4);
        double dAbs2 = Double.MAX_VALUE;
        if (d2 > 1.0d) {
            double d10 = d8 - d9;
            double d11 = ((d8 * dAbs) - d3) / d10;
            double d12 = dAbs - d11;
            dLog = Math.log(Math.abs(d5 / d12)) / d8;
            double dLog2 = Math.log(Math.abs(d5 / d11)) / d9;
            if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                dLog = dLog2;
            } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, dLog2);
            }
            double d13 = d12 * d8;
            double dLog3 = Math.log(d13 / ((-d11) * d9)) / (d9 - d8);
            if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                d5 = -d5;
            } else if (dLog3 <= 0.0d) {
                dLog = Math.log((-((d11 * d9) * d9)) / (d13 * d8)) / d10;
            } else if ((-((Math.exp(dLog3 * d9) * d11) + (Math.exp(d8 * dLog3) * d12))) < d5) {
                d5 = -d5;
                dLog = (d11 <= 0.0d || d12 >= 0.0d) ? dLog : 0.0d;
            } else {
                dLog = Math.log((-((d11 * d9) * d9)) / (d13 * d8)) / d10;
            }
            double d14 = d11 * d9;
            if (Math.abs((Math.exp(d9 * dLog) * d14) + (Math.exp(d8 * dLog) * d13)) >= 1.0E-4d) {
                int i = 0;
                while (dAbs2 > 0.001d && i < 100) {
                    i++;
                    double d15 = d8 * dLog;
                    double d16 = d9 * dLog;
                    double dExp = dLog - ((((Math.exp(d16) * d11) + (Math.exp(d15) * d12)) + d5) / ((Math.exp(d16) * d14) + (Math.exp(d15) * d13)));
                    dAbs2 = Math.abs(dLog - dExp);
                    dLog = dExp;
                }
            }
        } else if (d2 < 1.0d) {
            double d17 = (d3 - (d8 * dAbs)) / dSqrt3;
            dLog = Math.log(d5 / Math.sqrt((d17 * d17) + (dAbs * dAbs))) / d8;
        } else {
            double d18 = d8 * dAbs;
            double d19 = d3 - d18;
            double dLog4 = Math.log(Math.abs(d5 / dAbs)) / d8;
            double dLog5 = Math.log(Math.abs(d5 / d19));
            double dLog6 = dLog5;
            for (int i2 = 0; i2 < 6; i2++) {
                dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d8));
            }
            double d20 = dLog6 / d8;
            if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                dLog4 = d20;
            } else if ((Double.doubleToRawLongBits(d20) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog4 = Math.max(dLog4, d20);
            }
            double d21 = (-(d18 + d19)) / (d8 * d19);
            double d22 = d8 * d21;
            double dExp2 = (Math.exp(d22) * d19 * d21) + (Math.exp(d22) * dAbs);
            if (Double.isNaN(d21) || d21 <= 0.0d) {
                d5 = -d5;
            } else if (d21 <= 0.0d || (-dExp2) >= d5) {
                dLog4 = (-(2.0d / d8)) - (dAbs / d19);
            } else {
                if (d19 < 0.0d && dAbs > 0.0d) {
                    dLog4 = 0.0d;
                }
                d5 = -d5;
            }
            dLog = dLog4;
            int i3 = 0;
            while (dAbs2 > 0.001d && i3 < 100) {
                i3++;
                double d23 = d8 * dLog;
                double dExp3 = dLog - (((Math.exp(d23) * ((d19 * dLog) + dAbs)) + d5) / (Math.exp(d23) * (((((double) 1) + d23) * d19) + d18)));
                dAbs2 = Math.abs(dLog - dExp3);
                dLog = dExp3;
            }
        }
        return (long) (dLog * 1000.0d);
    }

    /* JADX INFO: renamed from: k */
    public static u0m m59159k(String str) {
        Object next;
        C2042k7 c2042k7 = new C2042k7(u0m.f225533c, 0);
        do {
            if (!c2042k7.hasNext()) {
                next = null;
                break;
            }
            next = c2042k7.next();
        } while (!bm51.m29797h0(((u0m) next).name(), str, true));
        u0m u0mVar = (u0m) next;
        return u0mVar == null ? u0m.f225531a : u0mVar;
    }

    /* JADX INFO: renamed from: l */
    public static final AppWidgetManager m59160l(Context context) {
        return (AppWidgetManager) context.getSystemService("appwidget");
    }

    /* JADX INFO: renamed from: m */
    public static final pv01 m59161m(rv01 rv01Var) {
        if (rv01Var instanceof pv01) {
            return (pv01) rv01Var;
        }
        if (rv01Var instanceof iv01) {
            return ((iv01) rv01Var).f106063b;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m59162n(ie5 ie5Var) {
        int i = ie5Var.f101318a;
        return Integer.MIN_VALUE <= i && i < -1;
    }

    /* JADX INFO: renamed from: o */
    public static cbh0 m59163o(int i) {
        st91 st91Var = st91.f213865b;
        return new cbh0(i);
    }

    /* JADX INFO: renamed from: p */
    public static final String m59164p(ie5 ie5Var) {
        return m59157i(ie5Var.f101318a);
    }

    /* JADX INFO: renamed from: q */
    public static Next m59165q(yuf0 yuf0Var, anf0 anf0Var) {
        b791 b791Var = yuf0Var.f276343P0;
        i0r0 i0r0Var = b791Var.f24195a;
        o1z o1zVar = i0r0Var.f97300Y;
        if (o1zVar == null) {
            o1zVar = new o1z(null, null, null);
        }
        o1z o1zVarM66089c = o1z.m66089c(o1zVar, anf0Var.f17433a, null, 6);
        o1z o1zVar2 = yuf0Var.f276343P0.f24195a.f97301Z;
        if (o1zVar2 == null) {
            o1zVar2 = new o1z(null, null, null);
        }
        return l6l.m58366o(l6l.m58375x(l6l.m58371t(Next.m15606h(yuf0.m94655c(yuf0Var, null, null, null, null, null, null, null, null, null, null, b791.m28366c(b791Var, i0r0.m49376c(i0r0Var, null, null, null, null, null, null, null, null, null, null, o1zVarM66089c, o1z.m66089c(o1zVar2, anf0Var.f17434b, null, 6), null, null, 26615), null, false, false, 14), null, null, null, null, false, 0, null, null, 0, 0, null, null, null, null, null, null, false, null, null, null, null, null, -131073, AudioDriver.SPOTIFY_MAX_VOLUME)))), 3);
    }

    /* JADX INFO: renamed from: r */
    public static String m59166r(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(m59167s(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(m59167s(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public static String m59167s(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strM36618r = dq60.m36618r(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM36618r), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strM36618r.length() + 8 + name2.length() + 1);
            klh.m56844p(sb, "<", strM36618r, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
