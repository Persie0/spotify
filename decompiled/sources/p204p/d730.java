package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class d730 implements qc81 {

    /* JADX INFO: renamed from: a */
    public final lhm f45981a;

    /* JADX INFO: renamed from: b */
    public final vbj f45982b;

    /* JADX INFO: renamed from: c */
    public final ic4 f45983c;

    public d730(lhm lhmVar, vbj vbjVar, ic4 ic4Var) {
        this.f45981a = lhmVar;
        this.f45982b = vbjVar;
        this.f45983c = ic4Var;
    }

    @Override // p204p.qc81
    /* JADX INFO: renamed from: a */
    public final pc81 mo35170a() {
        return new vux(this, 13);
    }

    @Override // p204p.qc81
    /* JADX INFO: renamed from: b */
    public final boolean mo35171b(nc81 nc81Var) {
        ContextTrack contextTrack = nc81Var.f152461a;
        ic4 ic4Var = this.f45983c;
        return (hc1.m47085n(contextTrack, ic4Var.m50227b()) || (ic4Var.m50227b() && nc81Var.f152463c && !e72.m37977K(contextTrack))) && nc81Var.f152462b;
    }

    @Override // p204p.qc81
    public final oc81 type() {
        return oc81.f163867d;
    }
}
