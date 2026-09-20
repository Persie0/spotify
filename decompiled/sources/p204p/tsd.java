package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tsd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f223285a;

    /* JADX INFO: renamed from: b */
    public int f223286b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ usd f223287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsd(usd usdVar, ibk ibkVar) {
        super(ibkVar);
        this.f223287c = usdVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f223285a = obj;
        this.f223286b |= Integer.MIN_VALUE;
        return this.f223287c.mo15629a(null, null, this);
    }
}
