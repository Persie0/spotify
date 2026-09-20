package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h8k extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88720a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l8k f88721b;

    /* JADX INFO: renamed from: c */
    public int f88722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8k(l8k l8kVar, ibk ibkVar) {
        super(ibkVar);
        this.f88721b = l8kVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88720a = obj;
        this.f88722c |= Integer.MIN_VALUE;
        return this.f88721b.m58480c(null, this);
    }
}
