package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g9k0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77821a;

    /* JADX INFO: renamed from: b */
    public int f77822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f77823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9k0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f77823c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77821a = obj;
        this.f77822b |= Integer.MIN_VALUE;
        return this.f77823c.emit(null, this);
    }
}
