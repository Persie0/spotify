package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hm4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f92811a;

    /* JADX INFO: renamed from: b */
    public final bji f92812b;

    /* JADX INFO: renamed from: c */
    public final wg61 f92813c = new wg61(new jk4(this, 22));

    public hm4(boolean z, bji bjiVar) {
        this.f92811a = z;
        this.f92812b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m47922a() {
        hm4 hm4Var = (hm4) this.f92813c.getValue();
        return hm4Var != null ? hm4Var.m47922a() : this.f92811a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_sleeptimer_nudge", "android-podcastexperience-sleeptimernudge", m47922a()));
    }
}
