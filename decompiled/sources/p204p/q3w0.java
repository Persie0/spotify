package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q3w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f184976a;

    /* JADX INFO: renamed from: b */
    public int f184977b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f184978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3w0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f184978c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f184976a = obj;
        this.f184977b |= Integer.MIN_VALUE;
        return this.f184978c.emit(null, this);
    }
}
