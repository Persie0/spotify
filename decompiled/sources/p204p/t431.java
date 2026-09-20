package p204p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class t431 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ k7o f216892a;

    public t431(k7o k7oVar) {
        this.f216892a = k7oVar;
    }

    /* JADX INFO: renamed from: a */
    public final hy21 m80029a(p431 p431Var) {
        d3o d3oVar = this.f216892a.f120167a;
        er70 er70VarM27971a = b2s.m27971a((d3o) d3o.m34868a(d3oVar).f123730f);
        er70 er70VarM27971a2 = b2s.m27971a((d3o) d3o.m34868a(d3oVar).f123732h);
        Scheduler schedulerM87897b = kkx0.m56750c(d3o.m34868a(d3oVar)).m87897b();
        jg31.m53271i(schedulerM87897b);
        Scheduler schedulerM87896a = kkx0.m56750c(d3o.m34868a(d3oVar)).m87896a();
        jg31.m53271i(schedulerM87896a);
        return new hy21(p431Var, er70VarM27971a, er70VarM27971a2, schedulerM87897b, schedulerM87896a);
    }
}
