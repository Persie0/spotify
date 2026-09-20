package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r93 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f196889a;

    /* JADX INFO: renamed from: b */
    public int f196890b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f196891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r93(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f196891c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f196889a = obj;
        this.f196890b |= Integer.MIN_VALUE;
        return this.f196891c.emit(null, this);
    }
}
