package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class i24 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f97736a;

    /* JADX INFO: renamed from: b */
    public final bji f97737b;

    /* JADX INFO: renamed from: c */
    public final wg61 f97738c;

    public i24(boolean z, bji bjiVar) {
        this.f97736a = z;
        this.f97737b = bjiVar;
        this.f97738c = new wg61(new u14(this, 8));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m49447a() {
        i24 i24Var = (i24) this.f97738c.getValue();
        return i24Var != null ? i24Var.m49447a() : this.f97736a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("registration_enabled", "android-deviceproxy-registrar", m49447a()));
    }

    public i24(bji bjiVar) {
        this(false, bjiVar);
    }
}
