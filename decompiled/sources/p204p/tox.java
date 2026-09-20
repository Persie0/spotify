package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tox extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yo7 f222337b;

    /* JADX INFO: renamed from: c */
    public int f222338c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tox(yo7 yo7Var, ibk ibkVar) {
        super(ibkVar);
        this.f222337b = yo7Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222336a = obj;
        this.f222338c |= Integer.MIN_VALUE;
        return this.f222337b.m94273b(null, null, this);
    }
}
