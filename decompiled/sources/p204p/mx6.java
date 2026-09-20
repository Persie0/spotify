package p204p;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class mx6 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final Handler f147969a;

    /* JADX INFO: renamed from: b */
    public final AudioManager.OnAudioFocusChangeListener f147970b;

    public mx6(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f147970b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = h0b1.f86200a;
        this.f147969a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        h0b1.m46304c0(this.f147969a, new lx6(this, i, 0));
    }
}
