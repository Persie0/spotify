package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class fdm0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final pkh f68521a;

    /* JADX INFO: renamed from: b */
    public final mb30 f68522b;

    /* JADX INFO: renamed from: c */
    public final h7u f68523c;

    /* JADX INFO: renamed from: d */
    public final pyu f68524d;

    /* JADX INFO: renamed from: e */
    public final gdm0 f68525e;

    /* JADX INFO: renamed from: f */
    public final wpi0 f68526f;

    /* JADX INFO: renamed from: g */
    public final pfm0 f68527g;

    public fdm0(pkh pkhVar, mb30 mb30Var, h7u h7uVar, pyu pyuVar, gdm0 gdm0Var) {
        this.f68521a = pkhVar;
        this.f68522b = mb30Var;
        this.f68523c = h7uVar;
        this.f68524d = pyuVar;
        this.f68525e = gdm0Var;
        wpi0 wpi0Var = new wpi0(null);
        this.f68526f = wpi0Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f68527g = new pfm0(new qfm0[]{new q040(xgg1.m90916y1(), xoc1.f263904I1, null), new sfj0(wpi0Var), new e6m0(true), new sw91(14, true, false, false), new i200(1)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f68527g;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f68521a.m70217a(sw41.m79513e(this.f68522b), rkk.m75763o(new bnl0(this, 4), true, -1358703886), new hlh(null, null, null, false, 63));
    }
}
