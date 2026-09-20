package p204p;

import android.media.MediaPlayer;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class dg4 implements MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fg4 f48712a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqb f48713b;

    public dg4(fg4 fg4Var, hqb hqbVar) {
        this.f48712a = fg4Var;
        this.f48713b = hqbVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Logger.m3973i(s571.m77247f(i, "MediaPlayer error: what=", i2, ", extra="), new Object[0]);
        fg4 fg4Var = this.f48712a;
        fg4Var.f69214b = null;
        this.f48713b.mo42416r(null);
        fg4.m41572b(fg4Var);
        return false;
    }
}
