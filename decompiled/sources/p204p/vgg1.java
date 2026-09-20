package p204p;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.car.app.model.Alert;
import com.comscore.streaming.ContentType;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class vgg1 {

    /* JADX INFO: renamed from: a */
    public static final int[] f241242a = {R.attr.theme, com.spotify.music.R.attr.theme};

    /* JADX INFO: renamed from: b */
    public static final int[] f241243b = {com.spotify.music.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: c */
    public static final String[] f241244c = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* JADX INFO: renamed from: d */
    public static final String[] f241245d = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* JADX INFO: renamed from: A */
    public static te40 m85445A(Object obj) {
        return obj == null ? te40.f219571b : new te40(obj);
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m85446B(b7u b7uVar) {
        List list;
        String str = null;
        xoz0 xoz0Var = (xoz0) b7uVar.mo24996b().mo47026a(null, zy20.f287448N0);
        uoz0 uoz0VarM91575e = xoz0Var != null ? xoz0Var.m91575e() : null;
        if (uoz0VarM91575e != null && (list = (List) uoz0VarM91575e.m83639a()) != null) {
            str = (String) list.get(0);
        }
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: C */
    public static final f8b0 m85447C(xq00 xq00Var) {
        xq00Var.m91773j0(2024497114);
        xq00Var.m91773j0(-610207850);
        Object objM91750T = xq00Var.m91750T();
        if (objM91750T == t6x0.f217647t) {
            objM91750T = new f8b0();
            xq00Var.m91793t0(objM91750T);
        }
        f8b0 f8b0Var = (f8b0) objM91750T;
        xq00Var.m91788r(false);
        xq00Var.m91788r(false);
        return f8b0Var;
    }

    /* JADX INFO: renamed from: D */
    public static final AnimatorSet m85448D(View view, float f, float f2, long j, long j2, PathInterpolator pathInterpolator) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", f, f2);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f, f2);
        objectAnimatorOfFloat2.setStartDelay(j2);
        objectAnimatorOfFloat2.setDuration(j);
        objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: E */
    public static hl91 m85449E(Runnable runnable, Executor executor) {
        hl91 hl91VarM47873y = hl91.m47873y(runnable, null);
        executor.execute(hl91VarM47873y);
        return hl91VarM47873y;
    }

    /* JADX INFO: renamed from: F */
    public static hl91 m85450F(zl6 zl6Var, Executor executor) {
        hl91 hl91VarM47872A = hl91.m47872A(zl6Var);
        executor.execute(hl91VarM47872A);
        return hl91VarM47872A;
    }

    /* JADX INFO: renamed from: G */
    public static final dlo0 m85451G(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return dlo0.f50290a;
        }
        if (iM38547C == 1) {
            return dlo0.f50291b;
        }
        if (iM38547C == 2) {
            return dlo0.f50292c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: H */
    public static int m85452H(tjr tjrVar, ray0 ray0Var) {
        if (tjrVar instanceof njr) {
            return ((njr) tjrVar).f154650a;
        }
        int iOrdinal = ray0Var.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: I */
    public static ObjectAnimator m85453I(View view, float f, float f2, long j, PathInterpolator pathInterpolator) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", f, f2);
        objectAnimatorOfFloat.setStartDelay(0L);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: J */
    public static xu91 m85454J(th00 th00Var, vh00 vh00Var, int i) {
        if ((i & 1) != 0) {
            th00Var = hex0.f90530Z;
        }
        if ((i & 2) != 0) {
            vh00Var = jq71.f114831X;
        }
        return new xu91(th00Var, vh00Var);
    }

    /* JADX INFO: renamed from: K */
    public static Context m85455K(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f241243b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof g9k) && ((g9k) context).f77816a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        g9k g9kVar = new g9k(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f241242a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            g9kVar.getTheme().applyStyle(resourceId2, true);
        }
        return g9kVar;
    }

    /* JADX INFO: renamed from: L */
    public static final void m85456L(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* JADX INFO: renamed from: M */
    public static final byte[] m85457M(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: N */
    public static final byte[] m85458N(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return m85457M(0, 0, bArr.length, bArr, bArr2);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    /* JADX INFO: renamed from: O */
    public static boolean m85459O(xgf1 xgf1Var) {
        Cursor cursorQuery;
        xgf1Var.getClass();
        try {
            cursorQuery = xgf1Var.f261313a.query(xgf1.f261311b, null, null, null, null);
        } catch (RuntimeException e) {
            xgf1.f261312c.m94134e("RuntimeException occurred", e);
            cursorQuery = null;
        }
        boolean z = cursorQuery == null;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return !z;
    }

    /* JADX INFO: renamed from: a */
    public static final void m85460a(int i, int i2, String str, xq00 xq00Var, fxh0 fxh0Var) {
        int i3;
        int i4;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1497975862);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (xq00Var.m91766g(fxh0Var) ? 32 : 16);
        }
        if (xq00Var.m91752Y(i4 & 1, (i4 & 19) != 18)) {
            fxh0Var2 = i5 != 0 ? cxh0.f43038a : fxh0Var;
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = m1k.f138995M0;
                xq00Var.m91793t0(objM91750T);
            }
            ahf1.m25932d(str, fxh0Var2, null, 0L, null, null, 2, false, new ml80((gh00) objM91750T), 0, null, xq00Var, (i4 & 14) | 1572864 | (i4 & ContentType.LONG_FORM_ON_DEMAND), 0, 1724);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cyl(str, fxh0Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m85461b(j15 j15Var, fxh0 fxh0Var, xq00 xq00Var, int i, int i2) {
        fxh0 fxh0Var2;
        int i3;
        fxh0 fxh0Var3;
        xq00Var.m91775k0(-1506567652);
        int i4 = i | (xq00Var.m91766g(j15Var) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            fxh0Var2 = fxh0Var;
        } else {
            fxh0Var2 = fxh0Var;
            i3 = i4 | (xq00Var.m91766g(fxh0Var2) ? 32 : 16);
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            fxh0Var3 = i5 != 0 ? cxh0.f43038a : fxh0Var2;
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = e6u.f56736P0;
                xq00Var.m91793t0(objM91750T);
            }
            ahf1.m25933e(j15Var, fxh0Var3, null, 0L, null, null, 2, false, new ml80((gh00) objM91750T), 0, null, null, xq00Var, (i3 & 14) | 1572864 | (i3 & ContentType.LONG_FORM_ON_DEMAND), 0, 3772);
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ejh(j15Var, fxh0Var3, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m85462c(ta40 ta40Var, String str, qe10 qe10Var, int i, m7f m7fVar, xq00 xq00Var, int i2, int i3) {
        int i4;
        qe10 qe10VarM41720A;
        int i5;
        m7f m7fVar2;
        xq00Var.m91775k0(491792371);
        if ((i2 & 6) == 0) {
            int i6 = i2 & 8;
            i4 = (xq00Var.m91766g(ta40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= xq00Var.m91766g(qe10Var) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= xq00Var.m91762e(i) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            int i10 = 32768 & i2;
            i4 |= xq00Var.m91766g(m7fVar) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && xq00Var.m91738H()) {
            xq00Var.m91757b0();
            i5 = i;
            m7fVar2 = m7fVar;
        } else {
            if (i7 != 0) {
                qe10Var = oe10.f164317a;
            }
            int i11 = i8 != 0 ? 1 : i;
            m7f m7fVar3 = i9 != 0 ? null : m7fVar;
            xq00Var.m91773j0(135631275);
            if (str != null) {
                xq00Var.m91773j0(135633130);
                boolean zM91766g = xq00Var.m91766g(str);
                Object objM91750T = xq00Var.m91750T();
                if (zM91766g || objM91750T == t6x0.f217647t) {
                    objM91750T = new c49(str, 5);
                    xq00Var.m91793t0(objM91750T);
                }
                xq00Var.m91788r(false);
                qe10VarM41720A = fig1.m41720A(qe10Var, (gh00) objM91750T);
            } else {
                qe10VarM41720A = qe10Var;
            }
            xq00Var.m91788r(false);
            u640 u640Var = u640.f227217h;
            xq00Var.m91773j0(-1115894518);
            xq00Var.m91773j0(1886828752);
            if (!(xq00Var.f264811a instanceof tg5)) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91767g0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(new re10(0, u640Var));
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(ta40Var, zy20.f287460Y, xq00Var);
            zsf1.m96835F(qe10VarM41720A, zy20.f287462Z, xq00Var);
            zsf1.m96835F(luj.m60017a(i11), zy20.f287446L0, xq00Var);
            zsf1.m96835F(m7fVar3, zy20.f287447M0, xq00Var);
            xq00Var.m91788r(true);
            xq00Var.m91788r(false);
            xq00Var.m91788r(false);
            i5 = i11;
            m7fVar2 = m7fVar3;
        }
        qe10 qe10Var2 = qe10Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yff(ta40Var, str, qe10Var2, i5, m7fVar2, i2, i3, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m85463d(wc61 wc61Var, t60 t60Var, float f, boolean z, float f2, xq00 xq00Var, int i) {
        int i2;
        t60 t60Var2;
        float f3;
        float f4;
        wc61 wc61Var2;
        boolean z2;
        xq00Var.m91775k0(-214456321);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(pha.f177517a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(wc61Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91762e(t60Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91760d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91768h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91760d(f2) ? 131072 : 65536;
        }
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            int iM38547C = edb.m38547C(wc61Var.m87691a());
            if (iM38547C != 0) {
                if (iM38547C == 1) {
                    i3 = 1;
                } else {
                    if (iM38547C != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 9;
                }
            }
            wc61Var2 = wc61Var;
            z2 = z;
            xc61 xc61Var = new xc61(f2, f, 1, t60Var, wc61Var2, z2);
            f4 = f2;
            f3 = f;
            t60Var2 = t60Var;
            qiu.m72881g(i3, rkk.m75772x(-652362958, xc61Var, xq00Var), xq00Var, 48);
        } else {
            t60Var2 = t60Var;
            f3 = f;
            f4 = f2;
            wc61Var2 = wc61Var;
            z2 = z;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xyd(f3, f4, i, t60Var2, wc61Var2, z2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final r2d0 m85464e(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new r2d0(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m85465f(u790 u790Var, fk00 fk00Var, Executor executor) {
        u790Var.mo28322a(new lk00(22, u790Var, fk00Var), executor);
    }

    /* JADX INFO: renamed from: g */
    public static final qe10 m85466g(qe10 qe10Var, r8f r8fVar) {
        return qe10Var.mo66783d(new sm8(r8fVar));
    }

    /* JADX INFO: renamed from: h */
    public static final qe10 m85467h(qe10 qe10Var, long j) {
        return m85466g(qe10Var, zfg1.m96012a(j));
    }

    /* JADX INFO: renamed from: i */
    public static qe10 m85468i(qe10 qe10Var, ko4 ko4Var) {
        return qe10Var.mo66783d(new tm8(ko4Var));
    }

    /* JADX INFO: renamed from: j */
    public static final void m85469j(up60 up60Var, Object obj) {
        if (up60Var.mo29118z(obj)) {
            return;
        }
        throw new ClassCastException("Value cannot be cast to " + up60Var.mo29110D());
    }

    /* JADX INFO: renamed from: k */
    public static final Object m85470k(fbk fbkVar, niz nizVar, eh00 eh00Var, vh00 vh00Var, fiz[] fizVarArr) {
        Object objM89112p = wvf1.m89112p(new naf(null, nizVar, eh00Var, vh00Var, fizVarArr), fbkVar);
        return objM89112p == yuk.f276404a ? objM89112p : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: l */
    public static final long m85471l(int i, int i2, ci21 ci21Var, ray0 ray0Var, ci21 ci21Var2) {
        int i3;
        int i4;
        if (!wj50.m88271j(ci21Var, ci21.f38193c)) {
            i = m85452H(ci21Var.f38194a, ray0Var);
            i2 = m85452H(ci21Var.f38195b, ray0Var);
        }
        tjr tjrVar = ci21Var2.f38194a;
        tjr tjrVar2 = ci21Var2.f38195b;
        if ((tjrVar instanceof njr) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i4 = ((njr) tjrVar).f154650a)) {
            i = i4;
        }
        if ((tjrVar2 instanceof njr) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i3 = ((njr) tjrVar2).f154650a)) {
            i2 = i3;
        }
        return b0g1.m27789k(i, i2);
    }

    /* JADX INFO: renamed from: m */
    public static final double m85472m(int i, int i2, int i3, int i4, ray0 ray0Var) {
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int iOrdinal = ray0Var.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d, d2);
        }
        if (iOrdinal == 1) {
            return Math.min(d, d2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    public static final ValueAnimator m85473n(long j, PathInterpolator pathInterpolator, List list) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(333L);
        valueAnimatorOfFloat.setInterpolator(pathInterpolator);
        int i = 0;
        valueAnimatorOfFloat.addListener(new gey0(i, list));
        valueAnimatorOfFloat.addUpdateListener(new fey0(i, list));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m85474o(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Alert.DURATION_SHOW_INDEFINITELY - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: p */
    public static final vzv m85475p(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        kzv kzvVar = new kzv(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String strName = (String) bk5.m29587J0(i2, strArr);
            if (strName == null) {
                strName = r5.name();
            }
            kzvVar.m86594k(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) bk5.m29587J0(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    int i4 = kzvVar.f245524d;
                    List[] listArr = kzvVar.f245526f;
                    List arrayList = listArr[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[kzvVar.f245524d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        vzv vzvVar = new vzv(str, enumArr);
        vzvVar.f246553b = kzvVar;
        return vzvVar;
    }

    /* JADX INFO: renamed from: q */
    public static final float m85476q(Integer num, View view) {
        return TypedValue.applyDimension(1, num.floatValue(), view.getContext().getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m85477r(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    /* JADX INFO: renamed from: s */
    public static ObjectAnimator m85478s(View view, long j, PathInterpolator pathInterpolator, int i) {
        long j2 = (i & 8) != 0 ? 0L : 333L;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: t */
    public static ObjectAnimator m85479t(View view, long j, long j2, PathInterpolator pathInterpolator) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: u */
    public static final long m85480u(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: v */
    public static Object m85481v(Future future) {
        c95.m31857w(future.isDone(), "Future was expected to be done: %s", future);
        return ckf1.m33174w(future);
    }

    /* JADX INFO: renamed from: w */
    public static Intent m85482w(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM85484y = m85484y(context, componentName);
        if (strM85484y == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM85484y);
        return m85484y(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: x */
    public static Intent m85483x(r55 r55Var) {
        Intent parentActivityIntent = r55Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM85484y = m85484y(r55Var, r55Var.getComponentName());
            if (strM85484y == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(r55Var, strM85484y);
            try {
                return m85484y(r55Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: y */
    public static String m85484y(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: z */
    public static final unc1 m85485z(View view) {
        unc1 unc1Var;
        Object tag = view.getTag(com.spotify.music.R.id.coil3_request_manager);
        unc1 unc1Var2 = tag instanceof unc1 ? (unc1) tag : null;
        if (unc1Var2 != null) {
            return unc1Var2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(com.spotify.music.R.id.coil3_request_manager);
                unc1Var = tag2 instanceof unc1 ? (unc1) tag2 : null;
                if (unc1Var == null) {
                    unc1Var = new unc1(view);
                    view.addOnAttachStateChangeListener(unc1Var);
                    view.setTag(com.spotify.music.R.id.coil3_request_manager, unc1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return unc1Var;
    }
}
