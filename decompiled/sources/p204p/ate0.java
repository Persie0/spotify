package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ate0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19663a;

    /* JADX INFO: renamed from: b */
    public int f19664b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f19665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ate0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f19665c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19663a = obj;
        this.f19664b |= Integer.MIN_VALUE;
        return this.f19665c.emit(null, this);
    }
}
