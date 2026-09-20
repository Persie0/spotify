package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class rs4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f202175a;

    /* JADX INFO: renamed from: b */
    public final bji f202176b;

    /* JADX INFO: renamed from: c */
    public final wg61 f202177c = new wg61(new zr4(this, 16));

    public rs4(boolean z, bji bjiVar) {
        this.f202175a = z;
        this.f202176b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76310a() {
        rs4 rs4Var = (rs4) this.f202177c.getValue();
        return rs4Var != null ? rs4Var.m76310a() : this.f202175a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("preserve_resumed_overlay_activity", "android-ubi-page-view-observer", m76310a()));
    }
}
