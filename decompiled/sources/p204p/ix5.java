package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ix5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f106595a;

    /* JADX INFO: renamed from: b */
    public int f106596b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f106597c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix5(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f106597c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f106595a = obj;
        this.f106596b |= Integer.MIN_VALUE;
        return this.f106597c.emit(null, this);
    }
}
