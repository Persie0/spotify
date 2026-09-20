package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xky0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f262962a;

    /* JADX INFO: renamed from: b */
    public int f262963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jl1 f262964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xky0(jl1 jl1Var, fbk fbkVar) {
        super(fbkVar);
        this.f262964c = jl1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f262962a = obj;
        this.f262963b |= Integer.MIN_VALUE;
        return this.f262964c.emit(null, this);
    }
}
