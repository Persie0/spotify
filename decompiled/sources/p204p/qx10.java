package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qx10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f193453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rx10 f193454b;

    /* JADX INFO: renamed from: c */
    public int f193455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx10(rx10 rx10Var, ibk ibkVar) {
        super(ibkVar);
        this.f193454b = rx10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f193453a = obj;
        this.f193455c |= Integer.MIN_VALUE;
        return this.f193454b.m76600i(this);
    }
}
