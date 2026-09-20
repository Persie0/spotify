package p204p;

import com.spotify.show_esperanto.proto.MarkShowAsPlayedRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes8.dex */
public final class y380 implements omc0 {

    /* JADX INFO: renamed from: a */
    public final mr11 f268783a;

    public y380(mr11 mr11Var) {
        this.f268783a = mr11Var;
    }

    @Override // p204p.omc0
    /* JADX INFO: renamed from: a */
    public final Single mo52340a(String str, String str2) {
        pmc0 pmc0VarM21233p = MarkShowAsPlayedRequest.m21233p();
        pmc0VarM21233p.m70277m(str2);
        pmc0VarM21233p.m70278q(qmc0.UNPLAYED);
        return this.f268783a.callSingle("spotify.show_esperanto.proto.ShowService", "MarkShowAsPlayed", (MarkShowAsPlayedRequest) pmc0VarM21233p.build()).map(ujr0.f231082L0);
    }

    @Override // p204p.omc0
    /* JADX INFO: renamed from: b */
    public final Single mo52341b(String str, String str2) {
        pmc0 pmc0VarM21233p = MarkShowAsPlayedRequest.m21233p();
        pmc0VarM21233p.m70277m(str2);
        pmc0VarM21233p.m70278q(qmc0.PLAYED);
        return this.f268783a.callSingle("spotify.show_esperanto.proto.ShowService", "MarkShowAsPlayed", (MarkShowAsPlayedRequest) pmc0VarM21233p.build()).map(ujr0.f231082L0);
    }
}
