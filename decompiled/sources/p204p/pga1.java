package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pga1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f177275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qga1 f177276b;

    /* JADX INFO: renamed from: c */
    public int f177277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pga1(qga1 qga1Var, ibk ibkVar) {
        super(ibkVar);
        this.f177276b = qga1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177275a = obj;
        this.f177277c |= Integer.MIN_VALUE;
        return this.f177276b.m72735a(null, this);
    }
}
