package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class aps {

    /* JADX INFO: renamed from: a */
    public final k7s0 f18001a;

    /* JADX INFO: renamed from: b */
    public final o7s f18002b;

    /* JADX INFO: renamed from: c */
    public final opx f18003c;

    /* JADX INFO: renamed from: d */
    public ago f18004d;

    /* JADX INFO: renamed from: e */
    public gbc0 f18005e;

    public aps(k7s0 k7s0Var, o7s o7sVar, opx opxVar) {
        this.f18001a = k7s0Var;
        this.f18002b = o7sVar;
        this.f18003c = opxVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m26726a() {
        ago agoVar = this.f18004d;
        if (agoVar != null) {
            agoVar.m25872i();
        }
        this.f18004d = null;
    }

    /* JADX INFO: renamed from: b */
    public final ago m26727b() {
        if (this.f18004d == null) {
            ojo ojoVar = ago.f15436t;
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            ago agoVarM44033i = g9g1.m44033i(new erh(this.f18003c, k7s0.m55712a(this.f18001a, xgg1.m90629I3(), 4), this.f18002b.m66386a(false)));
            this.f18005e = spg1.m78912v(agoVarM44033i);
            this.f18004d = agoVarM44033i;
        }
        ago agoVar = this.f18004d;
        wj50.m88279p(agoVar);
        return agoVar;
    }
}
