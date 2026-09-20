package p204p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.ActivityOptions;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.icu.text.ListFormatter;
import android.os.Build;
import android.os.Bundle;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.webkit.WebView;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.widgets.npvwidget.PlaybackCommandHandlerService;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c150 {

    /* JADX INFO: renamed from: a */
    public static Context f32981a;

    /* JADX INFO: renamed from: b */
    public static Boolean f32982b;

    /* JADX INFO: renamed from: c */
    public static final o50 f32983c = new o50("widget_category");

    /* JADX INFO: renamed from: d */
    public static final o50 f32984d = new o50("widget_interaction");

    /* JADX INFO: renamed from: e */
    public static final o50 f32985e = new o50("deeplink_path");

    /* JADX INFO: renamed from: A */
    public static long m31207A(Animator animator) {
        return animator.getTotalDuration();
    }

    /* JADX INFO: renamed from: B */
    public static synchronized boolean m31208B(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f32981a;
        if (context2 != null && (bool = f32982b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f32982b = null;
        if (u1h1.m82225t()) {
            f32982b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f32982b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f32982b = Boolean.FALSE;
            }
        }
        f32981a = applicationContext;
        return f32982b.booleanValue();
    }

    /* JADX INFO: renamed from: C */
    public static final void m31209C(ex3 ex3Var, SparseArray sparseArray) {
        if (((h68) ex3Var.f63659b).f88027a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueM88814f = wra.m88814f(sparseArray.get(iKeyAt));
            if (autofillValueM88814f.isText()) {
                h68 h68Var = (h68) ex3Var.f63659b;
                autofillValueM88814f.getTextValue().toString();
                if (h68Var.f88027a.get(Integer.valueOf(iKeyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (autofillValueM88814f.isDate()) {
                    throw new xpj0("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueM88814f.isList()) {
                    throw new xpj0("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueM88814f.isToggle()) {
                    throw new xpj0("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m31210D(ex3 ex3Var, ViewStructure viewStructure) {
        h68 h68Var = (h68) ex3Var.f63659b;
        if (h68Var.f88027a.isEmpty()) {
            return;
        }
        int iAddChildCount = viewStructure.addChildCount(h68Var.f88027a.size());
        Iterator it = h68Var.f88027a.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            ViewStructure viewStructureNewChild = viewStructure.newChild(iAddChildCount);
            x58.m89973f(viewStructureNewChild, (AutofillId) ex3Var.f63661d, iIntValue);
            viewStructureNewChild.setId(iIntValue, ((oz3) ex3Var.f63658a).getContext().getPackageName(), null, null);
            x58.m89974g(viewStructureNewChild, 1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m31211E(TextView textView, int i) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(24, i, 1, 2);
    }

    /* JADX INFO: renamed from: F */
    public static void m31212F(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    /* JADX INFO: renamed from: G */
    public static void m31213G(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }

    /* JADX INFO: renamed from: H */
    public static void m31214H(Notification.Builder builder, int i) {
        builder.setGroupAlertBehavior(i);
    }

    /* JADX INFO: renamed from: I */
    public static final void m31215I(StaticLayout.Builder builder, int i) {
        builder.setJustificationMode(i);
    }

    /* JADX INFO: renamed from: J */
    public static void m31216J(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    /* JADX INFO: renamed from: K */
    public static void m31217K(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    /* JADX INFO: renamed from: L */
    public static void m31218L(Notification.Builder builder, long j) {
        builder.setTimeoutAfter(j);
    }

    /* JADX INFO: renamed from: a */
    public static final void m31219a(suy suyVar, gh00 gh00Var, fiz fizVar, fiz fizVar2, fxh0 fxh0Var, miq0 miq0Var, xq00 xq00Var, int i) {
        int i2;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-1825824641);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(suyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fizVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(fizVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91770i(miq0Var) ? 131072 : 65536;
        }
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == obj) {
                yfn0.Companion.getClass();
                objM91750T = xfn0.m90510a(suyVar);
                xq00Var.m91793t0(objM91750T);
            }
            yfn0 yfn0Var = (yfn0) objM91750T;
            boolean zM91766g = xq00Var.m91766g(miq0Var) | xq00Var.m91766g(yfn0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g || objM91750T2 == obj) {
                objM91750T2 = (miq0Var == null || miq0Var.f144074e || miq0Var.f144073d || !miq0Var.f144071b.equals(yfn0Var)) ? null : miq0Var;
                xq00Var.m91793t0(objM91750T2);
            }
            xq00Var.m91765f0(2024172498, yfn0Var);
            int i4 = i2 << 6;
            m31220b(suyVar, yfn0Var, (miq0) objM91750T2, gh00Var, fizVar, fizVar2, fxh0Var, xq00Var, (i4 & 7168) | i3 | (57344 & i4) | (458752 & i4) | (i4 & 3670016));
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fxa0((Object) suyVar, gh00Var, (Object) fizVar, (Object) fizVar2, (Object) fxh0Var, (Object) miq0Var, i, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r28v0, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX INFO: renamed from: b */
    public static final void m31220b(suy suyVar, yfn0 yfn0Var, miq0 miq0Var, gh00 gh00Var, fiz fizVar, fiz fizVar2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fbk fbkVar;
        String str;
        kqi0 kqi0Var;
        Object rpk0Var;
        w2a1 w2a1Var;
        boolean z;
        Object o3e0Var;
        Object obj;
        vgn0 vgn0Var;
        eh00 eh00Var;
        char c;
        Object ro5Var;
        boolean z2;
        ?? r12;
        Double d;
        xq00Var.m91775k0(-1154966972);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(suyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(yfn0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(miq0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(fizVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91770i(fizVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 1048576 : 524288;
        }
        if (xq00Var.m91752Y(i2 & 1, (599187 & i2) != 599186)) {
            Object[] objArr = new Object[0];
            Object objM91750T = xq00Var.m91750T();
            Object obj2 = t6x0.f217647t;
            if (objM91750T == obj2) {
                objM91750T = ytl0.f276168c1;
                xq00Var.m91793t0(objM91750T);
            }
            Bundle bundle = (Bundle) dul.m37018u(objArr, (eh00) objM91750T, xq00Var, 48);
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj2) {
                objM91750T2 = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var2 = (kqi0) objM91750T2;
            String str2 = suyVar.f214240b;
            int i3 = suyVar.f214237X;
            float fDoubleValue = (float) ((miq0Var == null || (d = (Double) miq0Var.f144072c.getValue()) == null) ? suyVar.f214238Y : d.doubleValue());
            boolean zM91770i = xq00Var.m91770i(kqi0Var2) | xq00Var.m91770i(miq0Var) | xq00Var.m91770i(bundle);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == obj2) {
                objM91750T3 = new m56(kqi0Var2, miq0Var, bundle, 8);
                xq00Var.m91793t0(objM91750T3);
            }
            w2a1 w2a1Var2 = w2a1.f247311a;
            hz40.m49233e(w2a1Var2, (gh00) objM91750T3, xq00Var);
            boolean zM91770i2 = xq00Var.m91770i(fizVar) | xq00Var.m91770i(kqi0Var2);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T4 == obj2) {
                fbkVar = null;
                objM91750T4 = new d2n0(fizVar, kqi0Var2, fbkVar, 6);
                xq00Var.m91793t0(objM91750T4);
            } else {
                fbkVar = null;
            }
            hz40.m49237i(w2a1Var2, (th00) objM91750T4, xq00Var);
            boolean zM91770i3 = xq00Var.m91770i(fizVar2) | xq00Var.m91770i(kqi0Var2) | xq00Var.m91766g(str2);
            Object objM91750T5 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T5 == obj2) {
                fbk fbkVar2 = fbkVar;
                str = str2;
                kqi0Var = kqi0Var2;
                w2a1Var = w2a1Var2;
                z = true;
                rpk0Var = new rpk0(fizVar2, kqi0Var, str, fbkVar2, 16);
                xq00Var.m91793t0(rpk0Var);
            } else {
                z = true;
                str = str2;
                kqi0Var = kqi0Var2;
                rpk0Var = objM91750T5;
                w2a1Var = w2a1Var2;
            }
            hz40.m49237i(w2a1Var, (th00) rpk0Var, xq00Var);
            Object objM91750T6 = xq00Var.m91750T();
            if (objM91750T6 == obj2) {
                objM91750T6 = new vgn0(miq0Var, kqi0Var, yfn0Var, gh00Var);
                xq00Var.m91793t0(objM91750T6);
            }
            vgn0 vgn0Var2 = (vgn0) objM91750T6;
            int i4 = i2 & 7168;
            boolean z3 = i4 == 2048 ? z : false;
            Object objM91750T7 = xq00Var.m91750T();
            if (z3 || objM91750T7 == obj2) {
                objM91750T7 = new rxl0(23, gh00Var);
                xq00Var.m91793t0(objM91750T7);
            }
            eh00 eh00Var2 = (eh00) objM91750T7;
            boolean zM91770i4 = xq00Var.m91770i(miq0Var) | xq00Var.m91766g(eh00Var2) | (i4 == 2048 ? z : false);
            Object objM91750T8 = xq00Var.m91750T();
            if (zM91770i4 || objM91750T8 == obj2) {
                obj = obj2;
                vgn0Var = vgn0Var2;
                eh00Var = eh00Var2;
                c = 2;
                o3e0Var = new o3e0(miq0Var, vgn0Var, eh00Var, gh00Var, 14);
                xq00Var.m91793t0(o3e0Var);
            } else {
                obj = obj2;
                o3e0Var = objM91750T8;
                vgn0Var = vgn0Var2;
                eh00Var = eh00Var2;
                c = 2;
            }
            hz40.m49233e(miq0Var, (gh00) o3e0Var, xq00Var);
            boolean z4 = i3 == c || !(i3 != 1 || miq0Var == null || ((Double) miq0Var.f144072c.getValue()) == null);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
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
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            boolean zM91770i5 = xq00Var.m91770i(miq0Var) | xq00Var.m91766g(eh00Var) | xq00Var.m91770i(bundle) | xq00Var.m91766g(str) | xq00Var.m91770i(kqi0Var);
            Object objM91750T9 = xq00Var.m91750T();
            if (zM91770i5 || objM91750T9 == obj) {
                String str3 = str;
                z2 = true;
                r12 = 0;
                ro5Var = new ro5(miq0Var, kqi0Var, vgn0Var, eh00Var, bundle, str3, 23);
                xq00Var.m91793t0(ro5Var);
            } else {
                ro5Var = objM91750T9;
                z2 = true;
                r12 = 0;
            }
            gh00 gh00Var2 = (gh00) ro5Var;
            cxh0 cxh0Var = cxh0.f43038a;
            g0b1.m43261b(gh00Var2, zxc.m97185e(z4 ? 1.0f : 0.0f, mi21.m61822f(1.0f, cxh0Var).mo34315F(ybs.m93300a(fDoubleValue, (float) r12) > 0 ? mi21.m61824h(fDoubleValue, cxh0Var) : pha.f177517a.mo66946b(cxh0Var))), null, xq00Var, 0, 4);
            int iM38547C = edb.m38547C(i3);
            if (iM38547C == 0) {
                xq00Var.m91771i0(-163593309);
                if (z4) {
                    xq00Var.m91771i0(-776370504);
                } else {
                    xq00Var.m91771i0(-163592937);
                    m31221c(r12, xq00Var, null, suyVar.f214246h);
                }
                xq00Var.m91788r(r12);
                xq00Var.m91788r(r12);
            } else if (iM38547C == z2) {
                xq00Var.m91771i0(-776340682);
                xq00Var.m91788r(r12);
            } else {
                if (iM38547C != 2) {
                    throw lq51.m59703i(-163597859, xq00Var, r12);
                }
                xq00Var.m91771i0(-163596218);
                ?? r3 = i4 == 2048 ? z2 : r12;
                Object objM91750T10 = xq00Var.m91750T();
                if (r3 != 0 || objM91750T10 == obj) {
                    objM91750T10 = new rxl0(22, gh00Var);
                    xq00Var.m91793t0(objM91750T10);
                }
                m31222d(r12, (eh00) objM91750T10, xq00Var, null);
                xq00Var.m91788r(r12);
            }
            xq00Var.m91788r(z2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new nk3((Object) suyVar, (Object) yfn0Var, (Object) miq0Var, gh00Var, (Object) fizVar, (Object) fizVar2, fxh0Var, i, 20);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m31221c(int i, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        fxh0 fxh0Var2;
        boolean z2;
        xq00Var.m91775k0(-885848216);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = (xq00Var.m91768h(z) ? 4 : 2) | i | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var), 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 7);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96832C);
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
            m31223e(0, 1, xq00Var, null);
            if (z) {
                z2 = true;
                xq00Var.m91771i0(-1079983344);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1080299513);
                fxh0 fxh0VarM62688m = ms2.m62688m(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, xq00Var, cxh0Var, 1.0f);
                irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46141L0, xq00Var, 0);
                int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM62688m);
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
                m31223e(0, 0, xq00Var, new cr70(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                riw0.m75615i(xq00Var, mi21.m61838v(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var));
                if (1.0f <= 0.0d) {
                    kt40.m57301a("invalid weight; must be greater than zero");
                }
                z2 = true;
                m31223e(0, 0, xq00Var, new cr70(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                xq00Var.m91788r(true);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(z2);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fl3(z, fxh0Var2, i, 17);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m31222d(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(993816883);
        int i2 = i | (xq00Var2.m91770i(eh00Var) ? 4 : 2) | 48;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var2, 0);
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
            ahf1.m25932d(k0e1.m54977L(R.string.payment_error_title_generic, xq00Var2), null, leu.m58818d(xq00Var2).f64968d, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2042);
            xq00Var2 = xq00Var;
            fxh0 fxh0VarM96832C = zsf1.m96832C(cxh0Var, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 0.0f, 13);
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new ymi0(29, eh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            dyu.m37371c(new peu(u40.f226523c, (eh00) objM91750T), new tgu(13), fxh0VarM96832C, null, null, null, null, null, null, null, ezg.f64374a, xq00Var2, 0, 48, 2040);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zoc0(eh00Var, fxh0Var2, i, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m31223e(int i, int i2, xq00 xq00Var, fxh0 fxh0Var) {
        int i3;
        xq00Var.m91775k0(-1784903928);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 3) != 2)) {
            cxh0 cxh0Var = cxh0.f43038a;
            if (i4 != 0) {
                fxh0Var = cxh0Var;
            }
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
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
            dha.m36004a(xtm0.m92060G(mi21.m61822f(0.3f, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224764g, cxh0Var)), 0L, null, 15), xq00Var, 0);
            riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224762e, cxh0Var));
            dha.m36004a(xtm0.m92060G(mi21.m61822f(1.0f, mi21.m61824h(48, cxh0Var)), 0L, null, 15), xq00Var, 0);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dxa0(fxh0Var, i, i2, 10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Object m31224f(eoi0 eoi0Var, o50 o50Var) {
        Object obj = eoi0Var.f61430a.get(o50Var);
        if (obj != null) {
            return obj;
        }
        na6.m63957e("[DynamicNpvWidget] " + o50Var + " missing from ActionParameters");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final void m31225g(Context context, WidgetInteraction widgetInteraction, String str) {
        Intent intent = new Intent(context, (Class<?>) PlaybackCommandHandlerService.class);
        intent.setAction("com.spotify.widgets.widgets.ACTION_PLAYBACK_COMMAND");
        intent.putExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION", widgetInteraction);
        intent.putExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_CATEGORY", str);
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m31226h(WebView webView) {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 26) {
            webView.setImportantForAutofill(1);
        }
        webView.setVerticalScrollBarEnabled(false);
        webView.setBackgroundColor(0);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m31227i(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m31228j(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m31229k(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m31230l(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m31231m(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    /* JADX INFO: renamed from: n */
    public static gw80 m31232n(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? new jd4(context, ListFormatter.getInstance(new Locale(ihf1.m50633q(context)))) : new cop(context);
    }

    /* JADX INFO: renamed from: o */
    public static final Bitmap m31233o(int i, int i2, int i3, z8f z8fVar) {
        ColorSpace rgb;
        ColorSpace rgb2;
        ColorSpace colorSpaceM25752B;
        ColorSpace colorSpace;
        Bitmap.Config configM43143G = fz6.m43143G(i3);
        if (wj50.m88271j(z8fVar, c9f.f35494e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (wj50.m88271j(z8fVar, c9f.f35506q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (wj50.m88271j(z8fVar, c9f.f35507r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (wj50.m88271j(z8fVar, c9f.f35504o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (wj50.m88271j(z8fVar, c9f.f35499j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (wj50.m88271j(z8fVar, c9f.f35498i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (wj50.m88271j(z8fVar, c9f.f35509t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (wj50.m88271j(z8fVar, c9f.f35508s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (wj50.m88271j(z8fVar, c9f.f35500k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (wj50.m88271j(z8fVar, c9f.f35501l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (wj50.m88271j(z8fVar, c9f.f35496g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (wj50.m88271j(z8fVar, c9f.f35497h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (wj50.m88271j(z8fVar, c9f.f35495f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (wj50.m88271j(z8fVar, c9f.f35502m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else {
            if (!wj50.m88271j(z8fVar, c9f.f35505p)) {
                if (wj50.m88271j(z8fVar, c9f.f35503n)) {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
                } else if (Build.VERSION.SDK_INT < 34 || (colorSpaceM25752B = AbstractC1665af.m25752B(z8fVar)) == null) {
                    if (z8fVar instanceof wdx0) {
                        String str = z8fVar.f280461a;
                        wdx0 wdx0Var = (wdx0) z8fVar;
                        float[] fArrM96829a = wdx0Var.f250363d.m96829a();
                        y491 y491Var = wdx0Var.f250366g;
                        ColorSpace.Rgb.TransferParameters transferParameters = y491Var != null ? new ColorSpace.Rgb.TransferParameters(y491Var.f269103b, y491Var.f269104c, y491Var.f269105d, y491Var.f269106e, y491Var.f269107f, y491Var.f269108g, y491Var.f269102a) : null;
                        float[] fArr = wdx0Var.f250368i;
                        if (transferParameters != null) {
                            a9f.m25110e();
                            ColorSpace.Rgb rgb3 = new ColorSpace.Rgb(str, wdx0Var.f250367h, fArrM96829a, transferParameters);
                            if (Float.isNaN(fArr[0]) || Arrays.equals(rgb3.getTransform(), fArr)) {
                                rgb2 = rgb3;
                            } else {
                                a9f.m25110e();
                                rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                            }
                        } else {
                            a9f.m25110e();
                            float[] fArr2 = wdx0Var.f250367h;
                            final gnv0 gnv0Var = wdx0Var.f250371l;
                            final int i4 = 0;
                            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: p.b9f
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    switch (i4) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) gnv0Var.invoke(Double.valueOf(d))).doubleValue();
                                }
                            };
                            final ono0 ono0Var = wdx0Var.f250374o;
                            final int i5 = 1;
                            rgb2 = new ColorSpace.Rgb(str, fArr2, fArrM96829a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: p.b9f
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    switch (i5) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) ono0Var.invoke(Double.valueOf(d))).doubleValue();
                                }
                            }, wdx0Var.f250364e, wdx0Var.f250365f);
                        }
                    } else {
                        configM43143G = configM43143G;
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                    rgb2 = rgb;
                } else {
                    rgb2 = colorSpaceM25752B;
                    configM43143G = configM43143G;
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM43143G, true, rgb2);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        rgb2 = colorSpace;
        configM43143G = configM43143G;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM43143G, true, rgb2);
    }

    /* JADX INFO: renamed from: p */
    public static Notification.Builder m31234p(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* JADX INFO: renamed from: q */
    public static final a84 m31235q(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new a84(AutofillValue.forToggle(z));
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final a84 m31236r(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new a84(AutofillValue.forText(charSequence));
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static final Bundle m31237s() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ActivityOptions.makeBasic().setLaunchDisplayId(0).toBundle();
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static Icon m31238t(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    /* JADX INFO: renamed from: u */
    public static void m31239u(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i2 = configuration2.colorMode & 3;
        if (i != i2) {
            configuration3.colorMode |= i2;
        }
        int i3 = configuration.colorMode & 12;
        int i4 = configuration2.colorMode & 12;
        if (i3 != i4) {
            configuration3.colorMode |= i4;
        }
    }

    /* JADX INFO: renamed from: v */
    public static AutofillId m31240v(View view) {
        return view.getAutofillId();
    }

    /* JADX INFO: renamed from: w */
    public static float[] m31241w(ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return colorMatrix.getArray();
    }

    /* JADX INFO: renamed from: x */
    public static m200 m31242x(Context context, NotificationManager notificationManager) {
        String string = context.getString(R.string.edit_playlist_change_image_notification_title);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel("set_playlist_picture_channel", context.getString(R.string.edit_playlist_change_image_notification_channel_title), 2));
        }
        ktj0 ktj0Var = new ktj0(context, "set_playlist_picture_channel");
        ktj0Var.f126314e = ktj0.m57322d(string);
        ktj0Var.m57339r(string);
        ktj0Var.f126307D.icon = R.drawable.icn_notification;
        ktj0Var.m57332k(2, true);
        Notification notificationM57325c = ktj0Var.m57325c();
        return i >= 29 ? new m200(147, notificationM57325c, 1) : new m200(147, notificationM57325c, 0);
    }

    /* JADX INFO: renamed from: y */
    public static float m31243y(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    /* JADX INFO: renamed from: z */
    public static float m31244z(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
