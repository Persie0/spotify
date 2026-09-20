package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n9i0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o9i0 f151807b;

    /* JADX INFO: renamed from: c */
    public int f151808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9i0(o9i0 o9i0Var, ibk ibkVar) {
        super(ibkVar);
        this.f151807b = o9i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151806a = obj;
        this.f151808c |= Integer.MIN_VALUE;
        return this.f151807b.m66476c(null, this);
    }
}
