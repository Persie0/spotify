package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class em90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60854a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hm90 f60855b;

    /* JADX INFO: renamed from: c */
    public int f60856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em90(hm90 hm90Var, ibk ibkVar) {
        super(ibkVar);
        this.f60855b = hm90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60854a = obj;
        this.f60856c |= Integer.MIN_VALUE;
        return this.f60855b.mo28227l(null, this);
    }
}
