package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class exp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63814a;

    /* JADX INFO: renamed from: b */
    public int f63815b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fxp0 f63816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exp0(fxp0 fxp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f63816c = fxp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f63814a = obj;
        this.f63815b |= Integer.MIN_VALUE;
        return this.f63816c.emit(null, this);
    }
}
