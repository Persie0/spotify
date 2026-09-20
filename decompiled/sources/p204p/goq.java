package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class goq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f83000a;

    /* JADX INFO: renamed from: b */
    public int f83001b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hoq f83002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goq(hoq hoqVar, ibk ibkVar) {
        super(ibkVar);
        this.f83002c = hoqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f83000a = obj;
        this.f83001b |= Integer.MIN_VALUE;
        return this.f83002c.mo15629a(null, null, this);
    }
}
