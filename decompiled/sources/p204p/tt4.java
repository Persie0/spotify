package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tt4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f223512a;

    /* JADX INFO: renamed from: b */
    public final fnk0 f223513b;

    /* JADX INFO: renamed from: c */
    public final bji f223514c;

    /* JADX INFO: renamed from: d */
    public final wg61 f223515d = new wg61(new st4(this, 1));

    /* JADX INFO: renamed from: e */
    public final wg61 f223516e = new wg61(new st4(this, 0));

    public tt4(boolean z, fnk0 fnk0Var, bji bjiVar) {
        this.f223512a = z;
        this.f223513b = fnk0Var;
        this.f223514c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81496a() {
        tt4 tt4Var = (tt4) this.f223516e.getValue();
        return tt4Var != null ? tt4Var.m81496a() : this.f223512a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("allow_showing_music_videos_setting", "android-video", m81496a()));
    }
}
