package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j6v extends ibk {

    /* JADX INFO: renamed from: a */
    public vhe0 f109400a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f109401b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jj1 f109402c;

    /* JADX INFO: renamed from: d */
    public int f109403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6v(jj1 jj1Var, ibk ibkVar) {
        super(ibkVar);
        this.f109402c = jj1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f109401b = obj;
        this.f109403d |= Integer.MIN_VALUE;
        return this.f109402c.mo28141b(null, null, this);
    }
}
