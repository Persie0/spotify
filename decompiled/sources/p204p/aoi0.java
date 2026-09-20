package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class aoi0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17697a;

    /* JADX INFO: renamed from: b */
    public int f17698b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f17699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoi0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f17699c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17697a = obj;
        this.f17698b |= Integer.MIN_VALUE;
        return this.f17699c.emit(null, this);
    }
}
