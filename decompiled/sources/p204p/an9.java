package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class an9 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f17336a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f17337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn9 f17338c;

    /* JADX INFO: renamed from: d */
    public int f17339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an9(bn9 bn9Var, ibk ibkVar) {
        super(ibkVar);
        this.f17338c = bn9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17337b = obj;
        this.f17339d |= Integer.MIN_VALUE;
        return bn9.m29928c(this.f17338c, null, this);
    }
}
