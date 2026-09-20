package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gk41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f80729a;

    /* JADX INFO: renamed from: b */
    public int f80730b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f80731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk41(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f80731c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80729a = obj;
        this.f80730b |= Integer.MIN_VALUE;
        return this.f80731c.emit(null, this);
    }
}
