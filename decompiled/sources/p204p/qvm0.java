package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qvm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f193053a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rvm0 f193054b;

    /* JADX INFO: renamed from: c */
    public int f193055c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvm0(rvm0 rvm0Var, ibk ibkVar) {
        super(ibkVar);
        this.f193054b = rvm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f193053a = obj;
        this.f193055c |= Integer.MIN_VALUE;
        return rvm0.m76484c(this.f193054b, this);
    }
}
