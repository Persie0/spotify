package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f158503a;

    /* JADX INFO: renamed from: b */
    public final bji f158504b;

    /* JADX INFO: renamed from: c */
    public final wg61 f158505c = new wg61(new ju3(this, 3));

    public nu3(boolean z, bji bjiVar) {
        this.f158503a = z;
        this.f158504b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65668a() {
        nu3 nu3Var = (nu3) this.f158505c.getValue();
        return nu3Var != null ? nu3Var.m65668a() : this.f158503a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_video_blocker", "android-age-verification-age-assurance-video-blocker-impl", m65668a()));
    }
}
