package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ue4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f229394a;

    /* JADX INFO: renamed from: b */
    public final bji f229395b;

    /* JADX INFO: renamed from: c */
    public final wg61 f229396c;

    public ue4(boolean z, bji bjiVar) {
        this.f229394a = z;
        this.f229395b = bjiVar;
        this.f229396c = new wg61(new ne4(this, 6));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82888a() {
        ue4 ue4Var = (ue4) this.f229396c.getValue();
        return ue4Var != null ? ue4Var.m82888a() : this.f229394a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a(x09.f256832d, "android-list-ux-platform-consumers-standard-listcomponents-providedsortreconciliation", m82888a()));
    }

    public ue4(bji bjiVar) {
        this(true, bjiVar);
    }
}
