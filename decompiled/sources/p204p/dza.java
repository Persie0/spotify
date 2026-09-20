package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dza implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fza f54595a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f54596b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i500 f54597c;

    public dza(fza fzaVar, String str, i500 i500Var) {
        this.f54595a = fzaVar;
        this.f54596b = str;
        this.f54597c = i500Var;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f54597c.f98716q1.mo31988d(this);
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        this.f54595a.m43184a(this.f54596b);
    }
}
