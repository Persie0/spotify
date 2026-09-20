package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mxw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f148209a;

    /* JADX INFO: renamed from: b */
    public int f148210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f148211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxw0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f148211c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f148209a = obj;
        this.f148210b |= Integer.MIN_VALUE;
        return this.f148211c.emit(null, this);
    }
}
