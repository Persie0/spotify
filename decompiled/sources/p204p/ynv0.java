package p204p;

import java.util.concurrent.CancellationException;
import spotify.spotbot.p212v2.promptable_playlist.Refinement$AttachRefinementSessionRequest;
import spotify.spotbot.p212v2.promptable_playlist.Refinement$AttachRefinementSessionResponse;
import spotify.spotbot.p212v2.promptable_playlist.Refinement$DiscardRefinementSessionRequest;
import spotify.spotbot.p212v2.promptable_playlist.Refinement$SaveRefinementSessionRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class ynv0 {

    /* JADX INFO: renamed from: a */
    public final znv0 f274510a;

    public ynv0(znv0 znv0Var) {
        this.f274510a = znv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m94260a(String str, String str2, ibk ibkVar) {
        vnv0 vnv0Var;
        if (ibkVar instanceof vnv0) {
            vnv0Var = (vnv0) ibkVar;
            int i = vnv0Var.f243256c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vnv0Var.f243256c = i - Integer.MIN_VALUE;
            } else {
                vnv0Var = new vnv0(this, ibkVar);
            }
        } else {
            vnv0Var = new vnv0(this, ibkVar);
        }
        Object objM96596b = vnv0Var.f243254a;
        int i2 = vnv0Var.f243256c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96596b);
                snv0 snv0VarM98051p = Refinement$AttachRefinementSessionRequest.m98051p();
                snv0VarM98051p.m78595q(str);
                snv0VarM98051p.m78594m(str2);
                Refinement$AttachRefinementSessionRequest refinement$AttachRefinementSessionRequest = (Refinement$AttachRefinementSessionRequest) snv0VarM98051p.build();
                znv0 znv0Var = this.f274510a;
                wj50.m88279p(refinement$AttachRefinementSessionRequest);
                vnv0Var.f243256c = 1;
                objM96596b = znv0Var.m96596b(refinement$AttachRefinementSessionRequest, vnv0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96596b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96596b);
            }
            o2x0 o2x0Var = (o2x0) objM96596b;
            if (o2x0Var.f161171a.f149852O0) {
                Object obj = o2x0Var.f161172b;
                if (obj != null) {
                    return new do6(((Refinement$AttachRefinementSessionResponse) obj).m98052n());
                }
                throw new IllegalArgumentException("Response body is null for successful attach refinement session response");
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return co6.f40189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m94261b(String str, ibk ibkVar) {
        wnv0 wnv0Var;
        if (ibkVar instanceof wnv0) {
            wnv0Var = (wnv0) ibkVar;
            int i = wnv0Var.f253305c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wnv0Var.f253305c = i - Integer.MIN_VALUE;
            } else {
                wnv0Var = new wnv0(this, ibkVar);
            }
        } else {
            wnv0Var = new wnv0(this, ibkVar);
        }
        Object objM96597c = wnv0Var.f253303a;
        int i2 = wnv0Var.f253305c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96597c);
                tnv0 tnv0VarM98054o = Refinement$DiscardRefinementSessionRequest.m98054o();
                tnv0VarM98054o.m81185m(str);
                Refinement$DiscardRefinementSessionRequest refinement$DiscardRefinementSessionRequest = (Refinement$DiscardRefinementSessionRequest) tnv0VarM98054o.build();
                znv0 znv0Var = this.f274510a;
                wj50.m88279p(refinement$DiscardRefinementSessionRequest);
                wnv0Var.f253305c = 1;
                objM96597c = znv0Var.m96597c(refinement$DiscardRefinementSessionRequest, wnv0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96597c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96597c);
            }
            if (((o2x0) objM96597c).f161171a.f149852O0) {
                return llr.f134689f;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return klr.f123944f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m94262c(String str, String str2, ibk ibkVar) {
        xnv0 xnv0Var;
        if (ibkVar instanceof xnv0) {
            xnv0Var = (xnv0) ibkVar;
            int i = xnv0Var.f263717c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xnv0Var.f263717c = i - Integer.MIN_VALUE;
            } else {
                xnv0Var = new xnv0(this, ibkVar);
            }
        } else {
            xnv0Var = new xnv0(this, ibkVar);
        }
        Object objM96595a = xnv0Var.f263715a;
        int i2 = xnv0Var.f263717c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96595a);
                unv0 unv0VarM98057p = Refinement$SaveRefinementSessionRequest.m98057p();
                unv0VarM98057p.m83591q(str);
                unv0VarM98057p.m83590m(str2);
                Refinement$SaveRefinementSessionRequest refinement$SaveRefinementSessionRequest = (Refinement$SaveRefinementSessionRequest) unv0VarM98057p.build();
                znv0 znv0Var = this.f274510a;
                wj50.m88279p(refinement$SaveRefinementSessionRequest);
                xnv0Var.f263717c = 1;
                objM96595a = znv0Var.m96595a(refinement$SaveRefinementSessionRequest, xnv0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96595a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96595a);
            }
            if (((o2x0) objM96595a).f161171a.f149852O0) {
                return b7y0.f24438a;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return a7y0.f13148a;
    }
}
