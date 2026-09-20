package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z161 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f278244a;

    /* JADX INFO: renamed from: b */
    public int f278245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f278246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z161(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f278246c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278244a = obj;
        this.f278245b |= Integer.MIN_VALUE;
        return this.f278246c.emit(null, this);
    }
}
