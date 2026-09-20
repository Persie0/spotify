package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kk41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f123509a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lk41 f123510b;

    /* JADX INFO: renamed from: c */
    public int f123511c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk41(lk41 lk41Var, ibk ibkVar) {
        super(ibkVar);
        this.f123510b = lk41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123509a = obj;
        this.f123511c |= Integer.MIN_VALUE;
        return lk41.m59214b(this.f123510b, null, this);
    }
}
