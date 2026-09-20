package p204p;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class wdc0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final h6a0 f250258a;

    /* JADX INFO: renamed from: b */
    public final r5n f250259b;

    /* JADX INFO: renamed from: c */
    public final ni00 f250260c;

    /* JADX INFO: renamed from: d */
    public final pfm0 f250261d;

    public wdc0(h6a0 h6a0Var, r5n r5nVar, ni00 ni00Var) {
        this.f250258a = h6a0Var;
        this.f250259b = r5nVar;
        this.f250260c = ni00Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f250261d = new pfm0(new qfm0[]{new q040(xgg1.m90662N1("PUFFIN_MANUAL_SELECT", "puffin/manual-select", 1543, "puffin"), xoc1.f263904I1, null), new a811(Uri.EMPTY)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f250261d;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return h6a0.m46706b(this.f250258a, v3h1.m84575H(this.f250260c.m64549a().map(zyx.f287694M0)), new b6b0(this, 16));
    }
}
