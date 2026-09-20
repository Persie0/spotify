package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q790 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186052a;

    /* JADX INFO: renamed from: b */
    public int f186053b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f186054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q790(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f186054c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186052a = obj;
        this.f186053b |= Integer.MIN_VALUE;
        return this.f186054c.emit(null, this);
    }
}
