package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class we10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f250403a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ye10 f250404b;

    /* JADX INFO: renamed from: c */
    public int f250405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we10(ye10 ye10Var, ibk ibkVar) {
        super(ibkVar);
        this.f250404b = ye10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f250403a = obj;
        this.f250405c |= Integer.MIN_VALUE;
        return this.f250404b.m93517c(null, null, null, this);
    }
}
