package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wkr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f252293a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ykr0 f252294b;

    /* JADX INFO: renamed from: c */
    public int f252295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkr0(ykr0 ykr0Var, ibk ibkVar) {
        super(ibkVar);
        this.f252294b = ykr0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252293a = obj;
        this.f252295c |= Integer.MIN_VALUE;
        return this.f252294b.m94120e(false, this);
    }
}
