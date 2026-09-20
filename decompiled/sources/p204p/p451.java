package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p451 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f173820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t451 f173821b;

    /* JADX INFO: renamed from: c */
    public int f173822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p451(t451 t451Var, ibk ibkVar) {
        super(ibkVar);
        this.f173821b = t451Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173820a = obj;
        this.f173822c |= Integer.MIN_VALUE;
        return this.f173821b.m80037g(null, this);
    }
}
