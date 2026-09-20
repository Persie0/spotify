package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nk50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f154792a;

    /* JADX INFO: renamed from: b */
    public int f154793b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f154794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f154794c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f154792a = obj;
        this.f154793b |= Integer.MIN_VALUE;
        return this.f154794c.emit(null, this);
    }
}
