package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ub4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f228629a;

    /* JADX INFO: renamed from: b */
    public final bji f228630b;

    /* JADX INFO: renamed from: c */
    public final wg61 f228631c = new wg61(new sb4(this, 1));

    public ub4(boolean z, bji bjiVar) {
        this.f228629a = z;
        this.f228630b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82713a() {
        ub4 ub4Var = (ub4) this.f228631c.getValue();
        return ub4Var != null ? ub4Var.m82713a() : this.f228629a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("should_use_vit", "android-libs-nowplaying-elements-artwork", m82713a()));
    }
}
