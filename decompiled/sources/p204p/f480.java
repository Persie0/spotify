package p204p;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$MarkAsFinishedRequest;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$MarkAsNotStartedRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class f480 implements j7s0 {

    /* JADX INFO: renamed from: a */
    public final fmj f65698a;

    /* JADX INFO: renamed from: b */
    public final sr6 f65699b;

    /* JADX INFO: renamed from: c */
    public final luk f65700c;

    /* JADX INFO: renamed from: d */
    public final boolean f65701d;

    /* JADX INFO: renamed from: e */
    public final zv41 f65702e;

    /* JADX INFO: renamed from: f */
    public final f7s0 f65703f;

    public f480(fmj fmjVar, sr6 sr6Var, luk lukVar, h7s0 h7s0Var, zam0 zam0Var, boolean z) {
        this.f65698a = fmjVar;
        this.f65699b = sr6Var;
        this.f65700c = lukVar;
        this.f65701d = z;
        zv41 zv41VarM52819d = jag1.m52819d(gbu.f78413a);
        this.f65702e = zv41VarM52819d;
        this.f65703f = wxf1.m89252i(h7s0Var.f88517a.m41852a(zv41VarM52819d, zam0Var, z)).m47134j();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m40719f(f480 f480Var, List list, fbk fbkVar) {
        d480 d480Var;
        if (fbkVar instanceof d480) {
            d480Var = (d480) fbkVar;
            int i = d480Var.f45103c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d480Var.f45103c = i - Integer.MIN_VALUE;
            } else {
                d480Var = new d480(f480Var, fbkVar);
            }
        } else {
            d480Var = new d480(f480Var, fbkVar);
        }
        Object obj = d480Var.f45101a;
        int i2 = d480Var.f45103c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                kax0 kax0VarM97900o = ResumptionProgressEsperanto$MarkAsFinishedRequest.m97900o();
                kax0VarM97900o.m55912m(list);
                ResumptionProgressEsperanto$MarkAsFinishedRequest resumptionProgressEsperanto$MarkAsFinishedRequest = (ResumptionProgressEsperanto$MarkAsFinishedRequest) kax0VarM97900o.build();
                sr6 sr6Var = f480Var.f65699b;
                wj50.m88279p(resumptionProgressEsperanto$MarkAsFinishedRequest);
                d480Var.f45103c = 1;
                Object objM79033I = sr6Var.m79033I(resumptionProgressEsperanto$MarkAsFinishedRequest, d480Var);
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
    public static final Object m40720g(f480 f480Var, List list, fbk fbkVar) {
        e480 e480Var;
        if (fbkVar instanceof e480) {
            e480Var = (e480) fbkVar;
            int i = e480Var.f56028c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e480Var.f56028c = i - Integer.MIN_VALUE;
            } else {
                e480Var = new e480(f480Var, fbkVar);
            }
        } else {
            e480Var = new e480(f480Var, fbkVar);
        }
        Object obj = e480Var.f56026a;
        int i2 = e480Var.f56028c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                lax0 lax0VarM97905o = ResumptionProgressEsperanto$MarkAsNotStartedRequest.m97905o();
                lax0VarM97905o.m58578m(list);
                ResumptionProgressEsperanto$MarkAsNotStartedRequest resumptionProgressEsperanto$MarkAsNotStartedRequest = (ResumptionProgressEsperanto$MarkAsNotStartedRequest) lax0VarM97905o.build();
                sr6 sr6Var = f480Var.f65699b;
                wj50.m88279p(resumptionProgressEsperanto$MarkAsNotStartedRequest);
                e480Var.f56028c = 1;
                Object objM79034J = sr6Var.m79034J(resumptionProgressEsperanto$MarkAsNotStartedRequest, e480Var);
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
        return nau.f152117a;
    }

    @Override // p204p.uz60
    /* JADX INFO: renamed from: c */
    public final tz60 mo28094c(gh00 gh00Var) {
        return new m49(this, (jq81) gh00Var);
    }

    @Override // p204p.uz60
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ tn61 mo28095d() {
        return v7s0.f238310a;
    }
}
