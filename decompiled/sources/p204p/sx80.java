package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sx80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214843a;

    /* JADX INFO: renamed from: b */
    public int f214844b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lx80 f214845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx80(lx80 lx80Var, fbk fbkVar) {
        super(fbkVar);
        this.f214845c = lx80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214843a = obj;
        this.f214844b |= Integer.MIN_VALUE;
        return this.f214845c.emit(null, this);
    }
}
