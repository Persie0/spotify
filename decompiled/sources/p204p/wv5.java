package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wv5 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f255404a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f255405b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xv5 f255406c;

    /* JADX INFO: renamed from: d */
    public int f255407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv5(xv5 xv5Var, ibk ibkVar) {
        super(ibkVar);
        this.f255406c = xv5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f255405b = obj;
        this.f255407d |= Integer.MIN_VALUE;
        return xv5.m92216c(this.f255406c, null, this);
    }
}
