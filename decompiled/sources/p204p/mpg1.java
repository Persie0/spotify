package p204p;

import android.view.View;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.p201km.InconsistentKotlinMetadataException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mpg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f146020a;

    /* JADX INFO: renamed from: b */
    public static sd40 f146021b;

    /* JADX INFO: renamed from: a */
    public static final void m62465a(int i, int i2, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(331081126);
        int i3 = i2 | (xq00Var2.m91762e(i) ? 4 : 2) | (xq00Var2.m91768h(z) ? 32 : 16) | (xq00Var2.m91770i(eh00Var) ? 256 : 128) | 3072;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            long j = leu.m58815a(xq00Var2).f112824b.f138757a;
            long j2 = leu.m58815a(xq00Var2).f112823a.f229876c;
            wwu wwuVar = z ? qou.f191038c : mou.f145743c;
            String strM54971F = k0e1.m54971F(R.plurals.accessibility_grouped_speakers_count, i, new Object[]{Integer.valueOf(i)}, xq00Var2);
            String strM54977L = k0e1.m54977L(z ? R.string.accessibility_state_expanded : R.string.accessibility_state_collapsed, xq00Var2);
            String strM54977L2 = k0e1.m54977L(z ? R.string.accessibility_group_toggle_collapse : R.string.accessibility_group_toggle_expand, xq00Var2);
            vb9 vb9Var = d7f0.f46142M0;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96866z = zsf1.m96866z(zoz0.m96644b(hdi.m47247x(nec.m64246i(r9g1.m75068p(epv0.m39673I("group-toggle", cxh0Var), hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.f148189e)), j, kxf1.f127485a), false, strM54977L2, new tix0(0), null, eh00Var, 9), false, new C2026js(strM54971F, strM54977L, 7)), leu.m58816b(xq00Var2).f117230b.f224761d, leu.m58816b(xq00Var2).f117230b.f224759b);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, vb9Var, xq00Var2, 48);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96866z);
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
            hpu hpuVar = hpu.f93849c;
            fxh0 fxh0VarM61834r = mi21.m61834r(leu.m58816b(xq00Var2).f117235g.f159604b, cxh0Var);
            int i4 = hpu.f93850d | 48;
            qgj qgjVar = qgj.f188480a;
            y85.m93057b(hpuVar, qgjVar, fxh0VarM61834r, j2, 0L, false, xq00Var2, i4, 48);
            String strValueOf = String.valueOf(i);
            if71 if71Var = leu.m58818d(xq00Var2).f64975k;
            ol80 ol80Var = new ol80(1);
            fxh0 fxh0VarM96832C = zsf1.m96832C(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224759b, 0.0f, 0.0f, 0.0f, 14);
            Object objM91750T = xq00Var2.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = r2r.f195211i;
                xq00Var2.m91793t0(objM91750T);
            }
            ahf1.m25932d(strValueOf, zoz0.m96644b(fxh0VarM96832C, false, (gh00) objM91750T), if71Var, j2, null, null, 0, false, ol80Var, 0, null, xq00Var, 0, 0, 1776);
            xq00Var2 = xq00Var;
            y85.m93057b(wwuVar, qgjVar, zsf1.m96832C(mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159603a, cxh0Var), leu.m58816b(xq00Var).f117230b.f224759b, 0.0f, 0.0f, 0.0f, 14), j2, 0L, false, xq00Var2, 56, 48);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gk7(i, z, eh00Var, fxh0Var2, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m62466b(gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-325231230);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            String strM54977L = k0e1.m54977L(R.string.something_went_wrong_error_title, xq00Var);
            ev51 ev51Var = new ev51(k0e1.m54977L(R.string.something_went_wrong_error_subtitle, xq00Var));
            String strM54977L2 = k0e1.m54977L(R.string.try_again_button, xq00Var);
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new tc00(13, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            glg1.m45152c(strM54977L, strM54977L2, ev51Var, true, (eh00) objM91750T, xq00Var, 3072, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new t20(i, gh00Var, false, 15);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m62467c(int i, xq00 xq00Var, boolean z) {
        xq00Var.m91775k0(-2043349501);
        int i2 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            View view = (View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zM91770i = xq00Var.m91770i(view) | ((i2 & 14) == 4);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new voh(view, z, (fbk) null);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49237i(boolValueOf, (th00) objM91750T, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new op0(i, 7, z);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m62468d(aac0 aac0Var, gh00 gh00Var, li80 li80Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1360030427);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(aac0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? xq00Var.m91766g(li80Var) : xq00Var.m91770i(li80Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            WeakHashMap weakHashMap = cxd1.f42984x;
            ni80 ni80Var = new ni80(bxd1.m30815d(xq00Var).f42991g, 32);
            fyf fyfVarM75772x = rkk.m75772x(-1038151544, new hgb0(13, li80Var, gh00Var), xq00Var);
            fyf fyfVarM75772x2 = rkk.m75772x(1538096770, new p220(aac0Var, li80Var, gh00Var, 25), xq00Var);
            int i4 = ((i3 >> 9) & 14) | 24624;
            cxh0 cxh0Var = cxh0.f43038a;
            vig1.m85649d(cxh0Var, fyfVarM75772x, null, ni80Var, fyfVarM75772x2, xq00Var, i4, 4);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mg60((Object) aac0Var, gh00Var, (Object) li80Var, (Object) fxh0Var2, i, 29);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m62469e(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(355632639);
        int i2 = i | (xq00Var2.m91770i(eh00Var) ? 4 : 2) | 48;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96830A);
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
            cxh0 cxh0Var2 = cxh0Var;
            ahf1.m25932d(tfe.m80651i(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224761d, xq00Var2, R.string.notes_sharing_reminder_title, xq00Var2), mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var2).f64969e, leu.m58815a(xq00Var2).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var2, 0, 0, 2016);
            ahf1.m25932d(tfe.m80651i(cxh0Var2, leu.m58816b(xq00Var2).f117230b.f224761d, xq00Var2, R.string.notes_sharing_reminder_body, xq00Var2), mi21.m61822f(1.0f, cxh0Var2), leu.m58818d(xq00Var2).f64974j, leu.m58815a(xq00Var2).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var2, 0, 0, 2016);
            riw0.m75615i(xq00Var2, mi21.m61824h(leu.m58816b(xq00Var2).f117230b.f224763f, cxh0Var2));
            tgu tguVar = new tgu(4);
            String strM54977L = k0e1.m54977L(R.string.notes_sharing_reminder_continue, xq00Var2);
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            dyu.m37371c(new peu(new t40(strM54977L), eh00Var), tguVar, null, sdu.f208086a, null, null, null, null, null, null, owg.f170711a, xq00Var, 0, 48, 2028);
            xq00Var2 = xq00Var;
            AbstractC0000a.m22u(cxh0Var2, leu.m58816b(xq00Var2).f117230b.f224768k, xq00Var2, true);
            fxh0Var2 = cxh0Var2;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zoc0(eh00Var, fxh0Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m62470f(eju ejuVar, oh21 oh21Var, fxh0 fxh0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1089611880);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(ejuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(oh21Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zM91770i = xq00Var.m91770i(ejuVar) | ((i2 & 7168) == 2048);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new xqm0(ejuVar, gh00Var, 5);
                xq00Var.m91793t0(objM91750T);
            }
            gh00 gh00Var2 = (gh00) objM91750T;
            boolean zM91770i2 = xq00Var.m91770i(oh21Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                objM91750T2 = new gem0(oh21Var, 12);
                xq00Var.m91793t0(objM91750T2);
            }
            g0b1.m43261b(gh00Var2, fxh0Var, (gh00) objM91750T2, xq00Var, (i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i0m0(i, 2, ejuVar, oh21Var, fxh0Var, gh00Var, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m62471g(fyf fyfVar, String str, fxh0 fxh0Var, boolean z, String str2, tdu tduVar, peu peuVar, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0VarM31947l;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(1048113910);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91768h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91766g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? xq00Var.m91766g(tduVar) : xq00Var.m91770i(tduVar) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= xq00Var.m91766g(peuVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 67108864 : 33554432;
        }
        if (xq00Var.m91752Y(i3 & 1, (38347923 & i3) != 38347922)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            fxh0 fxh0VarM61818b = mi21.m61818b(mi21.m61820d(1.0f, fxh0Var), 0.0f, 70, 1);
            fxh0 fxh0Var2 = cxh0.f43038a;
            if (gh00Var == null) {
                xq00Var.m91771i0(-50243065);
                xq00Var.m91788r(false);
                fxh0VarM31947l = null;
            } else {
                xq00Var.m91771i0(-50243064);
                boolean zM91766g = xq00Var.m91766g(gh00Var);
                Object objM91750T = xq00Var.m91750T();
                if (zM91766g || objM91750T == ia7Var) {
                    objM91750T = new ons0(8, gh00Var);
                    xq00Var.m91793t0(objM91750T);
                }
                fxh0VarM31947l = c9g1.m31947l(fxh0Var2, tduVar, (gh00) objM91750T);
                xq00Var.m91788r(false);
            }
            if (fxh0VarM31947l != null) {
                fxh0Var2 = fxh0VarM31947l;
            }
            fxh0 fxh0VarMo34315F = fxh0VarM61818b.mo34315F(fxh0Var2);
            int i4 = i3;
            wb9 wb9Var = d7f0.f46174i;
            fmx0 fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148188d);
            boolean z2 = (i4 & 3670016) == 1048576;
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new zej0(2, 29, false);
                xq00Var.m91793t0(objM91750T2);
            }
            zn91.m96545d(fxh0VarMo34315F, wb9Var, fmx0VarM47993b, new rju(2, (th00) objM91750T2, null, null, 12), null, emk.m39455x(tduVar, xq00Var), false, null, zbp.f281359f, peuVar, null, rkk.m75772x(-1117433875, new C2228ou(fyfVar, str, z, str2), xq00Var), xq00Var, ((i4 << 6) & 1879048192) | 100663344, 48, 1232);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cp5(fyfVar, str, fxh0Var, z, str2, tduVar, peuVar, gh00Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[PHI: r2 r4 r5 r6 r7 r8
      0x00f1: PHI (r2v30 int) = (r2v24 int), (r2v32 int) binds: [B:90:0x011d, B:73:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r4v11 p.fxh0) = (r4v7 p.fxh0), (r4v13 p.fxh0) binds: [B:90:0x011d, B:73:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r5v9 boolean) = (r5v5 boolean), (r5v11 boolean) binds: [B:90:0x011d, B:73:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r6v10 java.lang.String) = (r6v7 java.lang.String), (r6v12 java.lang.String) binds: [B:90:0x011d, B:73:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r7v9 p.tdu) = (r7v5 p.tdu), (r7v11 p.tdu) binds: [B:90:0x011d, B:73:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r8v10 p.peu) = (r8v7 p.peu), (r8v12 p.peu) binds: [B:90:0x011d, B:73:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0108  */
    /* JADX WARN: Code duplicated, block: B:85:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0113  */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:91:0x011f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    /* JADX WARN: Code duplicated, block: B:96:0x0168  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m62472h(wwu wwuVar, String str, fxh0 fxh0Var, boolean z, String str2, tdu tduVar, peu peuVar, gh00 gh00Var, xq00 xq00Var, int i, int i2) {
        fxh0 fxh0Var2;
        int i3;
        boolean z2;
        int i4;
        String str3;
        int i5;
        tdu tduVar2;
        int i6;
        int i7;
        peu peuVar2;
        int i8;
        int i9;
        int i10;
        gh00 gh00Var2;
        int i11;
        int i12;
        int i13;
        boolean z3;
        fxh0 fxh0Var3;
        boolean z4;
        String str4;
        tdu tduVar3;
        peu peuVar3;
        gh00 gh00Var3;
        pgv0 pgv0VarM91796v;
        int i14;
        fxh0 fxh0Var4;
        boolean z5;
        String str5;
        tdu tduVar4;
        peu peuVar4;
        gh00 gh00Var4;
        xq00Var.m91775k0(865224769);
        int i15 = i | ((i & 8) == 0 ? xq00Var.m91766g(wwuVar) : xq00Var.m91770i(wwuVar) ? 4 : 2) | (xq00Var.m91766g(str) ? 32 : 16);
        int i16 = i2 & 4;
        if (i16 != 0) {
            i3 = i15 | 384;
            fxh0Var2 = fxh0Var;
        } else {
            fxh0Var2 = fxh0Var;
            i3 = i15 | (xq00Var.m91766g(fxh0Var2) ? 256 : 128);
        }
        int i17 = i2 & 8;
        if (i17 != 0) {
            i4 = i3 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (xq00Var.m91768h(z2) ? 2048 : 1024);
        }
        int i18 = i2 & 16;
        if (i18 != 0) {
            i5 = i4 | 24576;
            str3 = str2;
        } else {
            str3 = str2;
            i5 = i4 | (xq00Var.m91766g(str3) ? 16384 : 8192);
        }
        if ((i2 & 32) == 0) {
            tduVar2 = tduVar;
            int i19 = xq00Var.m91766g(tduVar2) ? 131072 : 65536;
            i6 = i5 | i19;
            i7 = i2 & 64;
            if (i7 != 0) {
                i9 = i6 | 1572864;
                peuVar2 = peuVar;
            } else {
                peuVar2 = peuVar;
                if (xq00Var.m91766g(peuVar2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i9 = i6 | i8;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                i12 = i9 | 12582912;
                gh00Var2 = gh00Var;
            } else {
                gh00Var2 = gh00Var;
                if (xq00Var.m91770i(gh00Var2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i12 = i9 | i11;
            }
            i13 = i12;
            if ((i12 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (xq00Var.m91752Y(i13 & 1, z3)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0 || xq00Var.m91735E()) {
                    if (i16 != 0) {
                        fxh0Var2 = cxh0.f43038a;
                    }
                    if (i17 != 0) {
                        z2 = false;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    }
                    if ((i2 & 32) != 0) {
                        i14 = i13 & (-458753);
                        tduVar2 = rdu.f198207a;
                    } else {
                        i14 = i13;
                    }
                    if (i7 != 0) {
                        peuVar2 = null;
                    }
                    fxh0Var4 = fxh0Var2;
                    z5 = z2;
                    str5 = str3;
                    tduVar4 = tduVar2;
                    peuVar4 = peuVar2;
                    if (i10 != 0) {
                        gh00Var4 = null;
                    } else {
                        gh00Var4 = gh00Var2;
                    }
                } else {
                    xq00Var.m91757b0();
                    if ((i2 & 32) != 0) {
                        i14 = i13 & (-458753);
                        fxh0Var4 = fxh0Var2;
                        z5 = z2;
                        str5 = str3;
                        tduVar4 = tduVar2;
                        peuVar4 = peuVar2;
                        gh00Var4 = gh00Var2;
                    } else {
                        fxh0Var4 = fxh0Var2;
                        z5 = z2;
                        str5 = str3;
                        tduVar4 = tduVar2;
                        peuVar4 = peuVar2;
                        gh00Var4 = gh00Var2;
                        i14 = i13;
                    }
                }
                xq00Var.m91790s();
                fyf fyfVarM75772x = rkk.m75772x(-576191427, new y92(wwuVar, z5, 11), xq00Var);
                int i20 = (i14 & ContentType.LONG_FORM_ON_DEMAND) | 6 | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14);
                int i21 = i14 << 3;
                m62471g(fyfVarM75772x, str, fxh0Var4, z5, str5, tduVar4, peuVar4, gh00Var4, xq00Var, i20 | (29360128 & i21) | (i21 & 234881024));
                fxh0Var3 = fxh0Var4;
                z4 = z5;
                str4 = str5;
                tduVar3 = tduVar4;
                peuVar3 = peuVar4;
                gh00Var3 = gh00Var4;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                z4 = z2;
                str4 = str3;
                tduVar3 = tduVar2;
                peuVar3 = peuVar2;
                gh00Var3 = gh00Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new t4e(wwuVar, str, fxh0Var3, z4, str4, tduVar3, peuVar3, gh00Var3, i, i2);
            }
        }
        tduVar2 = tduVar;
        i6 = i5 | i19;
        i7 = i2 & 64;
        if (i7 != 0) {
            i9 = i6 | 1572864;
            peuVar2 = peuVar;
        } else {
            peuVar2 = peuVar;
            if (xq00Var.m91766g(peuVar2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i9 = i6 | i8;
        }
        i10 = i2 & 128;
        if (i10 != 0) {
            i12 = i9 | 12582912;
            gh00Var2 = gh00Var;
        } else {
            gh00Var2 = gh00Var;
            if (xq00Var.m91770i(gh00Var2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i12 = i9 | i11;
        }
        i13 = i12;
        if ((i12 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq00Var.m91752Y(i13 & 1, z3)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    fxh0Var2 = cxh0.f43038a;
                }
                if (i17 != 0) {
                    z2 = false;
                }
                if (i18 != 0) {
                    str3 = null;
                }
                if ((i2 & 32) != 0) {
                    i14 = i13 & (-458753);
                    tduVar2 = rdu.f198207a;
                } else {
                    i14 = i13;
                }
                if (i7 != 0) {
                    peuVar2 = null;
                }
                fxh0Var4 = fxh0Var2;
                z5 = z2;
                str5 = str3;
                tduVar4 = tduVar2;
                peuVar4 = peuVar2;
                if (i10 != 0) {
                    gh00Var4 = null;
                } else {
                    gh00Var4 = gh00Var2;
                }
            } else {
                if (i16 != 0) {
                    fxh0Var2 = cxh0.f43038a;
                }
                if (i17 != 0) {
                    z2 = false;
                }
                if (i18 != 0) {
                    str3 = null;
                }
                if ((i2 & 32) != 0) {
                    i14 = i13 & (-458753);
                    tduVar2 = rdu.f198207a;
                } else {
                    i14 = i13;
                }
                if (i7 != 0) {
                    peuVar2 = null;
                }
                fxh0Var4 = fxh0Var2;
                z5 = z2;
                str5 = str3;
                tduVar4 = tduVar2;
                peuVar4 = peuVar2;
                if (i10 != 0) {
                    gh00Var4 = null;
                } else {
                    gh00Var4 = gh00Var2;
                }
            }
            xq00Var.m91790s();
            fyf fyfVarM75772x2 = rkk.m75772x(-576191427, new y92(wwuVar, z5, 11), xq00Var);
            int i22 = (i14 & ContentType.LONG_FORM_ON_DEMAND) | 6 | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14);
            int i23 = i14 << 3;
            m62471g(fyfVarM75772x2, str, fxh0Var4, z5, str5, tduVar4, peuVar4, gh00Var4, xq00Var, i22 | (29360128 & i23) | (i23 & 234881024));
            fxh0Var3 = fxh0Var4;
            z4 = z5;
            str4 = str5;
            tduVar3 = tduVar4;
            peuVar3 = peuVar4;
            gh00Var3 = gh00Var4;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
            z4 = z2;
            str4 = str3;
            tduVar3 = tduVar2;
            peuVar3 = peuVar2;
            gh00Var3 = gh00Var2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new t4e(wwuVar, str, fxh0Var3, z4, str4, tduVar3, peuVar3, gh00Var3, i, i2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m62473i(float f, int i, xq00 xq00Var, fxh0 fxh0Var) {
        float f2;
        xq00 xq00Var2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(2112814698);
        int i2 = (xq00Var.m91760d(f) ? 4 : 2) | i | (xq00Var.m91766g(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            long j = n6f.f150866f;
            xq00Var2 = xq00Var;
            fxh0Var2 = fxh0Var;
            f2 = f;
            ja61.m52782d(f2, (i2 & ContentType.LONG_FORM_ON_DEMAND) | (i2 & 14) | 3456, 0, j, n6f.m63765b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14), xq00Var2, fxh0Var2);
        } else {
            f2 = f;
            xq00Var2 = xq00Var;
            fxh0Var2 = fxh0Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1910gu(f2, fxh0Var2, i, 11);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final sd40 m62474j() {
        sd40 sd40Var = f146021b;
        if (sd40Var != null) {
            return sd40Var;
        }
        float f = 16;
        rd40 rd40Var = new rd40("Encore.Vector.VideoVertical16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
        int i = c5b1.f34134a;
        long j = n6f.f150862b;
        pk31 pk31Var = new pk31(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new gcn0(11.196f, 8.0f));
        arrayList.add(new fcn0(6.0f, 5.0f));
        arrayList.add(new scn0(6.0f));
        arrayList.add(ccn0.f36584c);
        rd40.m75320a(rd40Var, arrayList, pk31Var, 1.0f, 2, 1.0f);
        pk31 pk31Var2 = new pk31(j);
        sep sepVarM62656j = mrx0.m62656j(15.002f, 1.75f);
        sepVarM62656j.m77932f(1.75f, 1.75f, false, false, 13.252f, 0.0f);
        sepVarM62656j.m77942p(-10.5f);
        sepVarM62656j.m77933g(1.75f, 1.75f, false, false, -1.75f, 1.75f);
        sepVarM62656j.m77927D(12.5f);
        sepVarM62656j.m77939m(0.0f, 0.966f, 0.783f, 1.75f, 1.75f, 1.75f);
        sepVarM62656j.m77942p(10.5f);
        sepVarM62656j.m77933g(1.75f, 1.75f, false, false, 1.75f, -1.75f);
        sepVarM62656j.m77937k();
        sepVarM62656j.m77945s(13.252f, 1.5f);
        sepVarM62656j.m77933g(0.25f, 0.25f, false, true, 0.25f, 0.25f);
        sepVarM62656j.m77927D(12.5f);
        sepVarM62656j.m77933g(0.25f, 0.25f, false, true, -0.25f, 0.25f);
        sepVarM62656j.m77942p(-10.5f);
        sepVarM62656j.m77933g(0.25f, 0.25f, false, true, -0.25f, -0.25f);
        sepVarM62656j.m77943q(2.502f, 1.75f);
        sepVarM62656j.m77933g(0.25f, 0.25f, false, true, 0.25f, -0.25f);
        sepVarM62656j.m77937k();
        rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var2, 1.0f, 2, 1.0f);
        sd40 sd40VarM75321b = rd40Var.m75321b();
        f146021b = sd40VarM75321b;
        return sd40VarM75321b;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m62475k(f69 f69Var) {
        return f69Var.f66320c == 1 && f69Var.f66322e > 0.0f;
    }

    /* JADX INFO: renamed from: l */
    public static void m62476l(xto xtoVar, tf01 tf01Var) {
        String str = tf01Var.f219822a;
        dut dutVar = tf01Var.f219824c;
        fyf fyfVar = new fyf(new sf01(tf01Var, 0), true, -222038020);
        xtoVar.f265900e.add(tf01Var);
        xtoVar.f265896a.mo30901d(str, dutVar, new fyf(new xkh(xtoVar, tf01Var, fyfVar, 8), true, -532513962));
    }

    /* JADX INFO: renamed from: m */
    public static final void m62477m(HlsMediaSource$Factory hlsMediaSource$Factory, nsk nskVar, String str, tdd0 tdd0Var) {
        hlsMediaSource$Factory.f1003g = new ay21(nskVar, str, tdd0Var, 25);
    }

    /* JADX INFO: renamed from: n */
    public static final String[] m62478n(Metadata metadata) {
        String[] strArrM24211d1 = metadata.m24211d1();
        if (strArrM24211d1.length == 0) {
            strArrM24211d1 = null;
        }
        if (strArrM24211d1 != null) {
            return strArrM24211d1;
        }
        throw new InconsistentKotlinMetadataException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null);
    }

    /* JADX INFO: renamed from: o */
    public static void m62479o(xto xtoVar, tf01 tf01Var) {
        String str = tf01Var.f219822a;
        dut dutVar = tf01Var.f219824c;
        fyf fyfVar = new fyf(new sf01(tf01Var, 1), true, -2064529189);
        xtoVar.f265901f = true;
        ArrayList arrayList = xtoVar.f265900e;
        arrayList.add(null);
        uw70 uw70Var = xtoVar.f265896a;
        uw70Var.mo30900a(str, dutVar + ".stickyHeader", new fyf(new cj0(str, xtoVar, fyfVar, 7), true, -2114332953));
        arrayList.add(null);
        uw70.m84091c(uw70Var, ((Object) str) + ".divider", tbg.f218848a, 2);
    }

    /* JADX INFO: renamed from: p */
    public static final int m62480p(f69 f69Var) {
        return q3d0.m72083N(f69Var.f66318a * 1000);
    }
}
