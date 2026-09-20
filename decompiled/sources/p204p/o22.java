package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o22 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f160915a;

    /* JADX INFO: renamed from: b */
    public int f160916b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f160917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o22(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f160917c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f160915a = obj;
        this.f160916b |= Integer.MIN_VALUE;
        return this.f160917c.emit(null, this);
    }
}
