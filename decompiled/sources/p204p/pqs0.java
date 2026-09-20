package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pqs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180415a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rqs0 f180416b;

    /* JADX INFO: renamed from: c */
    public int f180417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqs0(rqs0 rqs0Var, ibk ibkVar) {
        super(ibkVar);
        this.f180416b = rqs0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180415a = obj;
        this.f180417c |= Integer.MIN_VALUE;
        return this.f180416b.m76265d(this);
    }
}
