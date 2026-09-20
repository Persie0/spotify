package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o2w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f161168a;

    /* JADX INFO: renamed from: b */
    public int f161169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f161170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2w0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f161170c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f161168a = obj;
        this.f161169b |= Integer.MIN_VALUE;
        return this.f161170c.emit(null, this);
    }
}
