package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xby extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f260027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zby f260028b;

    /* JADX INFO: renamed from: c */
    public int f260029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xby(zby zbyVar, ibk ibkVar) {
        super(ibkVar);
        this.f260028b = zbyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260027a = obj;
        this.f260029c |= Integer.MIN_VALUE;
        return this.f260028b.m95891i(null, this);
    }
}
