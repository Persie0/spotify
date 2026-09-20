package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class suf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214066a;

    /* JADX INFO: renamed from: b */
    public int f214067b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f214068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f214068c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214066a = obj;
        this.f214067b |= Integer.MIN_VALUE;
        return this.f214068c.emit(null, this);
    }
}
