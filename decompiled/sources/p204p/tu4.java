package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tu4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f223758a;

    /* JADX INFO: renamed from: b */
    public final bji f223759b;

    /* JADX INFO: renamed from: c */
    public final wg61 f223760c = new wg61(new zr4(this, 29));

    public tu4(boolean z, bji bjiVar) {
        this.f223758a = z;
        this.f223759b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81547a() {
        tu4 tu4Var = (tu4) this.f223760c.getValue();
        return tu4Var != null ? tu4Var.m81547a() : this.f223758a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_time_measurements", "android-watchfeed-explorerentrypoint", m81547a()));
    }
}
