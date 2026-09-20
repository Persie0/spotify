package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yi4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f273029a;

    /* JADX INFO: renamed from: b */
    public final bji f273030b;

    /* JADX INFO: renamed from: c */
    public final wg61 f273031c = new wg61(new si4(this, 5));

    public yi4(boolean z, bji bjiVar) {
        this.f273029a = z;
        this.f273030b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m93699a() {
        yi4 yi4Var = (yi4) this.f273031c.getValue();
        return yi4Var != null ? yi4Var.m93699a() : this.f273029a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("burst_skip_enabled", "android-nowplaying-elements-seekburst", m93699a()));
    }
}
