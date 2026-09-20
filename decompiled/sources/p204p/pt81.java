package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class pt81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f181072a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rt81 f181073b;

    /* JADX INFO: renamed from: c */
    public int f181074c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt81(rt81 rt81Var, ibk ibkVar) {
        super(ibkVar);
        this.f181073b = rt81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f181072a = obj;
        this.f181074c |= Integer.MIN_VALUE;
        return rt81.m76370c(this.f181073b, null, null, this);
    }
}
