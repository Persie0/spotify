package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rps0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201639a;

    /* JADX INFO: renamed from: b */
    public int f201640b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f201641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rps0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f201641c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201639a = obj;
        this.f201640b |= Integer.MIN_VALUE;
        return this.f201641c.emit(null, this);
    }
}
