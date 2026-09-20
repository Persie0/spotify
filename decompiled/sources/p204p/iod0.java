package p204p;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iod0 {

    /* JADX INFO: renamed from: c */
    public boolean f104193c;

    /* JADX INFO: renamed from: e */
    public un6 f104195e;

    /* JADX INFO: renamed from: a */
    public final Object f104191a = new Object();

    /* JADX INFO: renamed from: b */
    public final hod0 f104192b = new hod0(this);

    /* JADX INFO: renamed from: d */
    public WeakReference f104194d = new WeakReference(null);

    /* JADX INFO: renamed from: a */
    public final void m51157a(jod0 jod0Var, Handler handler) {
        if (this.f104193c) {
            this.f104193c = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompatM53883d = jod0Var.m53883d();
            long j = playbackStateCompatM53883d == null ? 0L : playbackStateCompatM53883d.f36e;
            boolean z = playbackStateCompatM53883d != null && playbackStateCompatM53883d.f32a == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                mo51161e();
            } else {
                if (z || !z2) {
                    return;
                }
                mo51162f();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean mo51160d(Intent intent) {
        jod0 jod0Var;
        un6 un6Var;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f104191a) {
                jod0Var = (jod0) this.f104194d.get();
                un6Var = this.f104195e;
            }
            if (jod0Var != null && un6Var != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                qqd0 qqd0VarMo53882c = jod0Var.mo53882c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    m51157a(jod0Var, un6Var);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    m51157a(jod0Var, un6Var);
                    return true;
                }
                if (!this.f104193c) {
                    this.f104193c = true;
                    un6Var.sendMessageDelayed(un6Var.obtainMessage(1, qqd0VarMo53882c), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                un6Var.removeMessages(1);
                this.f104193c = false;
                PlaybackStateCompat playbackStateCompatM53883d = jod0Var.m53883d();
                if (((playbackStateCompatM53883d == null ? 0L : playbackStateCompatM53883d.f36e) & 32) != 0) {
                    mo51172p();
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m51176t(jod0 jod0Var, Handler handler) {
        synchronized (this.f104191a) {
            try {
                this.f104194d = new WeakReference(jod0Var);
                un6 un6Var = this.f104195e;
                un6 un6Var2 = null;
                if (un6Var != null) {
                    un6Var.removeCallbacksAndMessages(null);
                }
                if (jod0Var != null && handler != null) {
                    un6Var2 = new un6(this, handler.getLooper(), 8);
                }
                this.f104195e = un6Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo51161e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo51162f() {
    }

    /* JADX INFO: renamed from: p */
    public void mo51172p() {
    }

    /* JADX INFO: renamed from: q */
    public void mo51173q() {
    }

    /* JADX INFO: renamed from: s */
    public void mo51175s() {
    }

    /* JADX INFO: renamed from: l */
    public void mo51168l(long j) {
    }

    /* JADX INFO: renamed from: m */
    public void mo51169m(RatingCompat ratingCompat) {
    }

    /* JADX INFO: renamed from: n */
    public void mo51170n(int i) {
    }

    /* JADX INFO: renamed from: o */
    public void mo51171o(int i) {
    }

    /* JADX INFO: renamed from: r */
    public void mo51174r(long j) {
    }

    /* JADX INFO: renamed from: c */
    public void mo51159c(String str, Bundle bundle) {
    }

    /* JADX INFO: renamed from: g */
    public void mo51163g(String str, Bundle bundle) {
    }

    /* JADX INFO: renamed from: h */
    public void mo51164h(String str, Bundle bundle) {
    }

    /* JADX INFO: renamed from: i */
    public void mo51165i(Uri uri, Bundle bundle) {
    }

    /* JADX INFO: renamed from: j */
    public void mo51166j(String str, Bundle bundle) {
    }

    /* JADX INFO: renamed from: k */
    public void mo51167k(Uri uri, Bundle bundle) {
    }

    /* JADX INFO: renamed from: b */
    public void mo51158b(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
