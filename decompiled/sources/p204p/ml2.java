package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ml2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f144741a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pl2 f144742b;

    /* JADX INFO: renamed from: c */
    public int f144743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml2(pl2 pl2Var, ibk ibkVar) {
        super(ibkVar);
        this.f144742b = pl2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144741a = obj;
        this.f144743c |= Integer.MIN_VALUE;
        return this.f144742b.m70247h(null, null, this);
    }
}
