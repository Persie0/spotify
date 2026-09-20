package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class fsm0 implements hsm0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f72900a;

    /* JADX INFO: renamed from: b */
    public final urm0 f72901b;

    /* JADX INFO: renamed from: c */
    public final pl80 f72902c;

    /* JADX INFO: renamed from: d */
    public final bsm0 f72903d;

    /* JADX INFO: renamed from: e */
    public final csm0 f72904e;

    public fsm0(ArrayList arrayList, urm0 urm0Var, pl80 pl80Var, int i) {
        urm0Var = (i & 2) != 0 ? new urm0() : urm0Var;
        this.f72900a = arrayList;
        this.f72901b = urm0Var;
        this.f72902c = pl80Var;
        this.f72903d = new bsm0();
        this.f72904e = csm0.f41656a;
    }

    @Override // p204p.hsm0
    /* JADX INFO: renamed from: a */
    public final esm0 mo42565a() {
        return this.f72904e;
    }

    @Override // p204p.hsm0
    /* JADX INFO: renamed from: b */
    public final urm0 mo42566b() {
        return this.f72901b;
    }

    @Override // p204p.hsm0
    /* JADX INFO: renamed from: c */
    public final pl80 mo42567c() {
        return this.f72902c;
    }

    @Override // p204p.hsm0
    /* JADX INFO: renamed from: d */
    public final bsm0 mo42568d() {
        return this.f72903d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsm0)) {
            return false;
        }
        fsm0 fsm0Var = (fsm0) obj;
        return wj50.m88271j(this.f72900a, fsm0Var.f72900a) && wj50.m88271j(this.f72901b, fsm0Var.f72901b) && wj50.m88271j(this.f72902c, fsm0Var.f72902c);
    }

    public final int hashCode() {
        return this.f72902c.hashCode() + ((this.f72901b.hashCode() + (this.f72900a.hashCode() * 31)) * 961);
    }
}
