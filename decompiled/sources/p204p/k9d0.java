package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k9d0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f120567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l9d0 f120568b;

    /* JADX INFO: renamed from: c */
    public int f120569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d0(l9d0 l9d0Var, ibk ibkVar) {
        super(ibkVar);
        this.f120568b = l9d0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f120567a = obj;
        this.f120569c |= Integer.MIN_VALUE;
        return this.f120568b.mo38243a(null, this);
    }
}
