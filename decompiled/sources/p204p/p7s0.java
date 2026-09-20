package p204p;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$MarkAsFinishedRequest;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$MarkAsNotStartedRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class p7s0 implements j7s0 {

    /* JADX INFO: renamed from: a */
    public final fmj f174753a;

    /* JADX INFO: renamed from: b */
    public final sr6 f174754b;

    /* JADX INFO: renamed from: c */
    public final boolean f174755c;

    /* JADX INFO: renamed from: d */
    public final r7s0 f174756d;

    /* JADX INFO: renamed from: e */
    public final o49 f174757e;

    public p7s0(q7s0 q7s0Var, q7s0 q7s0Var2, fmj fmjVar, sr6 sr6Var, luk lukVar, zam0 zam0Var, boolean z) {
        this.f174753a = fmjVar;
        this.f174754b = sr6Var;
        this.f174755c = z;
        this.f174756d = z ? q7s0Var2.mo59839a(zam0Var) : q7s0Var.mo59839a(zam0Var);
        this.f174757e = jpg1.m53931m(v7s0.f238310a, lukVar, new mep0(this, null, 23), new d67(27), new p0r0(this, 20), null, 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m69295f(p7s0 p7s0Var, List list, ibk ibkVar) {
        n7s0 n7s0Var;
        if (ibkVar instanceof n7s0) {
            n7s0Var = (n7s0) ibkVar;
            int i = n7s0Var.f151208c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n7s0Var.f151208c = i - Integer.MIN_VALUE;
            } else {
                n7s0Var = new n7s0(p7s0Var, ibkVar);
            }
        } else {
            n7s0Var = new n7s0(p7s0Var, ibkVar);
        }
        Object obj = n7s0Var.f151206a;
        int i2 = n7s0Var.f151208c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                kax0 kax0VarM97900o = ResumptionProgressEsperanto$MarkAsFinishedRequest.m97900o();
                kax0VarM97900o.m55912m(list);
                ResumptionProgressEsperanto$MarkAsFinishedRequest resumptionProgressEsperanto$MarkAsFinishedRequest = (ResumptionProgressEsperanto$MarkAsFinishedRequest) kax0VarM97900o.build();
                sr6 sr6Var = p7s0Var.f174754b;
                wj50.m88279p(resumptionProgressEsperanto$MarkAsFinishedRequest);
                n7s0Var.f151208c = 1;
                Object objM79033I = sr6Var.m79033I(resumptionProgressEsperanto$MarkAsFinishedRequest, n7s0Var);
                yuk yukVar = yuk.f276404a;
                if (objM79033I == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException unused) {
            throw new CancellationException();
        } catch (Exception unused2) {
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final Object m69296g(p7s0 p7s0Var, List list, ibk ibkVar) {
        o7s0 o7s0Var;
        if (ibkVar instanceof o7s0) {
            o7s0Var = (o7s0) ibkVar;
            int i = o7s0Var.f162612c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7s0Var.f162612c = i - Integer.MIN_VALUE;
            } else {
                o7s0Var = new o7s0(p7s0Var, ibkVar);
            }
        } else {
            o7s0Var = new o7s0(p7s0Var, ibkVar);
        }
        Object obj = o7s0Var.f162610a;
        int i2 = o7s0Var.f162612c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                lax0 lax0VarM97905o = ResumptionProgressEsperanto$MarkAsNotStartedRequest.m97905o();
                lax0VarM97905o.m58578m(list);
                ResumptionProgressEsperanto$MarkAsNotStartedRequest resumptionProgressEsperanto$MarkAsNotStartedRequest = (ResumptionProgressEsperanto$MarkAsNotStartedRequest) lax0VarM97905o.build();
                sr6 sr6Var = p7s0Var.f174754b;
                wj50.m88279p(resumptionProgressEsperanto$MarkAsNotStartedRequest);
                o7s0Var.f162612c = 1;
                Object objM79034J = sr6Var.m79034J(resumptionProgressEsperanto$MarkAsNotStartedRequest, o7s0Var);
                yuk yukVar = yuk.f276404a;
                if (objM79034J == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException unused) {
            throw new CancellationException();
        } catch (Exception unused2) {
        }
        return w2a1.f247311a;
    }

    @Override // p204p.uz60
    /* JADX INFO: renamed from: b */
    public final Map mo28093b(Set set) {
        return this.f174757e.mo28093b(set);
    }

    @Override // p204p.uz60
    /* JADX INFO: renamed from: c */
    public final tz60 mo28094c(gh00 gh00Var) {
        o49 o49Var = this.f174757e;
        return mt60.m62802i(o49Var, o49Var, gh00Var);
    }

    @Override // p204p.uz60
    /* JADX INFO: renamed from: d */
    public final tn61 mo28095d() {
        return this.f174757e.f161589b;
    }
}
