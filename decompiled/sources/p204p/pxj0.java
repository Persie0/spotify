package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pxj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f182321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wxj0 f182322b;

    /* JADX INFO: renamed from: c */
    public int f182323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxj0(wxj0 wxj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f182322b = wxj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f182321a = obj;
        this.f182323c |= Integer.MIN_VALUE;
        return this.f182322b.m89310f(this);
    }
}
