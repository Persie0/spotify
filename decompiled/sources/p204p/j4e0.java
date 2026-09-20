package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j4e0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f108676a;

    /* JADX INFO: renamed from: b */
    public int f108677b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f108678c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4e0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f108678c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f108676a = obj;
        this.f108677b |= Integer.MIN_VALUE;
        return this.f108678c.emit(null, this);
    }
}
