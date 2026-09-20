package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class tb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f218739a;

    /* JADX INFO: renamed from: b */
    public final bji f218740b;

    /* JADX INFO: renamed from: c */
    public final wg61 f218741c = new wg61(new sb4(this, 0));

    public tb4(boolean z, bji bjiVar) {
        this.f218739a = z;
        this.f218740b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80377a() {
        tb4 tb4Var = (tb4) this.f218741c.getValue();
        return tb4Var != null ? tb4Var.m80377a() : this.f218739a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("playback_quality_on_context_menu", "android-libs-nowplaying-commonviews", m80377a()));
    }
}
