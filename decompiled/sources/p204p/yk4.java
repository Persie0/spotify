package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class yk4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f273565a;

    /* JADX INFO: renamed from: b */
    public final bji f273566b;

    /* JADX INFO: renamed from: c */
    public final wg61 f273567c;

    public yk4(boolean z, bji bjiVar) {
        this.f273565a = z;
        this.f273566b = bjiVar;
        this.f273567c = new wg61(new f30(this, 21));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m93960b() {
        yk4 yk4Var = (yk4) this.f273567c.getValue();
        return yk4Var != null ? yk4Var.m93960b() : this.f273565a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a(x09.f256832d, "android-peekabook", m93960b()));
    }

    public yk4(bji bjiVar) {
        this(false, bjiVar);
    }
}
