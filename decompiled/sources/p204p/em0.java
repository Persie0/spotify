package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class em0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60786a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fm0 f60787b;

    /* JADX INFO: renamed from: c */
    public int f60788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em0(fm0 fm0Var, ibk ibkVar) {
        super(ibkVar);
        this.f60787b = fm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60786a = obj;
        this.f60788c |= Integer.MIN_VALUE;
        return this.f60787b.m42041c(null, 0, null, this);
    }
}
