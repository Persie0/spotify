package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vkr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f242279a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ykr0 f242280b;

    /* JADX INFO: renamed from: c */
    public int f242281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkr0(ykr0 ykr0Var, ibk ibkVar) {
        super(ibkVar);
        this.f242280b = ykr0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f242279a = obj;
        this.f242281c |= Integer.MIN_VALUE;
        return this.f242280b.m94119d(false, this);
    }
}
