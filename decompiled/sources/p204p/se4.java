package p204p;

import com.spotify.searchview.proto.AudioEpisode;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class se4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f208187a;

    /* JADX INFO: renamed from: b */
    public final int f208188b;

    /* JADX INFO: renamed from: c */
    public final bji f208189c;

    /* JADX INFO: renamed from: d */
    public final wg61 f208190d;

    public se4(int i, int i2, bji bjiVar) {
        this.f208187a = i;
        this.f208188b = i2;
        this.f208189c = bjiVar;
        this.f208190d = new wg61(new ne4(this, 4));
    }

    /* JADX INFO: renamed from: a */
    public final int m77881a() {
        se4 se4Var = (se4) this.f208190d.getValue();
        return se4Var != null ? se4Var.m77881a() : this.f208187a;
    }

    /* JADX INFO: renamed from: b */
    public final int m77882b() {
        se4 se4Var = (se4) this.f208190d.getValue();
        return se4Var != null ? se4Var.m77882b() : this.f208188b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("kodiak_prefetch_buffer_size", "android-list-ux-platform-consumers-standard-listcomponents-kodiakprefetch", m77881a(), 0, 100), new k8a("kodiak_prefetch_timeout_ms", "android-list-ux-platform-consumers-standard-listcomponents-kodiakprefetch", m77882b(), 0, AudioEpisode.SHOW_URI_FIELD_NUMBER));
    }

    public se4(bji bjiVar) {
        this(20, 0, bjiVar);
    }
}
