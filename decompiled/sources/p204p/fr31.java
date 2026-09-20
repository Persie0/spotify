package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fr31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f72347a;

    /* JADX INFO: renamed from: b */
    public int f72348b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f72349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr31(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f72349c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f72347a = obj;
        this.f72348b |= Integer.MIN_VALUE;
        return this.f72349c.emit(null, this);
    }
}
