package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vyj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f246158a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gzj0 f246159b;

    /* JADX INFO: renamed from: c */
    public int f246160c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyj0(gzj0 gzj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f246159b = gzj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f246158a = obj;
        this.f246160c |= Integer.MIN_VALUE;
        return gzj0.m46207d(this.f246159b, null, this);
    }
}
