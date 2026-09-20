package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class la20 extends lud1 {
    @Override // p204p.ctq
    /* JADX INFO: renamed from: a */
    public final void mo29208a(ctq ctqVar) {
        ftq ftqVar = this.f137068h;
        if (ftqVar.f73267c && !ftqVar.f73274j) {
            ftqVar.mo42686d((int) ((((ftq) ftqVar.f73276l.get(0)).f73271g * ((ka20) this.f137062b).f120760u0) + 0.5f));
        }
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: d */
    public final void mo29209d() {
        v7j v7jVar = this.f137062b;
        ka20 ka20Var = (ka20) v7jVar;
        int i = ka20Var.f120761v0;
        int i2 = ka20Var.f120762w0;
        int i3 = ka20Var.f120764y0;
        ftq ftqVar = this.f137068h;
        if (i3 == 1) {
            if (i != -1) {
                ftqVar.f73276l.add(v7jVar.f238221V.f238232d.f137068h);
                this.f137062b.f238221V.f238232d.f137068h.f73275k.add(ftqVar);
                ftqVar.f73270f = i;
            } else if (i2 != -1) {
                ftqVar.f73276l.add(v7jVar.f238221V.f238232d.f137069i);
                this.f137062b.f238221V.f238232d.f137069i.f73275k.add(ftqVar);
                ftqVar.f73270f = -i2;
            } else {
                ftqVar.f73266b = true;
                ftqVar.f73276l.add(v7jVar.f238221V.f238232d.f137069i);
                this.f137062b.f238221V.f238232d.f137069i.f73275k.add(ftqVar);
            }
            m58531m(this.f137062b.f238232d.f137068h);
            m58531m(this.f137062b.f238232d.f137069i);
            return;
        }
        if (i != -1) {
            ftqVar.f73276l.add(v7jVar.f238221V.f238234e.f137068h);
            this.f137062b.f238221V.f238234e.f137068h.f73275k.add(ftqVar);
            ftqVar.f73270f = i;
        } else if (i2 != -1) {
            ftqVar.f73276l.add(v7jVar.f238221V.f238234e.f137069i);
            this.f137062b.f238221V.f238234e.f137069i.f73275k.add(ftqVar);
            ftqVar.f73270f = -i2;
        } else {
            ftqVar.f73266b = true;
            ftqVar.f73276l.add(v7jVar.f238221V.f238234e.f137069i);
            this.f137062b.f238221V.f238234e.f137069i.f73275k.add(ftqVar);
        }
        m58531m(this.f137062b.f238234e.f137068h);
        m58531m(this.f137062b.f238234e.f137069i);
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: e */
    public final void mo29210e() {
        v7j v7jVar = this.f137062b;
        int i = ((ka20) v7jVar).f120764y0;
        ftq ftqVar = this.f137068h;
        if (i == 1) {
            v7jVar.f238227a0 = ftqVar.f73271g;
        } else {
            v7jVar.f238229b0 = ftqVar.f73271g;
        }
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: f */
    public final void mo29211f() {
        this.f137068h.m42685c();
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: k */
    public final boolean mo29212k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m58531m(ftq ftqVar) {
        ftq ftqVar2 = this.f137068h;
        ftqVar2.f73275k.add(ftqVar);
        ftqVar.f73276l.add(ftqVar2);
    }
}
