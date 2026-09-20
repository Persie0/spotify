package p204p;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class l77 implements l07 {

    /* JADX INFO: renamed from: l */
    public static final j561 f130584l = kgg1.m56358u(new j77(0));

    /* JADX INFO: renamed from: a */
    public final Context f130585a;

    /* JADX INFO: renamed from: b */
    public final y5i0 f130586b;

    /* JADX INFO: renamed from: c */
    public final uxo f130587c;

    /* JADX INFO: renamed from: d */
    public final vbu0 f130588d;

    /* JADX INFO: renamed from: e */
    public final float f130589e;

    /* JADX INFO: renamed from: f */
    public n890 f130590f;

    /* JADX INFO: renamed from: g */
    public gh61 f130591g;

    /* JADX INFO: renamed from: h */
    public bu6 f130592h;

    /* JADX INFO: renamed from: i */
    public eu6 f130593i;

    /* JADX INFO: renamed from: j */
    public Looper f130594j;

    /* JADX INFO: renamed from: k */
    public Context f130595k;

    public l77(k77 k77Var) {
        Context context = (Context) k77Var.f119992b;
        this.f130585a = context;
        uxo uxoVar = (uxo) k77Var.f119993c;
        uxoVar.getClass();
        this.f130587c = uxoVar;
        this.f130586b = (y5i0) k77Var.f119994d;
        this.f130592h = (bu6) k77Var.f119995e;
        this.f130588d = context == null ? null : new vbu0(this, 27);
        this.f130589e = k77Var.f119991a;
        this.f130591g = gh61.f79843a;
    }

    /* JADX INFO: renamed from: a */
    public final i77 m58393a(k07 k07Var) throws Exception {
        Context context;
        Context context2;
        try {
            int i = k07Var.f117914h;
            int i2 = k07Var.f117915i;
            if (i2 == -1 || (context2 = this.f130585a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.f130595k;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.f130595k = context2.createDeviceContext(i2);
                }
                context = this.f130595k;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(k07Var.f117910d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : k07Var.f117913g.m91967c()).setAudioFormat(new AudioFormat.Builder().setSampleRate(k07Var.f117908b).setChannelMask(k07Var.f117909c).setEncoding(k07Var.f117907a).build()).setTransferMode(1).setBufferSizeInBytes(k07Var.f117912f).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                sessionId.setOffloadedPlayback(k07Var.f117911e);
            }
            if (i3 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new i77(audioTrackBuild, k07Var, this.f130588d, this.f130589e, this.f130591g);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new Exception() { // from class: androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException
            };
        } catch (IllegalArgumentException e) {
            e = e;
            throw new Exception(e) { // from class: androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException
            };
        } catch (UnsupportedOperationException e2) {
            e = e2;
            throw new Exception(e) { // from class: androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public final i07 m58394b(g07 g07Var) {
        m58397e(g07Var);
        r300 r300Var = g07Var.f75293a;
        xs6 xs6Var = g07Var.f75294b;
        vz6 vz6VarM84180a = this.f130587c.m84180a(xs6Var, r300Var);
        h07 h07Var = new h07();
        String str = r300Var.f195387p;
        int i = r300Var.f195363M;
        int i2 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.f130592h.m30505c(xs6Var, r300Var) != null : i == 2) {
            i2 = 2;
        }
        h07Var.f86166d = i2;
        h07Var.f86163a = vz6VarM84180a.f246400a;
        h07Var.f86164b = vz6VarM84180a.f246401b;
        h07Var.f86165c = vz6VarM84180a.f246402c;
        return h07Var.m46258a();
    }

    /* JADX INFO: renamed from: c */
    public final k07 m58395c(g07 g07Var) {
        int iIntValue;
        char c;
        int iM46338z;
        boolean z;
        boolean z2;
        int iM54992k;
        int i;
        int iM94500o;
        r300 r300Var = g07Var.f75293a;
        boolean z3 = g07Var.f75297e;
        boolean z4 = g07Var.f75296d;
        xs6 xs6Var = g07Var.f75294b;
        m58397e(g07Var);
        String str = r300Var.f195387p;
        int i2 = r300Var.f195360J;
        int i3 = r300Var.f195362L;
        int iIntValue2 = r300Var.f195363M;
        if (Objects.equals(str, "audio/raw")) {
            c95.m31843i(h0b1.m46288P(iIntValue2));
            iIntValue = h0b1.m46337y(r300Var);
            iM46338z = h0b1.m46338z(iIntValue2) * i2;
            z = false;
            c = 0;
        } else {
            vz6 vz6VarM84180a = z3 ? this.f130587c.m84180a(xs6Var, r300Var) : vz6.f246399d;
            if (z3 && vz6VarM84180a.f246400a) {
                str.getClass();
                int iM35787d = def0.m35787d(str, r300Var.f195383l);
                int iM46337y = h0b1.m46337y(r300Var);
                if ((iM35787d == 11 || iM35787d == 12) && i3 >= 16000 && !((Boolean) f130584l.get()).booleanValue()) {
                    if (iM35787d == 12 && i2 == 2) {
                        iM46337y = 4;
                    }
                    i3 /= 2;
                    iM35787d = 10;
                }
                int i4 = iM46337y;
                int i5 = iM35787d;
                iIntValue = i4;
                z = vz6VarM84180a.f246401b;
                iIntValue2 = i5;
                iM46338z = -1;
                z4 = true;
                c = 1;
            } else {
                Pair pairM30505c = this.f130592h.m30505c(xs6Var, r300Var);
                if (pairM30505c == null) {
                    String str2 = "Unable to configure passthrough for: " + r300Var;
                    str2.getClass();
                    throw new AudioOutputProvider$ConfigurationException(str2);
                }
                iIntValue2 = ((Integer) pairM30505c.first).intValue();
                iIntValue = ((Integer) pairM30505c.second).intValue();
                c = 2;
                iM46338z = -1;
                z = false;
            }
        }
        int i6 = r300Var.f195382k;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i6 == -1) {
            i6 = 768000;
        }
        int iMax = g07Var.f75301i;
        if (iMax != -1) {
            z2 = true;
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i3, iIntValue, iIntValue2);
            c95.m31855u(minBufferSize != -2);
            if (iM46338z == -1) {
                iM46338z = 1;
            }
            double d = z4 ? this.f130589e : 1.0d;
            this.f130586b.getClass();
            if (c == 0) {
                z2 = true;
                iM54992k = k0e1.m54992k(((((long) 500000) * ((long) i3)) * ((long) iM46338z)) / 1000000);
            } else if (c != 1) {
                z2 = true;
                if (c != 2) {
                    throw new IllegalArgumentException();
                }
                if (iIntValue2 == 5) {
                    i = 500000;
                } else {
                    i = iIntValue2 == 8 ? 1000000 : 250000;
                }
                if (i6 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    iM94500o = q3d0.m72110u(i6, 8);
                } else {
                    iM94500o = ysj0.m94500o(iIntValue2);
                    c95.m31855u(iM94500o != -2147483647);
                }
                iM54992k = k0e1.m54992k((((long) i) * ((long) iM94500o)) / 1000000);
            } else {
                z2 = true;
                int iM94500o2 = ysj0.m94500o(iIntValue2);
                c95.m31855u(iM94500o2 != -2147483647);
                iM54992k = k0e1.m54992k((((long) 50000000) * ((long) iM94500o2)) / 1000000);
            }
            iMax = (((Math.max(minBufferSize, (int) (((double) iM54992k) * d)) + iM46338z) - 1) / iM46338z) * iM46338z;
        }
        j07 j07Var = new j07();
        xs6 xs6Var2 = xs6.f265509i;
        j07Var.f107375i = -1;
        j07Var.f107368b = i3;
        j07Var.f107369c = iIntValue;
        j07Var.f107367a = iIntValue2;
        j07Var.f107372f = iMax;
        j07Var.f107374h = g07Var.f75298f;
        j07Var.f107373g = xs6Var;
        boolean z5 = z2;
        j07Var.f107371e = c == z5 ? z5 : false;
        j07Var.f107370d = g07Var.f75300h;
        j07Var.f107376j = z4;
        j07Var.f107377k = z;
        j07Var.f107375i = g07Var.f75299g;
        return new k07(j07Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m58396d() {
        uw31 uw31Var;
        n890 n890Var = this.f130590f;
        if (n890Var != null) {
            n890Var.m63835f();
        }
        eu6 eu6Var = this.f130593i;
        if (eu6Var != null) {
            Context context = (Context) eu6Var.f62877b;
            if (eu6Var.f62876a) {
                eu6Var.f62884i = null;
                fz6.m43165u(context).unregisterAudioDeviceCallback((cu6) eu6Var.f62880e);
                if (Build.VERSION.SDK_INT >= 32 && (uw31Var = (uw31) eu6Var.f62883h) != null) {
                    uw31Var.m84088e();
                    eu6Var.f62883h = null;
                }
                context.unregisterReceiver((o4a) eu6Var.f62881f);
                du6 du6Var = (du6) eu6Var.f62882g;
                if (du6Var != null) {
                    du6Var.f52984a.unregisterContentObserver(du6Var);
                }
                eu6Var.f62876a = false;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m58397e(g07 g07Var) {
        Context context;
        bu6 bu6VarM30504b;
        AudioDeviceInfo audioDeviceInfo = g07Var.f75295c;
        xs6 xs6Var = g07Var.f75294b;
        m58398f();
        eu6 eu6Var = this.f130593i;
        if (eu6Var == null && (context = this.f130585a) != null) {
            eu6 eu6Var2 = new eu6(context, new nc5(this, 11), xs6Var, audioDeviceInfo);
            this.f130593i = eu6Var2;
            Handler handler = (Handler) eu6Var2.f62879d;
            Context context2 = (Context) eu6Var2.f62877b;
            if (eu6Var2.f62876a) {
                bu6VarM30504b = (bu6) eu6Var2.f62884i;
                bu6VarM30504b.getClass();
            } else {
                eu6Var2.f62876a = true;
                du6 du6Var = (du6) eu6Var2.f62882g;
                if (du6Var != null) {
                    du6Var.f52984a.registerContentObserver(du6Var.f52985b, false, du6Var);
                }
                fz6.m43165u(context2).registerAudioDeviceCallback((cu6) eu6Var2.f62880e, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((uw31) eu6Var2.f62883h) == null) {
                    eu6Var2.f62883h = new uw31(context2, new RunnableC2210od(eu6Var2, 9), Boolean.valueOf(h0b1.m46292T(context2)));
                }
                bu6VarM30504b = bu6.m30504b(context2, context2.registerReceiver((o4a) eu6Var2.f62881f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (xs6) eu6Var2.f62886k, (AudioDeviceInfo) eu6Var2.f62885j, eu6Var2.m40033g());
                eu6Var2.f62884i = bu6VarM30504b;
            }
            this.f130592h = bu6VarM30504b;
        } else if (eu6Var != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) eu6Var.f62885j)) {
                eu6Var.f62885j = audioDeviceInfo;
                Context context3 = (Context) eu6Var.f62877b;
                xs6 xs6Var2 = (xs6) eu6Var.f62886k;
                List listM40033g = eu6Var.m40033g();
                wsv0 wsv0Var = bu6.f31027e;
                eu6Var.m40034h(bu6.m30504b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), xs6Var2, audioDeviceInfo, listM40033g));
            }
            eu6 eu6Var3 = this.f130593i;
            if (!Objects.equals(xs6Var, (xs6) eu6Var3.f62886k)) {
                eu6Var3.f62886k = xs6Var;
                Context context4 = (Context) eu6Var3.f62877b;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) eu6Var3.f62885j;
                List listM40033g2 = eu6Var3.m40033g();
                wsv0 wsv0Var2 = bu6.f31027e;
                eu6Var3.m40034h(bu6.m30504b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), xs6Var, audioDeviceInfo2, listM40033g2));
            }
        }
        this.f130592h.getClass();
    }

    /* JADX INFO: renamed from: f */
    public final void m58398f() {
        if (this.f130585a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f130594j;
        c95.m31858x(looper == null || looper == looperMyLooper, "AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", looper == null ? "null" : looper.getThread().getName(), looperMyLooper != null ? looperMyLooper.getThread().getName() : "null");
        this.f130594j = looperMyLooper;
    }
}
