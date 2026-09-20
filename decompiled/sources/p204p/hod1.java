package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class hod1 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f93509a;

    /* JADX INFO: renamed from: b */
    public final rod1 f93510b;

    /* JADX INFO: renamed from: c */
    public final jal0 f93511c;

    /* JADX INFO: renamed from: d */
    public final q0f0 f93512d;

    /* JADX INFO: renamed from: e */
    public final bka1 f93513e;

    /* JADX INFO: renamed from: f */
    public final pfm0 f93514f;

    public hod1(doh dohVar, rod1 rod1Var, jal0 jal0Var, q0f0 q0f0Var, bka1 bka1Var) {
        this.f93509a = dohVar;
        this.f93510b = rod1Var;
        this.f93511c = jal0Var;
        this.f93512d = q0f0Var;
        this.f93513e = bka1Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f93514f = new pfm0(new qfm0[]{new q040(xgg1.m90854p2(), xoc1.f263920K1, null), new sw91(14, true, false, false), new e6m0(true), new zox()}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f93514f;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f93509a.m36532a(rkk.m75763o(new god1(this), true, -1490048276));
    }
}
