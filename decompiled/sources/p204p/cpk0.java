package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cpk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40573a;

    /* JADX INFO: renamed from: b */
    public int f40574b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f40575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpk0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f40575c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40573a = obj;
        this.f40574b |= Integer.MIN_VALUE;
        return this.f40575c.emit(null, this);
    }
}
