package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class kb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f121076a;

    /* JADX INFO: renamed from: b */
    public final bji f121077b;

    /* JADX INFO: renamed from: c */
    public final wg61 f121078c = new wg61(new ga4(this, 22));

    public kb4(boolean z, bji bjiVar) {
        this.f121076a = z;
        this.f121077b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55927a() {
        kb4 kb4Var = (kb4) this.f121078c.getValue();
        return kb4Var != null ? kb4Var.m55927a() : this.f121076a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_fullscreen_track_change", "android-libs-lyrics", m55927a()));
    }
}
