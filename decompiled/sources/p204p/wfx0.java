package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wfx0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f250921a;

    /* JADX INFO: renamed from: b */
    public int f250922b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f250923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfx0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f250923c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f250921a = obj;
        this.f250922b |= Integer.MIN_VALUE;
        return this.f250923c.emit(null, this);
    }
}
