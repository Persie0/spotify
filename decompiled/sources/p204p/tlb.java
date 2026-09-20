package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tlb extends ibk {

    /* JADX INFO: renamed from: a */
    public lmb f221431a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f221432b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f221433c;

    /* JADX INFO: renamed from: d */
    public int f221434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f221433c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221432b = obj;
        this.f221434d |= Integer.MIN_VALUE;
        return this.f221433c.m59334k(null, null, this);
    }
}
