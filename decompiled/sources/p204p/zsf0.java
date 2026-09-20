package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zsf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285935a;

    /* JADX INFO: renamed from: b */
    public int f285936b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f285937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f285937c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285935a = obj;
        this.f285936b |= Integer.MIN_VALUE;
        return this.f285937c.emit(null, this);
    }
}
