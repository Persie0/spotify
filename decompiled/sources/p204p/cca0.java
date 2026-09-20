package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cca0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f36363a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ica0 f36364b;

    /* JADX INFO: renamed from: c */
    public int f36365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cca0(ica0 ica0Var, ibk ibkVar) {
        super(ibkVar);
        this.f36364b = ica0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f36363a = obj;
        this.f36365c |= Integer.MIN_VALUE;
        return this.f36364b.m50244b(null, this);
    }
}
