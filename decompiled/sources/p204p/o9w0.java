package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o9w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f163147a;

    /* JADX INFO: renamed from: b */
    public int f163148b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f163149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9w0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f163149c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f163147a = obj;
        this.f163148b |= Integer.MIN_VALUE;
        return this.f163149c.emit(null, this);
    }
}
