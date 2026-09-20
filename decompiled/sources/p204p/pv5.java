package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pv5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f181595a;

    /* JADX INFO: renamed from: b */
    public int f181596b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f181597c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv5(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f181597c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f181595a = obj;
        this.f181596b |= Integer.MIN_VALUE;
        return this.f181597c.emit(null, this);
    }
}
