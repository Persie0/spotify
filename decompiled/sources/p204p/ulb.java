package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ulb extends ibk {

    /* JADX INFO: renamed from: a */
    public lmb f231498a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f231499b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f231500c;

    /* JADX INFO: renamed from: d */
    public int f231501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f231500c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231499b = obj;
        this.f231501d |= Integer.MIN_VALUE;
        return this.f231500c.m59335l(null, null, this);
    }
}
