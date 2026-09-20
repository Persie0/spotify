package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p8n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175008a;

    /* JADX INFO: renamed from: b */
    public int f175009b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f175010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8n0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f175010c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175008a = obj;
        this.f175009b |= Integer.MIN_VALUE;
        return this.f175010c.emit(null, this);
    }
}
