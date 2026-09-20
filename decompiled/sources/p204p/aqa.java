package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class aqa extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18151a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bqa f18152b;

    /* JADX INFO: renamed from: c */
    public int f18153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqa(bqa bqaVar, ibk ibkVar) {
        super(ibkVar);
        this.f18152b = bqaVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f18151a = obj;
        this.f18153c |= Integer.MIN_VALUE;
        Object objM30221N = this.f18152b.m30221N(null, 0, 0L, this);
        return objM30221N == yuk.f276404a ? objM30221N : new unc(objM30221N);
    }
}
