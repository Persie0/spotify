package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c950 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35402a;

    /* JADX INFO: renamed from: b */
    public int f35403b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f35404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c950(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f35404c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35402a = obj;
        this.f35403b |= Integer.MIN_VALUE;
        return this.f35404c.emit(null, this);
    }
}
