package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pml0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f179103a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uml0 f179104b;

    /* JADX INFO: renamed from: c */
    public int f179105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pml0(uml0 uml0Var, ibk ibkVar) {
        super(ibkVar);
        this.f179104b = uml0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f179103a = obj;
        this.f179105c |= Integer.MIN_VALUE;
        return this.f179104b.m83459f(this);
    }
}
