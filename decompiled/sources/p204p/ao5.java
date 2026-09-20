package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ao5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17576a;

    /* JADX INFO: renamed from: b */
    public int f17577b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bo5 f17578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao5(bo5 bo5Var, fbk fbkVar) {
        super(fbkVar);
        this.f17578c = bo5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17576a = obj;
        this.f17577b |= Integer.MIN_VALUE;
        return this.f17578c.emit(null, this);
    }
}
