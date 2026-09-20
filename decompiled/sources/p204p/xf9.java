package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xf9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f260870a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hd41 f260871b;

    /* JADX INFO: renamed from: c */
    public int f260872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf9(hd41 hd41Var, ibk ibkVar) {
        super(ibkVar);
        this.f260871b = hd41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260870a = obj;
        this.f260872c |= Integer.MIN_VALUE;
        return this.f260871b.m47172l(null, this);
    }
}
