package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class bv4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f31270a;

    /* JADX INFO: renamed from: b */
    public final bji f31271b;

    /* JADX INFO: renamed from: c */
    public final wg61 f31272c = new wg61(new uu4(this, 3));

    public bv4(boolean z, bji bjiVar) {
        this.f31270a = z;
        this.f31271b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m30584a() {
        bv4 bv4Var = (bv4) this.f31272c.getValue();
        return bv4Var != null ? bv4Var.m30584a() : this.f31270a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_lazy_preloading", "android-webview-startup", m30584a()));
    }
}
