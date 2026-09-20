package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class riq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f199602a;

    /* JADX INFO: renamed from: b */
    public int f199603b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jl1 f199604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public riq0(jl1 jl1Var, fbk fbkVar) {
        super(fbkVar);
        this.f199604c = jl1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199602a = obj;
        this.f199603b |= Integer.MIN_VALUE;
        return this.f199604c.emit(null, this);
    }
}
