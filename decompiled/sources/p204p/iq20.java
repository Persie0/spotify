package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class iq20 extends lud1 {
    @Override // p204p.ctq
    /* JADX INFO: renamed from: a */
    public final void mo29208a(ctq ctqVar) {
        ix8 ix8Var = (ix8) this.f137062b;
        int i = ix8Var.f106616w0;
        ftq ftqVar = this.f137068h;
        Iterator it = ftqVar.f73276l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((ftq) it.next()).f73271g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            ftqVar.mo42686d(i3 + ix8Var.f106618y0);
        } else {
            ftqVar.mo42686d(i2 + ix8Var.f106618y0);
        }
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: d */
    public final void mo29209d() {
        v7j v7jVar = this.f137062b;
        if (v7jVar instanceof ix8) {
            ftq ftqVar = this.f137068h;
            ftqVar.f73266b = true;
            ArrayList arrayList = ftqVar.f73276l;
            ix8 ix8Var = (ix8) v7jVar;
            int i = ix8Var.f106616w0;
            boolean z = ix8Var.f106617x0;
            int i2 = 0;
            if (i == 0) {
                ftqVar.f73269e = 4;
                while (i2 < ix8Var.f114775v0) {
                    v7j v7jVar2 = ix8Var.f114774u0[i2];
                    if (z || v7jVar2.f238243i0 != 8) {
                        ftq ftqVar2 = v7jVar2.f238232d.f137068h;
                        ftqVar2.f73275k.add(ftqVar);
                        arrayList.add(ftqVar2);
                    }
                    i2++;
                }
                m51318m(this.f137062b.f238232d.f137068h);
                m51318m(this.f137062b.f238232d.f137069i);
                return;
            }
            if (i == 1) {
                ftqVar.f73269e = 5;
                while (i2 < ix8Var.f114775v0) {
                    v7j v7jVar3 = ix8Var.f114774u0[i2];
                    if (z || v7jVar3.f238243i0 != 8) {
                        ftq ftqVar3 = v7jVar3.f238232d.f137069i;
                        ftqVar3.f73275k.add(ftqVar);
                        arrayList.add(ftqVar3);
                    }
                    i2++;
                }
                m51318m(this.f137062b.f238232d.f137068h);
                m51318m(this.f137062b.f238232d.f137069i);
                return;
            }
            if (i == 2) {
                ftqVar.f73269e = 6;
                while (i2 < ix8Var.f114775v0) {
                    v7j v7jVar4 = ix8Var.f114774u0[i2];
                    if (z || v7jVar4.f238243i0 != 8) {
                        ftq ftqVar4 = v7jVar4.f238234e.f137068h;
                        ftqVar4.f73275k.add(ftqVar);
                        arrayList.add(ftqVar4);
                    }
                    i2++;
                }
                m51318m(this.f137062b.f238234e.f137068h);
                m51318m(this.f137062b.f238234e.f137069i);
                return;
            }
            if (i != 3) {
                return;
            }
            ftqVar.f73269e = 7;
            while (i2 < ix8Var.f114775v0) {
                v7j v7jVar5 = ix8Var.f114774u0[i2];
                if (z || v7jVar5.f238243i0 != 8) {
                    ftq ftqVar5 = v7jVar5.f238234e.f137069i;
                    ftqVar5.f73275k.add(ftqVar);
                    arrayList.add(ftqVar5);
                }
                i2++;
            }
            m51318m(this.f137062b.f238234e.f137068h);
            m51318m(this.f137062b.f238234e.f137069i);
        }
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: e */
    public final void mo29210e() {
        v7j v7jVar = this.f137062b;
        if (v7jVar instanceof ix8) {
            int i = ((ix8) v7jVar).f106616w0;
            ftq ftqVar = this.f137068h;
            if (i == 0 || i == 1) {
                v7jVar.f238227a0 = ftqVar.f73271g;
            } else {
                v7jVar.f238229b0 = ftqVar.f73271g;
            }
        }
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: f */
    public final void mo29211f() {
        this.f137063c = null;
        this.f137068h.m42685c();
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: k */
    public final boolean mo29212k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m51318m(ftq ftqVar) {
        ftq ftqVar2 = this.f137068h;
        ftqVar2.f73275k.add(ftqVar);
        ftqVar.f73276l.add(ftqVar2);
    }
}
