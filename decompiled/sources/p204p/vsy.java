package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class vsy implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f244509a;

    /* JADX INFO: renamed from: b */
    public final bji f244510b;

    /* JADX INFO: renamed from: c */
    public final wg61 f244511c;

    public vsy(boolean z, bji bjiVar) {
        this.f244509a = z;
        this.f244510b = bjiVar;
        this.f244511c = new wg61(new ias(this, 14));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m86365b() {
        vsy vsyVar = (vsy) this.f244511c.getValue();
        return vsyVar != null ? vsyVar.m86365b() : this.f244509a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_offline_listening_toggle", "fetch-settings", m86365b()));
    }

    public vsy(bji bjiVar) {
        this(false, bjiVar);
    }
}
