package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jfq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f111956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kfq f111957b;

    /* JADX INFO: renamed from: c */
    public int f111958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfq(kfq kfqVar, ibk ibkVar) {
        super(ibkVar);
        this.f111957b = kfqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f111956a = obj;
        this.f111958c |= Integer.MIN_VALUE;
        return this.f111957b.m56303a(null, this);
    }
}
