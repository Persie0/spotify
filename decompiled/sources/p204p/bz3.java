package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bz3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f32382a;

    /* JADX INFO: renamed from: b */
    public final bji f32383b;

    /* JADX INFO: renamed from: c */
    public final wg61 f32384c = new wg61(new ey3(this, 11));

    public bz3(boolean z, bji bjiVar) {
        this.f32382a = z;
        this.f32383b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m30951a() {
        bz3 bz3Var = (bz3) this.f32384c.getValue();
        return bz3Var != null ? bz3Var.m30951a() : this.f32382a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("clear_cache_on_trim_enabled", "android-companion-content-loader-impl", m30951a()));
    }
}
