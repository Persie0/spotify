package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k1w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f118439a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q1w0 f118440b;

    /* JADX INFO: renamed from: c */
    public int f118441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1w0(q1w0 q1w0Var, ibk ibkVar) {
        super(ibkVar);
        this.f118440b = q1w0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f118439a = obj;
        this.f118441c |= Integer.MIN_VALUE;
        return this.f118440b.m71959e(null, null, this);
    }
}
