package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wfj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f250857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yfj0 f250858b;

    /* JADX INFO: renamed from: c */
    public int f250859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfj0(yfj0 yfj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f250858b = yfj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f250857a = obj;
        this.f250859c |= Integer.MIN_VALUE;
        return this.f250858b.m93563a(0L, 0L, this);
    }
}
