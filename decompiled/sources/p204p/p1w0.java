package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p1w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f173181a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q1w0 f173182b;

    /* JADX INFO: renamed from: c */
    public int f173183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1w0(q1w0 q1w0Var, ibk ibkVar) {
        super(ibkVar);
        this.f173182b = q1w0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173181a = obj;
        this.f173183c |= Integer.MIN_VALUE;
        return this.f173182b.m71963i(this);
    }
}
