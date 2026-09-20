package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class k7x implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final v6x f120206a;

    /* JADX INFO: renamed from: b */
    public final qre0 f120207b;

    public k7x(v6x v6xVar, qre0 qre0Var) {
        this.f120206a = v6xVar;
        this.f120207b = qre0Var;
        j7x j7xVar = (j7x) v6xVar;
        synchronized (j7xVar) {
            try {
                if (j7xVar.f109699O) {
                    j7xVar.m52664c().mo46852b();
                } else {
                    j7xVar.f109699O = true;
                    j7xVar.m52662a().m53790b();
                    ((ex20) j7xVar.f109716q.getValue()).m40156b();
                    ((d7x) j7xVar.f109687C.getValue()).m35241f();
                    if (j7xVar.m52663b().m67508c()) {
                        ((v7x) ((t7x) j7xVar.f109721v.getValue())).m84899b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.hgm
    public final void shutdown() {
        j7x j7xVar = (j7x) this.f120206a;
        synchronized (j7xVar) {
            if (j7xVar.f109699O) {
                j7xVar.m52664c().mo46852b();
                if (j7xVar.f109721v.m88008a()) {
                    v7x v7xVar = (v7x) ((t7x) j7xVar.f109721v.getValue());
                    if (!v7xVar.f238336g.isDisposed()) {
                        v7xVar.f238336g.dispose();
                    }
                }
                jmn0 jmn0VarM52662a = j7xVar.m52662a();
                synchronized (jmn0VarM52662a) {
                    if (!jmn0VarM52662a.f113914e.isDisposed()) {
                        jmn0VarM52662a.f113914e.dispose();
                    }
                }
                ((d7x) j7xVar.f109687C.getValue()).m35242g();
                ((ex20) j7xVar.f109716q.getValue()).m40157c();
                j7xVar.f109699O = false;
            } else {
                j7xVar.m52664c().mo46852b();
            }
        }
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
