package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77555a;

    /* JADX INFO: renamed from: b */
    public int f77556b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f77557c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f77557c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77555a = obj;
        this.f77556b |= Integer.MIN_VALUE;
        return this.f77557c.emit(null, this);
    }
}
