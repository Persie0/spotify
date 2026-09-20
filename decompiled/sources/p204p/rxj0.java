package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rxj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203615a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wxj0 f203616b;

    /* JADX INFO: renamed from: c */
    public int f203617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxj0(wxj0 wxj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f203616b = wxj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203615a = obj;
        this.f203617c |= Integer.MIN_VALUE;
        return this.f203616b.m89312h(this);
    }
}
