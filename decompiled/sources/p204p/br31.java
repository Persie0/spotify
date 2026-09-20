package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class br31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29959a;

    /* JADX INFO: renamed from: b */
    public int f29960b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f29961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br31(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f29961c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f29959a = obj;
        this.f29960b |= Integer.MIN_VALUE;
        return this.f29961c.emit(null, this);
    }
}
