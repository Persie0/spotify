package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v7n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f238283a;

    /* JADX INFO: renamed from: b */
    public int f238284b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f238285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7n0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f238285c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f238283a = obj;
        this.f238284b |= Integer.MIN_VALUE;
        return this.f238285c.emit(null, this);
    }
}
