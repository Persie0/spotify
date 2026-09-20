package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qqs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191646a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rqs0 f191647b;

    /* JADX INFO: renamed from: c */
    public int f191648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqs0(rqs0 rqs0Var, ibk ibkVar) {
        super(ibkVar);
        this.f191647b = rqs0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191646a = obj;
        this.f191648c |= Integer.MIN_VALUE;
        Object objM76266e = this.f191647b.m76266e(null, null, this);
        return objM76266e == yuk.f276404a ? objM76266e : new s6x0(objM76266e);
    }
}
