package p204p;

import com.spotify.betamax.player.offline.exception.BetamaxDownloadException;
import com.spotify.messages.BetamaxDownloadError;

/* JADX INFO: loaded from: classes5.dex */
public final class r89 implements s89 {

    /* JADX INFO: renamed from: a */
    public final qre0 f196739a;

    public r89(qre0 qre0Var) {
        this.f196739a = qre0Var;
    }

    @Override // p204p.s89
    /* JADX INFO: renamed from: g */
    public final void mo26723g(g6s g6sVar, long j, BetamaxDownloadException betamaxDownloadException, long j2) {
        q89 q89VarM13605v = BetamaxDownloadError.m13605v();
        int i = betamaxDownloadException.f3085a;
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            i2 = 3;
            if (i != 3) {
                throw null;
            }
        }
        q89VarM13605v.m72309m(i2);
        String message = betamaxDownloadException.getMessage();
        if (message == null) {
            message = "";
        }
        q89VarM13605v.m72310q(message);
        q89VarM13605v.m72311r("BetamaxDownloadException");
        q89VarM13605v.m72312s(wqg1.m88754C(betamaxDownloadException));
        q89VarM13605v.m72313t(wqg1.m88768w(betamaxDownloadException));
        q89VarM13605v.m72316w(g6sVar.f77102b);
        q89VarM13605v.m72314u();
        q89VarM13605v.m72315v(g6sVar.f77101a.f100067a);
        this.f196739a.m73616a((BetamaxDownloadError) q89VarM13605v.build());
    }
}
