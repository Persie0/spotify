package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qv4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f192865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ az1 f192866b;

    /* JADX INFO: renamed from: c */
    public int f192867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv4(az1 az1Var, ibk ibkVar) {
        super(ibkVar);
        this.f192866b = az1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f192865a = obj;
        this.f192867c |= Integer.MIN_VALUE;
        return this.f192866b.m27560a(null, this);
    }
}
