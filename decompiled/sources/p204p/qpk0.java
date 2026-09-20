package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qpk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191340a;

    /* JADX INFO: renamed from: b */
    public int f191341b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f191342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpk0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f191342c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191340a = obj;
        this.f191341b |= Integer.MIN_VALUE;
        return this.f191342c.emit(null, this);
    }
}
