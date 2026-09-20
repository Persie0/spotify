package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tgk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f220209a;

    /* JADX INFO: renamed from: b */
    public int f220210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f220211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgk0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f220211c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f220209a = obj;
        this.f220210b |= Integer.MIN_VALUE;
        return this.f220211c.emit(null, this);
    }
}
