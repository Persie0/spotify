package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qk11 extends ibk {

    /* JADX INFO: renamed from: a */
    public s50 f189404a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f189405b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sk11 f189406c;

    /* JADX INFO: renamed from: d */
    public int f189407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk11(sk11 sk11Var, ibk ibkVar) {
        super(ibkVar);
        this.f189406c = sk11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189405b = obj;
        this.f189407d |= Integer.MIN_VALUE;
        return this.f189406c.mo33757a(null, this);
    }
}
