package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class wsi0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final xnh f254639a;

    /* JADX INFO: renamed from: b */
    public final tsi0 f254640b;

    /* JADX INFO: renamed from: c */
    public final pfm0 f254641c;

    public wsi0(xnh xnhVar, tsi0 tsi0Var) {
        this.f254639a = xnhVar;
        this.f254640b = tsi0Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f254641c = new pfm0(new qfm0[]{new q040(xgg1.m90911x3(), xoc1.f263956O5, null), new e6m0(true)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f254641c;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f254639a.m91502a(tvg.f224155a, new wc21(new vsi0(this), pni0.f179401Y, new iq3(18), pni0.f179403Z));
    }
}
