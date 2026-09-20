package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ol4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f166749a;

    /* JADX INFO: renamed from: b */
    public final fnk0 f166750b;

    /* JADX INFO: renamed from: c */
    public final bji f166751c;

    /* JADX INFO: renamed from: d */
    public final wg61 f166752d;

    /* JADX INFO: renamed from: e */
    public final wg61 f166753e;

    public ol4(boolean z, fnk0 fnk0Var, bji bjiVar) {
        this.f166749a = z;
        this.f166750b = fnk0Var;
        this.f166751c = bjiVar;
        this.f166752d = new wg61(new nl4(this, 1));
        this.f166753e = new wg61(new nl4(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m67275a() {
        ol4 ol4Var = (ol4) this.f166753e.getValue();
        return ol4Var != null ? ol4Var.m67275a() : this.f166749a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("automix_enabled", "android-player-settings-automix", m67275a()));
    }

    public ol4(fnk0 fnk0Var, bji bjiVar) {
        this(true, fnk0Var, bjiVar);
    }
}
