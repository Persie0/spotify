package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class y6u implements w6u {

    /* JADX INFO: renamed from: a */
    public qe10 f269898a = oe10.f164317a;

    /* JADX INFO: renamed from: b */
    public r8f f269899b = o5s0.f162062a;

    @Override // p204p.w6u
    /* JADX INFO: renamed from: a */
    public final w6u mo24995a() {
        y6u y6uVar = new y6u();
        y6uVar.f269898a = this.f269898a;
        y6uVar.f269899b = this.f269899b;
        return y6uVar;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: b */
    public final qe10 mo24996b() {
        return this.f269898a;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: c */
    public final void mo24997c(qe10 qe10Var) {
        this.f269898a = qe10Var;
    }

    public final String toString() {
        return "EmittableCircularProgressIndicator(modifier=" + this.f269898a + ", color=" + this.f269899b + ')';
    }
}
