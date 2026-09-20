package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class hc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f89689a;

    /* JADX INFO: renamed from: b */
    public final bji f89690b;

    /* JADX INFO: renamed from: c */
    public final wg61 f89691c = new wg61(new sb4(this, 13));

    public hc4(boolean z, bji bjiVar) {
        this.f89689a = z;
        this.f89690b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m47094a() {
        hc4 hc4Var = (hc4) this.f89691c.getValue();
        return hc4Var != null ? hc4Var.m47094a() : this.f89689a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("music_npv_leavebehinds_enabled", "android-libs-nowplaying-scroll-widgets-podcast-sponsors", m47094a()));
    }
}
