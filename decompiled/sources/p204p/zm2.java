package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zm2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284129a;

    /* JADX INFO: renamed from: b */
    public int f284130b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f284131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f284131c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284129a = obj;
        this.f284130b |= Integer.MIN_VALUE;
        return this.f284131c.emit(null, this);
    }
}
