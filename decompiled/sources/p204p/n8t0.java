package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class n8t0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f151621a;

    /* JADX INFO: renamed from: b */
    public final bji f151622b;

    /* JADX INFO: renamed from: c */
    public final wg61 f151623c = new wg61(new cgr0(this, 26));

    public n8t0(boolean z, bji bjiVar) {
        this.f151621a = z;
        this.f151622b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m63854a() {
        n8t0 n8t0Var = (n8t0) this.f151623c.getValue();
        return n8t0Var != null ? n8t0Var.m63854a() : this.f151621a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a(x09.f256832d, "puffin-cross-device-syncing", m63854a()));
    }
}
