package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class go4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f82832a;

    /* JADX INFO: renamed from: b */
    public final bji f82833b;

    /* JADX INFO: renamed from: c */
    public final wg61 f82834c = new wg61(new cn4(this, 23));

    public go4(boolean z, bji bjiVar) {
        this.f82832a = z;
        this.f82833b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m45321a() {
        go4 go4Var = (go4) this.f82834c.getValue();
        return go4Var != null ? go4Var.m45321a() : this.f82832a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_remote_downloads_onboarding", "android-remotedownloads-onboarding", m45321a()));
    }
}
