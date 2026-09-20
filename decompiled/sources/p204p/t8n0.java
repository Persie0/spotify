package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t8n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218113a;

    /* JADX INFO: renamed from: b */
    public int f218114b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f218115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8n0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f218115c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218113a = obj;
        this.f218114b |= Integer.MIN_VALUE;
        return this.f218115c.emit(null, this);
    }
}
