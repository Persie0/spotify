package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rrf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f202039a;

    /* JADX INFO: renamed from: b */
    public int f202040b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f202041c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f202041c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202039a = obj;
        this.f202040b |= Integer.MIN_VALUE;
        return this.f202041c.emit(null, this);
    }
}
