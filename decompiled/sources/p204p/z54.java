package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f279462a;

    /* JADX INFO: renamed from: b */
    public final bji f279463b;

    /* JADX INFO: renamed from: c */
    public final wg61 f279464c = new wg61(new o54(this, 8));

    public z54(int i, bji bjiVar) {
        this.f279462a = i;
        this.f279463b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m95447a() {
        z54 z54Var = (z54) this.f279464c.getValue();
        return z54Var != null ? z54Var.m95447a() : this.f279462a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("days_after_release_with_unrestricted_playback", "android-feature-on-demand-new-releases", m95447a(), 0, 30));
    }
}
