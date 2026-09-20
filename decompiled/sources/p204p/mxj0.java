package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mxj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f148063a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wxj0 f148064b;

    /* JADX INFO: renamed from: c */
    public int f148065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxj0(wxj0 wxj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f148064b = wxj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f148063a = obj;
        this.f148065c |= Integer.MIN_VALUE;
        return this.f148064b.m89307c(this);
    }
}
