package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sgk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f208885a;

    /* JADX INFO: renamed from: b */
    public int f208886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f208887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgk0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f208887c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208885a = obj;
        this.f208886b |= Integer.MIN_VALUE;
        return this.f208887c.emit(null, this);
    }
}
