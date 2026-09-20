package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class o741 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f162464a;

    /* JADX INFO: renamed from: b */
    public int f162465b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f162466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o741(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f162466c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162464a = obj;
        this.f162465b |= Integer.MIN_VALUE;
        return this.f162466c.emit(null, this);
    }
}
