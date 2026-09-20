package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class d190 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f44204a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g190 f44205b;

    /* JADX INFO: renamed from: c */
    public int f44206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d190(g190 g190Var, ibk ibkVar) {
        super(ibkVar);
        this.f44205b = g190Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f44204a = obj;
        this.f44206c |= Integer.MIN_VALUE;
        return g190.m43347a(this.f44205b, null, null, this);
    }
}
