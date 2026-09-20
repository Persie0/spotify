package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class ggb1 implements qc81 {

    /* JADX INFO: renamed from: a */
    public final hsb1 f79628a;

    /* JADX INFO: renamed from: b */
    public final vbj f79629b;

    public ggb1(hsb1 hsb1Var, vbj vbjVar) {
        this.f79628a = hsb1Var;
        this.f79629b = vbjVar;
    }

    @Override // p204p.qc81
    /* JADX INFO: renamed from: a */
    public final pc81 mo35170a() {
        return new vr11(this, 27);
    }

    @Override // p204p.qc81
    /* JADX INFO: renamed from: b */
    public final boolean mo35171b(nc81 nc81Var) {
        ContextTrack contextTrack = nc81Var.f152461a;
        return hc1.m47085n(contextTrack, false) && nc81Var.f152462b && hra.m48353F(contextTrack) == 2;
    }

    @Override // p204p.qc81
    public final oc81 type() {
        return oc81.f163872i;
    }
}
