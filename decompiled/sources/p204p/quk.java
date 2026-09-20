package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class quk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f192726a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ruk f192727b;

    /* JADX INFO: renamed from: c */
    public int f192728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public quk(ruk rukVar, ibk ibkVar) {
        super(ibkVar);
        this.f192727b = rukVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f192726a = obj;
        this.f192728c |= Integer.MIN_VALUE;
        return this.f192727b.m76453a(this);
    }
}
