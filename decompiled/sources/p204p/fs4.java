package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fs4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f72764a;

    /* JADX INFO: renamed from: b */
    public final bji f72765b;

    /* JADX INFO: renamed from: c */
    public final wg61 f72766c = new wg61(new zr4(this, 4));

    public fs4(boolean z, bji bjiVar) {
        this.f72764a = z;
        this.f72765b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m42538a() {
        fs4 fs4Var = (fs4) this.f72766c.getValue();
        return fs4Var != null ? fs4Var.m42538a() : this.f72764a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("clear_cache_on_trim_enabled", "android-transcript-endpoints-impl", m42538a()));
    }
}
