package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z0y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f278184a;

    /* JADX INFO: renamed from: b */
    public int f278185b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f278186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0y0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f278186c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278184a = obj;
        this.f278185b |= Integer.MIN_VALUE;
        return this.f278186c.emit(null, this);
    }
}
