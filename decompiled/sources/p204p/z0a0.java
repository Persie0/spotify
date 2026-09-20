package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z0a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f278045a;

    /* JADX INFO: renamed from: b */
    public int f278046b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1a0 f278047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0a0(a1a0 a1a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f278047c = a1a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278045a = obj;
        this.f278046b |= Integer.MIN_VALUE;
        return this.f278047c.emit(null, this);
    }
}
