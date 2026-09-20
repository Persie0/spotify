package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ez1 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f64235a;

    /* JADX INFO: renamed from: b */
    public final bji f64236b;

    /* JADX INFO: renamed from: c */
    public final wg61 f64237c;

    public ez1(boolean z, bji bjiVar) {
        this.f64235a = z;
        this.f64236b = bjiVar;
        this.f64237c = new wg61(new C2038k3(this, 26));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m40328a() {
        ez1 ez1Var = (ez1) this.f64237c.getValue();
        return ez1Var != null ? ez1Var.m40328a() : this.f64235a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("fetch_connected_accessories_at_start", "ads-device-info", m40328a()));
    }

    public ez1(bji bjiVar) {
        this(false, bjiVar);
    }
}
