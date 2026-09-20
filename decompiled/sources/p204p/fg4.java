package p204p;

import android.media.MediaPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class fg4 implements mgf {

    /* JADX INFO: renamed from: a */
    public MediaPlayer f69213a;

    /* JADX INFO: renamed from: b */
    public hqb f69214b;

    /* JADX INFO: renamed from: b */
    public static final void m41572b(fg4 fg4Var) {
        MediaPlayer mediaPlayer = fg4Var.f69213a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
        }
        fg4Var.f69213a = null;
        hqb hqbVar = fg4Var.f69214b;
        if (hqbVar != null) {
            hqbVar.mo42416r(null);
        }
        fg4Var.f69214b = null;
    }

    @Override // p204p.mgf
    /* JADX INFO: renamed from: a */
    public final Object mo41573a(String str, ibk ibkVar) throws IOException {
        hqb hqbVar = new hqb(1, seg1.m77914f(ibkVar));
        hqbVar.m48222q();
        this.f69214b = hqbVar;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f69213a = mediaPlayer;
        hqbVar.mo42415l(new k23(this, 22));
        mediaPlayer.setDataSource(str);
        mediaPlayer.setOnPreparedListener(new cg4(mediaPlayer));
        mediaPlayer.setOnErrorListener(new dg4(this, hqbVar));
        mediaPlayer.setOnCompletionListener(new eg4(this, hqbVar));
        mediaPlayer.prepareAsync();
        Object objM48221p = hqbVar.m48221p();
        return objM48221p == yuk.f276404a ? objM48221p : w2a1.f247311a;
    }
}
