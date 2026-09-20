package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h4w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87669a;

    /* JADX INFO: renamed from: b */
    public int f87670b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f87671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4w0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f87671c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87669a = obj;
        this.f87670b |= Integer.MIN_VALUE;
        return this.f87671c.emit(null, this);
    }
}
