package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class s7i0 implements r7i0 {

    /* JADX INFO: renamed from: a */
    public final xre f206381a;

    /* JADX INFO: renamed from: b */
    public final pap0 f206382b;

    /* JADX INFO: renamed from: c */
    public final wri0 f206383c;

    /* JADX INFO: renamed from: d */
    public final c9k f206384d;

    /* JADX INFO: renamed from: e */
    public boolean f206385e;

    /* JADX INFO: renamed from: f */
    public final t0h1 f206386f;

    /* JADX INFO: renamed from: g */
    public final s9p0 f206387g;

    /* JADX INFO: renamed from: h */
    public final yo3 f206388h;

    public s7i0(xre xreVar, pap0 pap0Var, wri0 wri0Var) {
        this.f206381a = xreVar;
        this.f206382b = pap0Var;
        this.f206383c = wri0Var;
        c9k c9kVarM56661c = kk40.m56661c(mlg1.m62205A(qlg1.m73202g(), xsr.f265652b));
        this.f206384d = c9kVarM56661c;
        this.f206386f = new t0h1(pap0Var.f175587a, new yrv(this));
        this.f206387g = mo43757c(false);
        this.f206388h = new yo3(this);
        x0h1.m89578u(c9kVarM56661c, null, 0, new l2i0(this, null, 2), 3);
    }

    @Override // p204p.r7i0, p204p.t9p0
    /* JADX INFO: renamed from: a */
    public final void mo32673a(s9p0 s9p0Var) {
        pap0 pap0Var = this.f206382b;
        ArrayList arrayList = pap0Var.f175592f;
        if (this.f206385e) {
            return;
        }
        s9p0 s9p0Var2 = s9p0Var instanceof s9p0 ? s9p0Var : null;
        if (s9p0Var2 == null) {
            throw new IllegalStateException("group not created by createPlayerGroup()");
        }
        t0h1 t0h1Var = this.f206386f;
        s9p0 s9p0VarM79808h = t0h1Var.m79808h();
        if (s9p0VarM79808h != null && s9p0VarM79808h.f206992a) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((v9p0) it.next()).m84988e(s9p0VarM79808h);
            }
        }
        pap0Var.f175593g = s9p0Var;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((v9p0) it2.next()).m84987d(s9p0Var);
        }
        t0h1Var.m79802b(s9p0Var2);
    }

    @Override // p204p.r7i0, p204p.t9p0
    /* JADX INFO: renamed from: b */
    public final boolean mo32674b(s9p0 s9p0Var) {
        if (!(s9p0Var instanceof s9p0)) {
            s9p0Var = null;
        }
        if (s9p0Var == null) {
            throw new IllegalStateException("group not created by createPlayerGroup()");
        }
        if (!s9p0Var.equals(this.f206386f.m79808h())) {
            return false;
        }
        mo32673a(this.f206387g);
        return true;
    }

    @Override // p204p.r7i0
    /* JADX INFO: renamed from: c */
    public final s9p0 mo43757c(boolean z) {
        return new s9p0(z);
    }

    @Override // p204p.r7i0
    /* JADX INFO: renamed from: d */
    public final void mo43758d() {
        if (this.f206385e) {
            return;
        }
        this.f206383c.mo29039k();
        mo32673a(this.f206387g);
        this.f206385e = true;
        kk40.m56680v(this.f206384d, null);
        pap0 pap0Var = this.f206382b;
        LinkedList linkedList = pap0Var.f175591e;
        ArrayList arrayList = pap0Var.f175592f;
        while (!arrayList.isEmpty()) {
            ((v9p0) g6f.m43741q0(arrayList)).m84986c();
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((ph50) it.next()).m69964q();
        }
        linkedList.clear();
    }
}
