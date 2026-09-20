package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class mi4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f143931a;

    /* JADX INFO: renamed from: b */
    public final bji f143932b;

    /* JADX INFO: renamed from: c */
    public final wg61 f143933c = new wg61(new bh4(this, 25));

    public mi4(boolean z, bji bjiVar) {
        this.f143931a = z;
        this.f143932b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61843a() {
        mi4 mi4Var = (mi4) this.f143933c.getValue();
        return mi4Var != null ? mi4Var.m61843a() : this.f143931a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_offline_listening_device_limit_text", "android-musicappplatform-offlineerrors", m61843a()));
    }
}
