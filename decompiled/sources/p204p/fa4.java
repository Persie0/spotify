package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class fa4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f67421a;

    /* JADX INFO: renamed from: b */
    public final bji f67422b;

    /* JADX INFO: renamed from: c */
    public final wg61 f67423c = new wg61(new f74(this, 29));

    public fa4(boolean z, bji bjiVar) {
        this.f67421a = z;
        this.f67422b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m41136a() {
        fa4 fa4Var = (fa4) this.f67423c.getValue();
        return fa4Var != null ? fa4Var.m41136a() : this.f67421a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_related_card_in_npv", "android-legacy-related-track-card", m41136a()));
    }
}
