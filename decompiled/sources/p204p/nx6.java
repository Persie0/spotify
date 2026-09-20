package p204p;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class nx6 {

    /* JADX INFO: renamed from: a */
    public final int f159375a;

    /* JADX INFO: renamed from: b */
    public final AudioManager.OnAudioFocusChangeListener f159376b;

    /* JADX INFO: renamed from: c */
    public final Handler f159377c;

    /* JADX INFO: renamed from: d */
    public final xs6 f159378d;

    /* JADX INFO: renamed from: e */
    public final boolean f159379e;

    /* JADX INFO: renamed from: f */
    public final Object f159380f;

    public nx6(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, xs6 xs6Var, boolean z, boolean z2) {
        this.f159375a = i;
        this.f159377c = handler;
        this.f159378d = xs6Var;
        this.f159379e = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.f159376b = new mx6(onAudioFocusChangeListener, handler);
        } else {
            this.f159376b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f159380f = new AudioFocusRequest.Builder(i).setAudioAttributes(xs6Var.m91967c()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z2).build();
        } else {
            this.f159380f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx6)) {
            return false;
        }
        nx6 nx6Var = (nx6) obj;
        return this.f159375a == nx6Var.f159375a && this.f159379e == nx6Var.f159379e && Objects.equals(this.f159376b, nx6Var.f159376b) && Objects.equals(this.f159377c, nx6Var.f159377c) && Objects.equals(this.f159378d, nx6Var.f159378d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f159375a), this.f159376b, this.f159377c, this.f159378d, Boolean.valueOf(this.f159379e));
    }
}
