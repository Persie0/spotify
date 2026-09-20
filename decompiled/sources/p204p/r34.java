package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class r34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f195418a;

    /* JADX INFO: renamed from: b */
    public final bji f195419b;

    /* JADX INFO: renamed from: c */
    public final wg61 f195420c = new wg61(new u14(this, 23));

    public r34(boolean z, bji bjiVar) {
        this.f195418a = z;
        this.f195419b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74570a() {
        r34 r34Var = (r34) this.f195420c.getValue();
        return r34Var != null ? r34Var.m74570a() : this.f195418a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("is_enabled", "android-fandom-hub-scroll-card", m74570a()));
    }
}
