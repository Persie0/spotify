package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nmm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f155493a;

    /* JADX INFO: renamed from: b */
    public int f155494b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f155495c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmm0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f155495c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f155493a = obj;
        this.f155494b |= Integer.MIN_VALUE;
        return this.f155495c.emit(null, this);
    }
}
