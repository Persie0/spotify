package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f186989a;

    /* JADX INFO: renamed from: b */
    public final bji f186990b;

    /* JADX INFO: renamed from: c */
    public final wg61 f186991c = new wg61(new ga4(this, 28));

    public qb4(boolean z, bji bjiVar) {
        this.f186989a = z;
        this.f186990b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72480a() {
        qb4 qb4Var = (qb4) this.f186991c.getValue();
        return qb4Var != null ? qb4Var.m72480a() : this.f186989a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("video_manifest_prefetch_plugin_enabled", "android-libs-nowplaying-activity-plugins", m72480a()));
    }
}
