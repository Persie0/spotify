package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sxj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214904a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wxj0 f214905b;

    /* JADX INFO: renamed from: c */
    public int f214906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxj0(wxj0 wxj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f214905b = wxj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214904a = obj;
        this.f214906c |= Integer.MIN_VALUE;
        return this.f214905b.m89313i(this);
    }
}
