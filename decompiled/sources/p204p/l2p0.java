package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l2p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f129062a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n2p0 f129063b;

    /* JADX INFO: renamed from: c */
    public int f129064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2p0(n2p0 n2p0Var, ibk ibkVar) {
        super(ibkVar);
        this.f129063b = n2p0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f129062a = obj;
        this.f129064c |= Integer.MIN_VALUE;
        return this.f129063b.m63567b(null, this);
    }
}
