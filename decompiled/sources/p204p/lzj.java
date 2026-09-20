package p204p;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.LocusId;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.graphics.text.MeasuredText;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.work.impl.foreground.SystemForegroundService;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService;
import com.spotify.music.R;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lzj {

    /* JADX INFO: renamed from: a */
    public static final Object f138376a = null;

    /* JADX INFO: renamed from: A */
    public static File[] m60323A(Context context) {
        return context.getExternalFilesDirs(null);
    }

    /* JADX INFO: renamed from: B */
    public static float m60324B(MediaFormat mediaFormat) {
        int integer;
        if (!mediaFormat.containsKey("frame-rate")) {
            return -1.0f;
        }
        if (Build.VERSION.SDK_INT < 29) {
            try {
                return mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                integer = mediaFormat.getInteger("frame-rate");
            }
        } else {
            if (mediaFormat.getValueTypeForKey("frame-rate") == 3) {
                return mediaFormat.getFloat("frame-rate");
            }
            integer = mediaFormat.getInteger("frame-rate");
        }
        return integer;
    }

    /* JADX INFO: renamed from: C */
    public static Typeface m60325C(Context context, int i, int i2) {
        Object c6x0Var;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        try {
            Object obj = (Object[]) de41.m35763a(d000.f43689a).get(Integer.valueOf(i));
            if (obj == null) {
                obj = new String[0];
            }
            c6x0Var = m60338P(context, i, (String[]) obj, i2);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            na6.m63959g("Failed to load font stack for fontResourceId = " + i, thM77348a);
        }
        return (Typeface) (c6x0Var instanceof c6x0 ? null : c6x0Var);
    }

    /* JADX INFO: renamed from: E */
    public static int m60327E(MediaFormat mediaFormat, String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaFormat.getInteger(str, i);
        }
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i;
    }

    /* JADX INFO: renamed from: F */
    public static Executor m60328F(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? r35.m74610r(context) : new sf4(new Handler(context.getMainLooper()));
    }

    /* JADX INFO: renamed from: G */
    public static int m60329G(int i, int i2, xs6 xs6Var) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iM46336x = h0b1.m46336x(i3);
            if (iM46336x != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iM46336x).build(), xs6Var.m91967c())) {
                return i3;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: H */
    public static String m60330H(Context context) {
        return context.getOpPackageName();
    }

    /* JADX INFO: renamed from: I */
    public static int m60331I(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    /* JADX INFO: renamed from: J */
    public static Object m60332J(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: K */
    public static final void m60333K(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }

    /* JADX INFO: renamed from: L */
    public static final long m60334L(oz3 oz3Var) {
        return oz3Var.getUniqueDrawingId();
    }

    /* JADX INFO: renamed from: M */
    public static void m60335M(Context context) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        if (applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext2 = context.getApplicationContext();
            PackageManager packageManager = applicationContext2.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (!u1h1.m82226u()) {
            bga.m29102x(null);
            return;
        }
        y7h1 y7h1Var = new y7h1();
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                Context applicationContext3 = context.getApplicationContext();
                if (applicationContext3 == null) {
                    applicationContext3 = context;
                }
                SharedPreferences.Editor editorEdit = applicationContext3.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("proxy_notification_initialized", true);
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                context.getPackageName();
            }
        } finally {
            y7h1Var.m92998s(null);
        }
    }

    /* JADX INFO: renamed from: N */
    public static boolean m60336N(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    /* JADX INFO: renamed from: O */
    public static boolean m60337O(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* JADX INFO: renamed from: P */
    public static Typeface m60338P(Context context, int i, String[] strArr, int i2) {
        Typeface typefaceBuild;
        String str;
        int iDeepHashCode = Arrays.deepHashCode(strArr);
        Typeface typeface = (Typeface) x0v.f256998a.get(Integer.valueOf(iDeepHashCode));
        if (typeface != null) {
            return typeface;
        }
        Typeface.CustomFallbackBuilder customFallbackBuilder = null;
        for (String str2 : strArr) {
            HashMap map = x0v.f256999b;
            Object objValueOf = map.get(str2);
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(context.getResources().getIdentifier(str2, "font", context.getPackageName()));
                map.put(str2, objValueOf);
            }
            int iIntValue = ((Number) objValueOf).intValue();
            if (iIntValue > 0) {
                FontFamily fontFamilyBuild = new FontFamily.Builder(new Font.Builder(context.getResources(), iIntValue).build()).build();
                if (customFallbackBuilder == null) {
                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                } else {
                    wj50.m88279p(customFallbackBuilder.addCustomFallback(fontFamilyBuild));
                }
            }
        }
        if (customFallbackBuilder != null) {
            Typeface.CustomFallbackBuilder style = customFallbackBuilder.setStyle(new FontStyle(x0v.f257000c.contains(Integer.valueOf(i)) ? CtaType.SEE_ALL_SHOWS_FIELD_NUMBER : x0v.f257001d.contains(Integer.valueOf(i)) ? 900 : 400, 0));
            if (i2 == 1) {
                str = "sans-serif";
            } else {
                if (i2 != 2) {
                    throw null;
                }
                str = "monospace";
            }
            style.setSystemFallback(str);
        }
        if (customFallbackBuilder == null || (typefaceBuild = customFallbackBuilder.build()) == null) {
            return null;
        }
        x0v.f256998a.put(Integer.valueOf(iDeepHashCode), typefaceBuild);
        return typefaceBuild;
    }

    /* JADX INFO: renamed from: Q */
    public static void m60339Q(MediaFormat mediaFormat, p7f p7fVar) {
        if (p7fVar != null) {
            m60340R(mediaFormat, "color-transfer", p7fVar.f174677c);
            m60340R(mediaFormat, "color-standard", p7fVar.f174675a);
            m60340R(mediaFormat, "color-range", p7fVar.f174676b);
            byte[] bArr = p7fVar.f174678d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m60340R(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX INFO: renamed from: S */
    public static String m60341S(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (awg1.m27325s(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (awg1.m27325s(context, str) == 0) {
                return str;
            }
        }
        throw new RuntimeException(s571.m77251j("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    /* JADX INFO: renamed from: T */
    public static Object m60342T(int i) {
        switch (edb.m38547C(i)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            case 17:
                return BlendMode.LIGHTEN;
            case 18:
                return BlendMode.COLOR_DODGE;
            case 19:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case 28:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m60343U(cdb cdbVar) {
        cdbVar.onCameraAccessPrioritiesChanged();
    }

    /* JADX INFO: renamed from: V */
    public static void m60344V(View view) {
        Vibrator vibrator = (Vibrator) view.getContext().getSystemService("vibrator");
        if (Build.VERSION.SDK_INT >= 29) {
            vibrator.vibrate(VibrationEffect.createPredefined(1));
        } else {
            vibrator.vibrate(200L);
        }
    }

    /* JADX INFO: renamed from: W */
    public static void m60345W(Resources.Theme theme) {
        theme.rebase();
    }

    /* JADX INFO: renamed from: X */
    public static Intent m60346X(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i & 2;
        if (i3 == 0 && (i & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i3 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            return fz6.m43139C(context, broadcastReceiver, intentFilter, handler, i);
        }
        if (i4 >= 26) {
            return n0b1.m63350I(context, broadcastReceiver, intentFilter, handler, i);
        }
        return (i & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, m60341S(context), handler) : context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }

    /* JADX INFO: renamed from: Y */
    public static void m60347Y(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        m60346X(context, broadcastReceiver, intentFilter, null, 2);
    }

    /* JADX INFO: renamed from: Z */
    public static void m60348Z(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    /* JADX INFO: renamed from: a */
    public static void m60349a(AudioAttributes.Builder builder, boolean z) {
        builder.setHapticChannelsMuted(z);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m60350a0(AudioAttributes.Builder builder, int i) {
        builder.setAllowedCapturePolicy(i);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX INFO: renamed from: b */
    public static int m60351b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (xba0.m90309h(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && zug1.f286445b == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 37) {
                    z = false;
                } else {
                    int iM60383s = m60383s(true);
                    if (i5 < 35 ? !(m60383s(false) != 2 || iM60383s == 1) : iM60383s != 1) {
                        z = false;
                    }
                }
                zug1.f286445b = Boolean.valueOf(z);
                if (z) {
                }
            }
            return i3;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m60352b0(zd70 zd70Var, Object obj) {
        zd70Var.setBlendMode((BlendMode) obj);
    }

    /* JADX INFO: renamed from: c */
    public static int m60353c(Context context, String str) {
        p1m0.m68837r(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new pwj0(context).f182068b.areNotificationsEnabled() ? 0 : -1;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m60354c0(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    /* JADX INFO: renamed from: d */
    public static final Notification m60355d(Service service) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) service.getSystemService("notification");
            if (notificationManager.getNotificationChannel("spotify_updates_channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("spotify_updates_channel", "Spotify", 2));
            }
        }
        ktj0 ktj0Var = new ktj0(service, "spotify_updates_channel");
        ktj0Var.f126307D.icon = service.getApplicationInfo().icon;
        ktj0Var.f126319j = -1;
        ktj0Var.f126331v = 1;
        return ktj0Var.m57325c();
    }

    /* JADX INFO: renamed from: d0 */
    public static void m60356d0(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    /* JADX INFO: renamed from: e */
    public static LocusId m60357e(String str) {
        return new LocusId(str);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m60358e0(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(s571.m77246e(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* JADX INFO: renamed from: f */
    public static ColorFilter m60359f(int i, Object obj) {
        return new BlendModeColorFilter(i, (BlendMode) obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m60360f0(Context context, Intent intent) {
        context.startActivity(intent, null);
    }

    /* JADX INFO: renamed from: g */
    public static Context m60361g(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m60362g0(Service service, int i, Integer num) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return;
        }
        Notification notificationM60355d = m60355d(service);
        if (num == null || i2 < 29) {
            service.startForeground(i, notificationM60355d);
        } else {
            service.startForeground(i, notificationM60355d, num.intValue());
        }
    }

    /* JADX INFO: renamed from: h */
    public static MediaFormat m60363h(r300 r300Var) {
        int i;
        MediaFormat mediaFormat = new MediaFormat();
        m60340R(mediaFormat, "bitrate", r300Var.f195382k);
        m60340R(mediaFormat, "max-bitrate", r300Var.f195381j);
        m60340R(mediaFormat, "channel-count", r300Var.f195360J);
        int iM46337y = h0b1.m46337y(r300Var);
        if (iM46337y != 0) {
            mediaFormat.setInteger("channel-mask", iM46337y);
        }
        m60339Q(mediaFormat, r300Var.f195358H);
        String str = r300Var.f195387p;
        if (str != null) {
            mediaFormat.setString("mime", str);
        }
        String str2 = r300Var.f195383l;
        if (str2 != null) {
            mediaFormat.setString("codecs-string", str2);
        }
        float f = r300Var.f195352B;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m60340R(mediaFormat, "width", r300Var.f195394w);
        m60340R(mediaFormat, "height", r300Var.f195395x);
        m60358e0(mediaFormat, r300Var.f195390s);
        int i2 = r300Var.f195363M;
        if (i2 != -1) {
            m60340R(mediaFormat, "exo-pcm-encoding-int", i2);
            if (i2 == 0) {
                i = 0;
            } else if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    i = 4;
                    if (i2 != 4) {
                        i = 21;
                        if (i2 != 21) {
                            i = 22;
                            if (i2 == 22) {
                            }
                        }
                    }
                }
            } else {
                i = 2;
            }
            mediaFormat.setInteger("pcm-encoding", i);
        }
        String str3 = r300Var.f195375d;
        if (str3 != null) {
            mediaFormat.setString("language", str3);
        }
        m60340R(mediaFormat, "max-input-size", r300Var.f195388q);
        m60340R(mediaFormat, "sample-rate", r300Var.f195362L);
        m60340R(mediaFormat, "caption-service-number", r300Var.f195366P);
        mediaFormat.setInteger("rotation-degrees", r300Var.f195353C);
        int i3 = r300Var.f195376e;
        int i4 = 1;
        mediaFormat.setInteger("is-autoselect", (i3 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i3 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i3 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", r300Var.f195364N);
        mediaFormat.setInteger("encoder-padding", r300Var.f195365O);
        float f2 = r300Var.f195355E;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f2);
        int i5 = 1073741824;
        if (f2 < 1.0f) {
            i4 = (int) (f2 * 1073741824);
        } else if (f2 > 1.0f) {
            i4 = 1073741824;
            i5 = (int) (1073741824 / f2);
        } else {
            i5 = 1;
        }
        mediaFormat.setInteger("sar-width", i4);
        mediaFormat.setInteger("sar-height", i5);
        String str4 = r300Var.f195372a;
        if (str4 != null) {
            try {
                mediaFormat.setInteger("track-id", Integer.parseInt(str4));
            } catch (NumberFormatException unused) {
            }
        }
        return mediaFormat;
    }

    /* JADX INFO: renamed from: i */
    public static void m60365i(Canvas canvas) {
        canvas.disableZ();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m60366i0(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    /* JADX INFO: renamed from: j */
    public static void m60367j(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m60368j0(SpotifyMediaLibraryService spotifyMediaLibraryService, Notification notification, int i) {
        if (i == 0 || i == -1) {
            spotifyMediaLibraryService.startForeground(R.id.notification_placeholder_mls_fg_start, notification, i);
        } else {
            spotifyMediaLibraryService.startForeground(R.id.notification_placeholder_mls_fg_start, notification, i & 255);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m60369k(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m60370k0(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            gaz gazVarM44190b = gaz.m44190b();
            int i3 = SystemForegroundService.f1429e;
            gazVarM44190b.getClass();
        } catch (SecurityException unused2) {
            gaz gazVarM44190b2 = gaz.m44190b();
            int i4 = SystemForegroundService.f1429e;
            gazVarM44190b2.getClass();
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m60371l(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m60372l0(SpotifyMediaLibraryService spotifyMediaLibraryService, Notification notification, int i) {
        if (i == 0 || i == -1) {
            spotifyMediaLibraryService.startForeground(R.id.notification_placeholder_mls_fg_start, notification, i);
        } else {
            spotifyMediaLibraryService.startForeground(R.id.notification_placeholder_mls_fg_start, notification, i & 1073745919);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m60373m(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m60374m0(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            n0b1.m63359R(context, intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m60375n(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    /* JADX INFO: renamed from: n0 */
    public static final BlendMode m60376n0(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        return i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX INFO: renamed from: o */
    public static void m60377o(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    /* JADX INFO: renamed from: o0 */
    public static final PorterDuff.Mode m60378o0(int i) {
        if (i == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX INFO: renamed from: p */
    public static void m60379p(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    /* JADX INFO: renamed from: p0 */
    public static long m60380p0(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        return (((long) Float.floatToRawIntBits(motionEvent.getRawY(i))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }

    /* JADX INFO: renamed from: q */
    public static void m60381q(Canvas canvas) {
        canvas.enableZ();
    }

    /* JADX INFO: renamed from: r */
    public static void m60382r(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    /* JADX INFO: renamed from: s */
    public static int m60383s(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            p300 p300Var = new p300();
            p300Var.f173527o = def0.m35799p("video/avc");
            r300 r300Var = new r300(p300Var);
            String str = r300Var.f195387p;
            if (str != null) {
                List listM95776f = zad0.m95776f(str, z, false);
                String strM95773c = zad0.m95773c(r300Var);
                Iterable iterableM95776f = strM95773c == null ? wsv0.f254763e : zad0.m95776f(strM95773c, z, false);
                jf40 jf40VarM69788m = pf40.m69788m();
                jf40VarM69788m.m28987e(listM95776f);
                jf40VarM69788m.m28987e(iterableM95776f);
                wsv0 wsv0VarM53150g = jf40VarM69788m.m53150g();
                for (int i = 0; i < wsv0VarM53150g.f254765d; i++) {
                    if (((tad0) wsv0VarM53150g.get(i)).f218547d != null && (videoCapabilities = ((tad0) wsv0VarM53150g.get(i)).f218547d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (xba0.m90309h(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil$DecoderQueryException unused) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public static String m60384t(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return iqa.m51350a(context);
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static String m60385u(MediaCodec mediaCodec) {
        return mediaCodec.getCanonicalName();
    }

    /* JADX INFO: renamed from: v */
    public static int m60386v(Context context, int i) {
        return context.getColor(i);
    }

    /* JADX INFO: renamed from: w */
    public static ColorStateList m60387w(Context context, int i) {
        ColorStateList colorStateListM35354a;
        ColorStateList colorStateList;
        s1x0 s1x0Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        t1x0 t1x0Var = new t1x0(resources, theme);
        synchronized (u1x0.f225933c) {
            try {
                SparseArray sparseArray = (SparseArray) u1x0.f225932b.get(t1x0Var);
                colorStateListM35354a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (s1x0Var = (s1x0) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (s1x0Var.f204850b.equals(resources.getConfiguration())) {
                        if (theme != null || s1x0Var.f204851c != 0) {
                            if (theme == null || s1x0Var.f204851c != theme.hashCode()) {
                            }
                        }
                        colorStateList = s1x0Var.f204849a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = u1x0.f225931a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM35354a = d9f.m35354a(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListM35354a == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (u1x0.f225933c) {
            try {
                WeakHashMap weakHashMap = u1x0.f225932b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(t1x0Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(t1x0Var, sparseArray2);
                }
                sparseArray2.append(i, new s1x0(colorStateListM35354a, t1x0Var.f216378a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListM35354a;
    }

    /* JADX INFO: renamed from: x */
    public static wsv0 m60388x(xs6 xs6Var) {
        jf40 jf40VarM69788m = pf40.m69788m();
        o3a1 o3a1VarMo38719j = bu6.f31030h.keySet().iterator();
        while (o3a1VarMo38719j.hasNext()) {
            Integer num = (Integer) o3a1VarMo38719j.next();
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= h0b1.m46335w(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), xs6Var.m91967c())) {
                jf40VarM69788m.m28985c(num);
            }
        }
        jf40VarM69788m.m28985c(2);
        return jf40VarM69788m.m53150g();
    }

    /* JADX INFO: renamed from: y */
    public static Drawable m60389y(Context context, int i) {
        return context.getDrawable(i);
    }

    /* JADX INFO: renamed from: z */
    public static File[] m60390z(Context context) {
        return context.getExternalCacheDirs();
    }
}
