package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uyt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f235359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vyt0 f235360b;

    /* JADX INFO: renamed from: c */
    public int f235361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyt0(vyt0 vyt0Var, ibk ibkVar) {
        super(ibkVar);
        this.f235360b = vyt0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f235359a = obj;
        this.f235361c |= Integer.MIN_VALUE;
        return vyt0.m86861c(this.f235360b, this);
    }
}
