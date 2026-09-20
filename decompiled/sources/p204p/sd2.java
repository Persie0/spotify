package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sd2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f207858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ td2 f207859b;

    /* JADX INFO: renamed from: c */
    public int f207860c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd2(td2 td2Var, ibk ibkVar) {
        super(ibkVar);
        this.f207859b = td2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f207858a = obj;
        this.f207860c |= Integer.MIN_VALUE;
        return this.f207859b.m80488a(this);
    }
}
