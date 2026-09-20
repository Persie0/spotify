package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f281621a;

    /* JADX INFO: renamed from: b */
    public final boolean f281622b;

    /* JADX INFO: renamed from: c */
    public final bji f281623c;

    /* JADX INFO: renamed from: d */
    public final wg61 f281624d;

    public zd4(boolean z, boolean z2, bji bjiVar) {
        this.f281621a = z;
        this.f281622b = z2;
        this.f281623c = bjiVar;
        this.f281624d = new wg61(new dd4(this, 18));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95913a() {
        zd4 zd4Var = (zd4) this.f281624d.getValue();
        return zd4Var != null ? zd4Var.m95913a() : this.f281621a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m95914b() {
        zd4 zd4Var = (zd4) this.f281624d.getValue();
        return zd4Var != null ? zd4Var.m95914b() : this.f281622b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("show_show_image_next_to_subtitle", "android-list-ux-platform-consumers-episode-shared", m95913a()), new k8a("use_standard_title_and_subtitle_for_music_episodes", "android-list-ux-platform-consumers-episode-shared", m95914b()));
    }

    public zd4(bji bjiVar) {
        this(false, false, bjiVar);
    }
}
