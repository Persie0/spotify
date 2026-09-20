package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q451 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f185068a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t451 f185069b;

    /* JADX INFO: renamed from: c */
    public int f185070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q451(t451 t451Var, ibk ibkVar) {
        super(ibkVar);
        this.f185069b = t451Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185068a = obj;
        this.f185070c |= Integer.MIN_VALUE;
        return t451.m80032b(this.f185069b, null, this);
    }
}
