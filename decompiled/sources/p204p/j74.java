package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f109480a;

    /* JADX INFO: renamed from: b */
    public final bji f109481b;

    /* JADX INFO: renamed from: c */
    public final wg61 f109482c = new wg61(new f74(this, 3));

    public j74(boolean z, bji bjiVar) {
        this.f109480a = z;
        this.f109481b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m52598a() {
        j74 j74Var = (j74) this.f109482c.getValue();
        return j74Var != null ? j74Var.m52598a() : this.f109480a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("track_video_indicator_enabled", "android-feature-track-row-configuration-builder", m52598a()));
    }
}
