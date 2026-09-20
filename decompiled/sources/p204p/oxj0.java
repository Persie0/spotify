package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class oxj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f171003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wxj0 f171004b;

    /* JADX INFO: renamed from: c */
    public int f171005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxj0(wxj0 wxj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f171004b = wxj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f171003a = obj;
        this.f171005c |= Integer.MIN_VALUE;
        return this.f171004b.m89309e(this);
    }
}
