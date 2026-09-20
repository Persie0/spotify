package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tb90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218799a;

    /* JADX INFO: renamed from: b */
    public int f218800b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ub90 f218801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb90(ub90 ub90Var, fbk fbkVar) {
        super(fbkVar);
        this.f218801c = ub90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218799a = obj;
        this.f218800b |= Integer.MIN_VALUE;
        return this.f218801c.emit(null, this);
    }
}
