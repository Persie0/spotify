package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f36302a;

    /* JADX INFO: renamed from: b */
    public final bji f36303b;

    /* JADX INFO: renamed from: c */
    public final wg61 f36304c = new wg61(new sb4(this, 9));

    public cc4(boolean z, bji bjiVar) {
        this.f36302a = z;
        this.f36303b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m32204a() {
        cc4 cc4Var = (cc4) this.f36304c.getValue();
        return cc4Var != null ? cc4Var.m32204a() : this.f36302a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_queued_badge", "android-libs-nowplaying-elements-trackinfo", m32204a()));
    }
}
