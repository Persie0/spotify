package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xc01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f260041a;

    /* JADX INFO: renamed from: b */
    public int f260042b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f260043c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc01(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f260043c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260041a = obj;
        this.f260042b |= Integer.MIN_VALUE;
        return this.f260043c.emit(null, this);
    }
}
