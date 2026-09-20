package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ck4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f38794a;

    /* JADX INFO: renamed from: b */
    public final wy91 f38795b;

    /* JADX INFO: renamed from: c */
    public final wg61 f38796c = new wg61(new si4(this, 25));

    public ck4(boolean z, saw0 saw0Var) {
        this.f38794a = z;
        this.f38795b = saw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m33069a() {
        ck4 ck4Var = (ck4) this.f38796c.getValue();
        return ck4Var != null ? ck4Var.m33069a() : this.f38794a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("allow_unauthenticated_search", "android-oem-integrations-xiaomi-unauth-properties-service", m33069a()));
    }
}
