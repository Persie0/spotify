package p204p;

import android.media.AudioManager;
import com.spotify.messages.AudioManagerProxyEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class mz6 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pz6 f148627a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f148628b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener f148629c;

    public mz6(pz6 pz6Var, int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.f148627a = pz6Var;
        this.f148628b = i;
        this.f148629c = onAudioFocusChangeListener;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        String strM38563l;
        jz6 jz6Var = this.f148627a.f183612b;
        iz6 iz6VarM13581w = AudioManagerProxyEvent.m13581w();
        iz6VarM13581w.m51972r(ei6.m39066c(this.f148628b));
        iz6VarM13581w.m51977w("FOCUS_CHANGED");
        if (i == -3) {
            strM38563l = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
        } else if (i == -2) {
            strM38563l = "AUDIOFOCUS_LOSS_TRANSIENT";
        } else if (i != -1) {
            strM38563l = i != 1 ? edb.m38563l("UNKNOWN(", i, ")") : "AUDIOFOCUS_GAIN";
        } else {
            strM38563l = "AUDIOFOCUS_LOSS";
        }
        iz6VarM13581w.m51974t(strM38563l);
        jz6Var.f117603a.m73616a(iz6VarM13581w.build());
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f148629c;
        if (onAudioFocusChangeListener != null) {
            onAudioFocusChangeListener.onAudioFocusChange(i);
        }
    }
}
