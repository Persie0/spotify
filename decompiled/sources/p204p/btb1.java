package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class btb1 implements op3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hmm0 f30547a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ be41 f30548b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yzo0 f30549c;

    public btb1(hmm0 hmm0Var, be41 be41Var, yzo0 yzo0Var) {
        this.f30547a = hmm0Var;
        this.f30548b = be41Var;
        this.f30549c = yzo0Var;
    }

    @Override // p204p.op3
    /* JADX INFO: renamed from: c */
    public final void mo30462c(String str) {
        this.f30547a.invoke(new atb1(this.f30548b, this.f30549c, str, 1));
    }

    @Override // p204p.op3
    /* JADX INFO: renamed from: e */
    public final void mo30463e(String str) {
        this.f30547a.invoke(new atb1(this.f30548b, this.f30549c, str, 0));
    }
}
