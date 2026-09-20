package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qg6 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f188386a;

    /* JADX INFO: renamed from: b */
    public int f188387b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f188388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg6(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f188388c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188386a = obj;
        this.f188387b |= Integer.MIN_VALUE;
        return this.f188388c.emit(null, this);
    }
}
