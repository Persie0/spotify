package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f279697a;

    /* JADX INFO: renamed from: b */
    public final bji f279698b;

    /* JADX INFO: renamed from: c */
    public final wg61 f279699c;

    public z64(boolean z, bji bjiVar) {
        this.f279697a = z;
        this.f279698b = bjiVar;
        this.f279699c = new wg61(new o54(this, 25));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95470a() {
        z64 z64Var = (z64) this.f279699c.getValue();
        return z64Var != null ? z64Var.m95470a() : this.f279697a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("language_settings", "android-feature-settings", m95470a()));
    }

    public z64(bji bjiVar) {
        this(false, bjiVar);
    }
}
