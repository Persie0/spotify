package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sd91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f207953a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ td91 f207954b;

    /* JADX INFO: renamed from: c */
    public int f207955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd91(td91 td91Var, ibk ibkVar) {
        super(ibkVar);
        this.f207954b = td91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f207953a = obj;
        this.f207955c |= Integer.MIN_VALUE;
        return this.f207954b.mo42598a(0, this);
    }
}
