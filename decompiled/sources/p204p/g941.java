package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g941 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77671a;

    /* JADX INFO: renamed from: b */
    public int f77672b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f77673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g941(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f77673c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77671a = obj;
        this.f77672b |= Integer.MIN_VALUE;
        return this.f77673c.emit(null, this);
    }
}
