package p204p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class qxr implements a6a1 {

    /* JADX INFO: renamed from: a */
    public final tpx f193728a;

    /* JADX INFO: renamed from: b */
    public final a6a1 f193729b;

    public qxr(bz80 bz80Var, lnn lnnVar) {
        this.f193728a = lnnVar.m59498a(false);
        this.f193729b = bz80Var.m30979a(oh51.f165341a).mo24859a();
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: b */
    public final Map mo24860b(Set set) {
        wt60 wt60VarM96743r = zqg1.m96743r(set);
        tpx tpxVar = this.f193728a;
        tpxVar.getClass();
        return kkc0.m56700m0(kkc0.m56700m0(tpxVar.mo24860b(g6f.m43736n1(wt60VarM96743r.f254866c)), this.f193729b.mo24860b(g6f.m43736n1(wt60VarM96743r.f254865b))), jq60.m54064j(wt60VarM96743r.f254864a));
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: c */
    public final z5a1 mo24861c(gh00 gh00Var) {
        return new oxr(this.f193729b, this.f193728a, gh00Var);
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: e */
    public final boolean mo24862e(k35 k35Var) {
        return k35Var.f118762a instanceof txr;
    }
}
