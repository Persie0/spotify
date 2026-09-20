package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a2a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11607a;

    /* JADX INFO: renamed from: b */
    public int f11608b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z1a0 f11609c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2a0(z1a0 z1a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f11609c = z1a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11607a = obj;
        this.f11608b |= Integer.MIN_VALUE;
        return this.f11609c.emit(null, this);
    }
}
