package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cdk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f36905a;

    /* JADX INFO: renamed from: b */
    public int f36906b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f36907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdk0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f36907c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f36905a = obj;
        this.f36906b |= Integer.MIN_VALUE;
        return this.f36907c.emit(null, this);
    }
}
