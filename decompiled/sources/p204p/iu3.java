package p204p;

import com.spotify.searchview.proto.AudioEpisode;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class iu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f105848a;

    /* JADX INFO: renamed from: b */
    public final int f105849b;

    /* JADX INFO: renamed from: c */
    public final bji f105850c;

    /* JADX INFO: renamed from: d */
    public final wg61 f105851d = new wg61(new w62(this, 29));

    public iu3(int i, bji bjiVar, boolean z) {
        this.f105848a = z;
        this.f105849b = i;
        this.f105850c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m51645a() {
        iu3 iu3Var = (iu3) this.f105851d.getValue();
        return iu3Var != null ? iu3Var.m51645a() : this.f105848a;
    }

    /* JADX INFO: renamed from: b */
    public final int m51646b() {
        iu3 iu3Var = (iu3) this.f105851d.getValue();
        return iu3Var != null ? iu3Var.m51646b() : this.f105849b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_sponsored_playlist_horizontal_video", "android-adsdisplay-productssponsorship", m51645a()), new k8a("sponsored_playlist_v2_artwork_collapse_delay_ms", "android-adsdisplay-productssponsorship", m51646b(), 0, AudioEpisode.SHOW_URI_FIELD_NUMBER));
    }
}
