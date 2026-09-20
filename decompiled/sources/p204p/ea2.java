package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ea2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57567a;

    /* JADX INFO: renamed from: b */
    public int f57568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f57569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f57569c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57567a = obj;
        this.f57568b |= Integer.MIN_VALUE;
        return this.f57569c.emit(null, this);
    }
}
