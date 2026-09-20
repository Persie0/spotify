package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gus0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f84538a;

    /* JADX INFO: renamed from: b */
    public int f84539b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f84540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gus0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f84540c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84538a = obj;
        this.f84539b |= Integer.MIN_VALUE;
        return this.f84540c.emit(null, this);
    }
}
