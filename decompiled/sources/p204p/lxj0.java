package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lxj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f137831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wxj0 f137832b;

    /* JADX INFO: renamed from: c */
    public int f137833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxj0(wxj0 wxj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f137832b = wxj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137831a = obj;
        this.f137833c |= Integer.MIN_VALUE;
        return this.f137832b.m89306b(this);
    }
}
