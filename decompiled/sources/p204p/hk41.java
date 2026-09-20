package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hk41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f92347a;

    /* JADX INFO: renamed from: b */
    public int f92348b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f92349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk41(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f92349c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f92347a = obj;
        this.f92348b |= Integer.MIN_VALUE;
        return this.f92349c.emit(null, this);
    }
}
