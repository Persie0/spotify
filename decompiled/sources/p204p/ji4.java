package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ji4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f112636a;

    /* JADX INFO: renamed from: b */
    public final boolean f112637b;

    /* JADX INFO: renamed from: c */
    public final bji f112638c;

    /* JADX INFO: renamed from: d */
    public final wg61 f112639d = new wg61(new bh4(this, 22));

    public ji4(boolean z, boolean z2, bji bjiVar) {
        this.f112636a = z;
        this.f112637b = z2;
        this.f112638c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m53441a() {
        ji4 ji4Var = (ji4) this.f112639d.getValue();
        return ji4Var != null ? ji4Var.m53441a() : this.f112636a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m53442b() {
        ji4 ji4Var = (ji4) this.f112639d.getValue();
        return ji4Var != null ? ji4Var.m53442b() : this.f112637b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("music_video_enabled", "android-music-videos-widget-impl", m53441a()), new k8a("podcast_video_enabled", "android-music-videos-widget-impl", m53442b()));
    }
}
