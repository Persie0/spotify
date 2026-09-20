package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class a0p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11128a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h0p f11129b;

    /* JADX INFO: renamed from: c */
    public int f11130c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0p(h0p h0pVar, ibk ibkVar) {
        super(ibkVar);
        this.f11129b = h0pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11128a = obj;
        this.f11130c |= Integer.MIN_VALUE;
        return this.f11129b.m46363a(null, this);
    }
}
