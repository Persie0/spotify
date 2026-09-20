package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eej0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58804a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iej0 f58805b;

    /* JADX INFO: renamed from: c */
    public int f58806c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eej0(iej0 iej0Var, ibk ibkVar) {
        super(ibkVar);
        this.f58805b = iej0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58804a = obj;
        this.f58806c |= Integer.MIN_VALUE;
        return iej0.m50387a(this.f58805b, this);
    }
}
