package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qxj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f193692a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wxj0 f193693b;

    /* JADX INFO: renamed from: c */
    public int f193694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxj0(wxj0 wxj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f193693b = wxj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f193692a = obj;
        this.f193694c |= Integer.MIN_VALUE;
        return this.f193693b.m89311g(this);
    }
}
