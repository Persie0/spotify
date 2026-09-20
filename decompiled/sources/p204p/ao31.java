package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ao31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17551a;

    /* JADX INFO: renamed from: b */
    public int f17552b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bo31 f17553c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao31(bo31 bo31Var, fbk fbkVar) {
        super(fbkVar);
        this.f17553c = bo31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17551a = obj;
        this.f17552b |= Integer.MIN_VALUE;
        return this.f17553c.emit(null, this);
    }
}
