package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eal0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57696a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fal0 f57697b;

    /* JADX INFO: renamed from: c */
    public int f57698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eal0(fal0 fal0Var, ibk ibkVar) {
        super(ibkVar);
        this.f57697b = fal0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57696a = obj;
        this.f57698c |= Integer.MIN_VALUE;
        return this.f57697b.m41190j(this);
    }
}
