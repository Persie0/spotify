package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gl21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f80983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jl21 f80984b;

    /* JADX INFO: renamed from: c */
    public int f80985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl21(jl21 jl21Var, ibk ibkVar) {
        super(ibkVar);
        this.f80984b = jl21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80983a = obj;
        this.f80985c |= Integer.MIN_VALUE;
        return this.f80984b.m53647a(null, this);
    }
}
