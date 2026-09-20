package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xg4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f261193a;

    /* JADX INFO: renamed from: b */
    public int f261194b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f261195c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg4(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f261195c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f261193a = obj;
        this.f261194b |= Integer.MIN_VALUE;
        return this.f261195c.emit(null, this);
    }
}
