package p204p;

import com.spotify.betamax.transcoder.BetamaxTranscoderException;

/* JADX INFO: loaded from: classes5.dex */
public final class db9 implements kb9 {

    /* JADX INFO: renamed from: a */
    public final long f47258a;

    /* JADX INFO: renamed from: b */
    public final p611 f47259b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jb9 f47260c;

    public db9(jb9 jb9Var, long j, p611 p611Var) {
        this.f47260c = jb9Var;
        this.f47258a = j;
        this.f47259b = p611Var;
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: b */
    public final void mo35543b(long j, long j2) {
        this.f47259b.mo35543b(j, j2);
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: c */
    public final void mo35544c(long j, int i, String str) {
        this.f47259b.mo35544c(j, i, str);
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: f */
    public final void mo35545f(long j, boolean z) {
        nua nuaVar = (nua) this.f47260c.f110711j.get(Long.valueOf(this.f47258a));
        if (nuaVar != null) {
            if (z) {
                nuaVar.f158543a.addAndGet(j);
            } else {
                nuaVar.f158544b.addAndGet(j);
            }
        }
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: g */
    public final void mo35546g(BetamaxTranscoderException betamaxTranscoderException, long j) {
        this.f47259b.mo35546g(betamaxTranscoderException, j);
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: a */
    public final void mo35542a(int i, long j, long j2) {
    }
}
