package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eqz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61981a;

    /* JADX INFO: renamed from: b */
    public int f61982b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f61983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f61983c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61981a = obj;
        this.f61982b |= Integer.MIN_VALUE;
        return this.f61983c.emit(null, this);
    }
}
