package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ll4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f134523a;

    /* JADX INFO: renamed from: b */
    public final bji f134524b;

    /* JADX INFO: renamed from: c */
    public final wg61 f134525c = new wg61(new jk4(this, 7));

    public ll4(boolean z, bji bjiVar) {
        this.f134523a = z;
        this.f134524b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m59295a() {
        ll4 ll4Var = (ll4) this.f134525c.getValue();
        return ll4Var != null ? ll4Var.m59295a() : this.f134523a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("defer_cit", "android-player-esperanto", m59295a()));
    }
}
