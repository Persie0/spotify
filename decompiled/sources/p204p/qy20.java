package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qy20 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f193790a;

    /* JADX INFO: renamed from: b */
    public int f193791b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ry20 f193792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy20(ry20 ry20Var, ibk ibkVar) {
        super(ibkVar);
        this.f193792c = ry20Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f193790a = obj;
        this.f193791b |= Integer.MIN_VALUE;
        return this.f193792c.mo15629a(null, null, this);
    }
}
