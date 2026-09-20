package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t741 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f217678a;

    /* JADX INFO: renamed from: b */
    public int f217679b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f217680c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t741(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f217680c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f217678a = obj;
        this.f217679b |= Integer.MIN_VALUE;
        return this.f217680c.emit(null, this);
    }
}
