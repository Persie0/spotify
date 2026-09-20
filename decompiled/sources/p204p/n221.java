package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n221 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f149608a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x23 f149609b;

    /* JADX INFO: renamed from: c */
    public int f149610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n221(x23 x23Var, ibk ibkVar) {
        super(ibkVar);
        this.f149609b = x23Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f149608a = obj;
        this.f149610c |= Integer.MIN_VALUE;
        return this.f149609b.mo31808a(this);
    }
}
