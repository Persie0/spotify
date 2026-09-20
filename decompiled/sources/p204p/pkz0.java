package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pkz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f178600a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rkz0 f178601b;

    /* JADX INFO: renamed from: c */
    public int f178602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkz0(rkz0 rkz0Var, ibk ibkVar) {
        super(ibkVar);
        this.f178601b = rkz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178600a = obj;
        this.f178602c |= Integer.MIN_VALUE;
        return this.f178601b.m75807b(this);
    }
}
