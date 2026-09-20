package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ec91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58273a;

    /* JADX INFO: renamed from: b */
    public int f58274b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f58275c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec91(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f58275c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58273a = obj;
        this.f58274b |= Integer.MIN_VALUE;
        return this.f58275c.emit(null, this);
    }
}
