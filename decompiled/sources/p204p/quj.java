package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class quj extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f192720a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c9a f192721b;

    /* JADX INFO: renamed from: c */
    public int f192722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public quj(c9a c9aVar, ibk ibkVar) {
        super(ibkVar);
        this.f192721b = c9aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f192720a = obj;
        this.f192722c |= Integer.MIN_VALUE;
        return this.f192721b.m31914m(null, this);
    }
}
