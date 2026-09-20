package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lgf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133213a;

    /* JADX INFO: renamed from: b */
    public int f133214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f133215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgf0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f133215c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133213a = obj;
        this.f133214b |= Integer.MIN_VALUE;
        return this.f133215c.emit(null, this);
    }
}
