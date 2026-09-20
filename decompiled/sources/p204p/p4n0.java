package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p4n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f173986a;

    /* JADX INFO: renamed from: b */
    public int f173987b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f173988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4n0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f173988c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173986a = obj;
        this.f173987b |= Integer.MIN_VALUE;
        return this.f173988c.emit(null, this);
    }
}
