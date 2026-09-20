package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gie extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f80148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iie f80149b;

    /* JADX INFO: renamed from: c */
    public int f80150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gie(iie iieVar, ibk ibkVar) {
        super(ibkVar);
        this.f80149b = iieVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80148a = obj;
        this.f80150c |= Integer.MIN_VALUE;
        return this.f80149b.mo33214i(null, this);
    }
}
