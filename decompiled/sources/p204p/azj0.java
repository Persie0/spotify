package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class azj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f21630a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gzj0 f21631b;

    /* JADX INFO: renamed from: c */
    public int f21632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azj0(gzj0 gzj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f21631b = gzj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f21630a = obj;
        this.f21632c |= Integer.MIN_VALUE;
        return this.f21631b.m46209f(this);
    }
}
