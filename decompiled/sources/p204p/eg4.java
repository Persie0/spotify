package p204p;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes6.dex */
public final class eg4 implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fg4 f59209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqb f59210b;

    public eg4(fg4 fg4Var, hqb hqbVar) {
        this.f59209a = fg4Var;
        this.f59210b = hqbVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        fg4 fg4Var = this.f59209a;
        fg4Var.f69214b = null;
        this.f59210b.resumeWith(w2a1.f247311a);
        fg4.m41572b(fg4Var);
    }
}
