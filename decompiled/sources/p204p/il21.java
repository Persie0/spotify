package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class il21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103271a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jl21 f103272b;

    /* JADX INFO: renamed from: c */
    public int f103273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il21(jl21 jl21Var, ibk ibkVar) {
        super(ibkVar);
        this.f103272b = jl21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103271a = obj;
        this.f103273c |= Integer.MIN_VALUE;
        return this.f103272b.m53649c(this);
    }
}
