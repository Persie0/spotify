package p204p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class upa implements d7d1 {

    /* JADX INFO: renamed from: a */
    public Object f232604a = dqa.f51926p;

    /* JADX INFO: renamed from: b */
    public hqb f232605b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bqa f232606c;

    public upa(bqa bqaVar) {
        this.f232606c = bqaVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m83652a(fbk fbkVar) throws Throwable {
        vnc vncVarM30239r;
        Object obj = this.f232604a;
        boolean z = true;
        if (obj == dqa.f51926p || obj == dqa.f51922l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bqa.f29757g;
            bqa bqaVar = this.f232606c;
            vnc vncVar = (vnc) atomicReferenceFieldUpdater.get(bqaVar);
            while (!bqaVar.m30212D()) {
                long andIncrement = bqa.f29753c.getAndIncrement(bqaVar);
                long j = dqa.f51912b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (vncVar.f69124c != j2) {
                    vncVarM30239r = bqaVar.m30239r(j2, vncVar);
                    if (vncVarM30239r == null) {
                        continue;
                    }
                } else {
                    vncVarM30239r = vncVar;
                }
                Object objM30225R = bqaVar.m30225R(vncVarM30239r, i, andIncrement, null);
                C2617yl c2617yl = dqa.f51923m;
                if (objM30225R == c2617yl) {
                    throw new IllegalStateException("unreachable");
                }
                C2617yl c2617yl2 = dqa.f51925o;
                if (objM30225R == c2617yl2) {
                    if (andIncrement < bqaVar.m30246y()) {
                        vncVarM30239r.m25984b();
                    }
                    vncVar = vncVarM30239r;
                } else {
                    if (objM30225R == dqa.f51924n) {
                        bqa bqaVar2 = this.f232606c;
                        hqb hqbVarM44672k = gga.m44672k(seg1.m77914f(fbkVar));
                        try {
                            this.f232605b = hqbVarM44672k;
                            Object objM30225R2 = bqaVar2.m30225R(vncVarM30239r, i, andIncrement, this);
                            if (objM30225R2 != c2617yl) {
                                if (objM30225R2 == c2617yl2) {
                                    if (andIncrement < bqaVar2.m30246y()) {
                                        vncVarM30239r.m25984b();
                                    }
                                    vnc vncVar2 = (vnc) bqa.f29757g.get(bqaVar2);
                                    while (true) {
                                        if (bqaVar2.m30212D()) {
                                            hqb hqbVar = this.f232605b;
                                            wj50.m88279p(hqbVar);
                                            this.f232605b = null;
                                            this.f232604a = dqa.f51922l;
                                            Throwable thM30240s = bqaVar.m30240s();
                                            if (thM30240s != null) {
                                                hqbVar.resumeWith(new c6x0(thM30240s));
                                                break;
                                            }
                                            hqbVar.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = bqa.f29753c.getAndIncrement(bqaVar2);
                                        long j3 = dqa.f51912b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (vncVar2.f69124c != j4) {
                                            vnc vncVarM30239r2 = bqaVar2.m30239r(j4, vncVar2);
                                            if (vncVarM30239r2 != null) {
                                                vncVar2 = vncVarM30239r2;
                                            }
                                        }
                                        Object objM30225R3 = bqaVar2.m30225R(vncVar2, i2, andIncrement2, this);
                                        if (objM30225R3 == dqa.f51923m) {
                                            bqaVar2.mo30220L();
                                            mo35195b(vncVar2, i2);
                                            break;
                                        }
                                        if (objM30225R3 == dqa.f51925o) {
                                            if (andIncrement2 < bqaVar2.m30246y()) {
                                                vncVar2.m25984b();
                                            }
                                        } else {
                                            if (objM30225R3 == dqa.f51924n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            vncVar2.m25984b();
                                            this.f232604a = objM30225R3;
                                            this.f232605b = null;
                                        }
                                    }
                                } else {
                                    vncVarM30239r.m25984b();
                                    this.f232604a = objM30225R2;
                                    this.f232605b = null;
                                }
                                hqbVarM44672k.mo42414g(qyg1.m74178H(true), null);
                                break;
                            }
                            bqaVar2.mo30220L();
                            mo35195b(vncVarM30239r, i);
                            return hqbVarM44672k.m48221p();
                        } catch (Throwable th) {
                            hqbVarM44672k.m48228y();
                            throw th;
                        }
                    }
                    vncVarM30239r.m25984b();
                    this.f232604a = objM30225R;
                }
            }
            this.f232604a = dqa.f51922l;
            Throwable thM30240s2 = bqaVar.m30240s();
            if (thM30240s2 != null) {
                int i3 = kh41.f122529a;
                throw thM30240s2;
            }
            z = false;
        }
        return qyg1.m74178H(z);
    }

    @Override // p204p.d7d1
    /* JADX INFO: renamed from: b */
    public final void mo35195b(ffz0 ffz0Var, int i) {
        hqb hqbVar = this.f232605b;
        if (hqbVar != null) {
            hqbVar.mo35195b(ffz0Var, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m83653c() throws Throwable {
        Object obj = this.f232604a;
        C2617yl c2617yl = dqa.f51926p;
        if (obj == c2617yl) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f232604a = c2617yl;
        if (obj != dqa.f51922l) {
            return obj;
        }
        Throwable thM30241t = this.f232606c.m30241t();
        int i = kh41.f122529a;
        throw thM30241t;
    }
}
