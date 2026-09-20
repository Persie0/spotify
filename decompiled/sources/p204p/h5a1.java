package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h5a1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87792a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ va91 f87793b;

    /* JADX INFO: renamed from: c */
    public int f87794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5a1(va91 va91Var, ibk ibkVar) {
        super(ibkVar);
        this.f87793b = va91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87792a = obj;
        this.f87794c |= Integer.MIN_VALUE;
        return this.f87793b.m85033a(null, this);
    }
}
