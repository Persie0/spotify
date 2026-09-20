package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class bi5 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f27335a;

    /* JADX INFO: renamed from: b */
    public final wy91 f27336b;

    /* JADX INFO: renamed from: c */
    public final wg61 f27337c = new wg61(new uu4(this, 27));

    public bi5(boolean z, saw0 saw0Var) {
        this.f27335a = z;
        this.f27336b = saw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29287a() {
        bi5 bi5Var = (bi5) this.f27337c.getValue();
        return bi5Var != null ? bi5Var.m29287a() : this.f27335a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("widget_enabled", "apps-music-features-widget", m29287a()));
    }
}
