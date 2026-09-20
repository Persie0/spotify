package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xlx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k52 f263245b;

    /* JADX INFO: renamed from: c */
    public int f263246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlx(k52 k52Var, ibk ibkVar) {
        super(ibkVar);
        this.f263245b = k52Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263244a = obj;
        this.f263246c |= Integer.MIN_VALUE;
        return k52.m55416a(this.f263245b, null, this);
    }
}
