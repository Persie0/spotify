package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qf2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f188097a;

    /* JADX INFO: renamed from: b */
    public int f188098b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f188099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f188099c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188097a = obj;
        this.f188098b |= Integer.MIN_VALUE;
        return this.f188099c.emit(null, this);
    }
}
