package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pry extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u6x f180694b;

    /* JADX INFO: renamed from: c */
    public int f180695c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pry(u6x u6xVar, ibk ibkVar) {
        super(ibkVar);
        this.f180694b = u6xVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180693a = obj;
        this.f180695c |= Integer.MIN_VALUE;
        return this.f180694b.m82468h(this);
    }
}
