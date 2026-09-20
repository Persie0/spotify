package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jvu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public ic50 f116488a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f116489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lvu0 f116490c;

    /* JADX INFO: renamed from: d */
    public int f116491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvu0(lvu0 lvu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f116490c = lvu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116489b = obj;
        this.f116491d |= Integer.MIN_VALUE;
        return this.f116490c.m60083c(this);
    }
}
