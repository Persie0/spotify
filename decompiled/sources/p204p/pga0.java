package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pga0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f177272a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rga0 f177273b;

    /* JADX INFO: renamed from: c */
    public int f177274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pga0(rga0 rga0Var, ibk ibkVar) {
        super(ibkVar);
        this.f177273b = rga0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177272a = obj;
        this.f177274c |= Integer.MIN_VALUE;
        return this.f177273b.m75472k(this);
    }
}
