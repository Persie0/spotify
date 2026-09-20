package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class gtk0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final bd21 f84231a;

    /* JADX INFO: renamed from: b */
    public final m58 f84232b;

    /* JADX INFO: renamed from: c */
    public final pfm0 f84233c;

    public gtk0(bd21 bd21Var, m58 m58Var) {
        this.f84231a = bd21Var;
        this.f84232b = m58Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f84233c = new pfm0(new qfm0[]{new q040(xgg1.m90844n4(), xoc1.f264041a2, null), new v69(t5j0.f217311d), new e6m0(true), new sw91(14, true, false, false)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f84233c;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f84231a.mo28784a(new gxj0(this, 22));
    }
}
