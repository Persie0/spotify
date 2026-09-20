package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class arn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19102a;

    /* JADX INFO: renamed from: b */
    public int f19103b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f19104c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arn0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f19104c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19102a = obj;
        this.f19103b |= Integer.MIN_VALUE;
        return this.f19104c.emit(null, this);
    }
}
