package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dcx0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rwt0 f47654b;

    /* JADX INFO: renamed from: c */
    public int f47655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcx0(rwt0 rwt0Var, ibk ibkVar) {
        super(ibkVar);
        this.f47654b = rwt0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47653a = obj;
        this.f47655c |= Integer.MIN_VALUE;
        return this.f47654b.m76582d(null, this);
    }
}
