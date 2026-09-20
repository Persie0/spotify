package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b8n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ucj0 f24625b;

    /* JADX INFO: renamed from: c */
    public int f24626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8n0(ucj0 ucj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f24625b = ucj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24624a = obj;
        this.f24626c |= Integer.MIN_VALUE;
        return this.f24625b.m82783k(null, this);
    }
}
