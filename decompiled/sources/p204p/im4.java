package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class im4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f103584a;

    /* JADX INFO: renamed from: b */
    public final boolean f103585b;

    /* JADX INFO: renamed from: c */
    public final bji f103586c;

    /* JADX INFO: renamed from: d */
    public final wg61 f103587d = new wg61(new jk4(this, 23));

    public im4(boolean z, boolean z2, bji bjiVar) {
        this.f103584a = z;
        this.f103585b = z2;
        this.f103586c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m51050a() {
        im4 im4Var = (im4) this.f103587d.getValue();
        return im4Var != null ? im4Var.m51050a() : this.f103584a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m51051b() {
        im4 im4Var = (im4) this.f103587d.getValue();
        return im4Var != null ? im4Var.m51051b() : this.f103585b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_speed_control_page", "android-podcastplaybackspeed-bottom-sheet", m51050a()), new k8a("enable_speed_shortcuts_v2", "android-podcastplaybackspeed-bottom-sheet", m51051b()));
    }
}
