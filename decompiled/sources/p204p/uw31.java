package p204p;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class uw31 {

    /* JADX INFO: renamed from: a */
    public final Spatializer f234560a;

    /* JADX INFO: renamed from: b */
    public final boolean f234561b;

    /* JADX INFO: renamed from: c */
    public final Handler f234562c;

    /* JADX INFO: renamed from: d */
    public final tw31 f234563d;

    public uw31(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerM43165u = context == null ? null : fz6.m43165u(context);
        if (audioManagerM43165u == null || (bool != null && bool.booleanValue())) {
            this.f234560a = null;
            this.f234561b = false;
            this.f234562c = null;
            this.f234563d = null;
            return;
        }
        Spatializer spatializer = audioManagerM43165u.getSpatializer();
        this.f234560a = spatializer;
        this.f234561b = spatializer.getImmersiveAudioLevel() != 0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.f234562c = handler;
        tw31 tw31Var = new tw31(runnable);
        this.f234563d = tw31Var;
        spatializer.addOnSpatializerStateChangedListener(new xgi(handler, 0), tw31Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX INFO: renamed from: a */
    public final boolean m84084a(xs6 xs6Var, r300 r300Var) {
        int i;
        if (this.f234560a == null || !this.f234561b || !m84086c() || !m84087d()) {
            return false;
        }
        String str = r300Var.f195387p;
        int i2 = r300Var.f195360J;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i2 == 16) {
                i = 12;
            } else {
                i = i2;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i2 == -1) {
                i = 6;
            } else {
                i = i2;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i2 == 18 || i2 == 21)) {
            i = 24;
        } else {
            i = i2;
        }
        int iM46336x = r300Var.f195361K;
        if (iM46336x == -1 || i2 != i) {
            iM46336x = h0b1.m46336x(i);
        }
        if (iM46336x == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM46336x);
        int i3 = r300Var.f195362L;
        if (i3 != -1) {
            channelMask.setSampleRate(i3);
        }
        Spatializer spatializer = this.f234560a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(xs6Var.m91967c(), channelMask.build());
    }

    /* JADX INFO: renamed from: b */
    public final List m84085b() {
        if (this.f234560a == null || !this.f234561b || !m84086c() || !m84087d()) {
            kf40 kf40Var = pf40.f176960b;
            return wsv0.f254763e;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return pf40.m69794t(252);
        }
        Spatializer spatializer = this.f234560a;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m84086c() {
        Spatializer spatializer = this.f234560a;
        return spatializer != null && spatializer.isAvailable();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m84087d() {
        Spatializer spatializer = this.f234560a;
        return spatializer != null && spatializer.isEnabled();
    }

    /* JADX INFO: renamed from: e */
    public final void m84088e() {
        tw31 tw31Var;
        Handler handler;
        Spatializer spatializer = this.f234560a;
        if (spatializer == null || (tw31Var = this.f234563d) == null || (handler = this.f234562c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(tw31Var);
        handler.removeCallbacksAndMessages(null);
    }
}
