package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ej41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60129a;

    /* JADX INFO: renamed from: b */
    public int f60130b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f60131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej41(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f60131c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60129a = obj;
        this.f60130b |= Integer.MIN_VALUE;
        return this.f60131c.emit(null, this);
    }
}
