package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eo5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61294a;

    /* JADX INFO: renamed from: b */
    public int f61295b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bo5 f61296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo5(bo5 bo5Var, fbk fbkVar) {
        super(fbkVar);
        this.f61296c = bo5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61294a = obj;
        this.f61295b |= Integer.MIN_VALUE;
        return this.f61296c.emit(null, this);
    }
}
