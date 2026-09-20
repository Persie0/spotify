package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class on4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f167154a;

    /* JADX INFO: renamed from: b */
    public final bji f167155b;

    /* JADX INFO: renamed from: c */
    public final wg61 f167156c = new wg61(new cn4(this, 7));

    public on4(boolean z, bji bjiVar) {
        this.f167154a = z;
        this.f167155b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m67398a() {
        on4 on4Var = (on4) this.f167156c.getValue();
        return on4Var != null ? on4Var.m67398a() : this.f167154a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("use_shared_reachability", "android-reachability", m67398a()));
    }
}
