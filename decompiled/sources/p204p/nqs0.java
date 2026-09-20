package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nqs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f157327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rqs0 f157328b;

    /* JADX INFO: renamed from: c */
    public int f157329c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqs0(rqs0 rqs0Var, ibk ibkVar) {
        super(ibkVar);
        this.f157328b = rqs0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157327a = obj;
        this.f157329c |= Integer.MIN_VALUE;
        return this.f157328b.m76263a(null, null, this, false);
    }
}
