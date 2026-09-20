package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z131 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f278220a;

    /* JADX INFO: renamed from: b */
    public int f278221b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f278222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z131(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f278222c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278220a = obj;
        this.f278221b |= Integer.MIN_VALUE;
        return this.f278222c.emit(null, this);
    }
}
