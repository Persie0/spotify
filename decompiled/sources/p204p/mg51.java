package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mg51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f143332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vr11 f143333b;

    /* JADX INFO: renamed from: c */
    public int f143334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg51(vr11 vr11Var, ibk ibkVar) {
        super(ibkVar);
        this.f143333b = vr11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f143332a = obj;
        this.f143334c |= Integer.MIN_VALUE;
        return this.f143333b.m86263g(null, this);
    }
}
