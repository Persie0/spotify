package p204p;

import android.os.Handler;

/* JADX INFO: loaded from: classes5.dex */
public final class loz implements gz6 {

    /* JADX INFO: renamed from: a */
    public final bed0 f135580a;

    /* JADX INFO: renamed from: b */
    public final noz f135581b;

    public loz(bed0 bed0Var, noz nozVar) {
        this.f135580a = bed0Var;
        this.f135581b = nozVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        Handler handler = this.f135580a.f26335b;
        if (handler != null) {
            handler.post(new e9w(this, i, 1));
        }
    }
}
