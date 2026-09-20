package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class csn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f41658a;

    /* JADX INFO: renamed from: b */
    public int f41659b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f41660c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csn0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f41660c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41658a = obj;
        this.f41659b |= Integer.MIN_VALUE;
        return this.f41660c.emit(null, this);
    }
}
