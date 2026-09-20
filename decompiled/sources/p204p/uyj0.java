package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uyj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f235295a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gzj0 f235296b;

    /* JADX INFO: renamed from: c */
    public int f235297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyj0(gzj0 gzj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f235296b = gzj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f235295a = obj;
        this.f235297c |= Integer.MIN_VALUE;
        return gzj0.m46206c(this.f235296b, null, this);
    }
}
