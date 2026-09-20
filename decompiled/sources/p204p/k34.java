package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f118756a;

    /* JADX INFO: renamed from: b */
    public final bji f118757b;

    /* JADX INFO: renamed from: c */
    public final wg61 f118758c = new wg61(new u14(this, 18));

    public k34(boolean z, bji bjiVar) {
        this.f118756a = z;
        this.f118757b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55227a() {
        k34 k34Var = (k34) this.f118758c.getValue();
        return k34Var != null ? k34Var.m55227a() : this.f118756a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_content_capability_download_gate", "android-episode-contextmenu", m55227a()));
    }
}
