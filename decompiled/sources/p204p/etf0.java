package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class etf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62704a;

    /* JADX INFO: renamed from: b */
    public int f62705b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f62706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f62706c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f62704a = obj;
        this.f62705b |= Integer.MIN_VALUE;
        return this.f62706c.emit(null, this);
    }
}
