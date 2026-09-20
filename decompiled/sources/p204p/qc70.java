package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qc70 extends pc70 implements jr60 {

    /* JADX INFO: renamed from: b */
    public final Object f187275b = q3d0.m72078I(2, new ni00(this, 20));

    @Override // p204p.pc70
    /* JADX INFO: renamed from: A */
    public final y870 mo69546A() {
        return mo28809G().f14551e.f259067c;
    }

    @Override // p204p.rp60
    /* JADX INFO: renamed from: e */
    public final List mo25528e() {
        return mo28809G().mo25528e();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qc70) && wj50.m88271j(mo28809G(), ((qc70) obj).mo28809G());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.cpv0
    public final lbb getCaller() {
        return (lbb) this.f187275b.getValue();
    }

    @Override // p204p.rp60
    public final String getName() {
        return dq60.m36617q(new StringBuilder("<get-"), mo28809G().f14551e.f259066b, '>');
    }

    public final int hashCode() {
        return mo28809G().hashCode();
    }

    @Override // p204p.rp60
    /* JADX INFO: renamed from: i */
    public final sr60 mo25530i() {
        return mo28809G().mo25530i();
    }

    @Override // p204p.cpv0
    /* JADX INFO: renamed from: k */
    public final List mo25531k() {
        return mo28809G().mo25531k();
    }

    public final String toString() {
        return "getter of " + mo28809G();
    }
}
