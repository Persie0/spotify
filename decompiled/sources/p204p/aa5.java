package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aa5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13763a;

    /* JADX INFO: renamed from: b */
    public int f13764b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f13765c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa5(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f13765c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13763a = obj;
        this.f13764b |= Integer.MIN_VALUE;
        return this.f13765c.emit(null, this);
    }
}
