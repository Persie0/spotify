package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rk11 extends ibk {

    /* JADX INFO: renamed from: a */
    public s50 f199948a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f199949b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sk11 f199950c;

    /* JADX INFO: renamed from: d */
    public int f199951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk11(sk11 sk11Var, ibk ibkVar) {
        super(ibkVar);
        this.f199950c = sk11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199949b = obj;
        this.f199951d |= Integer.MIN_VALUE;
        return this.f199950c.m78363b(null, this);
    }
}
