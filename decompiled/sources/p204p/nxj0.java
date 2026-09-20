package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nxj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f159505a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wxj0 f159506b;

    /* JADX INFO: renamed from: c */
    public int f159507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxj0(wxj0 wxj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f159506b = wxj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f159505a = obj;
        this.f159507c |= Integer.MIN_VALUE;
        return this.f159506b.m89308d(this);
    }
}
