package p204p;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.verify.domain.DomainVerificationManager;
import android.content.pm.verify.domain.DomainVerificationUserState;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.location.Location;
import android.media.AudioDescriptor;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.util.LongSparseArray;
import android.view.DisplayCutout;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.media3.common.ParserException;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k04 {
    /* JADX INFO: renamed from: A */
    public static boolean m54894A(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    /* JADX INFO: renamed from: B */
    public static void m54895B(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    /* JADX INFO: renamed from: C */
    public static void m54896C(Notification.Builder builder, int i) {
        builder.setForegroundServiceBehavior(i);
    }

    /* JADX INFO: renamed from: D */
    public static void m54897D(MediaDrm mediaDrm, byte[] bArr, w9p0 w9p0Var) {
        LogSessionId logSessionIdM87525a = w9p0Var.m87525a();
        if (logSessionIdM87525a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionIdM87525a);
    }

    /* JADX INFO: renamed from: E */
    public static void m54898E(MediaFormat mediaFormat, LogSessionId logSessionId) {
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        mediaFormat.setString("log-session-id", logSessionId.getStringId());
    }

    /* JADX INFO: renamed from: F */
    public static void m54899F(yho yhoVar, w9p0 w9p0Var) {
        LogSessionId logSessionIdM87525a = w9p0Var.m87525a();
        if (logSessionIdM87525a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ((MediaFormat) yhoVar.f272928c).setString("log-session-id", logSessionIdM87525a.getStringId());
    }

    /* JADX INFO: renamed from: G */
    public static void m54900G(MediaSessionCompat mediaSessionCompat, ComponentName componentName) {
        try {
            Object mediaSession = mediaSessionCompat.getMediaSession();
            mediaSession.getClass();
            ((MediaSession) mediaSession).setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e) {
            if (!Build.MANUFACTURER.equals("motorola")) {
                throw e;
            }
            yif1.m93810s("caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m54901H(RenderNode renderNode, zjw0 zjw0Var) {
        renderNode.setRenderEffect(zjw0Var != null ? zjw0Var.m96247a() : null);
    }

    /* JADX INFO: renamed from: I */
    public static void m54902I(View view, zjw0 zjw0Var) {
        view.setRenderEffect(zjw0Var != null ? zjw0Var.m96247a() : null);
    }

    /* JADX INFO: renamed from: J */
    public static int[] m54903J(NetworkRequest networkRequest) {
        return networkRequest.getTransportTypes();
    }

    /* JADX INFO: renamed from: a */
    public static final io4 m54904a(float f, float f2) {
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.8f);
        RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffectCreateBlurEffect);
        if (f2 <= 0.0f) {
            return new io4(renderEffectCreateColorFilterEffect);
        }
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            fArr[i] = i / 8.0f;
        }
        int[] iArr = new int[9];
        for (int i2 = 0; i2 < 9; i2++) {
            iArr[i2] = Color.argb(q3d0.m72083N(akg1.m26232q(fArr[i2]) * 255.0f), 0, 0, 0);
        }
        return new io4(RenderEffect.createBlendModeEffect(renderEffectCreateColorFilterEffect, RenderEffect.createShaderEffect(new LinearGradient(0.0f, 0.0f, 0.0f, f2, iArr, fArr, Shader.TileMode.CLAMP)), BlendMode.DST_IN));
    }

    /* JADX INFO: renamed from: b */
    public static int m54905b() {
        int i = Build.VERSION.SDK_INT >= 31 ? Build.VERSION.MEDIA_PERFORMANCE_CLASS : 0;
        HashMap map = vcp.f240241b;
        if (i < 30) {
            i = 0;
        }
        if (i > 0) {
            return i;
        }
        Integer num = (Integer) vcp.f240241b.get(Build.BRAND + '/' + ((Object) Build.PRODUCT) + '/' + ((Object) Build.DEVICE) + ':' + ((Object) Build.VERSION.RELEASE));
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue();
        if (iIntValue < 30) {
            return 0;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m54906c(Context context) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo;
        if (Build.VERSION.SDK_INT < 31) {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/api/payment-sdk/android/v3/proceed/redirect/")), 65536);
            return wj50.m88271j((resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo.packageName, context.getPackageName());
        }
        DomainVerificationUserState domainVerificationUserState = ((DomainVerificationManager) context.getSystemService(DomainVerificationManager.class)).getDomainVerificationUserState(context.getPackageName());
        if (domainVerificationUserState == null || !domainVerificationUserState.isLinkHandlingAllowed()) {
            return false;
        }
        Integer num = domainVerificationUserState.getHostToStateMap().get("www.spotify.com");
        return (num != null && num.intValue() == 2) || (num != null && num.intValue() == 1);
    }

    /* JADX INFO: renamed from: d */
    public static int[] m54907d(NetworkRequest networkRequest) {
        return networkRequest.getCapabilities();
    }

    /* JADX INFO: renamed from: e */
    public static EdgeEffect m54908e(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: f */
    public static RenderEffect m54909f(float f, float f2, int i) {
        return (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, zuj0.m97061x(i));
    }

    /* JADX INFO: renamed from: g */
    public static Bitmap m54910g(byte[] bArr, int i, BitmapFactory.Options options, int i2) throws IOException {
        int i3 = 0;
        if (i2 != -1) {
            if (options == null) {
                options = new BitmapFactory.Options();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i2; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw ParserException.m752a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ehx ehxVar = new ehx(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (ehxVar.m39032i(1, "Orientation")) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = 270;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
            }
            if (i3 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m54911h(Context context, jij0 jij0Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            hij0 hij0Var = new hij0(jij0Var);
            telephonyManager.registerTelephonyCallback((Executor) jij0Var.f112774c, hij0Var);
            telephonyManager.unregisterTelephonyCallback(hij0Var);
        } catch (RuntimeException unused) {
            jij0Var.m53460g(5);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m54912i(m04 m04Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        epz0 epz0Var;
        cpz0 cpz0Var;
        gh00 gh00Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (epz0Var = (epz0) m04Var.m60402d().m87103b((int) jKeyAt)) != null && (cpz0Var = epz0Var.f61737a) != null) {
                Object objM33623g = cpz0Var.f40689d.f243555a.m33623g(toz0.f222357l);
                if (objM33623g == null) {
                    objM33623g = null;
                }
                C1811ee c1811ee = (C1811ee) objM33623g;
                if (c1811ee != null && (gh00Var = (gh00) c1811ee.f58630b) != null) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m54913j(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    /* JADX INFO: renamed from: k */
    public static void m54914k(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    /* JADX INFO: renamed from: l */
    public static void m54915l(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    /* JADX INFO: renamed from: m */
    public static pf40 m54916m(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            kf40 kf40Var = pf40.f176960b;
            return wsv0.f254763e;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new iw6(0)).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorM72353b = q95.m72353b(it.next());
            if (audioDescriptorM72353b.getStandard() == 1) {
                byte[] descriptor = audioDescriptorM72353b.getDescriptor();
                if (descriptor.length != 3) {
                    yif1.m93819w0("Invalid SAD length: " + descriptor.length);
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(h0b1.m46336x(i)));
                    }
                }
            }
        }
        return pf40.m69791p(treeSet);
    }

    /* JADX INFO: renamed from: n */
    public static Path m54917n(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    /* JADX INFO: renamed from: o */
    public static float m54918o(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: p */
    public static final int m54919p(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) {
            return 0;
        }
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }

    /* JADX INFO: renamed from: q */
    public static Shader.TileMode m54920q() {
        return Shader.TileMode.DECAL;
    }

    /* JADX INFO: renamed from: r */
    public static int m54921r(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        int i = SystemJobService.f1424e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m54922s(PendingIntent pendingIntent) {
        return pendingIntent.isActivity();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m54923t(Location location) {
        return location.isMock();
    }

    /* JADX INFO: renamed from: u */
    public static Bitmap m54924u(Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 31 ? bitmap.asShared() : bitmap;
    }

    /* JADX INFO: renamed from: v */
    public static void m54925v(m04 m04Var, long[] jArr, Consumer consumer) {
        cpz0 cpz0Var;
        String strM72221b;
        for (long j : jArr) {
            epz0 epz0Var = (epz0) m04Var.m60402d().m87103b((int) j);
            if (epz0Var != null && (cpz0Var = epz0Var.f61737a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(m04Var.f138502a.getAutofillId(), cpz0Var.f40691f);
                Object objM33623g = cpz0Var.f40689d.f243555a.m33623g(hpz0.f93927C);
                if (objM33623g == null) {
                    objM33623g = null;
                }
                List list = (List) objM33623g;
                if (list != null && (strM72221b = q690.m72221b(list, "\n", null, 62)) != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new j15(strM72221b)));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static float m54926w(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m54927x(m04 m04Var, LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (wj50.m88271j(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            m54912i(m04Var, longSparseArray);
        } else {
            m04Var.f138502a.post(new fr2(2, m04Var, longSparseArray));
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m54928y(View view) {
        Vibrator defaultVibrator;
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            view.performHapticFeedback(1);
            return;
        }
        Context context = view.getContext();
        if (i >= 31) {
            defaultVibrator = yrd0.m94416c(context.getSystemService("vibrator_manager")).getDefaultVibrator();
            wj50.m88279p(defaultVibrator);
        } else {
            defaultVibrator = (Vibrator) context.getSystemService("vibrator");
        }
        defaultVibrator.vibrate(VibrationEffect.createPredefined(0));
    }

    /* JADX INFO: renamed from: z */
    public static final void m54929z(View view) {
        Vibrator defaultVibrator;
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            view.performHapticFeedback(4);
            return;
        }
        Context context = view.getContext();
        if (i >= 31) {
            defaultVibrator = yrd0.m94416c(context.getSystemService("vibrator_manager")).getDefaultVibrator();
            wj50.m88279p(defaultVibrator);
        } else {
            defaultVibrator = (Vibrator) context.getSystemService("vibrator");
        }
        defaultVibrator.vibrate(VibrationEffect.createPredefined(2));
    }
}
