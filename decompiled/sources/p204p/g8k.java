package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g8k extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77541a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l8k f77542b;

    /* JADX INFO: renamed from: c */
    public int f77543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8k(l8k l8kVar, ibk ibkVar) {
        super(ibkVar);
        this.f77542b = l8kVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77541a = obj;
        this.f77543c |= Integer.MIN_VALUE;
        return this.f77542b.m58479b(null, this);
    }
}
