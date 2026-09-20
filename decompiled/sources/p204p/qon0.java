package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qon0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191011a;

    /* JADX INFO: renamed from: b */
    public int f191012b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f191013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qon0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f191013c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191011a = obj;
        this.f191012b |= Integer.MIN_VALUE;
        return this.f191013c.emit(null, this);
    }
}
