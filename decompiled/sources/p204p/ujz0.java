package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ujz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231187a;

    /* JADX INFO: renamed from: b */
    public int f231188b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f231189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f231189c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231187a = obj;
        this.f231188b |= Integer.MIN_VALUE;
        return this.f231189c.emit(null, this);
    }
}
