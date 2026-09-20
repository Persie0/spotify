package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class e0p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55010a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h0p f55011b;

    /* JADX INFO: renamed from: c */
    public int f55012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0p(h0p h0pVar, ibk ibkVar) {
        super(ibkVar);
        this.f55011b = h0pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55010a = obj;
        this.f55012c |= Integer.MIN_VALUE;
        return this.f55011b.m46367e(null, this);
    }
}
