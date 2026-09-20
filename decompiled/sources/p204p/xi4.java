package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class xi4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f261759a;

    /* JADX INFO: renamed from: b */
    public final bji f261760b;

    /* JADX INFO: renamed from: c */
    public final wg61 f261761c = new wg61(new si4(this, 4));

    public xi4(boolean z, bji bjiVar) {
        this.f261759a = z;
        this.f261760b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m91083a() {
        xi4 xi4Var = (xi4) this.f261761c.getValue();
        return xi4Var != null ? xi4Var.m91083a() : this.f261759a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("is_promo_indicator_enabled", "android-nowplaying-elements-promotionalindicator", m91083a()));
    }
}
