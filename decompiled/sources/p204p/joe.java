package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class joe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f114408a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ loe f114409b;

    /* JADX INFO: renamed from: c */
    public int f114410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joe(loe loeVar, ibk ibkVar) {
        super(ibkVar);
        this.f114409b = loeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f114408a = obj;
        this.f114410c |= Integer.MIN_VALUE;
        return loe.m59560f(this.f114409b, null, null, this);
    }
}
